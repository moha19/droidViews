package com.lewa.viewtest.preference;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.lewa.viewtest.R;

public class CustomSwitchFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.test_custom_preference, null);
        LinearLayout mainContent = (LinearLayout) v.findViewById(R.id.mainContent);
        View result = CustomSwitchPreference.inflateCheckBoxPreference(inflater, getActivity());
        mainContent.addView(result);
        return v;
    }
}