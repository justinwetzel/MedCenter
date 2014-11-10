package justinwetzel.medcenter;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
    
    //Declare our View variables and assign them the views from the layout file.
    final TextView user = (TextView) findViewById(R.id.userName);
    final TextView pass = (TextView) findViewById(R.id.passWord);
    final TextView testUser = (TextView) findViewById(R.id.TestUser);
    final TextView testPassword = (TextView) findViewById(R.id.TestPassword);
    final EditText userName = (EditText) findViewById(R.id.enteredUserName);
    final EditText passWord = (EditText) findViewById(R.id.enteredPassWord);
    Button loginButton = (Button) findViewById(R.id.loginButton);

    View.OnClickListener listener = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
        	String username = "";
        	String password = "";
        	int roleId = 0;
        	
        	// Get username and password from textfields
            
                Log.v(username, userName.getText().toString());
                Log.v(password, passWord.getText().toString());
                testUser.setText(username);
                testPassword.setText(password);
                
                
            
        	
        	// Use "authenticate" function, use response.
        	
        	// If authenticate returns "forbidden", show error message
        	
        	// If authenticate returns json data, parse for role id.
        	
        	// If role id = "1", then go to ? screen
                
            //    Intent doctorScreen = new Intent(currentclass.this, doctor_home);
            //    startActivity(doctorScreen);
                
        	// If role id = "2", then go to ? screen
                
            //    Intent nurseScreen = new Intent(currentclass.this, nurse_home);
        	//    startActivity(nurseScreen);
                
        	// If role id = "3", then go to ? screen
                
            //    Intent pharmScreen = new Intent(currentclass.this, pharm_home);
        	//    startActivity(pharmScreen);
                
        	// If role id = "4", then go to ? screen
                
            //    Intent patientScreen = new Intent(currentclass.this, patient_home);
        	//    startActivity(patientScreen);

        }
    };
    loginButton.setOnClickListener(listener);

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
}
