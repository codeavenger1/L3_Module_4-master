package threads;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
public static void main(String[] args) {
	Robot blue = new Robot();
	Robot yellow = new Robot();
	Robot black = new Robot();
	Robot green = new Robot();
	Robot red = new Robot();
	
	blue.setSpeed(10);
	yellow.setSpeed(10);
	black.setSpeed(10);
	green.setSpeed(10);
	red.setSpeed(10);
	
new Thread(()->{
blue.setX(500);
blue.setY(200);
	for (int i = 0; i < 400; i++) {
		
		blue.setPenColor(Color.BLUE);
		blue.penDown();
		blue.setPenWidth(10);
		blue.move(2);
		blue.turn(1);
		blue.sparkle();
	}		
			
}).start();

	
new Thread(()->{	
for (int i = 0; i < 400; i++) {
		
		yellow.setPenColor(Color.yellow);
		yellow.penDown();
		yellow.setPenWidth(10);
		yellow.move(2);
		yellow.turn(1);
		yellow.sparkle();
	}
}).start();	
new Thread(()->{	
for (int i = 0; i < 400; i++) {
	blue.setX(500);
	blue.setY(700);
		green.setPenColor(Color.GREEN);
		green.penDown();
		green.setPenWidth(10);
		green.move(2);
		green.turn(1);
		green.sparkle();
	}
}).start();

}
}

