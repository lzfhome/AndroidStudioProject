package uilayouttest.com.example.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        StaggeredGridLayoutManager layoutManager  = new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(layoutManager);
        FruitAdapter adapter = new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);
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
