package hilos;
import java.lang.Thread;


public class Proceso3 implements Runnable {
    @Override
    public void run() {
        int numero = 2;
        int i = 1;
        do {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        } while (i <= 10);
    }
    
}