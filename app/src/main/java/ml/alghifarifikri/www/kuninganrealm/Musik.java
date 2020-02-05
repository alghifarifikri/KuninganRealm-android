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

public class Musik extends AppCompatActivity {
    boolean doubleBackToExitPressedOnce = false;

    Button Tandang, Bersih;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musik);

        Tandang = (Button) findViewById(R.id.Tandang);
        Bersih = (Button) findViewById(R.id.Bersih);

        Tandang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Tandang.class);
                startActivity(i);

            }
        });

        Bersih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Bersih.class);
                startActivity(i);

            }
        });

    }
}
