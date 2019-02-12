public class QueenBoard {
	private int[][] board;

	public QueenBoard(int size) {
		if (size < 0) {
			throw new NegativeArraySizeException("A board cannot be of negative size.");
		}
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
		boolean returns = false;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[i][j] != 0) {
					throw new IllegalStateException("It has already been solved");
				}
			}
		}
		for (int j = 0; j < board.length; j++) {
			returns = returns || solver(0, j);
		}
		return returns;
	}
	public void add(int i, int j) {
		board[i][j] = -1;
	}
	public void undo(int i, int j) {
		if (board[i][j] == -1) {
			board[i][j] = 0;
		} else {
			board[i][j] -= 1;
		}
	}
	public boolean solver(int column, int row) {
		if (column == board.length) {
			return true;
		}
		if (board[column][row] == 0) {
			add(column, row);
			for (int i = column + 1; i < board.length; i++) {
				for (int j = row - 1; j > 0; j--) {
					board[i][j] = board[i][j] + 1;
				}
				board[i][row] = board[i][row] + 1;
				for (int j = row + 1; j < board.length; j++) {
					board[i][j] = board[i][j] + 1;
				}
			}
			undo(column, row);
		}
	}

	public int countSolutions() {
		int count = 0;
		return count;
	}
}
