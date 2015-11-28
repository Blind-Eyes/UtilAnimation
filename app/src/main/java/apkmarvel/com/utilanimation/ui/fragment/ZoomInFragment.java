package apkmarvel.com.utilanimation.ui.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import apkmarvel.com.utilanimation.R;
import apkmarvel.com.utilanimation.util.UtilAnim;


public class ZoomInFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment, container, false);
        UtilAnim.scaleWidth(v,0,1.0f,1000,null);
        UtilAnim.scaleHeight(v, 0,1.0f, 1000, null);
        return v;
    }
}