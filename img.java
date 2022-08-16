import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.Buffer;

import javax.imageio.ImageIO;

public class img{
    public static void main(String[] args){
        File jpgOriginal = new File("C:/Users/pastu/Desktop/5DM30481-3.jpg");
        File jpgizedImage = new File("C:/Users/pastu/Desktop/1.jpg");
        resizingImage(jpgOriginal, jpgizedImage, 1920, 1080, "jpg");
    }

    private static void resizingImage(File originalImage, File resizedImage, int width, int height, String format){
        try{
            BufferedImage original = ImageIO.read(originalImage);
            BufferedImage resized = new BufferedImage(width, height, original.getType());
            Graphics2D g2 = resized.createGraphics();
            g2.drawImage(original, 0, 0, width, height, null);
            g2.dispose();
            ImageIO.write(resized, format, resizedImage);
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
    }
}