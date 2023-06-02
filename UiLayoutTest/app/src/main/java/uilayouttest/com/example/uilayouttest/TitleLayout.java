package uilayouttest.com.example.uilayouttest;

import android.app.Activity;
import android.content.Context;
import android.service.quicksettings.Tile;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import org.w3c.dom.Attr;

/**
 * Created by Administrator on 2023/4/17 0017.
 */

public class TitleLayout extends LinearLayout {
    public TitleLayout(Context context, AttributeSet attributeSet){
            super(context,attributeSet);
        LayoutInflater.from(context).inflate(R.layout.title,this);
        Button button_1 = (Button)findViewById(R.id.title_back);
        Button button_2 = (Button)findViewById(R.id.title_edit);
        button_1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity)getContext()).finish();
            }
        });
        button_2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "You Click the button", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
