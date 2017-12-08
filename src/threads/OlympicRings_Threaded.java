package threads;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
public static void main(String[] args) {
	Robot blue = new Robot(300, 300);
	Robot yellow = new Robot(500,500);
	Robot black = new Robot(700,300);
	Robot green = new Robot(900, 500);
	Robot red = new Robot(1100, 300);
	
	blue.hide();
	yellow.hide();
	black.hide();
	green.hide();
	red.hide();
	
	blue.setSpeed(10);
	yellow.setSpeed(10);
	black.setSpeed(10);
	green.setSpeed(10);
	red.setSpeed(10);
	
new Thread(()->{
	for (int i = 0; i < 120; i++) {
		
		blue.setPenColor(Color.BLUE);
		blue.penDown();
		blue.setPenWidth(10);
		blue.move(10);
		blue.turn(3);
		blue.sparkle();
	}		
			
}).start();

	
new Thread(()->{	
for (int i = 0; i < 120; i++) {
		
		yellow.setPenColor(Color.yellow);
		yellow.penDown();
		yellow.setPenWidth(10);
		yellow.move(10);
		yellow.turn(3);
		yellow.sparkle();
	}
}).start();	
new Thread(()->{	
for (int i = 0; i < 120; i++) {
	
		green.setPenColor(Color.GREEN);
		green.penDown();
		green.setPenWidth(10);
		green.move(10);
		green.turn(3);
		green.sparkle();
	}
}).start();
new Thread(()->{	
for (int i = 0; i < 120; i++) {
	
		black.setPenColor(Color.BLACK);
		black.penDown();
		black.setPenWidth(10);
		black.move(10);
		black.turn(3);
		black.sparkle();
}
}).start();
new Thread(()->{	
for (int i = 0; i < 120; i++) {
	
		red.setPenColor(Color.RED);
		red.penDown();
		red.setPenWidth(10);
		red.move(10);
		red.turn(3);
		red.sparkle();
}
}).start();
}}

