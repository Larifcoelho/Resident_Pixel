package jogo;

import jplay.Keyboard;
import jplay.Scene;
import jplay.URL;
import jplay.Window;

public class Cenario1 {
    
    private Window janela;
    private Scene cena;
    private Jogador jogador;
    private Keyboard teclado;
    private Zumbi zumbi;
    
    public Cenario1(Window window){
        
        janela = window;
        cena = new Scene();
        cena.loadFromFile(URL.scenario("Cenario1.scn"));
        jogador = new Jogador(640, 350);
        teclado = janela.getKeyboard();
        zumbi = new Zumbi(300, 300);
        
        
        Som.play("flor.mid");
        run();
        
    }
    
    private void run(){
        while(true){
            //cena.draw();
            jogador.controle(janela, teclado);
            jogador.caminho(cena);
            zumbi.caminho(cena);
            zumbi.perseguir(jogador.x, jogador.y);
            
            cena.moveScene(jogador);
            
            jogador.x += cena.getXOffset();
            jogador.y += cena.getYOffset();
            
            jogador.atirar(janela, cena, teclado);
            
            zumbi.x += cena.getXOffset();
            zumbi.y += cena.getYOffset();
            
            jogador.draw();
            zumbi.draw();
            janela.update();

            
        
        }
    
    
    }
    
}
