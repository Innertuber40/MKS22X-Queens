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
		QueenBoard blank = new QueenBoard(16);
		testing.setBoard(testBoard);
		System.out.println(testing);
		try {
			System.out.println(testing.solve());
		} catch (IllegalStateException e) {
			System.out.println(e);
		}
		System.out.println(blank);
		try {
			QueenBoard noWork = new QueenBoard(-1);
		} catch (NegativeArraySizeException e) {
			System.out.println(e);
		}
		QueenBoard zero = new QueenBoard(0);
		System.out.println(zero);
		QueenBoard firstRealTest = new QueenBoard(4);
		System.out.println("A board of size 4 does have a solution: " + firstRealTest.solve());
		System.out.println(firstRealTest);
		try {
			System.out.println("A board of size 4 has this many solutions: " + firstRealTest.countSolutions());
		} catch (IllegalStateException e) {
			System.out.println(e);
		}
		QueenBoard traditional = new QueenBoard(8);
		System.out.println("A board of size 8 does have a solution: " + traditional.solve());
		System.out.println(traditional);
		QueenBoard big = new QueenBoard(20);
		System.out.println("A board of size 20 does have a solution: " + big.solve());
		System.out.println(big);
		QueenBoard newFour = new QueenBoard(4);
		System.out.println("A board of size 4 has this many solutions: " + newFour.countSolutions());
		System.out.println(newFour);
		QueenBoard aboutBestForGoodRuntime = new QueenBoard(13);
		System.out.println("A board of size 13 has this many solutions: " + aboutBestForGoodRuntime.countSolutions());
		System.out.println(aboutBestForGoodRuntime);
		QueenBoard notSolveable = new QueenBoard(3);
		System.out.println(notSolveable.solve());
		System.out.println(notSolveable);
	}
}