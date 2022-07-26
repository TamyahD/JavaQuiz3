package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    String[][] board;

    public TicTacToe(String[][] board) {
        this.board=board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        return board[value];
    }

    public String[] getColumn(Integer value) {
        return board[value];
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        return null;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        return null;
    }

    public String getWinner() {
        List<String> boardChars = new ArrayList<>();

        boardChars.add((board[0][0]) +board[0][1] +board[0][2]);
        boardChars.add((board[1][0]) +board[1][1] +board[1][2]);
        boardChars.add((board[2][0]) +board[2][1] +board[2][2]);

        boardChars.add((board[0][0]) +board[1][0] +board[2][0]);
        boardChars.add((board[0][1]) +board[1][1] +board[2][1]);
        boardChars.add((board[0][2]) +board[1][2] +board[2][2]);

        boardChars.add((board[0][0]) +board[1][1] +board[2][2]);
        boardChars.add((board[2][0]) +board[1][1] +board[0][2]);


        if (boardChars.contains("XXX")) {
            return "X";
        }
        if (boardChars.contains("OOO")) {
            return "O";
        }
        return "";
    }

    public String[][] getBoard() {
        return this.board;
    }
}
