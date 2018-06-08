package com.frootfel.poc;

public class Woman extends Human {
    public String hairColor;
    public int age;

    public Woman(){
    this.hairColor = "Color";
    this.age = 25;  //since age is local to this class you need to use the keyword 'this.' also
    }

    public Woman(String name, int age){
    this.name = name;
    this.age = age;

    }

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

}
