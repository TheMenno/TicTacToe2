package com.example.menno_000.tictactoe2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Game game;
    Integer row;
    Integer column;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        game = new Game();
    }

    public void tileClicked(View view) {
        int id = view.getId();

        Toast.makeText(MainActivity.this, String.valueOf(id), Toast.LENGTH_SHORT).show();

        /*
                if(id==R.id.button){
            row = 0;
            column = 0; }

        It has to translate the button into the right coordinates. Use int id = view.getId(); to find out which button it is, and (temporarily) store the corresponding row and column.

        It has to feed those coordinates to the Games draw method:

        Tile tile = game.draw(row, column);
        Depending on the outcome of the draw method, it has to update the selected button. Here’s a starter:

        switch(tile) {
            case CROSS:
                // do something
                break;
            case CIRCLE:
                // do something
                break;
            case INVALID:
                // do something different
                break; */
    }

    /*resetClicked() {
        game = new Game();
        /*But don’t forget to reset the UI as well!
    }*/
}
