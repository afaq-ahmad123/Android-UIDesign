package com.example.circlecee;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Home extends Fragment {

    List<circle> circles;
    public Home() {
        // Required empty public constructor
        circles=new ArrayList<circle>();
        circles.add(new circle("fast-16","fast circle of batch 2016","Lahore",
                "Fast University",R.drawable.fast));
        circles.add(new circle("NUSTIANS","NUST circle of batch 2016","Islamabad",
                "NUST University",R.drawable.nust));
        circles.add(new circle("PUNJABIANS","Punjab circle of batch 2016","Lahore",
                "Punjab University",R.drawable.punjab));
        circles.add(new circle("fast-16","fast circle of batch 2016","Lahore",
                "Fast University",R.drawable.fast));
        circles.add(new circle("NUSTIANS","NUST circle of batch 2016","Islamabad",
                "NUST University",R.drawable.nust));
        circles.add(new circle("PUNJABIANS","Punjab circle of batch 2016","Lahore",
                "Punjab University",R.drawable.punjab));
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_home, container, false);
        RecyclerView rec=v.findViewById(R.id.recycler_id);
        HomeViewAdapter Adapter=new HomeViewAdapter(getContext(),circles);
        rec.setLayoutManager(new GridLayoutManager(getContext(),3));
        rec.setAdapter(Adapter);
        return v;
    }

}
