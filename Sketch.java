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
    // for(int x = 1; x < 10; x++){
    //   strokeWeight(2);
    //   fill(0);
    //   line(x * (200 / 10), 0, x * (200 / 10), height / 2);
    // }
    // for(int x = 10; x > 0; x--){
    //   strokeWeight(2);
    //   fill(0);
    //   line(0, x * (200 / 10), width/2, x * (200 / 10));
    // }

    // //Q2
    // for(int row = 1; row < 6; row++){
    //   for(int column = 1; column < 6; column++){
    //     fill(255, 0, 0);
    //     ellipse((column) * (200 / 6) + 200, row * (200 / 6), 15, 15);
    //     //System.out.println(column + " " + row);
    //   }
    // }

    // //Q3
    // for(int y = 0; y < 200; y++){
    //   for(int x = 0; x < 200; x++){
    //     int greyscale =  (int) (1.275 * x);
    //     stroke(greyscale);
    //     point(x, y + 200);
    //   }
    // }
    //Q4
    fill(0, 200, 0);
    
    double radius = 1;
    for (int i = 0; i < 8; i++){
      fill(100, 25, 100);
      pushMatrix();
      translate(width * 0.75f, height * 0.75f);
      rotate(i * (HALF_PI / 2));
      ellipse((float) (radius * Math.cos(i * (HALF_PI / 2))), (float) (radius  * Math.sin(i * (HALF_PI / 2))), 100.0f, 30.0f);
      popMatrix();
    }
    ellipse(300, 300, 30, 30);
  }
  
  // define other methods down here.
}