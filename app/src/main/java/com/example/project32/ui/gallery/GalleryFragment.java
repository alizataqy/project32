package com.example.project32.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.project32.R;

import java.util.ArrayList;
import java.util.Arrays;

public class GalleryFragment extends Fragment {

    private ListView listView;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);

        // Find the ListView
        listView = root.findViewById(R.id.list_gallery);

        // Sample data for the ListView
        String[] data = {"UCOK", "MEMED", "PUNKY", "JAIDY", "RONALDO"};
        ArrayList<String> items = new ArrayList<>(Arrays.asList(data));

        // Setting up the adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);

        return root;
    }
}
