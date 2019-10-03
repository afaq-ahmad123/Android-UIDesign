package com.example.circlecee;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Search extends Fragment {

    private ExampleAdapter adapter;
    private List<search_example> exampleList;
    public Search() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_search, container, false);
        fillExampleList();
        setUpRecyclerView(v);
        return v;
    }
    private void fillExampleList() {
        exampleList = new ArrayList<search_example>();
        exampleList.add(new search_example(R.drawable.fast, "fast-16", "Fast University"));
        exampleList.add(new search_example(R.drawable.nust, "NUSTIANS", "NUST"));
        exampleList.add(new search_example(R.drawable.punjab, "PUNJABIANS", "Punjab University"));
        exampleList.add(new search_example(R.drawable.fast, "fast-16", "Fast University"));
        exampleList.add(new search_example(R.drawable.nust, "NUSTIANS", "NUST"));
        exampleList.add(new search_example(R.drawable.punjab, "PUNJABIANS", "Punjab University"));
        exampleList.add(new search_example(R.drawable.fast, "fast-16", "Fast University"));
        exampleList.add(new search_example(R.drawable.nust, "NUSTIANS", "NUST"));
        exampleList.add(new search_example(R.drawable.punjab, "PUNJABIANS", "Punjab University"));
    }

    private void setUpRecyclerView(View view) {
        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        adapter = new ExampleAdapter(exampleList);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        //MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu, menu);

        MenuItem searchItem = menu.findItem(R.id.search_text);
        SearchView searchView = (SearchView) searchItem.getActionView();
        searchView.setImeOptions(EditorInfo.IME_ACTION_DONE);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });
    }
}
