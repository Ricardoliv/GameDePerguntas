package jogadores;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class ArquivoJog 
{
   
    public ArquivoJog()
    {
        
    }
    public String[] lerJog()throws FileNotFoundException
    {
      String arquivo = "src\\textos\\ranking\\nomes.txt";       
      Scanner s = new Scanner(new FileReader(arquivo));
      
      String[] linhas = new String[10];
      for(int i=0; i<10 && s.hasNextLine() ;i++)
      {
          linhas[i] =s.nextLine();
           s.hasNextLine();
         
      }
        return linhas;
    }
    public int[] lerPts()throws FileNotFoundException
    {
      String arquivo = "src\\textos\\ranking\\pts.txt";       
      Scanner s = new Scanner(new FileReader(arquivo));
      int[] n = new int[10];
      String[] linhas = new String[10];
      for(int i=0; i<10 && s.hasNextLine() ;i++)
      {
          linhas[i] =s.nextLine();
           s.hasNextLine();
         n[i]=Integer.parseInt(linhas[i]);
         
      }
        return n;
    } 
    
    public void guardar(RepositorioJogador repj) throws IOException//FileNotFoundException,
    {
     
        FileOutputStream fop = new FileOutputStream("src\\textos\\ranking\\nomes.txt");//f
      
        PrintStream ps = new PrintStream(fop);
        System.setOut(ps);
        for(int i=0; i<10; i++)
        {
           System.out.println( repj.p1[i].getNome());
        } 
        
        FileOutputStream fop2 = new FileOutputStream("src\\textos\\ranking\\pts.txt");
        PrintStream ps2 = new PrintStream(fop2);
        System.setOut(ps2);
        for(int i=0; i<10; i++)
        {
           System.out.println(repj.p1[i].getPontuacao());
        } 
    }

    
    
    
       
    
    

}