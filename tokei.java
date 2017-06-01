import java.io.File;
 
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
 
public class tokei {
    public static void main(final String[] args) {
        try {
            final AudioInputStream ais =
                    AudioSystem.getAudioInputStream(new File("nc72806.wav"));
            ais.getFormat();
            final Clip line = AudioSystem.getClip();
            line.open(ais);
            line.start();
            System.out.println("start");
            Thread.sleep(1);
            line.drain();
            line.stop();
            System.out.println("stop");
            line.close();
            System.out.println("close");
        } catch (final Exception e) {
            System.out.println(e);
        }
    }
}
