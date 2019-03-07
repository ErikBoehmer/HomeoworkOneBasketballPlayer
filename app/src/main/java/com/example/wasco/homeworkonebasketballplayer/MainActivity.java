package com.example.wasco.homeworkonebasketballplayer;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.example.wasco.homeworkonebasketballplayer.BasketballPlayerArrayAdapter;


public class MainActivity extends AppCompatActivity
{
    public ListView lv;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //initializes the array of Strings so there are place holder strings in there
        for(int i = 0; i < Core.thePlayers.length; i++)
        {
            Core.thePlayers[i] = new basketballPlayer("","",0,0,0,0);
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Core.aa = new BasketballPlayerArrayAdapter(this, R.layout.list_view_advaanced, Core.thePlayers);
        this.lv = (ListView)this.findViewById(R.id.listView);
        this.lv.setAdapter(Core.aa);
        Core.listenForDatabaseChanges();

        LinkedList linkedFront = new LinkedList();
        linkedFront.addFront(1);
        linkedFront.addFront(2);
        linkedFront.addFront(3);
        linkedFront.display();

        LinkedList linkedEnd = new LinkedList();
        linkedEnd.addEnd(1);
        linkedEnd.addEnd(2);
        linkedEnd.addEnd(3);
        linkedEnd.display();
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        System.out.println("****** ON RESUME!!!!!!");

    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("****** ON START!!!!!!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("****** ON PAUSE!!!!!!");

    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("****** ON STOP!!!!!!");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("****** ON RESTART!!!!!!");
        Core.aa.notifyDataSetChanged();

    }

    public void AddPlayerButtonPressed(View v)
    {
        Intent i = new Intent(this, AddPlayerToTeam.class);
        this.startActivity(i);
    }
}