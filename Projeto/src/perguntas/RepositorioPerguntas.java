package perguntas; 


import herança.Gerenciar;


public class RepositorioPerguntas implements Gerenciar
{
    private Pergunta perguntas[];
    private int indice;

    public RepositorioPerguntas()
    {
         perguntas = new Pergunta[60]; 
         indice=0;
    }
    public void inserir(Pergunta pergIns)
    {  
        perguntas[indice] = pergIns; 
        indice++;    
    }

    public Pergunta proc(int i)
    {           
        return perguntas[i];
    }

    public Pergunta[] getPerguntas() 
    {
        return perguntas;
    }

    

    @Override
    public Object procurar(int codigo) {
        return null;
            }

    @Override
    public void remover(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void inserir(Object ins) {
    perguntas[indice] = (Pergunta) ins; 
    indice++;    
    
    }

}
   
   
 
   
