package perguntas;

public class Pergunta 
{
    private String []questoes = new String[6];
    
    public Pergunta(String[] information)
    {
        questoes[0] = information[0];
        questoes[1] = information[1];
        questoes[2] = information[2];
        questoes[3] = information[3];
        questoes[4] = information[4];
        questoes[5] = information[5];
        
    }
  
    public String getQuestoes(int i) 
    {  
        return questoes[i];
        
    }
    public String[] getQs() 
    {      
        return questoes;
        
    }
    

    
}
