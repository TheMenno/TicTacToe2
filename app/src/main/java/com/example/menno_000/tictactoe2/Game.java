package com.example.menno_000.tictactoe2;

import java.io.Serializable;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

/**
 * Created by menno_000 on 16-2-2018.
 */

public class Game implements Serializable {
    final private int BOARD_SIZE = 3;
    private Tile[][] board;

    private Boolean playerOneTurn;  // true if player 1's turn, false if player 2's turn
    private int movesPlayed;
    private Boolean gameOver;

    public Game() {
        board = new Tile[BOARD_SIZE][BOARD_SIZE];
        for(int i=0; i<BOARD_SIZE; i++)
            for(int j=0; j<BOARD_SIZE; j++)
                board[i][j] = Tile.BLANK;

        playerOneTurn = true;
        gameOver = false;
    }

    public Tile draw(int row, int column) {
        Tile current = board[row][column];

        if (current == Tile.BLANK) {
            if (playerOneTurn == TRUE) {
                board[row][column] = Tile.CROSS;
                playerOneTurn = FALSE;

                return Tile.CROSS;
            }

            else {
                board[row][column] = Tile.CIRCLE;
                playerOneTurn = TRUE;

                return Tile.CIRCLE;
            }

        }

        else {
            return Tile.INVALID;
        }
    }
}
