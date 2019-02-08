public class QueenDriver {
	public static void main(String[] args) {
		int[][] testBoard = new int[][] {
			{0, 0, 0, 0, -1, -1, -1, 0},
			{-1, 0, 0, 0, 0, 0, 0, -1},
			{-1, -1, -1, -1, -1, -1, -1, -1},
			{0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, -1, -1, -1, 0},
			{-1, 0, 0, 0, 0, 0, 0, -1},
			{-1, -1, -1, -1, -1, -1, -1, -1},
			{0, 0, 0, 0, 0, 0, 0, 0}
		};
		QueenBoard testing = new QueenBoard(8);
		testing.setBoard(testBoard);
		System.out.println(testing);
		try {
			System.out.println(testing.solve());
		} catch (IllegalStateException e) {
			System.out.println(e);
		}
	}
}
