package com.notmtu.mmenu;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class FoodList extends Activity {
	
	ArrayList<String> my_list = new ArrayList<String>();
	ListView the_list;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.food_list);
		
		the_list = (ListView) findViewById(R.id.listView);
		my_list.add("Winning");
		my_list.add("losing");
		
		ArrayAdapter<String> adapt = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, my_list);
		the_list.setAdapter(adapt);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.food_list, menu);
		return true;
	}

}

