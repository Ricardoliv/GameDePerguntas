package perguntas;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Arquivos
{
    private int codigo,nivel;
    private String tema;
    public Arquivos(String tema,int nivel,int codigo)
    {
        this.codigo = codigo;
        this.tema= tema;
        this.nivel=nivel;
    }
     
    public String[] lerTexto()throws FileNotFoundException
    {
      String arquivo ="src\\textos\\tema"+tema+"\\nível"+nivel+"\\"+codigo+".txt";       
      Scanner s = new Scanner(new FileReader(arquivo));
      
      String[] linhas = new String[6];
      for(int i=0; i<6 && s.hasNextLine() ;i++)
      {
          linhas[i] =s.nextLine();
           s.hasNextLine();
         
      }
        return linhas;
    }

}