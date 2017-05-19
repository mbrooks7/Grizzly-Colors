package com.example.mario.grizzlycolors;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

/** Class : MainActivity.java
 * @author: Mario Brooks
 * @version: 1.0
 * Written: Oct 28, 2016
 * This class handles the launching of the app and assigning varibles
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final SeekBar red = (SeekBar) findViewById(R.id.seekBar);
        final SeekBar blue = (SeekBar) findViewById(R.id.seekBar2);
        final SeekBar green = (SeekBar) findViewById(R.id.seekBar3);
        final SeekBar alpha = (SeekBar) findViewById(R.id.seekBar4);
        final Button update = (Button) findViewById(R.id.btnUpdate);
        final TextView word = (TextView) findViewById(R.id.txtWord);
        final ImageView background = (ImageView) findViewById(R.id.imageView);
        background.setAlpha(120);

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                word.setText("#" + Integer.toHexString(red.getProgress()) + Integer.toHexString(blue.getProgress()) + Integer.toHexString(green.getProgress()) + Integer.toHexString(alpha.getProgress()));

                word.setBackgroundColor(Color.argb(alpha.getProgress(), red.getProgress(), green.getProgress(), blue.getProgress()));

                if (red.getProgress() < 30 && blue.getProgress() < 30 && green.getProgress() < 30) {
                    word.setTextColor(Color.WHITE);
                } else
                    word.setTextColor(Color.BLACK);
            }
        });
        {

        }
    }


    /** Method: about
     * Purpose: Display a toast message to the user when the about button is clicked.
     */
    public void about(View view)
    {
        Toast.makeText(this,"Mario Brooks 10/28/2016", Toast.LENGTH_SHORT).show();
    }
}




