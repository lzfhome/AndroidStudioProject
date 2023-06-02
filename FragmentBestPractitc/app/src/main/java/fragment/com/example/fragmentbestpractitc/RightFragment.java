package fragment.com.example.fragmentbestpractitc;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Administrator on 2023/4/20 0020.
 */

public class RightFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.right_fragment,container,false);
        return view;
    }
    public void  updateDate(String newTitle, String newContent){
        TextView TitleText = (TextView) getView().findViewById(R.id.title_view);
        TextView ContentText = (TextView) getView().findViewById(R.id.content_view);
        TitleText.setText(newTitle);
        ContentText.setText(newContent);
    }
}
