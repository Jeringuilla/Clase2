
package hilos_gráfico;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class Avance_thread extends Thread{
    Random aleatorio = new Random();
    String nombre;
    JLabel L;
    public Avance_thread(){
        
    }
    
    public Avance_thread(String nombre,JLabel L){
        this.nombre = nombre;
        this.L = L;
    }
    
    public void run(){
        int coordenada_y = L.getY();
        int coordenada_x = L.getX();
        int valor = aleatorio.nextInt(100);
         
        for(int i=coordenada_x;coordenada_x+valor<580;i=+valor){
             valor = aleatorio.nextInt(100);
             coordenada_x = L.getX();
             L.setLocation(coordenada_x+valor,coordenada_y);
             int suma = coordenada_x+valor;
             System.out.println(nombre+":"+suma);
            try {
                Thread.currentThread().sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(Avance_thread.class.getName()).log(Level.SEVERE, null, ex);
            }
            }  
    }
}
