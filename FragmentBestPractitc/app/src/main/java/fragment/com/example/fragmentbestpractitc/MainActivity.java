package fragment.com.example.fragmentbestpractitc;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {
    public RightFragment rightFragment;
    public LeftFragment leftFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 如果是平板的话
        if(true){


        }else{

        }
    }
}
