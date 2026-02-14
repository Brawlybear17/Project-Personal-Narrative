import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {

    /*
     SceneOne images: Pokémon
     Only applies to scene one and does nothing for scene two
    */
    ImageFilter[][] sceneOneImages = {
      { new ImageFilter("rowlet.png"), new ImageFilter("Screenshot-2026-02-10-112622.png"), new ImageFilter("monkey.jpg"), new ImageFilter("luxray.jpg")  }
    };

    // Instantiate the scenes
    SceneOne scene1 = new SceneOne(sceneOneImages);
    SceneTwo scene2 = new SceneTwo();

    // Draw scenes first (optional)
    scene1.drawScene();
    scene2.drawScene();

    // Play them in order
    Theater.playScenes(scene1, scene2);
  }
}
