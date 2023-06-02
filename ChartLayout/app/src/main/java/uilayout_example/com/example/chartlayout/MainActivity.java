package uilayout_example.com.example.chartlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Message> mMessageList = new ArrayList<>();
    private EditText inputText;
    private Button send;
    private RecyclerView msgRecyclerView;
    private MessageAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Message msg1 = new Message("Hello guy.",Message.TYPE_RECCIVER);
        mMessageList.add(msg1);
        inputText = (EditText) findViewById(R.id.edit_text);
        send = (Button)findViewById(R.id.button);
        msgRecyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager  = new LinearLayoutManager(this);
        msgRecyclerView.setLayoutManager(layoutManager);
        adapter = new MessageAdapter(mMessageList);
        msgRecyclerView.setAdapter(adapter);
        send.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String content = inputText.getText().toString();
                if(!"".equals(content)){
                    Message msg = new Message(content , Message.TYPE_SENT);
                    mMessageList.add(msg);
                    adapter.notifyItemInserted(mMessageList.size() - 1);
                    msgRecyclerView.scrollToPosition(mMessageList.size() - 1);
                    inputText.setText("");
                }
            }
        });
    }
}
