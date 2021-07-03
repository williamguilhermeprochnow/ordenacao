package arquivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArqFile 
{
    private String sPath;
    private BufferedReader FileLeitura  = null;
    private BufferedWriter FileGravacao = null;

    private String getPath() 
    {
        return sPath;
    }

    public void setPath(String sPath) 
    {
        this.sPath = sPath;
    }
    
    public boolean GravaArquivo(List<String> lsNumero)
    {
       boolean bHRESULT = true;
        
       FileGravacao = abrirArquivoParaGravacao();
	
       try 
       {
            for (int idxArquivo = 0; idxArquivo < lsNumero.size(); ++idxArquivo) 
            {
		FileGravacao.append(lsNumero.get(idxArquivo));
            }
	} 
        catch (Exception e) 
        {
           return false;
        }
        finally 
        {
            fecharArquivoParaGravacao(FileGravacao);
        }
       
       return bHRESULT;
    } 
    
    public List<String> LerArquivo(List<String> lsNumero) throws IOException 
    {
        String sNumero;

        try 
        {
            FileLeitura = abrirArquivo();
            sNumero     = FileLeitura.readLine();
            
            while (sNumero != null) 
            {
                lsNumero.add(sNumero);
                sNumero = FileLeitura.readLine();
            }
        } 
        finally 
        {
            fecharArquivo(FileLeitura);
        }
        
        return lsNumero;
    }
    
    private BufferedReader abrirArquivo() throws FileNotFoundException 
    {
        FileLeitura = new BufferedReader(new FileReader(sPath));

        return FileLeitura;
    }
    
    private void fecharArquivo(BufferedReader fileControl) 
    {
	try 
        {
            fileControl.close();
	} 
        catch (IOException e) 
        {
            e.printStackTrace();
	}
    }
    
    private BufferedWriter abrirArquivoParaGravacao() 
    {
        try
        {
            BufferedWriter file = new BufferedWriter(new FileWriter(sPath));
	
            return file;
	}
        catch(Exception e) 
        {
            e.printStackTrace();
	}
	
        return null;
    }
	
    private void fecharArquivoParaGravacao(BufferedWriter fileControl) 
    {
	try 
        {
            fileControl.close();
	} 
        catch (IOException e) 
        {
            e.printStackTrace();
	}
    }
}
