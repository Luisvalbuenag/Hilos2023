package hilos;
import java.lang.Thread;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {

        Proceso inicio =new Proceso();
        Thread ejecutar = new Thread(inicio);
        Proceso2 inicio2 =new Proceso2();
        Thread ejecutar2 = new Thread(inicio2);
        Proceso3 inicio3 =new Proceso3();
        Thread ejecutar3 = new Thread(inicio3);
        ProcesoAudio inicio4 =new ProcesoAudio();
        Thread ejecutar4 = new Thread(inicio4);
        
        ejecutar.start();
        ejecutar2.start();
        ejecutar3.start();
        ejecutar4.start();
    }
}