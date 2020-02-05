package ml.alghifarifikri.www.kuninganrealm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class FloraFauna extends AppCompatActivity {
    boolean doubleBackToExitPressedOnce = false;

    Button Flora, Fauna;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_florafauna);

        Flora = (Button) findViewById(R.id.Flora);
        Fauna = (Button) findViewById(R.id.Fauna);

        Flora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Flora.class);
                startActivity(i);
            }
        });

        Fauna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Fauna.class);
                startActivity(i);
            }
        });
    }
}
