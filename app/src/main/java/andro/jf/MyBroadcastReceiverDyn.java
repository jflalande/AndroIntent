package andro.jf;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public final class MyBroadcastReceiverDyn extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		Toast.makeText(context, "Broadcast message received ! (dynamic)", 
				Toast.LENGTH_SHORT).show();
	}
}
