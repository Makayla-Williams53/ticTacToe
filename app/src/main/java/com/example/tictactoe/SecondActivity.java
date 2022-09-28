package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {

    public int playerTurn = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void playerClick1(View v)
    {
        if(playerTurn == 1)
        {
            ImageView box1 = (ImageView) findViewById(R.id.xo1);
            Drawable playerSymbol = getResources().getDrawable(R.drawable.o);
            box1.setImageDrawable(playerSymbol);
            playerTurn = 2;
        }
        else
        {
            ImageView box1 = (ImageView) findViewById(R.id.xo1);
            Drawable playerSymbol = getResources().getDrawable(R.drawable.x);
            box1.setImageDrawable(playerSymbol);
            playerTurn = 1;
        }
    }

    public void playerClick2(View v)
    {
        if(playerTurn == 1)
        {
            ImageView box1 = (ImageView) findViewById(R.id.xo2);
            Drawable playerSymbol = getResources().getDrawable(R.drawable.o);
            box1.setImageDrawable(playerSymbol);
            playerTurn = 2;
        }
        else
        {
            ImageView box1 = (ImageView) findViewById(R.id.xo2);
            Drawable playerSymbol = getResources().getDrawable(R.drawable.x);
            box1.setImageDrawable(playerSymbol);
            playerTurn = 1;
        }
    }

    public void playerClick3(View v)
    {
        if(playerTurn == 1)
        {
            ImageView box1 = (ImageView) findViewById(R.id.xo3);
            Drawable playerSymbol = getResources().getDrawable(R.drawable.o);
            box1.setImageDrawable(playerSymbol);
            playerTurn = 2;
        }
        else
        {
            ImageView box1 = (ImageView) findViewById(R.id.xo3);
            Drawable playerSymbol = getResources().getDrawable(R.drawable.x);
            box1.setImageDrawable(playerSymbol);
            playerTurn = 1;
        }
    }

    public void playerClick4(View v)
    {
        if(playerTurn == 1)
        {
            ImageView box1 = (ImageView) findViewById(R.id.xo4);
            Drawable playerSymbol = getResources().getDrawable(R.drawable.o);
            box1.setImageDrawable(playerSymbol);
            playerTurn = 2;
        }
        else
        {
            ImageView box1 = (ImageView) findViewById(R.id.xo4);
            Drawable playerSymbol = getResources().getDrawable(R.drawable.x);
            box1.setImageDrawable(playerSymbol);
            playerTurn = 1;
        }
    }

    public void playerClick5(View v)
    {
        if(playerTurn == 1)
        {
            ImageView box1 = (ImageView) findViewById(R.id.xo5);
            Drawable playerSymbol = getResources().getDrawable(R.drawable.o);
            box1.setImageDrawable(playerSymbol);
            playerTurn = 2;
        }
        else
        {
            ImageView box1 = (ImageView) findViewById(R.id.xo5);
            Drawable playerSymbol = getResources().getDrawable(R.drawable.x);
            box1.setImageDrawable(playerSymbol);
            playerTurn = 1;
        }
    }

    public void playerClick6(View v)
    {
        if(playerTurn == 1)
        {
            ImageView box1 = (ImageView) findViewById(R.id.xo6);
            Drawable playerSymbol = getResources().getDrawable(R.drawable.o);
            box1.setImageDrawable(playerSymbol);
            playerTurn = 2;
        }
        else
        {
            ImageView box1 = (ImageView) findViewById(R.id.xo6);
            Drawable playerSymbol = getResources().getDrawable(R.drawable.x);
            box1.setImageDrawable(playerSymbol);
            playerTurn = 1;
        }
    }

    public void playerClick7(View v)
    {
        if(playerTurn == 1)
        {
            ImageView box1 = (ImageView) findViewById(R.id.xo7);
            Drawable playerSymbol = getResources().getDrawable(R.drawable.o);
            box1.setImageDrawable(playerSymbol);
            playerTurn = 2;
        }
        else
        {
            ImageView box1 = (ImageView) findViewById(R.id.xo7);
            Drawable playerSymbol = getResources().getDrawable(R.drawable.x);
            box1.setImageDrawable(playerSymbol);
            playerTurn = 1;
        }
    }

    public void playerClick8(View v)
    {
        if(playerTurn == 1)
        {
            ImageView box1 = (ImageView) findViewById(R.id.xo8);
            Drawable playerSymbol = getResources().getDrawable(R.drawable.o);
            box1.setImageDrawable(playerSymbol);
            playerTurn = 2;
        }
        else
        {
            ImageView box1 = (ImageView) findViewById(R.id.xo8);
            Drawable playerSymbol = getResources().getDrawable(R.drawable.x);
            box1.setImageDrawable(playerSymbol);
            playerTurn = 1;
        }
    }

    public void playerClick9(View v)
    {
        if(playerTurn == 1)
        {
            ImageView box1 = (ImageView) findViewById(R.id.xo9);
            Drawable playerSymbol = getResources().getDrawable(R.drawable.o);
            box1.setImageDrawable(playerSymbol);
            playerTurn = 2;
        }
        else
        {
            ImageView box1 = (ImageView) findViewById(R.id.xo9);
            Drawable playerSymbol = getResources().getDrawable(R.drawable.x);
            box1.setImageDrawable(playerSymbol);
            playerTurn = 1;
        }
    }
}