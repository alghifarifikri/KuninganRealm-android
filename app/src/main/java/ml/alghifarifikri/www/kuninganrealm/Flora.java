package ml.alghifarifikri.www.kuninganrealm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

import static ml.alghifarifikri.www.kuninganrealm.R.string.text_desk3;

public class Flora extends AppCompatActivity {
    Button bt, video;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flora);

        video = (Button) findViewById(R.id.video1);

        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), VideoFlora.class);
                startActivity(i);
            }
        });

        bt=(Button)findViewById(R.id.share3);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String shareBody = "https://www.kuningankab.go.id/sumber-daya-alam/taman-nasional-gunung-ciremai";
                myIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(myIntent, "Bagikan dengan"));


            }
        });
        String text =  getString(R.string.text_desk3);

        WebView webView = (WebView) findViewById(R.id.webView3);
        webView.loadData("<p style=\"text-align: justify\">"+ text +"</p>", "text/html", "UTF-8");
        webView.getSettings().setBuiltInZoomControls(true);
    }
}