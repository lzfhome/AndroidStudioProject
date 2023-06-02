package broadcastbestpratice.com.example.broadcastbestpratice;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2023/4/27 0027.
 */

public class ActivityCollector {
    private static final String TAG = "ActivityCollector";
    public static List<BaseActivity> activities = new ArrayList<>();
    public static void addActivity(BaseActivity activity){
        Log.d(TAG, "addActivity: 0");
        activities.add(activity);
    }
    public static void removeActivity(BaseActivity activity){
        Log.d(TAG, "removeActivity: 0");
        activities.remove(activity);
    }
    public static void killActivity(){
        Log.d(TAG, "killActivity: 0");
        for(BaseActivity activity : activities){
            if(!activity.isFinishing()){
                Log.d(TAG, "killActivity: 1");
                activity.finish();
            }else{
                Log.d(TAG, "killActivity: 2");
            }
        }
    }
}
