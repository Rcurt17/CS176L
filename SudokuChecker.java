package Week14Answer;

public class SudokuChecker {
	
	private static boolean ValidSudoku(char [] [] board) {
		for (int x = 0; x < 9; x++) {
			if (!ValidRow(board, x) || !ValidColumn(board, x) || !ValidBox(board, x / 3 * 3, x % 3 * 3)) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean ValidRow(char [][] board, int row) {
		boolean[] haveSeen = new boolean[9];
		for (int y = 0; y < 9; y++) {
			char number = board[row][y];
			if (number != '.') {
				if (haveSeen[number - '1']) {
					return false;
				}
				haveSeen[number - '1'] = true;
			}
		}
		return true;
	}
	
	private static boolean ValidColumn(char [][] board, int column) {
		boolean[] haveSeen = new boolean[9];
		for (int b = 0; b < 9; b++) {
			char number = board[b][column];
			if (number != '.') {
				if (haveSeen[number - '1']) {
					return false;
				}
				haveSeen[number - '1'] = true;
			}
		}
		return true;
	}

	private static boolean ValidBox(char [][] board, int startingRow, int startingColumn) {
		boolean[] haveSeen = new boolean[9]; 
		for (int b = 0; b < 3; b++) {
			for (int c = 0; c < 3; c++) {
				char number = board[startingRow + b][startingColumn + c];
				if (number != '.') {
					if (haveSeen[number - '1']) {
						return false;
					}
					haveSeen[number - '1'] = true;
				}
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		
		char [] [] board1 = {
				{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
				{'6', '.', '.', '1', '9', '5', '.', '.', '.'},
				{'.', '9', '8', '.', '.', '.', '.', '6', '.'},
				{'8', '.', '.', '.', '6', '.', '.', '.', '3'},
				{'4', '.', '.', '8', '.', '3', '.', '.', '1'},
				{'7', '.', '.', '.', '2', '.', '.', '.', '6'},
				{'.', '6', '.', '.', '.', '.', '2', '8', '.'},
				{'.', '.', '.', '4', '1', '9', '.', '.', '5'},
				{'.', '.', '.', '.', '8', '.', '.', '7', '9'},
		};
		
		char [] [] board2 = {
				{'8', '3', '.', '.', '7', '.', '.', '.', '.'},
				{'6', '.', '.', '1', '9', '5', '.', '.', '.'},
				{'.', '9', '8', '.', '.', '.', '.', '6', '.'},
				{'8', '.', '.', '.', '6', '.', '.', '.', '3'},
				{'4', '.', '.', '8', '.', '3', '.', '.', '1'},
				{'7', '.', '.', '.', '2', '.', '.', '.', '6'},
				{'.', '6', '.', '.', '.', '.', '2', '8', '.'},
				{'.', '.', '.', '4', '1', '9', '.', '.', '5'},
				{'.', '.', '.', '.', '8', '.', '.', '7', '9'},
		};
		
		System.out.println(ValidSudoku(board1));
		System.out.println(ValidSudoku(board2));

	}

}
