package br.com.ddmsoftware.brazillianflags;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class Bootsplash extends AppCompatActivity implements  Runnable{
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_bootsplash);
        
        Handler h = new Handler();
        h.postDelayed(this,3000);
    }

    @Override
    public void run() {

        startActivity(new Intent(this, MainActivity.class));

        finish();
    }
}
