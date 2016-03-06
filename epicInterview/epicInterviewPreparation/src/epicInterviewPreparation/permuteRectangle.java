package epicInterviewPreparation;

import java.util.*;


public class permuteRectangle {

	public static void main(String args[]) {
		Point sp = new Point(0, 0);
		permuteRectangle(sp, 1);
	}

	public static void permuteRectangle(Point startPoint, int area) {
		List<Point> points = listFactors(area);

		for (Point p : points) {
			// flips for e.g. (1,3) --> (3,1)
			if (p.x != p.y) {
				Point p2 = new Point(p.y, p.x);
				rotateRectangleAndPrint(startPoint, p2);
			}
			rotateRectangleAndPrint(startPoint, p);
		}

	}

	// lists all the possible combination for that area
	public static List<Point> listFactors(int area) {
		int j = (int) Math.sqrt(area);
		ArrayList<Point> points = new ArrayList<Point>();
		for (int i = 1; i <= j; i++) {
			if (area % i == 0) {
				Point p = new Point(i, area / i);
				points.add(p);
			}
		}
		System.out.println(points.toString());
		return points;
	}

	// rotates in 4 directions --> (x,y) , (-x, y) (-x, -y), (x, -y)
	public static void rotateRectangleAndPrint(Point sp, Point ep) {

		Point p = new Point(ep);
		printCords(sp, p);
		
		
		p = new Point(-ep.x, ep.y);
		printCords(sp, p);

		p = new Point(-ep.x, -ep.y);
		printCords(sp, p);

		p = new Point(ep.x, -ep.y);
		printCords(sp, p);
		
	}

	// derives 4 cordinates from start and end points and print them.
	public static void printCords(Point sp, Point ep) {
		// rebase with start point
		ep.x += sp.x;
		ep.y += sp.y;

		Point p1 = sp;
		Point p2 = new Point(sp.x, ep.y);
		Point p3 = ep;
		Point p4 = new Point(ep.x, sp.y);
		
		System.out.println("" + p1 + " " + p2 + " " + p3 + " " + p4);
	}

	public static class Point {
		int x;
		int y;

		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

		Point(Point p) {
			this.x = p.x;
			this.y = p.y;
		}

		@Override
		public String toString() {
			return String.format("(%d,%d)", x, y);
		}
	}

}
