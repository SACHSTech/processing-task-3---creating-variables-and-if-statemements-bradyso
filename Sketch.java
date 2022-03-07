import processing.core.PApplet;

public class Sketch extends PApplet {
      /**
    * Description: Write a program Sketch.java that changes the location of a drawing and background-colour
    * Author: Brady So
	
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
    background(51, 153, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    // defining variables
    
	  float flowerRandomX = random(0, width);
    float flowerRandomY = random(0, height);
    float petalDiameter = random(30, 125);
    float petalDistance = petalDiameter / 2;

    // Changing background to green if both x is less than 200 AND y is greater than 200
    if(flowerRandomX < 200 && flowerRandomY > 200){
      background(0, 204, 0);
      
      // flower has colors of yellow petals and a orange center if above statement is true
      
      // upper left petal
      fill(255, 255, 0);
      ellipse(flowerRandomX - petalDistance, flowerRandomY - petalDistance, petalDiameter, petalDiameter);

      // upper right petal
      fill(255, 255, 0);
      ellipse(flowerRandomX + petalDistance, flowerRandomY - petalDistance, petalDiameter, petalDiameter);

      // bottom left petal
      fill(255, 255, 0);
      ellipse(flowerRandomX - petalDistance, flowerRandomY + petalDistance, petalDiameter, petalDiameter);

      // bottom right petal
      fill(255, 255, 0);
      ellipse(flowerRandomX + petalDistance, flowerRandomY + petalDistance, petalDiameter, petalDiameter);
    
      // center of flower
      fill(253, 102, 0);
      ellipse(flowerRandomX, flowerRandomY, petalDiameter, petalDistance * 2);
      }
    
      // change background to blue if x is not less than 200 OR if y is not greater than 200
       
    else if(!(flowerRandomX < 200) || !(flowerRandomY > 200)) {
      background(51, 153, 255);

      // flower changes color to brown center and red petals if above statement is true
      
      // upper left petal
      fill(255, 51, 51);
      ellipse(flowerRandomX - petalDistance, flowerRandomY - petalDistance, petalDiameter, petalDiameter);

      // upper right petal
      fill(255, 51, 51);
      ellipse(flowerRandomX + petalDistance, flowerRandomY - petalDistance, petalDiameter, petalDiameter);

      // bottom left petal
      fill(255, 51, 51);
      ellipse(flowerRandomX - petalDistance, flowerRandomY + petalDistance, petalDiameter, petalDiameter);

      // bottom right petal
      fill(255, 51, 51);
      ellipse(flowerRandomX + petalDistance, flowerRandomY + petalDistance, petalDiameter, petalDiameter);
    
      // center of flower
      fill(153, 102, 0);
      ellipse(flowerRandomX, flowerRandomY, petalDiameter, petalDistance * 2);
      }
    
      // make only one loop
      noLoop();

      // find current time
      int intHour = hour();
      int intMinutes = minute();
      int intSecond = second();
      String strTime = ("The current time is " + str(intHour - 17) + ":" + str(intMinutes) + ":" + str(intSecond));
      fill(0, 0, 0);
      textSize(20);
      text(strTime, 20, 315);
  }
  
}