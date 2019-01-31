package com.example.wasco.homeworkonebasketballplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BasketballPlayer pr = new BasketballPlayer("Steph", "Curry", 30, 24, 6,
                3);

        pr.display();
    }

    public void OnAddPlayerToTeamPressed(View v)
    {
        Intent i = new Intent(this, AddPlayerToTeam.class);
        this.startActivity(i);


    }
}
