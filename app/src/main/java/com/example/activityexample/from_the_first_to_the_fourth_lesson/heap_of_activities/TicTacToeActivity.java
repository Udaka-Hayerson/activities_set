package com.example.activityexample.from_the_first_to_the_fourth_lesson.heap_of_activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;

import com.example.activityexample.R;

public class TicTacToeActivity extends Activity {
    String x = "❌";
    String o = "⭕";
    String x_player;
    String o_player;
    Button btn00;
    Button btn01;
    Button btn02;
    Button btn10;
    Button btn11;
    Button btn12;
    Button btn20;
    Button btn21;
    Button btn22;
    TextView speaker_xo;
    boolean x_or_o = true;
    int count = 0;
    Intent intent;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tic_tac_toe_activity);// "❌"  "⭕"
        btn00 = (Button) findViewById(R.id.table_cell_00);
        btn01 = (Button) findViewById(R.id.table_cell_01);
        btn02 = (Button) findViewById(R.id.table_cell_02);
        btn10 = (Button) findViewById(R.id.table_cell_10);
        btn11 = (Button) findViewById(R.id.table_cell_11);
        btn12 = (Button) findViewById(R.id.table_cell_12);
        btn20 = (Button) findViewById(R.id.table_cell_20);
        btn21 = (Button) findViewById(R.id.table_cell_21);
        btn22 = (Button) findViewById(R.id.table_cell_22);
        speaker_xo = (TextView) findViewById(R.id.presenter);
        intent = getIntent();
        x_player = intent.getStringExtra("f_player") + x;
        o_player = intent.getStringExtra("s_player") + o;
        speaker_xo.setText("PLAYER " + x_player + " IS PLAYING");




    }
    public void restartGame(View view){
        Toast.makeText(this, "come back to play again", Toast.LENGTH_LONG).show();
        clearTablwCells();
        speaker_xo.setText("");
        Intent intent_back = new Intent(this, TicTacToeMenu.class);
        startActivity(intent_back);
    }

    void clearTablwCells(){
        x_or_o = true;
        count = 0;
        btn00.setText("");
        btn01.setText("");
        btn02.setText("");
        btn10.setText("");
        btn11.setText("");
        btn12.setText("");
        btn20.setText("");
        btn21.setText("");
        btn22.setText("");
        speaker_xo.setText("PLAYER " + x_player + " IS PLAYING");
    }


    public void winVerification(String s, String player) {

       if(btn00.getText().equals(s) && btn01.getText().equals(s) && btn02.getText().equals(s)){
           Toast.makeText(this, "PLAYER " + player + " WON!!!", Toast.LENGTH_LONG).show();
           clearTablwCells();
       } else if(btn10.getText().equals(s) && btn11.getText().equals(s) && btn12.getText().equals(s)){
           Toast.makeText(this, "PLAYER " + player + " WON!!!", Toast.LENGTH_LONG).show();
           clearTablwCells();
       } else if(btn20.getText().equals(s) && btn21.getText().equals(s) && btn22.getText().equals(s)){
           Toast.makeText(this, "PLAYER " + player + " WON!!!", Toast.LENGTH_LONG).show();
           clearTablwCells();
       } else if(btn00.getText().equals(s) && btn10.getText().equals(s) && btn20.getText().equals(s)){
           Toast.makeText(this, "PLAYER " + player + " WON!!!", Toast.LENGTH_LONG).show();
           clearTablwCells();
       } else if(btn01.getText().equals(s) && btn11.getText().equals(s) && btn21.getText().equals(s)){
           Toast.makeText(this, "PLAYER " + player + " WON!!!", Toast.LENGTH_LONG).show();
           clearTablwCells();
       } else if(btn02.getText().equals(s) && btn12.getText().equals(s) && btn22.getText().equals(s)){
           Toast.makeText(this, "PLAYER " + player + " WON!!!", Toast.LENGTH_LONG).show();
           clearTablwCells();
       } else if(btn00.getText().equals(s) && btn11.getText().equals(s) && btn22.getText().equals(s)){
           Toast.makeText(this, "PLAYER " + player + " WON!!!", Toast.LENGTH_LONG).show();
           clearTablwCells();
       } else if(btn20.getText().equals(s) && btn11.getText().equals(s) && btn02.getText().equals(s)){
           Toast.makeText(this, "PLAYER " + player + " WON!!!", Toast.LENGTH_LONG).show();
           clearTablwCells();
       } else {
           judge();
       }
    }

    public void judge() {
        if(count == 9){
            clearTablwCells();
            Toast.makeText(this, "draw in the game", Toast.LENGTH_LONG).show();
            return;
        }
        x_or_o = !x_or_o;
        if(x_or_o){
            speaker_xo.setText("PLAYER " + x_player + " IS PLAYING");
        } else {
            speaker_xo.setText("PLAYER " + o_player + " IS PLAYING");
        }
    }

    public void check(View v) {
        count++;
        if (v.getId() == R.id.table_cell_00) {
            if (x_or_o) {
                btn00.setText("❌");
                winVerification("❌", x_player);
            } else {
                btn00.setText("⭕");
                winVerification("⭕", o_player);
            }
            return;
        }
        if (v.getId() == R.id.table_cell_01) {
            if (x_or_o) {
                btn01.setText("❌");
                winVerification("❌", x_player);
            } else {
                btn01.setText("⭕");
                winVerification("⭕", o_player);
            }
            return;
        }
        if (v.getId() == R.id.table_cell_02) {
            if (x_or_o) {
                btn02.setText("❌");
                winVerification("❌", x_player);
            } else {
                btn02.setText("⭕");
                winVerification("⭕", o_player);
            }
            return;
        }
        if (v.getId() == R.id.table_cell_10) {
            if (x_or_o) {
                btn10.setText("❌");
                winVerification("❌", x_player);
            } else {
                btn10.setText("⭕");
                winVerification("⭕", o_player);
            }
            return;
        }
        if (v.getId() == R.id.table_cell_11) {
            if (x_or_o) {
                btn11.setText("❌");
                winVerification("❌", x_player);
            } else {
                btn11.setText("⭕");
                winVerification("⭕", o_player);
            }
            return;
        }
        if (v.getId() == R.id.table_cell_12) {
            if (x_or_o) {
                btn12.setText("❌");
                winVerification("❌", x_player);
            } else {
                btn12.setText("⭕");
                winVerification("⭕", o_player);
            }
            return;
        }
        if (v.getId() == R.id.table_cell_20) {
            if (x_or_o) {
                btn20.setText("❌");
                winVerification("❌", x_player);
            } else {
                btn20.setText("⭕");
                winVerification("⭕", o_player);
            }
            return;
        }
        if (v.getId() == R.id.table_cell_21) {
            if (x_or_o) {
                btn21.setText("❌");
                winVerification("❌", x_player);
            } else {
                btn21.setText("⭕");
                winVerification("⭕", o_player);
            }
            return;
        }
        if (v.getId() == R.id.table_cell_22) {
            if (x_or_o) {
                btn22.setText("❌");
                winVerification("❌", x_player);
            } else {
                btn22.setText("⭕");
                winVerification("⭕", o_player);
            }
        }
    }
}
