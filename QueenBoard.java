public class QueenBoard {
	private int[][] board;

	public QueenBoard(int size) {
		board = new int[size][size];
	}

	public String toString() {
		String last = "";
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[i][j] >= 0) {
					last += "_ ";
				} else {
					last += "Q ";
				}
			}
			last += "\n";
		}
		return last;
	}
	public void setBoard(int[][] forToStringTest) {
		board = forToStringTest;
	}
					

	public boolean solve() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[i][j] != 0) {
					throw new IllegalStateException("It has already been solved");
				}
			}
		}
		return true;
	}
	public int countSolutions() {
		int count = 0;
		return count;
	}
}
