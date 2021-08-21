package com.bradchao.hiskiotabpages;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TabPageFragment extends Fragment {
    private String pageName;
    private View mainView;
    private TextView tabName;

    public TabPageFragment(String pageName){
        this.pageName = pageName;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (mainView == null){
            mainView = inflater.inflate(R.layout.fragment_tab_page, container, false);
            tabName = mainView.findViewById(R.id.tabName);
            tabName.setText(pageName);
        }
        return mainView;
    }
}