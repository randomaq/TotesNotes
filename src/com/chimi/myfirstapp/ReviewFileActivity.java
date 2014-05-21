package com.chimi.myfirstapp;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import android.os.Build;
import android.app.Activity;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.*;

import com.chimi.myfirstapp.CreateMessageActivity.PlaceholderFragment;

public class ReviewFileActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_review_file);

		 if (savedInstanceState == null) {
	            getFragmentManager().beginTransaction()
	    .add(R.id.container, new PlaceholderFragment())
	                    .commit();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.review_file, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_review_file,
					container, false);
			return rootView;
		}
	}
	/*public String viewFiles(){
		Inputstream file = this.getResources().openRawResource(R.raw.textfile);
		BufferedReader input = new BufferedReader(new InputStreamReader(file));
		try{
			String line = input.readLine();
			return line;
		}catch(IOException e) { e.printStackTrace();
			 return "Error reading File!";
			 
			 }
		}
	}
		/*String str="";
		StringBuffer buf = new StringBuffer();
		InputStream is= this.getResources().openRawResource(R.drawable.my_base_data);
		BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		if( is!=null) {
			while((str=reader.readLine()) != null) {
				buf.append(str + "\n");
			}
		}
		is.close();
		Toast.makeText(getBaseContext(),buf.toString(),Toast.LENGTH_LONG).show();
		
			}
		
	}*/
	//to do read and edit
	//http://java-samples.com/showtutorial.php?tutorialid=1522
}

