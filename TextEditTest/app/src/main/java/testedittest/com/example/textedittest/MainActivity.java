package testedittest.com.example.textedittest;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                ProgressDialog  progress_dialog= new ProgressDialog(this);
                progress_dialog.setTitle("This is  a progress dialog");
                progress_dialog.setMessage("Something is Loading");
                progress_dialog.setCancelable(false);
                progress_dialog.show();


                /*
                AlertDialog.Builder dialog = new AlertDialog.Builder(this);
                dialog.setTitle("This is Dialog");
                dialog.setMessage("Some messages");
                dialog.setCancelable(false);
                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                                TextView textView = (TextView)findViewById(R.id.test_view);
                textView.setText("123123123");
                    }
                });
                dialog.setNegativeButton("Cancle", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                ImageView imageView = (ImageView)findViewById(R.id.image_view);
                imageView.setImageResource(R.drawable.q);
                    }
                });
                dialog.show();
                */

                /*TextView textView = (TextView)findViewById(R.id.test_view);
                textView.setText("123123123");*/



                /*ProgressBar progressbar = (ProgressBar)findViewById(R.id.progress_bar);
                if(progressbar.getVisibility()==View.GONE){
                    progressbar.setVisibility(View.VISIBLE);
                }else{
                    progressbar.setVisibility(View.GONE);
                }*/
                /*
                ProgressBar progressbar = (ProgressBar)findViewById(R.id.progress_bar);
                int progress = progressbar.getProgress();
                progress++;
                progressbar.setProgress(progress);
                */

                break;
            default:
                break;
        }
    }
}
