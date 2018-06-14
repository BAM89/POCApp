package com.frootfel.poc;

import android.util.Log;

public class Woman implements IHuman {
    public String hairColor;
    public int age;

    public Woman(){
    this.hairColor = "Color";
    this.age = 25;  //since age is local to this class you need to use the keyword 'this.' also
    }

    /* public Woman(String name, int age){
    this.name = name;
    this.age = age;


    } */

    //This function need to return a value
    //Also greet the the parameter that's being passed into the function so you can't modify it,
    //so what you need to do is declare a local variable and set it equal to greet and then return
    //it from the function: hint:  message = greet;  return message;
    //The function is written as a void which means it does't return a value, but we want it to
    //actually return a value. In that case you have to put the type ie.(String, int, etc.) that
    //the function returns that type will go in place of the 'void' keyword.
    public String sayHello(String greet){
         String hello;
         hello = greet;

         return hello;

    }

   /* @Override
    void Walk() {
        Log.d("Woman", "Walk: start");
    }

    @Override
    void Talk() {
        Log.d("Woman", "Talk: start");
    }

    @Override
    void Think() {
        Log.d("Woman", "Think: start ");
    }

    @Override
    void Run(){
        super.Run();
        Log.d("Woman", "Run: start ");
    }
*/
    @Override
    public void walk() {
        Log.d("Woman","Walk: start ");
    }

    @Override
    public void walk(Integer x) {
        if (x==10){
            Log.d("Woman", "X = 10");

        } else{
            Log.d("Walk","X != 10");
        }

    }

    @Override
    public void talk() {

    }

    @Override
    public void run() {

    }
}
