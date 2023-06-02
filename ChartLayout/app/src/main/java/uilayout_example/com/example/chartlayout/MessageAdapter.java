package uilayout_example.com.example.chartlayout;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Administrator on 2023/4/19 0019.
 */

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.ViewHolder> {

    private List<Message> mMessageList;
    static class ViewHolder extends RecyclerView.ViewHolder{
        LinearLayout leftLayout;
        LinearLayout rightLayout;
        TextView leftView;
        TextView rightView;

        public ViewHolder(View view){
            super(view);
            leftLayout = (LinearLayout)view.findViewById(R.id.layout_left);
            rightLayout = (LinearLayout)view.findViewById(R.id.layout_right);
            leftView = (TextView)view.findViewById(R.id.text_view_left);
            rightView = (TextView)view.findViewById(R.id.text_view_right);
        }
    }
    public MessageAdapter(List<Message> messageList){
        mMessageList = messageList;
    }

    public ViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item,parent,false);

        return new ViewHolder(view);
    }
    public void onBindViewHolder(ViewHolder holder, int position){
        Message message = mMessageList.get(position);
        if(message.getType() == message.TYPE_RECCIVER){
            holder.leftLayout.setVisibility(View.VISIBLE);
            holder.rightLayout.setVisibility(View.GONE);
            holder.leftView.setText(message.getContent());
        }else if(message.getType() == message.TYPE_SENT){
           holder.leftLayout.setVisibility(View.GONE);
            holder.rightLayout.setVisibility(View.VISIBLE);
            holder.rightView.setText(message.getContent());
        }


    }
    public int getItemCount(){
        return mMessageList.size();
    }
}
