package perguntas;


public class TeladeJogo 
{   //Pergunta p = new Pergunta();
    public TeladeJogo(String []linhas)
    {
    this.linhas = linhas;
    } 
    
    private String linhas[] = new String[6];
    
    public void mostra()
    {
        for(int i=0; i<5; i++)
        { 
           // linhas = a.lerTexto();
            System.out.print(" "+linhas[i]+"\n");
        }
    }
   public String mostraL(int i)
    {
       String l=linhas[i];
           // linhas = a.lerTexto();
        return l;
  
    }
    
}
