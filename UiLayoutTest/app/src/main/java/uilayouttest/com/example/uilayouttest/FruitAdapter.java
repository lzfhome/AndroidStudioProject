package uilayouttest.com.example.uilayouttest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2023/4/17 0017.
 */

public class FruitAdapter extends ArrayAdapter<Fruit> {
    private int resourceId;
    class ViewHolder{
        ImageView imageView;
        TextView textView;

    }
    public FruitAdapter(Context context, int textViewResourceId, List<Fruit> object) {
        super(context, textViewResourceId,object);
        resourceId = textViewResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Fruit fruit = getItem(position);
        View view;
        ViewHolder viewHolder;
        if(convertView !=null){
            view = convertView;
            viewHolder = (ViewHolder)view.getTag();
        }else {
            view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.imageView = (ImageView) view.findViewById(R.id.fruit_image);
            viewHolder.textView = (TextView) view.findViewById(R.id.fruit_name);
            view.setTag(viewHolder);
        }
        viewHolder.imageView.setImageResource(fruit.getImageId());
        viewHolder.textView.setText(fruit.getName());
        return view;
    }
}
