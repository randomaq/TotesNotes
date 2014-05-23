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
import android.widget.EditText;
import android.os.Build;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import java.io.*;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.List;
import javax.microedition.khronos.opengles.GL10;
import android.opengl.EGLConfig;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.EGLConfig;


public class MainActivity extends ActionBarActivity {
	public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }
    
    /** Called when the user clicks other send button*/
    //public void sendMessage(View view){
    	// Do something in response to button
    /*Intent intent = new Intent(this,DisplayMessageActivity.class);
    EditText editText = (EditText) findViewById(R.id.edit_message);
    String message = editText.getText().toString();
    intent.putExtra(EXTRA_MESSAGE, message);
    startActivity(intent);
    }*/
    /** Called when user clicks new button*/
    public void createMessage(View view){
    	Intent intent = new Intent(this,CreateMessageActivity.class);
    	//EditText editText = (EditText) findViewById(R.id.edit_message);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
    public void reviewFiles(View view){
    	//http://java-samples.com/showtutorial.php?tutorialid=1522
    	Intent intent = new Intent(this,ReviewFileActivity.class);
    	startActivity(intent);
    	
    }
    public class OpenGLES20Activity extends Activity {
		private GLSurfaceView mGLView;
		
		@Override
		public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			
			//Create a G:SurfaceView instance and set it
			//as the ContentView for this Activity.
			mGLView = new MyGLSurfaceView(this);
			setContentView(mGLView);
		}
	}
	
	class MyGLSurfaceView extends GLSurfaceView {
		//Create an OpenGL ES 2.0 context
		setEGLContextClientVersion(2);
		
		public MyGLSurfaceView(Context context) {
			super(context);
			
			//Set the Renderer for drawing on the GLSurfaceView
			setRenderer(new MyRenderer());
			setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
		}
	}
	
	public class MyGLRenderer implements GLSurfaceView.Renderer {
		
		public void onSurfaceCreated(GL10 unused, EGLConfig config) {
			//Set the background frame color
			GLES20.glClearColor(0.0f,  0.0f,  0.0f, 1.0f);
		}
		
		public void onDrawFrame(GL10 unused) {
			//Redraw background color
			GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT);
		}
		
		public void onSurfaceChanged(GL10 unused, int width, int height) {
			GLES20.glViewport(0, 0, width, height);
		}
	}
	
	public class Square {
		
		private FloatBuffer vertexBuffer;
		private ShortBuffer drawListBuffer;
		
		//number of coordinates per vertex in this array
		static final int COORDS_PER_VERTEX = 3;
	}

    public static class FileSorting  {
		
		String Filename = textfield; 
			public void WriteFile(){
				/* this method creates a new file then places the file in the stream.
				 * then the stream takes texts from a field and out puts it
				*/
				File file = new File (Filename);
				BufferedWriter out = new BufferedWriter(new FileWriter(file));
				out.write(R.editText1);
				out.close();
			}
			public String readFileAsString(String filename) throws IOException
			{
				BufferedReader reader = new BufferedReader(new FileReader(filename));
				String line;
				StringBuilder sb = new StringBuilder();
				while((line=reader.readLine()) != null) 
				{
					sb.append(line + "\n");
				}
				reader.close();
				return sb.toString();
			}
	
			public List<String> readFilesAsListOfStrings(String filename) throws IOException
			{
			//http://alvinalexander.com/java/java-file-utilities-open-read-write-copy-files
				List<String> record = new ArrayList<String>();
				BufferedReader reader = new BufferedReader(new FileReader(filename));
				String line;
				while((line = reader.readLine())!=null){
					records.add(line);
					
				}
				reader.close();
				return records;
			}
			

    }
}
