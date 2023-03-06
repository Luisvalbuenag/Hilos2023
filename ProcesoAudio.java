package hilos;
import java.io.File;
import java.lang.Thread;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.*;

public class ProcesoAudio implements Runnable {
    @Override
    public void run() {
        try{
            File cancion = new File("/Users/fernando/Downloads/QUEVEDO.wav"); 
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(cancion));
            clip.start();
            Thread.sleep(clip.getMicrosecondLength() / 1000); 
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}


