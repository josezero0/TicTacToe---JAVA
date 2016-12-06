package com.tictactoe;

import javax.swing.JButton;

/**
 *
 * @author BuenSeñor
 */
public class TicTacToe {

    /**
     * Check if the player with de 'mark' win the game.
     * @param mark String with the mark.
     * @return 'true' if the player win, 'false' otherwise.
     */
    public boolean win(String mark) {
        int aux = 0;
        for (int i = 0; i < 3; i++) { //Vertical
            for (int j = 0; j < 3; j++) {
                if (lstJButton[i][j].getText().equals(mark)) {
                    aux++;
                }
            }
            if (aux == 3) {
                return true;
            }
            aux = 0;
        }

        for (int i = 0; i < 3; i++) { //Horizontal
            for (int j = 0; j < 3; j++) {
                if (lstJButton[j][i].getText().equals(mark)) {
                    aux++;
                }
            }
            if (aux == 3) {
                return true;
            }
            aux = 0;
        }
        for (int i = 0, j = 0; i < 3; i++, j++) {
            if (lstJButton[i][j].getText().equals(mark)) {
                aux++;
            }
        }
        if (aux == 3) {
            return true;
        }
        aux = 0;
        for (int i = 2, j = 0; j < 3; i--, j++) {
            if (lstJButton[i][j].getText().equals(mark)) {
                aux++;
            }
        }
        return aux == 3;
    }

    public TicTacToe(JButton x0y0, JButton x1y0, JButton x2y0,
            JButton x0y1, JButton x1y1, JButton x2y1,
            JButton x0y2, JButton x1y2, JButton x2y2) {
        lstJButton = new JButton[3][3];
        lstJButton[0][0] = x0y0;
        lstJButton[1][0] = x1y0;
        lstJButton[2][0] = x2y0;
        lstJButton[0][1] = x0y1;
        lstJButton[1][1] = x1y1;
        lstJButton[2][1] = x2y1;
        lstJButton[0][2] = x0y2;
        lstJButton[1][2] = x1y2;
        lstJButton[2][2] = x2y2;
    }

    //Getters & Setters
    /**
     * Set a coordenate of the array of buttons.
     *
     * @param x coordanate X
     * @param y coordenate Y
     * @param mark String to set the text.
     */
    public void setCoordenate(int x, int y, String mark) {
        lstJButton[x][y].setText(mark);
    }

    /**
     * Check if a coordenate if empty.
     *
     * @param x coordenate X
     * @param y coordenate Y
     * @return 'true' if it's empty, 'false' otherwise.
     */
    public boolean isEmpty(int x, int y) {
        return lstJButton[x][y].getText().isEmpty();
    }
    
    public void incrementCount(){
        count++;
    }
    
    public int getCount(){
        return count;
    }
    //End getters & setters

    //Variable declaration
    private final JButton[][] lstJButton;
    private int count = 0;
    //End variable declaration

    //Static values
    public static final String PVP = "Player vs Player";
    public static final String PVC = "Player vs CPU";
    public static final String CVC = "CPU vs CPU";
    public static final String PLAYER_1 = "Player 1";
    public static final String PLAYER_2 = "Player 2";
    public static final String CPU = "CPU";
    public static final String CHAR_X = "X";
    public static final String CHAR_O = "O";
    //End static values

}
