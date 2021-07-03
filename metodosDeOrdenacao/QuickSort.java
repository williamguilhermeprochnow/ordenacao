package metodosDeOrdenacao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class QuickSort extends Ordenacao
{
    public static void main(String args[]) throws IOException 
    {   
        long tempoInicial = System.currentTimeMillis();

        //quicksort(dadosArquivoNumero, 0, dadosArquivoNumero.size() - 1);

        long tempoFinal = System.currentTimeMillis();

        System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");

        //System.out.println(dadosArquivoNumero);
    }

    @Override
    public void QuickSort(ArrayList<Long> dadosArquivoNumero, int inicioArquivo, int finalArquivo)
    {
        //long tempoInicial = System.currentTimeMillis();
        super.QuickSort(dadosArquivoNumero, inicioArquivo, finalArquivo);
        //long tempoFinal = System.currentTimeMillis();
    }
}
