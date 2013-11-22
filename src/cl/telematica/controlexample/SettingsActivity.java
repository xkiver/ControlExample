package cl.telematica.controlexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;

public class SettingsActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
	
	public void onSettingsButtonClick(){
		startActivity(new Intent(Settings.ACTION_SETTINGS));
	}

}
