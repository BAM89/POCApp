package com.frootfel.poc;
import android.util.Log;


public abstract class AbstractHuman {
    public String height;
    public String weight;
    public String name;


    abstract void Walk();
    abstract void Talk();
    abstract void Think();
    void Run(){
        Log.d("AbstractHuman", "Run: start ");

    }




}
