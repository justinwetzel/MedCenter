package justinwetzel.medcenter;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class PatientHomeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_patient_home);
		
		// Declare text views and buttons for the patient home screen.
		
	    final TextView patientName = (TextView) findViewById(R.id.tv_patientName);
	    final TextView breathingRate = (TextView) findViewById(R.id.tv_breathingRate);
	    final TextView heartRate = (TextView) findViewById(R.id.tv_heartRate);
	    final TextView rr = (EditText) findViewById(R.id.tv_rr);
	    final TextView pvNotes = (EditText) findViewById(R.id.tv_patientViewNote);
	    Button pvViewNote = (Button) findViewById(R.id.b_pv_viewNote);
	    Button pvLogout = (Button) findViewById(R.id.b_pv_logout);
	    
	    // View note button
	    View.OnClickListener listener = new View.OnClickListener(){
	        @Override
	        public void onClick(View view) {
	        	// Request note info using patient id to get a JSON object
	        	// Display the note.
	   
	        }
	    };
	    pvViewNote.setOnClickListener(listener);

	    // Logout button
	    View.OnClickListener logoutListener = new View.OnClickListener(){
	        @Override
	        public void onClick(View view) {
	        	//Send the user back to the main screen
	   
	        }
	    };
	    pvLogout.setOnClickListener(logoutListener);
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.patient_home, menu);
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
