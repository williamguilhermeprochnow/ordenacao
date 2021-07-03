package conversao;

import java.util.ArrayList;

public class Conversao 
{
    public ArrayList<Long> StringToLong(ArrayList<String> dadosArquivo) 
    {
        ArrayList<Long> dadosArquivoNumero = new ArrayList<Long>();

        for (int idx = 0; idx < dadosArquivo.size(); ++idx) 
        {
            Long iStringNum = Long.parseLong(dadosArquivo.get(idx));
            dadosArquivoNumero.add(iStringNum);
        }

        return dadosArquivoNumero;
    }

    public ArrayList<String> LongToString(ArrayList<Long> dadosArquivoNumero) 
    {
        ArrayList<String> dadosArquivo = new ArrayList<String>();

        for (int idx = 0; idx < dadosArquivoNumero.size(); ++idx) 
        {
            String sNumero = dadosArquivoNumero.get(idx).toString();
            dadosArquivo.add(sNumero);
        }
        
        return dadosArquivo;
    }
}
