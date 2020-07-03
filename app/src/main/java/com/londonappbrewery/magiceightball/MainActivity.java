package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView lucky_ball= findViewById(R.id.ball_luck);
        Button ask_button=findViewById(R.id.button);


        final int[] luckBall={R.drawable.ball1,R.drawable.ball2,R.drawable.ball3,R.drawable.ball4,R.drawable.ball5};
        ask_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand=new Random();
                final int lucky=rand.nextInt(5);
                lucky_ball.setImageResource(luckBall[lucky]);
            }
        });
    }
}
