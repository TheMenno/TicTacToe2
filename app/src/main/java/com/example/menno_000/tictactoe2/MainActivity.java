package com.example.menno_000.tictactoe2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Game game;
    Integer row;
    Integer column;

    Button Button1;
    Button Button2;
    Button Button3;
    Button Button4;
    Button Button5;
    Button Button6;
    Button Button7;
    Button Button8;
    Button Button9;

    TextView Text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        game = new Game();

        Button1 = findViewById(R.id.button1);
        Button2 = findViewById(R.id.button2);
        Button3 = findViewById(R.id.button3);
        Button4 = findViewById(R.id.button4);
        Button5 = findViewById(R.id.button5);
        Button6 = findViewById(R.id.button6);
        Button7 = findViewById(R.id.button7);
        Button8 = findViewById(R.id.button8);
        Button9 = findViewById(R.id.button9);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        String button1Text = (String) Button1.getText();
        String button2Text = (String) Button2.getText();
        String button3Text = (String) Button3.getText();
        String button4Text = (String) Button4.getText();
        String button5Text = (String) Button5.getText();
        String button6Text = (String) Button6.getText();
        String button7Text = (String) Button7.getText();
        String button8Text = (String) Button8.getText();
        String button9Text = (String) Button9.getText();

        outState.putString("Button1Text", button1Text);
        outState.putString("Button2Text", button2Text);
        outState.putString("Button3Text", button3Text);
        outState.putString("Button4Text", button4Text);
        outState.putString("Button5Text", button5Text);
        outState.putString("Button6Text", button6Text);
        outState.putString("Button7Text", button7Text);
        outState.putString("Button8Text", button8Text);
        outState.putString("Button9Text", button9Text);
    }

    @Override
    public void onRestoreInstanceState(Bundle inState) {
        super.onRestoreInstanceState(inState);

        String loadButton1Text = inState.getString("Button1Text");
        Button1.setText(loadButton1Text);

        String loadButton2Text = inState.getString("Button2Text");
        Button2.setText(loadButton2Text);

        String loadButton3Text = inState.getString("Button3Text");
        Button3.setText(loadButton3Text);

        String loadButton4Text = inState.getString("Button4Text");
        Button4.setText(loadButton4Text);

        String loadButton5Text = inState.getString("Button5Text");
        Button5.setText(loadButton5Text);

        String loadButton6Text = inState.getString("Button6Text");
        Button6.setText(loadButton6Text);

        String loadButton7Text = inState.getString("Button7Text");
        Button7.setText(loadButton7Text);

        String loadButton8Text = inState.getString("Button8Text");
        Button8.setText(loadButton8Text);

        String loadButton9Text = inState.getString("Button9Text");
        Button9.setText(loadButton9Text);

    }

    public void tileClicked(View view) {
        int id = view.getId();


        if(id==R.id.button1 || id==R.id.button2 || id==R.id.button3){
            row = 0; }

        if(id==R.id.button4 || id==R.id.button5 || id==R.id.button6){
            row = 1; }

        if(id==R.id.button7 || id==R.id.button8 || id==R.id.button9){
            row = 2; }

        if(id==R.id.button1 || id==R.id.button4 || id==R.id.button7){
            column = 0; }

        if(id==R.id.button2 || id==R.id.button5 || id==R.id.button8){
            column = 1; }

        if(id==R.id.button3 || id==R.id.button6 || id==R.id.button9){
            column = 2; }


        Tile tile = game.draw(row, column);

        Button button = findViewById(id);

        switch(tile) {
            case CROSS:
                button.setText("X");
                break;
            case CIRCLE:
                button.setText("O");
                break;
            case INVALID:
                // do something different
                Toast.makeText(MainActivity.this, String.valueOf("Don't press a button that's already been pressed!"), Toast.LENGTH_SHORT).show();
                break;
            case WIN1:
                Text = findViewById(R.id.text);
                Text.setText("Player X won!");
                button.setText("X");
                break;
            case WIN2:
                Text = findViewById(R.id.text);
                Text.setText("Player O won!");
                button.setText("O");
                break;
        }
    }

    public void resetClicked(View view) {
        game = new Game();

        Button button1 = findViewById(R.id.button1);
        button1.setText("");

        Button button2 = findViewById(R.id.button2);
        button2.setText("");

        Button button3 = findViewById(R.id.button3);
        button3.setText("");

        Button button4 = findViewById(R.id.button4);
        button4.setText("");

        Button button5 = findViewById(R.id.button5);
        button5.setText("");

        Button button6 = findViewById(R.id.button6);
        button6.setText("");

        Button button7 = findViewById(R.id.button7);
        button7.setText("");

        Button button8 = findViewById(R.id.button8);
        button8.setText("");

        Button button9 = findViewById(R.id.button9);
        button9.setText("");

        TextView Text = findViewById(R.id.text);
        Text.setText("");
    }
}
