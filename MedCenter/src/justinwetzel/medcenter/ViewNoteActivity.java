package justinwetzel.medcenter;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class ViewNoteActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_view_note);
		
	    TextView noteTitle = (TextView) findViewById(R.id.tv_noteTitle);
	    TextView noteText = (TextView) findViewById(R.id.tv_noteText);
		Button noteBack = (Button) findViewById(R.id.b_noteBack);
		
		String note_text = "";
		String note_title = "";
		
		// Request note based on note id, create JSON object
		// Use object to store note title and text, display on store in strings
		
		noteTitle.setText(note_title);
		noteText.setText(note_text);
		
	    // Go back to Patient Home screen.
	    View.OnClickListener listener = new View.OnClickListener(){
	        @Override
	        public void onClick(View view) {

	   
	        }
	    };
	    noteBack.setOnClickListener(listener);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.view_note, menu);
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
}
