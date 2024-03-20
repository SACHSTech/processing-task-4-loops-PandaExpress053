import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
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
	// sample code, delete this stuff
    stroke(0);
    // Q1
    //Vertical Line
    for(int intX = 1; intX < 10; intX++){
      strokeWeight(2);
      fill(0);
      line(intX * (200 / 10), 0, intX * (200 / 10), height / 2);
    }
    //Horizontal Line
    for(int x = 10; x > 0; x--){
      strokeWeight(2);
      fill(0);
      line(0, x * (200 / 10), width/2, x * (200 / 10));
    }

    //Q2
    for(int intRow = 1; intRow < 6; intRow++){
      for(int intColumn = 1; intColumn < 6; intColumn++){
        fill(255, 0, 0);
        ellipse((intColumn) * (200 / 6) + 200, intRow * (200 / 6), 15, 15);
        //System.out.println(column + " " + row);
      }
    }

    //Q3
    for(int intY = 0; intY < 200; intY++){
      for(int intX = 0; intX < 200; intX++){
        int intGreyScale =  (int) (1.275 * intX);
        stroke(intGreyScale);
        point(intX, intY + 200);
      }
    }
    
    //Q4    
    for (int intPetalNum = 0; intPetalNum < 8; intPetalNum++){
      fill(255, 180, 0);
      pushMatrix();
      translate(width * 0.75f, height * 0.75f);

      //Rotates in a circle
      rotate(-intPetalNum * (PI / 4));
      translate ((float) (width / 12), 0);
      ellipse(0, 0, (float)(width / 6), (float)(height / 22));
      popMatrix();

    }
    strokeWeight(0);
    fill(32, 92, 34);
    ellipse(width * 0.75f, height * 0.75f, 30, 30);
  }
  
  // define other methods down here.
}