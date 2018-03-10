package jogadores;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RepositorioJogador {
 
  public Jogador p1[]  = {new Jogador(11, "aaa"),new Jogador(12, "sss"),
      new Jogador(13, "ddd"),new Jogador(14, "fff"), 
      new Jogador(115, "ggg"),new Jogador(162, "hhh"), 
      new Jogador(117, "iii"),new Jogador(128, "jjj"),
      new Jogador(119, "kkk"),new Jogador(122, "lll")};

  
  public RepositorioJogador(int[]num,String[]nom)//int capacidade
  {
//    p1[0]= new Jogador(num[0],nom[0]);
//    p1[1]= new Jogador(num[1],nom[1]);
//    p1[2]= new Jogador(num[2],nom[2]);
//    p1[3]= new Jogador(num[3],nom[3]);
//    p1[4]= new Jogador(num[4],nom[4]);
//    p1[5]= new Jogador(num[5],nom[5]);
//    p1[6]= new Jogador(num[6],nom[6]);
//    p1[7]= new Jogador(num[7],nom[7]);
//    p1[8]= new Jogador(num[8],nom[8]);
//    p1[9]= new Jogador(num[9],nom[9]);
//    

  }
  
  public Jogador getP1(int i)
  {
  return p1[i];
  }
  public Jogador[] getP1()
  {
  return p1;
  }
  
  public int getRank(int novaPontuacao) 
  {
		int posicao = 1;
		for(int i=0; i< 10; i++) 
                {
			Jogador a = p1[i];
			if(a.getPontuacao()<= novaPontuacao) 
                        {
				posicao = i;
			}
                        else
                        {
                        break;
                        }
		}
            
		return posicao;
  }
  
 
  public void trocar(Jogador p1Ins)
  {
//   
////    Arrays.sort(p1);
    p1[getRank(p1Ins.getPontuacao())] = p1Ins;
    
  }
    
}
