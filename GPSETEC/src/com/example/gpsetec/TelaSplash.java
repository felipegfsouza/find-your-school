package com.example.gpsetec;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.ProgressBar;

public class TelaSplash extends Activity {
	ProgressBar pb1;
	int progress=0;
	Handler h = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_splash);
        pb1=(ProgressBar)findViewById(R.id.progressBar1);
        
        new Thread(new Runnable(){
        	@Override
        	public void run() {
        	for(int i=0;i<5;i++){
        	progress +=20;
        	h.post(new Runnable(){
        		@Override
        		public void run() {
        		pb1.setProgress(progress);
        		if(progress == pb1.getMax()){
        		// pb1.setVisibility(4);
        		Intent i = new Intent(TelaSplash.this, TelaMenu.class);
        		startActivity(i);
        		}
        		}
        		});
        		try {
        			Thread.sleep(3000);
        		} catch (InterruptedException e) {
        			// TODO: handle exception
        		}
        				}
        		}
        		}).start();
        		}
        
        


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.tela_splash, menu);
        return true;
    }
    
}
