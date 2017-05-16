package com.example.jprinz.basicclasses;

import android.util.Log;

/**
 * Created by jprinz on 5/16/2017.
 */

public class Soldier {

    int health;
    String soldierType;

    void shootEnemy(){
        //Let's print which type of soldier is shooting
        Log.i(soldierType, "is shooting");
    }

}
