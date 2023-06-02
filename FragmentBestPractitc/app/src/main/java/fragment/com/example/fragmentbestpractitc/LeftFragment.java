package fragment.com.example.fragmentbestpractitc;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2023/4/20 0020.
 */

public class LeftFragment extends Fragment {

    private  NewRecyclerViewAdapter newRecyclerViewAdapter;
    private RecyclerView newRecyclerView;
    private List<New> newList = new ArrayList<>();
    private RightFragment rightFragment;
    class NewRecyclerViewAdapter extends RecyclerView.Adapter<NewRecyclerViewAdapter.ViewHolder> {

        private List<New> mNewList;
        public NewRecyclerViewAdapter(List<New> mNewList){
            this.mNewList = mNewList;
        }
        class ViewHolder extends RecyclerView.ViewHolder{
            TextView textTitle;
            View titleView;
            public ViewHolder(View view){
                super(view);
                titleView = view;
                textTitle = (TextView) view.findViewById(R.id.recyclerview_text_view);
            }
        }
        public NewRecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item,parent,false);
            final NewRecyclerViewAdapter.ViewHolder holder = new NewRecyclerViewAdapter.ViewHolder(view);
            holder.textTitle.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    int position = holder.getAdapterPosition();
                    New new_ = mNewList.get(position);
                    Toast.makeText(v.getContext(),"you clicker title: " + new_.getTitle(),Toast.LENGTH_SHORT).show();
                    rightFragment = (RightFragment)getFragmentManager().findFragmentById(R.id.right_fragment);
                    rightFragment.updateDate(new_.getTitle(),new_.getTitle());
                }
            });

            return holder;
        }
        public void onBindViewHolder(NewRecyclerViewAdapter.ViewHolder holder, int position){
            New new_ = mNewList.get(position);
            holder.textTitle.setText(new_.getTitle());
        }
        public int getItemCount(){
            return mNewList.size();
        }
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
        View view = inflater.inflate(R.layout.left_fragment,container,false);

        initNewList();
        newRecyclerViewAdapter = new NewRecyclerViewAdapter(newList);

        newRecyclerView = (RecyclerView)view.findViewById(R.id.left_fragment_recycler_view);
        LinearLayoutManager layoutManager  = new LinearLayoutManager(getActivity());
        newRecyclerView.setLayoutManager(layoutManager);
        newRecyclerViewAdapter = new NewRecyclerViewAdapter(newList);
        newRecyclerView.setAdapter(newRecyclerViewAdapter);


        return view;
    }
    private void initNewList(){
        for(int i = 0;i < 2;i++){
            New apple = new New("apple","apple");
            newList.add(apple);
            New apple1 = new New("apple1","apple1");
            newList.add(apple1);
            New apple2 = new New("apple2","apple2");
            newList.add(apple2);
            New apple3 = new New("apple3","apple3");
            newList.add(apple3);
            New apple4 = new New("apple4","apple4");
            newList.add(apple4);
            New apple5 = new New("apple5","apple5");
            newList.add(apple5);
            New apple6 = new New("apple6","apple6");
            newList.add(apple6);
            New apple7 = new New("apple7","apple7");
            newList.add(apple7);
            New apple8 = new New("apple8","apple8");
            newList.add(apple8);
            New apple9 = new New("apple9","apple9");
            newList.add(apple9);
            New apple10 = new New("apple10","apple10");
            newList.add(apple10);
            New apple11 = new New("apple11","apple11");
            newList.add(apple11);
            New apple12 = new New("apple12","apple12");
            newList.add(apple12);
            New apple13 = new New("apple13","apple13");
            newList.add(apple13);
            New apple14 = new New("apple14","apple14");
            newList.add(apple14);
            New apple15 = new New("apple15","apple15");
            newList.add(apple15);
        }
    }
}
