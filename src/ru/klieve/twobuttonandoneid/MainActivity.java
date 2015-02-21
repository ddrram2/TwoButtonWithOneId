package ru.klieve.twobuttonandoneid;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class MainActivity extends Activity {
	
	Button[] button;
	final int BUTTON_COUNT = 2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        button = new Button[BUTTON_COUNT];
        
        button[0] = (Button)findViewById(R.id.button_1);		
		button[1] = (Button)((RelativeLayout)findViewById(R.id.button_2)).findViewById(R.id.button_1);
		
		for(int i = 0; i < BUTTON_COUNT; i++){
			button[i].setOnClickListener(BtnClickListener);
			}
		}
	
	OnClickListener BtnClickListener = new OnClickListener() {
		@Override
		public void onClick(View v) {
			Toast toast = Toast.makeText(getApplicationContext(), 
					"Two buttons with one id with one listener!", Toast.LENGTH_SHORT); 
			toast.setGravity(Gravity.CENTER, 0, 0); 
			toast.show(); 
			}
		};		
}


