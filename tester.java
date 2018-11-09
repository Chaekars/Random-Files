import java.io.FileInputStream;

import javazoom.jl.player.Player;
import javazoom.jl.player.advanced.*;

public class tester 
{
	public static void main(String[] args) 
	{
		SoundJLayer soundToPlay = new SoundJLayer("03 - Sleeping With A Friend.mp3");

        soundToPlay.play();
	}
}

class SoundJLayer extends PlaybackListener implements Runnable
{

    private AdvancedPlayer player;
    

    public SoundJLayer(String filePath)
    {
    }

    public void play()
    {
    	try{
    	    FileInputStream fis = new FileInputStream("F:\\Gorillaz\\02 - 5_4.mp3");
    	    Player playMP3 = new Player(fis);
    	    playMP3.play();
    	}
    	catch(Exception exc){
    	    exc.printStackTrace();
    	    System.out.println("Failed to play the file.");
    	}
    }

    // PlaybackListener members

    public void playbackStarted(PlaybackEvent playbackEvent)
    {
        System.out.println("playbackStarted");
    }

    public void playbackFinished(PlaybackEvent playbackEvent)
    {
        System.out.println("playbackEnded");
    }    

    // Runnable members

    public void run()
    {
        try
        {
            this.player.play();
        }
        catch (javazoom.jl.decoder.JavaLayerException ex)
        {
            ex.printStackTrace();
        }

    }
}