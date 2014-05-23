package com.chimi.myfirstapp;

import java.io.File;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

import javax.microedition.khronos.opengles.GL10;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


@TargetApi(Build.VERSION_CODES.KITKAT)
public class CreateMessageActivity extends ActionBarActivity {

	private static final String LOG_TAG = null;
	private static final String EXTRA_MESSAGE = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		 super.onCreate(savedInstanceState);

		   /** // Get the message from the intent
		    Intent intent = getIntent();
		    String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
			**/
		 	
		 	
		    // Create the text view
		    
		    //TextView textView = new TextView(this);
		    //textView.setTextSize(40);
		    //textView.setText(message);

		    // Set the text view as the activity layout
		    //setContentView(textView);
	        setContentView(R.layout.activity_create_message);

	        if (savedInstanceState == null) {
	            getSupportFragmentManager().beginTransaction()
	                    .add(R.id.container, new PlaceholderFragment())
	                    .commit();
	            }
		}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.create_message, menu);
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
			View rootView = inflater.inflate(R.layout.fragment_create_message,
					container, false);
			return rootView;
		}
	}
	


	 public void createMessage(View view){
	    	// Do something in response to button
	    Intent intent = new Intent(this,CreateMessageActivity.class);
	    EditText editText = (EditText) findViewById(R.id.editText1);
	    String message = editText.getText().toString();
	    intent.putExtra(EXTRA_MESSAGE, message);
	    startActivity(intent);
	    }
	
	 //the following code is place holder, may or may not be used...
	 /* Checks if external storage is available for read and write */
	 /*public boolean isEXternalStorageWritable() {
		 String state = Environment.getExternalStorageState();
		 if (Environment.MEDIA_MOUNTED.equals(state)) {
			 return true;
		 }
		 return false;
	 }
	 // Checks if external storage is available to at least read
	 public boolean isExternalStorageReadable() {
		 String state = Environment.getExternalStorageState();
		 if (Environment.MEDIA_MOUNTED.equals(state) ||
				Environment.MEDIA_MOUNTED_READ_ONLY.equals(state)) {
			 	return true;
		 }
		 return false;
		 
		
	 }
	//public File getNoteStorageDir(String noteName) {
		//Get the directory for the user's public document directory.
		//File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), noteName);
		//if (!file.mkdirs()) {
		//	Log.e(LOG_TAG, "Directory not created");
		//}
		
		//return file;
		//}
	
	 public void saveMessage(View view){
		 //saves typed text as a file
		 //Intent intent = new Intent(this,CreateMessageActivity.class);
		 EditText editText = (EditText) findViewById(R.id.editText1);
		 String message = editText.getText().toString();
		 //intent.putExtra(EXTRA_MESSAGE,message);
		 
		 //this.getNoteStorageDir(message);
		 
		 
		 //try to write the content
		 try{
			 //open myfile.txt for writing
			 OutputStreamWriter out = new OutputStreamWriter(openFileOutput("myfilename.txt",0));
			 // write the contents on my setting to the file
			 out.write(message);
			 //close the file
			 out.close();
		 } catch (java.io.IOException e){
			 //do something if an IOException occurs.
			 e.printStackTrace();
			
		 }
	 }*/
}
	/* public void viewMessage(File file){
		 // try opening the myfilename.txt
		 //http://huuah.com/android-writing-and-reading-files/
		 try{
			 // open the file for reading
			 InputStream instream = openFileInput("myfilename.txt");
			 
			 // if file the available for reading
			 if (instream = openFileInput("myfilename.txt") ){
				 // prepare the file for reading
				 InputStreamReader inputreader = new InputStreamReader(instream);
				 BufferedReader buffreader = new BufferedReader(inputreader);
				 
				 String line;
				 
				 //read everyline of the file into the line-variable, on line at the time
				 while(( line = buffreader.readLine())) {
					 //do something with the settings from the file
				 }
			 }
			 //close the file again
			 instream.close();
		 }catch (java.io.FileNotFoundException e){
			 //do something if the myfilename.txt does not exits
			 
				 }
			 }*/
		 
	 
	 

	 
