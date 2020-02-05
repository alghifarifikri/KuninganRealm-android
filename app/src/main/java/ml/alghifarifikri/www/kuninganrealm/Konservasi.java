package ml.alghifarifikri.www.kuninganrealm;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Konservasi extends AppCompatActivity {
    boolean doubleBackToExitPressedOnce = false;

    Button Taman, Kebun, Tilu, Ciremai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konservasi);

        Taman = (Button) findViewById(R.id.Taman);
        Kebun = (Button) findViewById(R.id.Kebun);
        Tilu = (Button) findViewById(R.id.Tilu);
        Ciremai = (Button) findViewById(R.id.Ciremai);



        Taman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Taman.class);
                startActivity(i);

            }
        });

        Kebun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Kebun.class);
                startActivity(i);

            }
        });

        Tilu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), GunungTilu.class);
                startActivity(i);

            }
        });

        Ciremai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), GunungCiremai.class);
                startActivity(i);

            }
        });
    }
}
