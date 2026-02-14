import org.code.theater.*;
import org.code.media.*;

public class SceneTwo extends Scene {

  /*
  both private variables
  Images, and Captions
  */
  private ImageFilter[] images;
  private String[] captions;

  public SceneTwo() {
    //Every image
    images = new ImageFilter[] {
      new ImageFilter("firered.jpg"),
      new ImageFilter("emerald.jpg"),
      new ImageFilter("moon.jpg"),
      new ImageFilter("pearl.jpg"),
    };
//captions for each image
    captions = new String[] {
      "FireRed Version: Generation 1",
      "Emerald Version: Generation 3",
      "Pokemon Moon: Generation 7",
      "Pokemon Pearl: Generation 4",
    };
  }

  // creates the scene as well as plays music, contains negative method
public void drawScene() {
   playSound("Pokemon.wav");
    int imageSize = 250;
// for loop for images
    for (int i = 0; i < images.length; i++) {
        ImageFilter img = images[i];

        clear("white");

        int centerX = getWidth() / 2 - imageSize / 2;
        int centerY = getHeight() / 2 - imageSize / 2 - 40;

        // Draw original
        drawImage(img, centerX, centerY, imageSize);

      /*
      Set Text color,
      sets the text height,
      thend sets the caption
      */
        setTextColor("black");
        setTextHeight(20);
        drawText(captions[i], 60, centerY + imageSize + 50);

        pause(2.0);

        // Apply negative filter
        img.makeNegative();

      // Draw filtered image with same caption
        drawImage(img, centerX, centerY, imageSize);
        drawText(captions[i], 60, centerY + imageSize + 50);

        pause(2.0);
            
    }
}
}
