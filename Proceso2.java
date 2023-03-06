package hilos;
import java.lang.Thread;

public class Proceso2 implements Runnable {
    @Override
   public void run (){  
        
        int a = 0;
        int b = 0;
        
        while ( a <= 10){
        
        b++; 
            
        a++;
        
    }
        System.out.print(b);
    
    }
}