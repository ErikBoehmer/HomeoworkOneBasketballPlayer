package com.example.wasco.homeworkonebasketballplayer;

import com.example.wasco.homeworkonebasketballplayer.BasketballPlayer;


public class Core
{
    private static BasketballPlayer[] thePlayers = new BasketballPlayer[1000];
    public static String[] Players = new String[1000];
    private static int numberOfPlayers = 0;

    public static void addPlayerRecord(BasketballPlayer pr)
    {
        //encapsulated the logic of adding patient records here
        Core.thePlayers[Core.numberOfPlayers] = pr;
        Core.numberOfPlayers++;
        Core.BasketBallPlayerstringarray();
    }

    public static void initializePlayers()
    {
        for(int i = 0; i < 1000; i++)
        {
            Players[i] = " ";
        }
    }

    public static void BasketBallPlayerstringarray()
    {

        for(int i = 0; i < numberOfPlayers; i++)
        {
            Players[i] = thePlayers[i].Basket();

        }


    }
}