
package hilos_gráfico;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class Avance_runnable implements Runnable{
    
    public Avance_coche carro;
    JLabel coche;
    
    public Avance_runnable(){
        
    }
    
    public Avance_runnable(Avance_coche carro, JLabel coche){
        this.carro = carro;
        this.coche = coche;
    }
    
    public static void main(String[] args){
        
    }

    @Override
    public void run(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(Avance_runnable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}


