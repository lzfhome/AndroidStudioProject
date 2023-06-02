package litepal.com.example.litepal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import org.litepal.crud.DataSupport;
import org.litepal.tablemanager.Connector;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button createDatabase = (Button)findViewById(R.id.create_database);
        createDatabase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Connector.getDatabase();
            }
        });

        Button addData = (Button)findViewById(R.id.add_data);
        addData.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Book book = new Book();
                book.setName("Oliver");
                book.setAuthor("Dan Brown");
                book.setPages(454);
                book.setPrice(123);
                book.setPress("Unknow");
                book.save();
            }
        });

        Button updateDatabase = (Button)findViewById(R.id.update_data);
        updateDatabase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Book book = new Book();
                book.setName("Oliver");
                book.setPrice(125);
                book.updateAll("name = ?","Oliver");
                book.save();
            }
        });
        Button deleteDatabase = (Button)findViewById(R.id.delete_data);
        deleteDatabase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DataSupport.deleteAll(Book.class, "price > ?", "15");
            }
        });
        Button queryButton = (Button)findViewById(R.id.query_data);
        queryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<Book> books = DataSupport.findAll(Book.class);
                for(Book book: books){
                    Log.d(TAG, "book name is  " + book.getName());
                    Log.d(TAG, "book author is  " + book.getAuthor());
                    Log.d(TAG, "book pages is  " + book.getPages());
                    Log.d(TAG, "book price is  " + book.getPrice());
                    Log.d(TAG, "book press is  " + book.getPress());
                }
            }
        });
    }

}
