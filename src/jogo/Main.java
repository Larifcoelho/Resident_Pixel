package jogo;
// Teste GIT
// Teste 2
// Teste 3

import jplay.GameImage;
import jplay.Keyboard;
import jplay.URL;
import jplay.Window;



public class Main {
    public static void main(String[] args) {
        Window janela = new Window(800, 600);
        GameImage plano = new GameImage(URL.sprite("Zack (6).png"));
        Keyboard teclado = janela.getKeyboard();
        
        
        while(true){
            plano.draw();
            janela.update();
            
            if(teclado.keyDown(Keyboard.ENTER_KEY)){
                new Cenario1(janela);
            
            
            }
            
        }
        
    }
}
