package com.example.activityexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;

//Задание 2
//Дописать игру крестики-нолики с предыдущего урока. Добавить Activity меню, где игроки будут вводить
//свои имена, а приступать к игре лиш тогда, когда они ввели свои имена. (Добавить кнопку на эту Activity
//“Start Game”). После завершения игры будет бросаться Toast уведомления, кто из них выиграл по имени
//или ничья. Кнопка “Restart Game” на Activity с полем игры будет завершать эту Activity и возвращаться на
//главную. При выходе из игры бросить уведомления с просьбой сыграть снова.

public class TicTacToeMenu extends Activity {
    EditText first_player;
    EditText second_player;
    Intent intent;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tic_tac_toe_menu);
        first_player =(EditText) findViewById(R.id.edit_first_player);
        second_player =(EditText) findViewById(R.id.edit_second_player);


    }
    public void startGame(View v){
        boolean f = first_player.getText().toString().isEmpty();// .isEmpty(); .equals("");
        boolean s = second_player.getText().toString().isEmpty();
        if((f||s)||(f && s)){
            Toast.makeText(this, "you don't entered name first or/and second player", Toast.LENGTH_SHORT).show();
        } else {
            String f_player = first_player.getText().toString();
            String s_player = second_player.getText().toString();
            intent = new Intent(this, TicTacToeActivity.class);
            intent.putExtra("f_player" , f_player);
            intent.putExtra("s_player" , s_player);
            startActivity(intent);
        }
    }
}
