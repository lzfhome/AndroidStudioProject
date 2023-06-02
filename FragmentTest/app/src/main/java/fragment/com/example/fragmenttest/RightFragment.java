package fragment.com.example.fragmenttest;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2023/4/19 0019.
 */

public class RightFragment extends Fragment {
    private static final String TAG = "RightFragment";

    @Override
    public void onAttach(Context context) {
        Log.d(TAG, "onAttach: ");
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {Log.d(TAG, "onCreate: ");
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onDestroy() {Log.d(TAG, "onDestroy: ");
        super.onDestroy();
    }

    @Override
    public void onDetach() {Log.d(TAG, "onDetach: ");
        super.onDetach();
    }

    @Override
    public void onStart() {Log.d(TAG, "onStart: ");
        super.onStart();
    }

    @Override
    public void onResume() {Log.d(TAG, "onResume: ");
        super.onResume();
    }

    @Override
    public void onPause() {Log.d(TAG, "onPause: ");
        super.onPause();
    }

    @Override
    public void onStop() {Log.d(TAG, "onStop: ");
        super.onStop();
    }

    @Override
    public void onDestroyView() {Log.d(TAG, "onDestroyView: ");
        super.onDestroyView();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {Log.d(TAG, "onActivityCreated: ");
        super.onActivityCreated(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){Log.d(TAG, "onCreateView: ");
        View view = inflater.inflate(R.layout.right_fragment,container,false);
        return view;
    }
}
