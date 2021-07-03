package metodosDeOrdenacao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;


public class SelectionSort extends Ordenacao
{

	public static void main(String args[]) throws IOException 
        {
		ArrayList<Long> dadosArquivoNumero = new ArrayList<Long>();

		long tempoInicial = System.currentTimeMillis();


		long tempoFinal = System.currentTimeMillis();

		System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");

		System.out.println(dadosArquivoNumero);

	}

        @Override
	public void SelectionSort(ArrayList<Long> dadosArquivoNumero) 
        {
            super.SelectionSort(dadosArquivoNumero);
	}
}
