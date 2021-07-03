
package metodosDeOrdenacao;

import java.util.ArrayList;


public class Ordenacao 
{
    protected void QuickSort(ArrayList<Long> dadosArquivoNumero, int inicioArquivo, int finalArquivo)
    {
        if (inicioArquivo < finalArquivo) 
        {
            int iMeioArquivo = Particao(dadosArquivoNumero, inicioArquivo, finalArquivo);
            QuickSort(dadosArquivoNumero, inicioArquivo, iMeioArquivo - 1);
            QuickSort(dadosArquivoNumero, iMeioArquivo + 1, finalArquivo);
        }
    }
    
     protected void InsertionSort(ArrayList<Long> dadosArquivoNumero) 
     {
        int iTamanhoList = dadosArquivoNumero.size();  
        for (int idxPosicaoList = 1; idxPosicaoList < iTamanhoList; idxPosicaoList++) 
        {  
            long lNumeroList = dadosArquivoNumero.get(idxPosicaoList);  
            int iPosicaoList = idxPosicaoList - 1;  
            
            while ((iPosicaoList > -1) && (dadosArquivoNumero.get(iPosicaoList) > lNumeroList )) 
            {  
                dadosArquivoNumero.set(iPosicaoList + 1, dadosArquivoNumero.get(iPosicaoList));
                iPosicaoList--;  
            }  
             dadosArquivoNumero.set(iPosicaoList + 1, lNumeroList);  
        }  
    }

    public void SelectionSort(ArrayList<Long> dadosArquivoNumero) 
    {
        for (int idxPosicaoList = 0; idxPosicaoList < dadosArquivoNumero.size(); idxPosicaoList++) 
        {
            int iMenor = idxPosicaoList;
                        
            for (int idxPosicaoList2 = idxPosicaoList + 1; idxPosicaoList2 < dadosArquivoNumero.size(); idxPosicaoList2++) 
            {
		if (dadosArquivoNumero.get(idxPosicaoList2) < dadosArquivoNumero.get(iMenor))
                    iMenor = idxPosicaoList2;
            }
	
            TrocaPosicaoListArray(dadosArquivoNumero, idxPosicaoList, iMenor);
        }
    }
    
    private static int Particao(ArrayList<Long> dadosArquivoNumero, int inicioArquivo, int finalArquivo) 
    {
        int iInicioArquivo = inicioArquivo + 1;
        int iFinalArquivo = finalArquivo;
        long lNumFixo = dadosArquivoNumero.get(inicioArquivo);
        
        while (iInicioArquivo <= iFinalArquivo) 
        {
            if (dadosArquivoNumero.get(iInicioArquivo) <= lNumFixo) 
                iInicioArquivo++;
            else if (dadosArquivoNumero.get(iFinalArquivo) > lNumFixo) 
                iFinalArquivo--;
            else if (iInicioArquivo <= iFinalArquivo) 
            {
                TrocaPosicaoListArray(dadosArquivoNumero, iInicioArquivo, iFinalArquivo);
                iInicioArquivo++;
                iFinalArquivo--;
            }
        }
        TrocaPosicaoListArray(dadosArquivoNumero, inicioArquivo, iFinalArquivo);
        return iFinalArquivo;
    }

    private static void TrocaPosicaoListArray(ArrayList<Long> dadosArquivoNumero, int iInicioArquivo, int iFinalArquivo) 
    {
        long lNumAux = dadosArquivoNumero.get(iInicioArquivo);
        dadosArquivoNumero.set(iInicioArquivo, dadosArquivoNumero.get(iFinalArquivo));
        dadosArquivoNumero.set(iFinalArquivo, lNumAux);
    }
}
