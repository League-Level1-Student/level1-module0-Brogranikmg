import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot houseBuilderHesAnArchitectTM = new Robot("mini");
	public static void main(String[] args) {
		houseBuilderHesAnArchitectTM.setSpeed(100);
		houseBuilderHesAnArchitectTM.moveTo(100, 350);
		houseBuilderHesAnArchitectTM.penDown();
		flatHouse(100, "blue");
		pointyHouse(70, "red");
		pointyHouse(170, "black");
		flatHouse(120, "green");
		pointyHouse(90, "red");
		flatHouse(200, "blue");
		pointyHouse(10, "black");
		pointyHouse(10, "black");
		pointyHouse(10, "red");
		pointyHouse(15, "green");
		pointyHouse(10, "black");
		flatHouse(60, "blue");
		flatHouse(140, "red");
	}
	static void flatHouse(int height, String color) {
		colorPick(color);
		houseBuilderHesAnArchitectTM.move(height);
		houseBuilderHesAnArchitectTM.turn(90);
		houseBuilderHesAnArchitectTM.move(20);
		houseBuilderHesAnArchitectTM.turn(90);
		houseBuilderHesAnArchitectTM.move(height);
		houseBuilderHesAnArchitectTM.turn(-90);
		houseBuilderHesAnArchitectTM.setPenColor(100, 150, 0);
		houseBuilderHesAnArchitectTM.move(10);
		houseBuilderHesAnArchitectTM.turn(-90);
	}
	static void pointyHouse(int height, String color) {
		colorPick(color);
		houseBuilderHesAnArchitectTM.move(height);
		houseBuilderHesAnArchitectTM.turn(45);
		houseBuilderHesAnArchitectTM.move(15);
		houseBuilderHesAnArchitectTM.turn(90);
		houseBuilderHesAnArchitectTM.move(15);
		houseBuilderHesAnArchitectTM.turn(45);
		houseBuilderHesAnArchitectTM.move(height);
		houseBuilderHesAnArchitectTM.turn(-90);
		houseBuilderHesAnArchitectTM.setPenColor(100, 150, 0);
		houseBuilderHesAnArchitectTM.move(10);
		houseBuilderHesAnArchitectTM.turn(-90);
	}
	static void colorPick(String colorString) {
		switch (colorString) {
		case "red":
			houseBuilderHesAnArchitectTM.setPenColor(150, 10, 10);
			break;
		case "green":
			houseBuilderHesAnArchitectTM.setPenColor(10, 150, 10);
			break;
		case "blue":
			houseBuilderHesAnArchitectTM.setPenColor(10, 10, 150);
			break;
		case "black":
			houseBuilderHesAnArchitectTM.setPenColor(0, 0, 0);
			break;
		case "white":
			houseBuilderHesAnArchitectTM.setPenColor(255, 255, 255);
			break;
		default:
			houseBuilderHesAnArchitectTM.setPenColor(0, 0, 0);
			break;
		}
	}
}
