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
				if (board[i][j] >= 0) {                    // change to == for debugging
					last += "_ ";
				}/* else if (board[i][j] > 0) {
					last = last + board[i][j] + " ";
				}*/ else {
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
		return solver(0, 0);
	}
	public void add(int i, int j) {
		board[i][j] = -1;
	}
	public void undo(int i, int j) {
		board[i][j] = 0;
	}
	public boolean solver(int row, int column) {
		if (column == board.length) {
			return true;
		}
		if (row == board.length) {
			return false;
		}
		if (board[row][column] == 0) {
			add(row, column);
			int upRow = row - 1;
			int downRow = row + 1;
			for (int i = column + 1; i < board.length; i++) {
				if (upRow >= 0) {
					board[upRow][i] = board[upRow][i] + 1;
				}
				board[row][i] = board[row][i] + 1;
				if (downRow < board.length) {
					board[downRow][i] = board[downRow][i] + 1;
				}
				upRow--;
				downRow++;
			}
			//System.out.println(this);
			if (solver(0, column + 1)) {
				return true;
			}
			upRow = row - 1;
			downRow = row + 1;
			for (int i = column + 1; i < board.length; i++) {
				if (upRow >= 0) {
					board[upRow][i] = board[upRow][i] - 1;
				}
				board[row][i] = board[row][i] - 1;
				if (downRow < board.length) {
					board[downRow][i] = board[downRow][i] - 1;
				}
				upRow--;
				downRow++;
			}
			undo(row, column);
			//System.out.println(this);
		}
		return solver(row + 1, column);
	}

	public int countSolutions() {
		int count = 0;
		return count;
	}
}
