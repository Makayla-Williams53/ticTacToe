package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    //creates variable to determine whose turn it is
    public int playerTurn = 1;
    //creates a variable for each cell to determine if they have been used or not
    public boolean cell1 = false, cell2 = false, cell3 = false, cell4 = false, cell5 = false, cell6 = false, cell7 = false, cell8 = false, cell9 = false;
    private TextView playerText;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        playerText = findViewById(R.id.playerT);
    }

    //when the top left button is clicked
    public void playerClick1(View v)
    {
        //checks if it isn't used yet
        if(cell1 == false)
        {
            //changes it to an x if its player one's turn
            if(playerTurn == 1)
            {
                ImageView box1 = (ImageView) findViewById(R.id.xo1);
                Drawable playerSymbol = getResources().getDrawable(R.drawable.x);
                box1.setImageDrawable(playerSymbol);
                playerTurn = 2;
            }
            //changes it to an o if its player two's turn
            else
            {
                ImageView box1 = (ImageView) findViewById(R.id.xo1);
                Drawable playerSymbol = getResources().getDrawable(R.drawable.o);
                box1.setImageDrawable(playerSymbol);
                playerTurn = 1;
            }
            //changes the variable to show that this square has been used
            cell1 = true;
            changeTurn();
        }
    }

    //when top middle button is clicked changes it to the correct player's symbol
    public void playerClick2(View v)
    {
        //checks if it isn't used yet
        if(cell2 == false)
        {
            //changes it to an x if its player one's turn
            if(playerTurn == 1)
            {
                ImageView box1 = (ImageView) findViewById(R.id.xo2);
                Drawable playerSymbol = getResources().getDrawable(R.drawable.x);
                box1.setImageDrawable(playerSymbol);
                playerTurn = 2;
            }
            //changes it to an o if its player two's turn
            else
            {
                ImageView box1 = (ImageView) findViewById(R.id.xo2);
                Drawable playerSymbol = getResources().getDrawable(R.drawable.o);
                box1.setImageDrawable(playerSymbol);
                playerTurn = 1;
            }
            //changes the variable to show that this square has been used
            cell2 = true;
            changeTurn();
        }
    }

    //when the top right button is clicked changes it to the correct player's symbol
    public void playerClick3(View v)
    {
        //checks if it isn't used yet
        if(cell3 == false)
        {
            //changes it to an x if its player one's turn
            if(playerTurn == 1)
            {
                ImageView box1 = (ImageView) findViewById(R.id.xo3);
                Drawable playerSymbol = getResources().getDrawable(R.drawable.x);
                box1.setImageDrawable(playerSymbol);
                playerTurn = 2;
            }
            //changes it to an o if its player two's turn
            else
            {
                ImageView box1 = (ImageView) findViewById(R.id.xo3);
                Drawable playerSymbol = getResources().getDrawable(R.drawable.o);
                box1.setImageDrawable(playerSymbol);
                playerTurn = 1;
            }
            //changes the variable to show that this square has been used
            cell3 = true;
            changeTurn();
        }
    }

    //when the middle left button is clicked changes it to the correct player's symbol
    public void playerClick4(View v)
    {
        //checks if it isn't used yet
        if(cell4 == false)
        {
            //changes it to an x if its player one's turn
            if(playerTurn == 1)
            {
                ImageView box1 = (ImageView) findViewById(R.id.xo4);
                Drawable playerSymbol = getResources().getDrawable(R.drawable.x);
                box1.setImageDrawable(playerSymbol);
                playerTurn = 2;
            }
            //changes it to an o if its player two's turn
            else
            {
                ImageView box1 = (ImageView) findViewById(R.id.xo4);
                Drawable playerSymbol = getResources().getDrawable(R.drawable.o);
                box1.setImageDrawable(playerSymbol);
                playerTurn = 1;
            }
            //changes the variable to show that this square has been used
            cell4 = true;
            changeTurn();
        }
    }

    //when the middle middle button is clicked changes it to the correct player's symbol
    public void playerClick5(View v)
    {
        //checks if it isn't used yet
        if(cell5 == false)
        {
            //changes it to an x if its player one's turn
            if(playerTurn == 1)
            {
                ImageView box1 = (ImageView) findViewById(R.id.xo5);
                Drawable playerSymbol = getResources().getDrawable(R.drawable.x);
                box1.setImageDrawable(playerSymbol);
                playerTurn = 2;
            }
            //changes it to an o if its player two's turn
            else
            {
                ImageView box1 = (ImageView) findViewById(R.id.xo5);
                Drawable playerSymbol = getResources().getDrawable(R.drawable.o);
                box1.setImageDrawable(playerSymbol);
                playerTurn = 1;
            }
            //changes the variable to show that this square has been used
            cell5 = true;
            changeTurn();
        }
    }

    //when the middle right button is clicked changes it to the correct player's symbol
    public void playerClick6(View v)
    {
        //checks if it isn't used yet
        if(cell6 == false)
        {
            //changes it to an x if its player one's turn
            if(playerTurn == 1)
            {
                ImageView box1 = (ImageView) findViewById(R.id.xo6);
                Drawable playerSymbol = getResources().getDrawable(R.drawable.x);
                box1.setImageDrawable(playerSymbol);
                playerTurn = 2;
            }
            //changes it to an o if its player two's turn
            else
            {
                ImageView box1 = (ImageView) findViewById(R.id.xo6);
                Drawable playerSymbol = getResources().getDrawable(R.drawable.o);
                box1.setImageDrawable(playerSymbol);
                playerTurn = 1;
            }
            //changes the variable to show that this square has been used
            cell6 = true;
            changeTurn();
        }
    }

    //when the bottom left button is clicked changes it to the correct player's symbol
    public void playerClick7(View v)
    {
        //checks if it isn't used yet
        if(cell7 == false)
        {
            //changes it to an x if its player one's turn
            if(playerTurn == 1)
            {
                ImageView box1 = (ImageView) findViewById(R.id.xo7);
                Drawable playerSymbol = getResources().getDrawable(R.drawable.x);
                box1.setImageDrawable(playerSymbol);
                playerTurn = 2;
            }
            //changes it to an o if its player two's turn
            else
            {
                ImageView box1 = (ImageView) findViewById(R.id.xo7);
                Drawable playerSymbol = getResources().getDrawable(R.drawable.o);
                box1.setImageDrawable(playerSymbol);
                playerTurn = 1;
            }
            //changes the variable to show that this square has been used
            cell7 = true;
            changeTurn();
        }
    }

    //when the bottom middle button is clicked changes it to the correct player's symbol
    public void playerClick8(View v)
    {
        //checks if it isn't used yet
        if(cell8 == false)
        {
            //changes it to an x if its player one's turn
            if(playerTurn == 1)
            {
                ImageView box1 = (ImageView) findViewById(R.id.xo8);
                Drawable playerSymbol = getResources().getDrawable(R.drawable.x);
                box1.setImageDrawable(playerSymbol);
                playerTurn = 2;
            }
            //changes it to an o if its player two's turn
            else
            {
                ImageView box1 = (ImageView) findViewById(R.id.xo8);
                Drawable playerSymbol = getResources().getDrawable(R.drawable.o);
                box1.setImageDrawable(playerSymbol);
                playerTurn = 1;
            }
            //changes the variable to show that this square has been used
            cell8 = true;
            changeTurn();
        }
    }

    //when the bottom right button is clicked changes it to the correct player's symbol
    public void playerClick9(View v)
    {
        //checks if it isn't used yet
        if(cell9 == false)
        {
            //changes it to an x if its player one's turn
            if(playerTurn == 1)
            {
                ImageView box1 = (ImageView) findViewById(R.id.xo9);
                Drawable playerSymbol = getResources().getDrawable(R.drawable.x);
                box1.setImageDrawable(playerSymbol);
                playerTurn = 2;
            }
            //changes it to an o if its player two's turn
            else
            {
                ImageView box1 = (ImageView) findViewById(R.id.xo9);
                Drawable playerSymbol = getResources().getDrawable(R.drawable.o);
                box1.setImageDrawable(playerSymbol);
                playerTurn = 1;
            }
            //changes the variable to show that this square has been used
            cell9 = true;
            changeTurn();
        }
    }

    public void changeTurn ()
    {
        if (playerTurn == 1)
        {
            playerText.setText("Player X Turn");
        }
        else if (playerTurn == 2)
        {
            playerText.setText("Player O Turn");
        }
    }
}