package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int chances=4;
    int rightNumber=(int) (Math.random()*20); ////every new game has different number to be guessed!!

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void newGame(){
        chances=4;
        int rightNumber=(int) (Math.random()*20); ////every new game has different number to be guessed!!

    }

    public void checker(View v){

        EditText val=(EditText) findViewById(R.id.value); // capturing the entered value..
        String valInString=val.getText().toString();     // converting the entered value in string.
        int valInInt=Integer.parseInt(valInString);  //string is converted in integer type





        if(chances>=0){
            if(valInInt<rightNumber){
                Toast.makeText(this,"Your guess is low, guess a higher value  "+chances+"cahnces are left",Toast.LENGTH_SHORT).show();
            }
            else if(valInInt==rightNumber){
                Toast.makeText(this,"You guessed it Right , Congets you won with "+chances+"left",Toast.LENGTH_SHORT).show();
                newGame();
            }
            else if(valInInt>rightNumber){
                Toast.makeText(this,"Your guess is high, guess a lower value  "+chances+"cahnces are left",Toast.LENGTH_SHORT).show();
            }
        }else{
            Toast.makeText(this, "Your chances are over", Toast.LENGTH_SHORT).show();
        }

        chances--;
    }


}