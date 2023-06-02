package anotherboardtest.com.example.anotherboardtest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AnotherBoardcastTest extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"receiver in  AnotherBoardcastTest",Toast.LENGTH_LONG).show();
    }
}
