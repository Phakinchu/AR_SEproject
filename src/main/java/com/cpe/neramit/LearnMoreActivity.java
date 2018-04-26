package com.cpe.neramit;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class LearnMoreActivity extends AppCompatActivity {

    private DrawerLayout learnMoreDrawerLayout;
    private ActionBarDrawerToggle learnMoreDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_more);
        learnMoreDrawerLayout = (DrawerLayout)findViewById(R.id.learn_more_drawer);
        learnMoreDrawerToggle = new ActionBarDrawerToggle(this, learnMoreDrawerLayout,R.string.open, R.string.close);
        learnMoreDrawerLayout.addDrawerListener(learnMoreDrawerToggle);
        learnMoreDrawerToggle.syncState();
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(learnMoreDrawerToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
