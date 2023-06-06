package sg.edu.rp.c346.id22002222.exercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    String[] fruits;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tv);


        fruits = new String[3];
        fruits[0] = "apple";
        fruits[1] = "banana";
        fruits[2] = "cherry";


        String fruitsOutput = "Fruits \n";

        fruitsOutput += "======  \n";
        for(int i =0; i <3 ; i++){
            fruitsOutput += fruits[i] +"\n";
        }

        tv.setText(fruitsOutput);

    }
}