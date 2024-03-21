import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   * Description: Copies the image we need to copy!
   * @author: E.Fung
   */
  public void settings() {
	// put your size call here
    size(500, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    // Changes outlining colour to black
    stroke(0);

    // Q1
    // Vertical Line
    for(int intVerticalLine = 1; intVerticalLine < 10; intVerticalLine++){
      strokeWeight(2);
      fill(0);
      line(intVerticalLine * (width / 20), 0, intVerticalLine * (width / 20), height / 2);
    }
    // Horizontal Line
    for(int intHorizontalLine = 10; intHorizontalLine > 0; intHorizontalLine--){
      strokeWeight(2);
      fill(0);
      line(0, intHorizontalLine * (height / 20), width/2, intHorizontalLine * (height / 20));
    }

    // Q2
    for(int intRow = 1; intRow < 6; intRow++){
      for(int intColumn = 1; intColumn < 6; intColumn++){
        fill(255, 0, 0);
        ellipse((intColumn) * ((width / 2) / 6) + width / 2, intRow * ((height / 2) / 6), width / 16, height / 16);
      }
    }

    // Q3
    for(int intY = 0; intY < height / 2; intY++){
      for(int intX = 0; intX < width / 2; intX++){
        int intGreyScale =  (int) ((255.0 / (width / 2.0)) * intX);
        stroke(intGreyScale);
        point(intX, intY + height / 2);
      }
    }

    // Q4    
    strokeWeight(1);
    for (int intPetalNum = 0; intPetalNum < 8; intPetalNum++){
      fill(255, 180, 0);
      pushMatrix();
      translate(width * 0.75f, height * 0.75f);

      // Rotates petals in a circle
      rotate(-intPetalNum * (PI / 4));
      translate ((float) (width / 12), 0);
      ellipse(0, 0, (float)(width / 6), (float)(height / 22));
      popMatrix();
    }
    // Middle Circle of FLower
    strokeWeight(0);
    fill(32, 92, 34);
    ellipse(width * 0.75f, height * 0.75f, width / 15, height / 15);
  }
}