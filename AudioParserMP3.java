import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.parser.mp3.Mp3Parser;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class AudioParserMP3
{
	 public static void main(String[] args) 
	 {
	        String fileLocation = "G:/Music/AM/01 - Do I Wanna Know.mp3";

	        try {

	        InputStream input = new FileInputStream(new File(fileLocation));
	        ContentHandler handler = new DefaultHandler();
	        Metadata metadata = new Metadata();
	        Parser parser = new Mp3Parser();
	        ParseContext parseCtx = new ParseContext();
	        parser.parse(input, handler, metadata, parseCtx);
	        input.close();

	        // List all metadata
	        String[] metadataNames = metadata.names();

	        for(String name : metadataNames){
	        System.out.println(name + ": " + metadata.get(name));
	        }
	        int hours = (int)(Float.parseFloat(metadata.get("xmpDM:duration"))/600000/6);
	        int minutes = (int)(Float.parseFloat(metadata.get("xmpDM:duration"))/60000%60);
	        float seconds = ((Float.parseFloat(metadata.get("xmpDM:duration"))/60000)%1);
	        seconds *= 60;

	        // Retrieve the necessary info from metadata
	        // Names - title, xmpDM:artist etc. - mentioned below may differ based
	        System.out.println("----------------------------------------------");
	        System.out.println("Title: " + metadata.get("title"));
	        System.out.println("Artists: " + metadata.get("xmpDM:artist"));
	        System.out.println("Release Date: "+metadata.get("xmpDM:releaseDate"));
	        System.out.println("Genre: "+metadata.get("xmpDM:genre"));
	        System.out.println("Album: "+metadata.get("xmpDM:album"));
	        System.out.printf("Duration: %02d:%02d:%02d", hours, minutes, (int)seconds);

	        } catch (FileNotFoundException e) {
	        e.printStackTrace();
	        } catch (IOException e) {
	        e.printStackTrace();
	        } catch (SAXException e) {
	        e.printStackTrace();
	        } catch (TikaException e) {
	        e.printStackTrace();
	        }
	        }
}
