package com.notmtu.mmenu;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class SearchActivity extends Activity {
	
	EditText my_search;
	Button submit;
	String food_item;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_search);
		my_search = (EditText) findViewById(R.id.search);
		submit = (Button) findViewById(R.id.button1);
		
		submit.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				food_item = my_search.getText().toString();
				Intent intent = new Intent(SearchActivity.this, FoodList.class);
				onPause();
				onStop();
				startActivity(intent);
			}

		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.search, menu);
		return true;
	}

}
