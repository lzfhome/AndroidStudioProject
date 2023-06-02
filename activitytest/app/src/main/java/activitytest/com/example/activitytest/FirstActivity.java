package activitytest.com.example.activitytest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends BaseActivity {
    private static final String TAG = "FirstActivity";
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main ,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.add_item:
                Toast.makeText(this, "You click the Add item",Toast.LENGTH_LONG).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this, "You click the Remove item",Toast.LENGTH_LONG).show();
                break;
            default:
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstlayout);
        Log.d(TAG, "onCreate: task id = " + getTaskId());
        Button button_1 = (Button)findViewById(R.id.button_1);
        button_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                /* 显示小时提示 */
                //Toast.makeText(FirstActivity.this,"You clicked the Button 1",
                //Toast.LENGTH_LONG).show();

                /* 退出程序 */
                //finish();

                /* 显示意图 */
                //Intent intent = new Intent(FirstActivity.this,SecondActivity.class);

                /* 隐式意图 */
                //Intent intent = new Intent("com.example.activitytest.ACTION_START");
                //intent.addCategory("com.example.activitytest.MY_CATEGORY");

                /* 打开网页（选择 APPA) */
                //Intent intent = new Intent(Intent.ACTION_VIEW);
                //intent.setData(Uri.parse("http:"));

                /* 传递字符串信息 */
                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                /* 启动意图 */
                startActivity(intent);
            }
        });

    }
}
