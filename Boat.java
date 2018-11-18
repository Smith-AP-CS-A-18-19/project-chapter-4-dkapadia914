
public class Boat {
	private double xCoordinate;
	private double yCoordinate;
	private double direction = 0;

	public Boat(double initialX, double initialY) {
		xCoordinate = initialX;
		yCoordinate = initialY;
	}

	public double getX() {
		return xCoordinate;
	}

	public double getY() {
		return yCoordinate;
	}

	public double getDirection() {
		return direction;
	}

	public double turn(double degrees) {
 		double radians = degrees * Math.PI / 180;
		direction = (direction + radians) % 360;
		return direction;
	}

	public void move(double distance) {
		double tempDirection;
		tempDirection = Math.PI / 2 - direction;
		double xMove = distance * Math.cos(tempDirection);
		double yMove = distance * Math.sin(tempDirection);
		xCoordinate += xMove;
		yCoordinate += yMove;
	}

	public static void main(String[] args) {
		Boat b = new Boat(0, 0);
		b.move(10);
		if ((Math.abs(b.getX() - 0.0) < 1e-10) && (Math.abs(b.getY() - 10.0) < 1e-10)) {
			System.out.println("Pass 1");
		}
		b.turn(90);
		b.move(20);
		if ((Math.abs(b.getX() - 20.0) < 1e-10) && (Math.abs(b.getY() - 10.0) < 1e-10)) {
			System.out.println("Pass 2");
		}
		b  = new Boat(0, 0);
		b.turn(-45);
		b.move(5);
		if ((Math.abs(Math.abs(b.getX()) - Math.abs(b.getY())) < 1e-10) && (Math.abs(Math.abs(b.getX()) - (5 / (Math.sqrt(2)))) < 1e-10)) {
			System.out.println("Pass 3");
		}
	}
}
