package edu.itstep.namedictionary.fragments;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;

import java.util.ArrayList;

import edu.itstep.namedictionary.R;
import edu.itstep.namedictionary.activities.MainActivity;
import edu.itstep.namedictionary.adapters.NameListAdapter;

@RequiresApi(api = Build.VERSION_CODES.N)
public class NameListFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_name_list , null);

        try {
            ArrayList<String> names = (ArrayList<String>) getArguments().getSerializable(MainActivity.NAME_LIST_TAG);
            NameListAdapter adapterName = new NameListAdapter(this.getContext(), names);

            GridView gridViewNameList = view.findViewById(R.id.gridViewNameList);
            gridViewNameList.setAdapter(adapterName);
            gridViewNameList.setOnItemClickListener((MainActivity)this.getActivity());
        } catch (Exception ex) {
            Log.e("Something bad happened", ex.getMessage());
        }

        return view;
    }
}