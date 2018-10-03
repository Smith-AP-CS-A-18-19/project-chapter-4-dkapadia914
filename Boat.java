public class Boat {

	public static void main(String[] args) {
		Boat b = new Boat(0, 0);
		b.move(10);
		if (b.getX() == 0.0 && b.getY() == 10.0) {
			System.out.println("Pass 1");
		}
		b.turn(90);
		b.move(20);
		if (b.getX() == 20.0 && b.getY() == 10.0) {
			System.out.println("Pass 2");
		}
		b  = new Boat(0, 0);
		b.turn(-45);
		b.move(5);
		if (b.getX() == b.getY() && b.getX() == Math.sqrt(50)) {
			System.out.println("Pass 3");
		}
	}
}
