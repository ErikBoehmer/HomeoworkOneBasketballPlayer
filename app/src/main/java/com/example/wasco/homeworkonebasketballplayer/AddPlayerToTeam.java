package com.example.wasco.homeworkonebasketballplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddPlayerToTeam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_player_to_team);


    }

    public void AddPlayerToTeamPressed(View v)
    {
        EditText FirstNameET = (EditText)this.findViewById(R.id.firstNameET);
        EditText lastNameET = (EditText)this.findViewById(R.id.lastNameET);
        EditText numberET = (EditText)this.findViewById(R.id.numberET);
        EditText ageET = (EditText)this.findViewById(R.id.ageET);
        EditText inchesET = (EditText)this.findViewById(R.id.inchesET);
        EditText feetET = (EditText)this.findViewById(R.id.feetET);

        BasketballPlayer pr = new BasketballPlayer(FirstNameET.getText().toString(), lastNameET.getText().toString(), Integer.parseInt(numberET.getText().toString(), Intent.parseIntent(ageET.getText().toString(),
                Integer.parseInt(inchesET.getText().toString(), Integer.parseInt(feetET.getText().toString()));
        pr.display();
    }
    }
