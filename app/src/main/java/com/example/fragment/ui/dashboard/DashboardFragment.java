package com.example.fragment.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
//import androidx.lifecycle.Observer;
//import androidx.lifecycle.ViewModelProviders;

import com.example.fragment.R;

import java.util.zip.Inflater;

public class DashboardFragment extends Fragment {
//    @Nullable
//    @Override
    private DashboardViewModel dashboardViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
//        Inflater inflater;
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);
        return root;
    }
}