package com.frootfel.poc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    private Human man;
    private TextView tv;
    private Woman female;
    public TextView femtext;
    public Bike bstat;
    public Car cstat;
    public Motorcycle mstat;
    public Button btnGas;
    public Button btnBrake;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bstat = new Bike(); //creating an instance of a class
        bstat.ChangeGear(2);
        bstat.SpeedUp(20);
        bstat.ApplyBrakes(14);
        bstat.printStats();
       /* man = new Human();
        man.name = "Joe";
        female = new Woman();
        female.walk(10);
        female.name ="Harmony";
        female.Walk();
        female.Run();
        */
       btnGas = (Button)findViewById(R.id.bgas); //instantiating gas button
        btnGas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bstat.SpeedUp(5);
                tv.setText(bstat.printStats());
            }
        });

       btnBrake =(Button)findViewById(R.id.bbrake);
       btnBrake.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               bstat.ApplyBrakes(1);
               tv.setText(bstat.printStats());
           }
       });
    }

    @Override
    protected void onStart() {
        super.onStart();

        tv = (TextView)findViewById(R.id.textviewName);
        tv.setText(bstat.printStats());

        /*femtext = (TextView)findViewById(R.id.textviewFName);
        femtext.setText(female.sayHello("How are you"));*/

    }
}
