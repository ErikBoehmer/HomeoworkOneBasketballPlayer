package com.example.wasco.homeworkonebasketballplayer;

import android.content.Context;
import android.graphics.Movie;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import org.w3c.dom.Text;
import java.util.ArrayList;
import java.util.List;

public class BasketballPlayerArrayAdapter extends ArrayAdapter
{
    private Context mContext;
    private BasketballPlayer[] playerRecordList = new BasketballPlayer[1000];
    private int textViewResourceId;

    public BasketballPlayerArrayAdapter(Context context, int textViewResourceId, BasketballPlayer[] list)
    {
        super(context, textViewResourceId , list);
        mContext = context;
        playerRecordList = list;
        this.textViewResourceId = textViewResourceId;
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {

        View listItem = convertView;
        if(listItem == null)
        {
            listItem = LayoutInflater.from(mContext).
                    inflate(this.textViewResourceId,parent,false);
        }


        BasketballPlayer pr = this.playerRecordList[position];

        TextView FirstnameTv = (TextView)listItem.findViewById(R.id.FirstnameTV);
        TextView LastnameTV = (TextView)listItem.findViewById(R.id.lastNameTV);
        TextView jerseyNumber = (TextView)listItem.findViewById(R.id.JerseyTV);
        TextView ageET = (TextView)listItem.findViewById(R.id.ageTV);
        TextView feetET = (TextView)listItem.findViewById(R.id.HeightTV);
        TextView inchesET =(TextView)listItem.findViewById(R.id.InchesTV);


        if(pr != null)
        {
            FirstnameTv.setText("First Name: " + pr.getFirstname());
            LastnameTV.setText("Last Name: " + pr.getLastname());
            jerseyNumber.setText("Jersey Number: " + pr.getJerseynumber() + "");
            ageET.setText("Age:" + pr.getAge() + "");
            feetET.setText("Height in Feet:" + pr.getHeightFeet() + "");
            inchesET.setText("Height in Inches: " + pr.getHeightInches() + "");
        }
        else
        {
            FirstnameTv.setText("");
            LastnameTV.setText("");
            jerseyNumber.setText("");
            ageET.setText("");
            feetET.setText("");
            inchesET.setText("");
        }

        return listItem;
    }
}