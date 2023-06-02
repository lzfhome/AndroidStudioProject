package boardcast.com.example.boardcasttest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"receiver in MyBroadcastReceiver", Toast.LENGTH_LONG).show();
        abortBroadcast();
    }
}
