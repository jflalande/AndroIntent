package andro.jf;

import java.net.URI;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class GivePhoneNumber extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.givephonenumber);
		
		// Bouton ok
		Button b = (Button)findViewById(R.id.ok);
		b.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				EditText number = (EditText)findViewById(R.id.number);
				Uri telnumber = Uri.parse("tel:" + number.getText().toString());
				Intent call = new Intent(Intent.ACTION_DIAL, telnumber);
				startActivity(call);
			}
		});
		// Bouton finish
		Button finish = (Button)findViewById(R.id.finish);
		finish.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				setResult(50);
				finish();
			}
		});
		
		// Bouton appel direct
		Button direct = (Button)findViewById(R.id.direct);
		direct.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				EditText number = (EditText)findViewById(R.id.number);
				Uri telnumber = Uri.parse("tel:" + number.getText().toString());
				Intent call = new Intent(Intent.ACTION_CALL, telnumber);
				startActivity(call);
			}});
		
		// Bouton broadcast
		Button broad = (Button)findViewById(R.id.broadcast);
		broad.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent broadcast = new Intent("andro.jf.broadcast");
				broadcast.putExtra("extra", "test");
				sendBroadcast(broadcast);
			}});
		
		// Bouton pour s'auto appeler
		Button autoinvoc = (Button)findViewById(R.id.autoinvoc);
		autoinvoc.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent call = new Intent("andro.jf.nom_du_message");
				call.putExtra("extra", "test");
				startActivity(call);
			}});
	}
}
