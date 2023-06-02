package uilayouttest.com.example.uilayouttest;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private String[] data = {"1","2","3","4","5","6","7","8","9",
            "10","11","12","13","14","15","16","17","18","19","20","21","22"};
    private List<Fruit> fruitList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionbar  = getSupportActionBar();
        if(actionbar != null){
            actionbar.hide();
            Log.d(TAG, "onCreate: hide the actionbar");
        }else{
            Log.d(TAG, "onCreate: dont hide the actionbar");
        }
        /*
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,data);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        */
        initFruits();;
        FruitAdapter adapter = new FruitAdapter(MainActivity.this,R.layout.fruit_layout,fruitList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
    private void initFruits(){
        for(int i = 0;i < 2;i++){
            Fruit apple = new Fruit("apple",R.drawable.logo);
            fruitList.add(apple);
            Fruit apple1 = new Fruit("apple1",R.drawable.logo);
            fruitList.add(apple1);
            Fruit apple2 = new Fruit("apple2",R.drawable.logo);
            fruitList.add(apple2);
            Fruit apple3 = new Fruit("apple3",R.drawable.logo);
            fruitList.add(apple3);
            Fruit apple4 = new Fruit("apple4",R.drawable.logo);
            fruitList.add(apple4);
            Fruit apple5 = new Fruit("apple5",R.drawable.logo);
            fruitList.add(apple5);
            Fruit apple6 = new Fruit("apple6",R.drawable.logo);
            fruitList.add(apple6);
            Fruit apple7 = new Fruit("apple7",R.drawable.logo);
            fruitList.add(apple7);
            Fruit apple8 = new Fruit("apple8",R.drawable.logo);
            fruitList.add(apple8);
            Fruit apple9 = new Fruit("apple9",R.drawable.logo);
            fruitList.add(apple9);
            Fruit apple10 = new Fruit("apple10",R.drawable.logo);
            fruitList.add(apple10);
            Fruit apple11 = new Fruit("apple11",R.drawable.logo);
            fruitList.add(apple11);
            Fruit apple12 = new Fruit("apple12",R.drawable.logo);
            fruitList.add(apple12);
            Fruit apple13 = new Fruit("apple13",R.drawable.logo);
            fruitList.add(apple13);
            Fruit apple14 = new Fruit("apple14",R.drawable.logo);
            fruitList.add(apple14);
            Fruit apple15 = new Fruit("apple15",R.drawable.logo);
            fruitList.add(apple15);

        }
    }
}
