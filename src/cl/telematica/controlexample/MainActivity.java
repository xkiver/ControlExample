package cl.telematica.controlexample;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import android.app.Activity;
import android.content.Intent;

public class MainActivity extends Activity {
	
	private EditText nameEdit;
	private EditText passEdit;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		passEdit = (EditText) findViewById(R.id.passEdit);
		
	}
	
	public void onButtonClick(){
		if(nameEdit.getText().toString().equals(getString(R.string.name))
				&& passEdit.getText().toString().equals(getString(R.string.pass))){
			Intent intent = new Intent(getApplicationContext(), SettingsActivity.class);
			startActivity(intent);
			finish();
		} else {
			Toast.makeText(getApplicationContext(), getString(R.string.error_message), Toast.LENGTH_SHORT).show();
		}
	}

}
