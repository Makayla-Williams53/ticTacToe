package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    //creates variable to determine whose turn it is
    public int playerTurn = 1;
    //creates a variable for each cell to determine if they have been used or not
    public boolean cell1 = false, cell2 = false, cell3 = false, cell4 = false, cell5 = false, cell6 = false, cell7 = false, cell8 = false, cell9 = false;

    //creates a variables for each square to see who used what square
    public int square1 = 0, square2 = 0, square3 = 0, square4 = 0, square5 = 0, square6 = 0, square7 = 0, square8 = 0, square9 = 0;
    public TextView playerText;
    public boolean inGame = true;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

    }//end onCreate

    public void checkWinner()
    {
        //creates the winnerView and replayButton and playerView to alter later
        TextView winnerView = (TextView) findViewById(R.id.winnerView);
        Button replayButton = (Button) findViewById(R.id.replayButton);
        playerText = (TextView) findViewById(R.id.playerT);

        boolean found = false;

        if(square1 == 1 && square2 == 1 && square3 == 1)
        {
            //says player 1 won
            winnerView.setText("Player 1 has won!!!");
            //stops game
            inGame = false;
            //makes replay button visible
            replayButton.setVisibility(View.VISIBLE);
            //changes player turn view
            playerText.setText("Game Over!!!");
            found = true;
        }//end 1st if
        else if(square4 == 1 && square5 == 1 && square6 == 1)
        {
            winnerView.setText("Player 1 has won!!!");
            inGame = false;
            replayButton.setVisibility(View.VISIBLE);
            playerText.setText("Game Over!!!");
            found = true;
        }//end 2nd if
        else if(square7 == 1 && square8 == 1 && square9 == 1)
        {
            winnerView.setText("Player 1 has won!!!");
            inGame = false;
            replayButton.setVisibility(View.VISIBLE);
            playerText.setText("Game Over!!!");
            found = true;
        }//end 3rd if
        else if(square1 == 1 && square4 == 1 && square7 == 1)
        {
            winnerView.setText("Player 1 has won!!!");
            inGame = false;
            replayButton.setVisibility(View.VISIBLE);
            playerText.setText("Game Over!!!");
            found = true;
        }//end 4th if
        else if(square2 == 1 && square5 == 1 && square8 == 1)
        {
            winnerView.setText("Player 1 has won!!!");
            inGame = false;
            replayButton.setVisibility(View.VISIBLE);
            playerText.setText("Game Over!!!");
            found = true;
        }//end 5th if
        else if(square3 == 1 && square6 == 1 && square9 == 1)
        {
            winnerView.setText("Player 1 has won!!!");
            inGame = false;
            replayButton.setVisibility(View.VISIBLE);
            playerText.setText("Game Over!!!");
            found = true;
        }//end 6th if
        else if(square1 == 1 && square5 == 1 && square9 == 1)
        {
            winnerView.setText("Player 1 has won!!!");
            inGame = false;
            replayButton.setVisibility(View.VISIBLE);
            playerText.setText("Game Over!!!");
            found = true;
        }//end 7th if
        else if(square3 == 1 && square5 == 1 && square7 == 1)
        {
            winnerView.setText("Player 1 has won!!!");
            inGame = false;
            replayButton.setVisibility(View.VISIBLE);
            playerText.setText("Game Over!!!");
            found = true;
        }//end 8th if

        if(square1 == 2 && square2 == 2 && square3 == 2)
        {
            winnerView.setText("Player 2 has won!!!");
            inGame = false;
            replayButton.setVisibility(View.VISIBLE);
            playerText.setText("Game Over!!!");
            found = true;
        }//end 1st if
        else if(square4 == 2 && square5 == 2 && square6 == 2)
        {
            winnerView.setText("Player 2 has won!!!");
            inGame = false;
            replayButton.setVisibility(View.VISIBLE);
            playerText.setText("Game Over!!!");
            found = true;
        }//end 2nd if
        else if(square7 == 2 && square8 == 2 && square9 == 2)
        {
            winnerView.setText("Player 2 has won!!!");
            inGame = false;
            replayButton.setVisibility(View.VISIBLE);
            playerText.setText("Game Over!!!");
            found = true;
        }//end 3rd if
        else if(square1 == 2 && square4 == 2 && square7 == 2)
        {
            winnerView.setText("Player 2 has won!!!");
            inGame = false;
            replayButton.setVisibility(View.VISIBLE);
            playerText.setText("Game Over!!!");
            found = true;
        }//end 4th if
        else if(square2 == 2 && square5 == 2 && square8 == 2)
        {
            winnerView.setText("Player 2 has won!!!");
            inGame = false;
            replayButton.setVisibility(View.VISIBLE);
            playerText.setText("Game Over!!!");
            found = true;
        }//end 5th if
        else if(square3 == 2 && square6 == 2 && square9 == 2)
        {
            winnerView.setText("Player 2 has won!!!");
            inGame = false;
            replayButton.setVisibility(View.VISIBLE);
            playerText.setText("Game Over!!!");
            found = true;
        }//end 6th if
        else if(square1 == 2 && square5 == 2 && square9 == 2)
        {
            winnerView.setText("Player 2 has won!!!");
            inGame = false;
            replayButton.setVisibility(View.VISIBLE);
            playerText.setText("Game Over!!!");
            found = true;
        }//end 7th if
        else if(square3 == 2 && square5 == 2 && square7 == 2)
        {
            winnerView.setText("Player 2 has won!!!");
            inGame = false;
            replayButton.setVisibility(View.VISIBLE);
            playerText.setText("Game Over!!!");
            found = true;
        }//end 8th if
        else if(!found && ((square1 == 1 || square1 == 2) && (square2 == 1 || square2 == 2) && (square3 == 1 || square3 == 2) && (square4 == 1 || square4 == 2) &&
                (square5 == 1 || square5 == 2) && (square6 == 1 || square6 == 2) && (square7 == 1 || square7 == 2) && (square8 == 1 || square8 == 2)  && (square9 == 1 || square9 == 2)))
        {
            winnerView.setText("Y'all tied!!!");
            inGame = false;
            replayButton.setVisibility(View.VISIBLE);
            playerText.setText("Game Over!!!");
        }//end final else if

    }//end checkWinner

    //when the top left button is clicked
    public void playerClick1(View v)
    {
        //checks to see if game is still being played
        if(inGame)
        {
            //checks if it isn't used yet
            if(!cell1)
            {
                //changes it to an x if its player one's turn
                if(playerTurn == 1)
                {
                    ImageView box1 = (ImageView) findViewById(R.id.xo1);
                    Drawable playerSymbol = getResources().getDrawable(R.drawable.x);
                    box1.setImageDrawable(playerSymbol);
                    playerTurn = 2;
                    square1 = 1;
                }//end inner if
                //changes it to an o if its player two's turn
                else
                {
                    ImageView box1 = (ImageView) findViewById(R.id.xo1);
                    Drawable playerSymbol = getResources().getDrawable(R.drawable.o);
                    box1.setImageDrawable(playerSymbol);
                    playerTurn = 1;
                    square1 = 2;
                }//end else
                //changes the variable to show that this square has been used
                cell1 = true;
            }//end outer if
            checkWinner();
            changeTurn();
        }
    }//end playerClick1

    //when top middle button is clicked changes it to the correct player's symbol
    public void playerClick2(View v)
    {
        //checks to see if game is still being played
        if(inGame)
        {
            //checks if it isn't used yet
            if(!cell2)
            {
                //changes it to an x if its player one's turn
                if(playerTurn == 1)
                {
                    ImageView box1 = (ImageView) findViewById(R.id.xo2);
                    Drawable playerSymbol = getResources().getDrawable(R.drawable.x);
                    box1.setImageDrawable(playerSymbol);
                    playerTurn = 2;
                    square2 = 1;
                }//end inner if
                //changes it to an o if its player two's turn
                else
                {
                    ImageView box1 = (ImageView) findViewById(R.id.xo2);
                    Drawable playerSymbol = getResources().getDrawable(R.drawable.o);
                    box1.setImageDrawable(playerSymbol);
                    playerTurn = 1;
                    square2 = 2;
                }//end else
                //changes the variable to show that this square has been used
                cell2 = true;

            }//end outer if
            checkWinner();
            changeTurn();
        }//end the very outer if
    }//end playerClick2

    //when the top right button is clicked changes it to the correct player's symbol
    public void playerClick3(View v)
    {
        //checks to see if game is still being played
        if(inGame)
        {
            //checks if it isn't used yet
            if(!cell3)
            {
                //changes it to an x if its player one's turn
                if(playerTurn == 1)
                {
                    ImageView box1 = (ImageView) findViewById(R.id.xo3);
                    Drawable playerSymbol = getResources().getDrawable(R.drawable.x);
                    box1.setImageDrawable(playerSymbol);
                    playerTurn = 2;
                    square3 = 1;
                }//end inner if
                //changes it to an o if its player two's turn
                else
                {
                    ImageView box1 = (ImageView) findViewById(R.id.xo3);
                    Drawable playerSymbol = getResources().getDrawable(R.drawable.o);
                    box1.setImageDrawable(playerSymbol);
                    playerTurn = 1;
                    square3 = 2;
                }//end else
                //changes the variable to show that this square has been used
                cell3 = true;
            }//end outer if
            checkWinner();
            changeTurn();
        }//end very outer if
    }//end playerClick3

    //when the middle left button is clicked changes it to the correct player's symbol
    public void playerClick4(View v)
    {
        //checks to see if game is still being played
        if(inGame)
        {
            //checks if it isn't used yet
            if(!cell4)
            {
                //changes it to an x if its player one's turn
                if(playerTurn == 1)
                {
                    ImageView box1 = (ImageView) findViewById(R.id.xo4);
                    Drawable playerSymbol = getResources().getDrawable(R.drawable.x);
                    box1.setImageDrawable(playerSymbol);
                    playerTurn = 2;
                    square4 = 1;
                }//end inner if
                //changes it to an o if its player two's turn
                else
                {
                    ImageView box1 = (ImageView) findViewById(R.id.xo4);
                    Drawable playerSymbol = getResources().getDrawable(R.drawable.o);
                    box1.setImageDrawable(playerSymbol);
                    playerTurn = 1;
                    square4 = 2;
                }//end else
                //changes the variable to show that this square has been used
                cell4 = true;

            }//end outer if
            checkWinner();
            changeTurn();
        }//end very outer if
    }//end playerClick4

    //when the middle middle button is clicked changes it to the correct player's symbol
    public void playerClick5(View v)
    {
        //checks to see if game is still being played
        if(inGame)
        {
            //checks if it isn't used yet
            if(!cell5)
            {
                //changes it to an x if its player one's turn
                if(playerTurn == 1)
                {
                    ImageView box1 = (ImageView) findViewById(R.id.xo5);
                    Drawable playerSymbol = getResources().getDrawable(R.drawable.x);
                    box1.setImageDrawable(playerSymbol);
                    playerTurn = 2;
                    square5 = 1;
                }//end inner if
                //changes it to an o if its player two's turn
                else
                {
                    ImageView box1 = (ImageView) findViewById(R.id.xo5);
                    Drawable playerSymbol = getResources().getDrawable(R.drawable.o);
                    box1.setImageDrawable(playerSymbol);
                    playerTurn = 1;
                    square5 = 2;
                }//end else
                //changes the variable to show that this square has been used
                cell5 = true;
            }//end outer if
            checkWinner();
            changeTurn();
        }//end very outer if
    }//end playerClick5

    //when the middle right button is clicked changes it to the correct player's symbol
    public void playerClick6(View v)
    {
        //checks to see if game is still being played
        if(inGame)
        {
            //checks if it isn't used yet
            if(!cell6)
            {
                //changes it to an x if its player one's turn
                if(playerTurn == 1)
                {
                    ImageView box1 = (ImageView) findViewById(R.id.xo6);
                    Drawable playerSymbol = getResources().getDrawable(R.drawable.x);
                    box1.setImageDrawable(playerSymbol);
                    playerTurn = 2;
                    square6 = 1;
                }//end inner if
                //changes it to an o if its player two's turn
                else
                {
                    ImageView box1 = (ImageView) findViewById(R.id.xo6);
                    Drawable playerSymbol = getResources().getDrawable(R.drawable.o);
                    box1.setImageDrawable(playerSymbol);
                    playerTurn = 1;
                    square6 = 2;
                }//end else
                //changes the variable to show that this square has been used
                cell6 = true;
            }//end outer if
            checkWinner();
            changeTurn();
        }//end very outer if
    }//end playerClick6

    //when the bottom left button is clicked changes it to the correct player's symbol
    public void playerClick7(View v)
    {
        //checks to see if game is still being played
        if(inGame)
        {
            //checks if it isn't used yet
            if(!cell7)
            {
                //changes it to an x if its player one's turn
                if(playerTurn == 1)
                {
                    ImageView box1 = (ImageView) findViewById(R.id.xo7);
                    Drawable playerSymbol = getResources().getDrawable(R.drawable.x);
                    box1.setImageDrawable(playerSymbol);
                    playerTurn = 2;
                    square7 = 1;
                }//end inner if
                //changes it to an o if its player two's turn
                else
                {
                    ImageView box1 = (ImageView) findViewById(R.id.xo7);
                    Drawable playerSymbol = getResources().getDrawable(R.drawable.o);
                    box1.setImageDrawable(playerSymbol);
                    playerTurn = 1;
                    square7 = 2;
                }//end else
                //changes the variable to show that this square has been used
                cell7 = true;
            }//end outer if
            checkWinner();
            changeTurn();
        }//end very outer if
    }//end playerClick7

    //when the bottom middle button is clicked changes it to the correct player's symbol
    public void playerClick8(View v)
    {
        //checks to see if game is still being played
        if(inGame)
        {
            //checks if it isn't used yet
            if(!cell8)
            {
                //changes it to an x if its player one's turn
                if(playerTurn == 1)
                {
                    ImageView box1 = (ImageView) findViewById(R.id.xo8);
                    Drawable playerSymbol = getResources().getDrawable(R.drawable.x);
                    box1.setImageDrawable(playerSymbol);
                    playerTurn = 2;
                    square8 = 1;
                }//end inner if
                //changes it to an o if its player two's turn
                else
                {
                    ImageView box1 = (ImageView) findViewById(R.id.xo8);
                    Drawable playerSymbol = getResources().getDrawable(R.drawable.o);
                    box1.setImageDrawable(playerSymbol);
                    playerTurn = 1;
                    square8 = 2;
                }//end else
                //changes the variable to show that this square has been used
                cell8 = true;
            }//end outer if
            checkWinner();
            changeTurn();
        }//end very outer if
    }//end playerClick8

    //when the bottom right button is clicked changes it to the correct player's symbol
    public void playerClick9(View v)
    {
        //checks to see if game is still being played
        if(inGame)
        {
            //checks if it isn't used yet
            if(!cell9)
            {
                //changes it to an x if its player one's turn
                if(playerTurn == 1)
                {
                    ImageView box1 = (ImageView) findViewById(R.id.xo9);
                    Drawable playerSymbol = getResources().getDrawable(R.drawable.x);
                    box1.setImageDrawable(playerSymbol);
                    playerTurn = 2;
                    square9 = 1;
                }//end inner if
                //changes it to an o if its player two's turn
                else
                {
                    ImageView box1 = (ImageView) findViewById(R.id.xo9);
                    Drawable playerSymbol = getResources().getDrawable(R.drawable.o);
                    box1.setImageDrawable(playerSymbol);
                    playerTurn = 1;
                    square9 = 2;
                }//end else
                //changes the variable to show that this square has been used
                cell9 = true;
            }//end outer if
            checkWinner();
            changeTurn();
        }//end very outer if
    }//end playerClick9

    //replay button onclick
    public void replay(View v)
    {
        //set player turn back to first player
        playerTurn = 1;
        changeTurn();

        //set all the squares back to unused
        cell1 = false;
        cell2 = false;
        cell3 = false;
        cell4 = false;
        cell5 = false;
        cell6 = false;
        cell7 = false;
        cell8 = false;
        cell9 = false;

        //set it back so that no player has used any square
        square1 = 0;
        square2 = 0;
        square3 = 0;
        square4 = 0;
        square5 = 0;
        square6 = 0;
        square7 = 0;
        square8 = 0;
        square9 = 0;

        //set each box back to the blank image
        Drawable playerBlank = getResources().getDrawable(R.drawable.blank);

        ImageView box1 = (ImageView) findViewById(R.id.xo1);
        box1.setImageDrawable(playerBlank);
        ImageView box2 = (ImageView) findViewById(R.id.xo2);
        box2.setImageDrawable(playerBlank);
        ImageView box3 = (ImageView) findViewById(R.id.xo3);
        box3.setImageDrawable(playerBlank);
        ImageView box4 = (ImageView) findViewById(R.id.xo4);
        box4.setImageDrawable(playerBlank);
        ImageView box5 = (ImageView) findViewById(R.id.xo5);
        box5.setImageDrawable(playerBlank);
        ImageView box6 = (ImageView) findViewById(R.id.xo6);
        box6.setImageDrawable(playerBlank);
        ImageView box7 = (ImageView) findViewById(R.id.xo7);
        box7.setImageDrawable(playerBlank);
        ImageView box8 = (ImageView) findViewById(R.id.xo8);
        box8.setImageDrawable(playerBlank);
        ImageView box9 = (ImageView) findViewById(R.id.xo9);
        box9.setImageDrawable(playerBlank);

        //sets the playerWin textView to blank
        TextView winnerView = (TextView) findViewById(R.id.winnerView);
        winnerView.setText("");

        //set it so the game starts again
        inGame = true;

        //sets replay button back to invisible
        Button replayButton = (Button) findViewById(R.id.replayButton);
        replayButton.setVisibility(View.INVISIBLE);
    }


    public void changeTurn()
    {
        playerText = (TextView) findViewById(R.id.playerT);

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
