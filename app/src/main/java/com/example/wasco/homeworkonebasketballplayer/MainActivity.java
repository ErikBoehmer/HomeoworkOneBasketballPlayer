package com.example.wasco.homeworkonebasketballplayer;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import com.example.wasco.homeworkonebasketballplayer.BasketballPlayerArrayAdapter;


public class MainActivity extends AppCompatActivity
{
    private ListView lv;
    private BasketballPlayerArrayAdapter aa;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //initializes the array of Strings so there are place holder strings in there

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("****** ON CREATE!!!!!!");
        this.aa = new BasketballPlayerArrayAdapter(this, R.layout.list_view_advaanced, Core.thePlayers);
        this.lv = (ListView)this.findViewById(R.id.listView);
        this.lv.setAdapter(aa);


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
        this.aa.notifyDataSetChanged();

    }

    public void AddPlayerButtonPressed(View v)
    {
        Intent i = new Intent(this, AddPlayerToTeam.class);
        this.startActivity(i);
    }
}