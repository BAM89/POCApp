package com.frootfel.poc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    private Human man;
    private TextView tv;
    private Woman female;
    public TextView femtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        man = new Human();
        man.name = "Joe";
        female = new Woman();
        female.name ="Harmony";
    }

    @Override
    protected void onStart() {
        super.onStart();

        tv = (TextView)findViewById(R.id.textviewName);
        tv.setText(man.name + "  " + female.name);

        femtext = (TextView)findViewById(R.id.textviewFName);
        femtext.setText(female.sayHello("How are you"));

    }
}
