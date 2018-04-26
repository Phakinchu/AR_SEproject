package com.cpe.neramit;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {

    public void openLearnMore(){
        Intent intent = new Intent(this, LearnMoreActivity.class);
        startActivity(intent);
    }

    ConstraintLayout upperWelcome;
    ConstraintLayout lowerWelcome;

    Animation upToDown;
    Animation downToUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Button newWishButton = (Button)findViewById(R.id.new_wish_button);
        Button learnMoreButton = (Button) findViewById(R.id.learn_more_button);

        upperWelcome = (ConstraintLayout) findViewById(R.id.upper_welcome);
        lowerWelcome = (ConstraintLayout) findViewById(R.id.lower_welcome);
        upToDown = AnimationUtils.loadAnimation(this, R.anim.up_to_down);
        upperWelcome.setAnimation(upToDown);
        downToUp = AnimationUtils.loadAnimation(this, R.anim.down_to_up);
        lowerWelcome.setAnimation(downToUp);

        learnMoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x =new Intent(getApplicationContext(),LearnMoreActivity.class) ;
                startActivity(x);
            }
        });

        newWishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x =new Intent(getApplicationContext(),UnityPlayerNativeActivity.class) ;
                startActivity(x);
            }
        });
    }



}
