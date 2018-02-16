package com.example.menno_000.tictactoe2;

import java.io.Serializable;


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
            if (playerOneTurn == false) {

                board[row][column] = Tile.CROSS;

                playerOneTurn = true;

                if (board[0][0] == Tile.CROSS && board[0][1] == Tile.CROSS && board[0][2] == Tile.CROSS){
                    gameOver = true;
                    return Tile.WIN1;
                }

                if (board[1][0] == Tile.CROSS && board[1][1] == Tile.CROSS && board[1][2] == Tile.CROSS) {
                    gameOver = true;
                    return Tile.WIN1;
                }


                if (board[2][0] == Tile.CROSS && board[2][1] == Tile.CROSS && board[2][2] == Tile.CROSS) {
                    gameOver = true;
                    return Tile.WIN1;
                }

                if (board[0][0] == Tile.CROSS && board[1][0] == Tile.CROSS && board[2][0] == Tile.CROSS) {
                    gameOver = true;
                    return Tile.WIN1;
                }

                if (board[0][1] == Tile.CROSS && board[1][1] == Tile.CROSS && board[2][1] == Tile.CROSS) {
                    gameOver = true;
                    return Tile.WIN1;
                }

                if (board[0][2] == Tile.CROSS && board[1][2] == Tile.CROSS && board[2][2] == Tile.CROSS) {
                    gameOver = true;
                    return Tile.WIN1;
                }

                if (board[0][0] == Tile.CROSS && board[1][1] == Tile.CROSS && board[2][2] == Tile.CROSS) {
                    gameOver = true;
                    return Tile.WIN1;
                }

                if (board[0][2] == Tile.CROSS && board[1][1] == Tile.CROSS && board[2][0] == Tile.CROSS) {
                    gameOver = true;
                    return Tile.WIN1;
                }

                return Tile.CROSS;
            }

            else {
                board[row][column] = Tile.CIRCLE;
                playerOneTurn = false;

                if (board[0][0] == Tile.CIRCLE && board[0][1] == Tile.CIRCLE && board[0][2] == Tile.CIRCLE){
                    gameOver = true;
                    return Tile.WIN2;
                }

                if (board[1][0] == Tile.CIRCLE && board[1][1] == Tile.CIRCLE && board[1][2] == Tile.CIRCLE) {
                    gameOver = true;
                    return Tile.WIN2;
                }


                if (board[2][0] == Tile.CIRCLE && board[2][1] == Tile.CIRCLE && board[2][2] == Tile.CIRCLE) {
                    gameOver = true;
                    return Tile.WIN2;
                }

                if (board[0][0] == Tile.CIRCLE && board[1][0] == Tile.CIRCLE && board[2][0] == Tile.CIRCLE) {
                    gameOver = true;
                    return Tile.WIN2;
                }

                if (board[0][1] == Tile.CIRCLE && board[1][1] == Tile.CIRCLE && board[2][1] == Tile.CIRCLE) {
                    gameOver = true;
                    return Tile.WIN2;
                }

                if (board[0][2] == Tile.CIRCLE && board[1][2] == Tile.CIRCLE && board[2][2] == Tile.CIRCLE) {
                    gameOver = true;
                    return Tile.WIN2;
                }

                if (board[0][0] == Tile.CIRCLE && board[1][1] == Tile.CIRCLE && board[2][2] == Tile.CIRCLE) {
                    gameOver = true;
                    return Tile.WIN2;
                }

                if (board[0][2] == Tile.CIRCLE && board[1][1] == Tile.CIRCLE && board[2][0] == Tile.CIRCLE) {
                    gameOver = true;
                    return Tile.WIN2;
                }

                return Tile.CIRCLE;
            }



        }

        else {
            return Tile.INVALID;
        }
    }
}
