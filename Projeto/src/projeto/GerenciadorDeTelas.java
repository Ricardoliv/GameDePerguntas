/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JTextArea;
import perguntas.Arquivos;
import perguntas.Pergunta;
import perguntas.RepositorioPerguntas;
import jogadores.ArquivoJog;
import jogadores.Jogador;
import jogadores.RepositorioJogador;


public class GerenciadorDeTelas 
{
     public static void main(String[] args) throws FileNotFoundException, IOException { 
    // Random aleatorio = new Random();
   // int codigo = aleatorio.nextInt(4);
       
   
    String tema="A";
    ////////jogador///
    String nome = "zé";
    int pontos = 0;
   ///////Tela de entrada///////////////////////////////////////////////
     RepositorioPerguntas rp = new RepositorioPerguntas();
         
    for(int lv=1; lv<4;lv++)
    { 
        for(int i=1; i<6;i++)
        {
            Arquivos txt = new Arquivos("informática",lv,i);    
            Pergunta p1 = new Pergunta(txt.lerTexto());     
            rp.inserir(p1);
        }

        for(int i=1; i<6;i++)
        {
            Arquivos txt = new Arquivos("inglês",lv,i);    
            Pergunta p1 = new Pergunta(txt.lerTexto());
            rp.inserir(p1);
        }

         for(int i=1; i<6;i++)
        {
            Arquivos txt = new Arquivos("espanhol",lv,i);    
            Pergunta p1 = new Pergunta(txt.lerTexto());     
            rp.inserir(p1);
        }

        for(int i=1; i<6;i++)
        {
            Arquivos txt = new Arquivos("geral",lv,i);    
            Pergunta p1 = new Pergunta(txt.lerTexto());
            rp.inserir(p1);
        }
    }
    
    ArquivoJog aj = new ArquivoJog();
    RepositorioJogador repj = new RepositorioJogador(aj.lerPts(), aj.lerJog());//pt
     
    aj.guardar(repj);
    
    Ini ini=new Ini();
    
    //ranking
        Apres ap =new Apres(ini);
        ap.setVisible(true); 
        JTextArea mr =ini.getT2();
        
        String ri="";        
        for(int i =0;i<10;i++)
        {
          ri=ri+ repj.getP1(i).getNome()+"   "+repj.getP1(i).getPontuacao()+"\n "; 
        }
        mr.setText(ri);
// new Ini().setVisible(true);
//   
        boolean ver=true;
        while (ver==true){
               nome= ini.getNome();
               tema = ini.getTema();
                ver=ini.on;
                }
        int ind1=0; 
        int ind2=15;
        int ind3=39;
        if(tema=="informática")
        {
             ind1 =0;
             ind2 =20;
             ind3 =39; 
        }
        if(tema=="inglês")
        {
             ind1 =5;
             ind2 =25;
             ind3 =45;
        }
        if(tema=="espanhol")
        {
             ind1 =10;
             ind2 =30;
             ind3 =50;
        }
        if(tema=="geral")
        {
             ind1 =15;
             ind2 =35;
             ind3 =55;
             
        }
                
         
        TJ tj = new TJ(rp, ind1, ind2, ind3, tema,nome);
        tj.setVisible(true);
                 
        boolean verf=true;
        while (verf==true)
            {
               pontos=tj.pontos;
               
                verf=tj.on;
            }
                
        Jogador j = new Jogador(pontos, nome);
        repj.trocar(j);
        aj.guardar(repj);
        
        String rf="";        
        for(int i =0;i<10;i++)
        {
          rf=rf+ repj.getP1(i).getNome()+"   "+repj.getP1(i).getPontuacao()+"\n "; 
        }
        mr.setText(rf);
        
        TelaFinal tf = new TelaFinal(rf);
        tf.setVisible(true);
        
//    System.out.println("+nome+"  "+tema);

    
    
    
   
}


}
