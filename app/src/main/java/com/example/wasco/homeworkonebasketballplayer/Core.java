package com.example.wasco.homeworkonebasketballplayer;


import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Core
{
    public static BasketballPlayer[] thePlayers = new BasketballPlayer[1000];
    public static String[] thePlayerstStrings = new String[1000];
    private static int numberofPlayers = 0;
    private static FirebaseDatabase database = FirebaseDatabase.getInstance();
    public static DatabaseReference myRef = database.getReference("players");

    public static void listenForDatabaseChanges()
    {
        //async listener
        ValueEventListener prListener = new ValueEventListener()
        {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot)
            {
                // Get Post object and use the values to update the UI
                System.out.println(dataSnapshot);
                for(DataSnapshot ds: dataSnapshot.getChildren())
                {
                    BasketballPlayer pr = ds.getValue(BasketballPlayer.class);
                    System.out.println("***** Data Changed");
                    pr.display();
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError)
            {
                // Getting Post failed, log a message
                System.out.println("loadPost:onCancelled " + databaseError.toException());
            }
        };
        Core.myRef.addValueEventListener(prListener);
    }

    public static void writePatientRecordToFirebase(BasketballPlayer pr)
    {
        //static context
        Core.myRef.push().setValue(pr);
    }

    public static void addPatientRecord(BasketballPlayer pr)
    {
        //encapsulated the logic of adding patient records here
        Core.thePlayers[Core.numberofPlayers] = pr;
        Core.thePlayerstStrings[Core.numberofPlayers] = pr.toString();
        Core.numberofPlayers++;
        Core.writePatientRecordToFirebase(pr);
    }
}