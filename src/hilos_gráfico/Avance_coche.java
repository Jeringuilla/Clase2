
package hilos_gráfico;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;


public class Avance_coche extends Thread{
    Random aleatorio = new Random();
    JLabel L;
    
    public Avance_coche(){
    
    }

     
     public void run(){
         int coordenada_y = L.getY(); //Creo una variable coordenada y la meto en un jLabel
         int coordenada_x = L.getX();
         int valor = aleatorio.nextInt(100);    //Creo un valor aleatorio
         
         for(int i=coordenada_x;coordenada_x+valor<600;i=+valor){   //Hago un for q a la variable alearioria le suma un valor aleatorio
             valor = aleatorio.nextInt(100);
             coordenada_x = L.getX();   //El valor dde la cordenada lo adopte el jLabel
             L.setLocation(coordenada_x+valor,coordenada_y);    //Y establecemos la posicion del jLabel en funcion de las coordenadas
             try {
                 Thread.currentThread().sleep(100);
             } catch (InterruptedException ex) {
                 Logger.getLogger(Avance_coche.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
     }
}
