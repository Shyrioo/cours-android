package com.example.shyrio.guestnumber;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends Activity implements View.OnClickListener {

    public static final Random rand = new Random();
    public static Integer nbRandom = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nbRandom = rand.nextInt(100);
        final int[] listeBoutons = {R.id.image0, R.id.image1, R.id.image2, R.id.image3, R.id.image4
                , R.id.image5, R.id.image6, R.id.image7, R.id.image8, R.id.image9,R.id.button1};


        for (int b : listeBoutons) {
            findViewById(b).setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        final TextView screen = (TextView) findViewById(R.id.EditText01);

        switch (v.getId()) {
            case R.id.image0:
                screen.setText(screen.getText() + "0");
                comapare(screen);
                break;
            case R.id.image1:
                screen.setText(screen.getText() + "1");
                comapare(screen);
                break;
            case R.id.image2:
                screen.setText(screen.getText() + "2");
                comapare(screen);
                break;
            case R.id.image3:
                screen.setText(screen.getText() + "3");
                comapare(screen);
                break;
            case R.id.image4:
                screen.setText(screen.getText() + "4");
                comapare(screen);
                break;
            case R.id.image5:
                screen.setText(screen.getText() + "5");
                comapare(screen);
                break;
            case R.id.image6:
                screen.setText(screen.getText() + "6");
                comapare(screen);
                break;
            case R.id.image7:
                screen.setText(screen.getText() + "7");
                comapare(screen);
                break;
            case R.id.image8:
                screen.setText(screen.getText() + "8");
                comapare(screen);
                break;
            case R.id.image9:
                screen.setText(screen.getText() + "9");
                comapare(screen);
                break;
            case R.id.button1:
                screen.setText("");
        }
    }

    private void comapare(TextView screen) {
        final TextView textButton = (TextView)  findViewById(R.id.button1);
        Integer number = Integer.parseInt((String) screen.getText());
        if (null != number) {
            if (nbRandom < number) {
                textButton.setText("- " + number);
                textButton.setTextColor(Color.GREEN);
            } else if (nbRandom > number) {
                textButton.setText("+ " + number);
                textButton.setTextColor(Color.RED);
            } else {
                textButton.setText("BRAVO ");
                textButton.setTextColor(Color.BLUE);
            }
        }
    }

}