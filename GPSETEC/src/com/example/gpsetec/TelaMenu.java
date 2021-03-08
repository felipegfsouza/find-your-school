package com.example.gpsetec;

import com.example.gpsetec.R.id;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.Menu;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageButton;

public class TelaMenu extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tela_menu);
		
		final ImageButton Cotia=(ImageButton)findViewById(R.id.btncotia);
		final ImageButton Embu=(ImageButton)findViewById(R.id.btnembu);
		final ImageButton Saoroque=(ImageButton)findViewById(R.id.btnsaoroque);
		
		Saoroque.setOnClickListener(new ImageButton.OnClickListener(){
			public void onClick(View arg0) {
				WebView wv = (WebView)findViewById(R.id.webView1);
				WebSettings ws= wv.getSettings();
				ws.setJavaScriptEnabled(true);
				ws.setSupportZoom(false);
				
				String html = "<html>";
				html+="<body>";
				html+="<style>";
				html+="</style>";
				html+="<center>";
				
				html+="<iframe width='600' height='450'  src='https://maps.google.com/maps?q=etec%20de%20s%C3%A3o%20%20roque&t=&z=13&ie=UTF8&iwloc=&output=embed' frameborder='0' scrolling='no' marginheight='0' marginwidth='0'></iframe>";
				html+="</center>";
				html+="</body>";
				html+="</html>";
				
				wv.loadData(html, "text/html", "UTF-8");
			}
		});
		
		Embu.setOnClickListener(new ImageButton.OnClickListener(){
			public void onClick (View arg0){
				WebView wv = (WebView)findViewById(R.id.webView1);
				WebSettings ws= wv.getSettings();
				ws.setJavaScriptEnabled(true);
				ws.setSupportZoom(false);
				
				String html = "<html>";
				html+="<body>";
				html+="<style>";
				html+="</style>";
				html+="<center>";
				
				html+="<iframe width='600' height='450' id='gmap_canvas' src='https://maps.google.com/maps?q=etec%20de%20EMBU&t=&z=13&ie=UTF8&iwloc=&output=embed' frameborder='0' scrolling='no' marginheight='0' marginwidth='0'></iframe>";
				html+="</center>";
				html+="</body>";
				html+="</html>";
				wv.loadData(html, "text/html", "UTF-8");
			}
		});
		
		Cotia.setOnClickListener(new ImageButton.OnClickListener(){
			public void onClick(View arg0){
				WebView wv = (WebView)findViewById(R.id.webView1);
				WebSettings ws= wv.getSettings();
				ws.setJavaScriptEnabled(true);
				ws.setSupportZoom(false);
				
				String html = "<html>";
				html+="<body>";
				html+="<style>";
				html+="</style>";
				html+="<center>";
				html+="<iframe width='600' height='450' id='gmap_canvas' src='https://maps.google.com/maps?q=etec%20de%20cotia&t=&z=13&ie=UTF8&iwloc=&output=embed' frameborder='0' scrolling='no' marginheight='0' marginwidth='0'></iframe>";
				html+="<iframe width='600' height='450' id='gmap_canvas' src='https://maps.google.com/maps?q=etec%20de%20EMBU&t=&z=13&ie=UTF8&iwloc=&output=embed' frameborder='0' scrolling='no' marginheight='0' marginwidth='0'></iframe>";
				html+="</center>";
				html+="</body>";
				html+="</html>";
				wv.loadData(html, "text/html", "UTF-8");
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tela_menu, menu);
		return true;
	}

}
