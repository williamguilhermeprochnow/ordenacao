/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pesquisa;

import java.util.ArrayList;
import java.util.List;

public class Pesquisa
{
    protected int Pesquisa(ArrayList<String> dadosArquivo, String sNumero)
    {
    int iMeioArquivo   = (dadosArquivo.size() - 1) / 2;
    int iInicioArquivo = 0;
    int iFinalArquivo  = dadosArquivo.size() - 1;

    boolean bEncontrouNumero = false;
    boolean bPraBaixo        = false;
		
    while (!bEncontrouNumero && iMeioArquivo >= 0)
    {
	if (dadosArquivo.get(iMeioArquivo).equals(sNumero))
        {
            return iMeioArquivo;
        }
        else
	{
            if (bPraBaixo)
		--iMeioArquivo;
            else
		++iMeioArquivo;
	}
			
	if (iMeioArquivo == dadosArquivo.size() - 1)
	{
            bPraBaixo = true;
        }
    }
        
        return - 1;
    }
    
    protected int PesquisaPorIndex(ArrayList<String> dadosArquivo, String sIndex)
    {
        if (dadosArquivo.size() < Integer.parseInt(sIndex))
            return - 1;
        
        String sNumero = dadosArquivo.get(Integer.parseInt(sIndex));
        
        return Integer.parseInt(sNumero);
    }
}
