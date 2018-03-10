package jogadores;


public class Jogador {
    private int pontuacao;
    private String nome;

   
    public int getPontuacao() {
        return pontuacao;
    }

  
    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    
    public String getNome() {
        return nome;
    }

  
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Jogador(int novaPontuacao, String novoNome)
    {
        pontuacao = novaPontuacao;
        nome = novoNome;
    }
    
    
    
}
