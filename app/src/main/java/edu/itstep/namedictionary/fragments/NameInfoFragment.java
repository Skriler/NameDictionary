package edu.itstep.namedictionary.fragments;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import edu.itstep.namedictionary.R;
import edu.itstep.namedictionary.activities.MainActivity;
import edu.itstep.namedictionary.entities.Name;

@RequiresApi(api = Build.VERSION_CODES.N)
public class NameInfoFragment extends Fragment {
    private Name name;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_name_info , null);

        if (getArguments() != null) {
            name = (Name) getArguments().getSerializable(MainActivity.NAME_TAG);
        }

        TextView tvName = view.findViewById(R.id.tvName);
        TextView tvNameDayDate = view.findViewById(R.id.tvNameDayDate);
        TextView tvDefinition = view.findViewById(R.id.tvDefinition);

        if (name != null) {
            tvName.setText(name.getName());
            tvNameDayDate.setText(String.format("%s %s", tvNameDayDate.getText(), name.getNameDayDate()));
            tvDefinition.setText(String.format("%s %s", tvDefinition.getText(), name.getDefinition()));
            tvDefinition.setMovementMethod(new ScrollingMovementMethod());
        }

        Button btnClose = view.findViewById(R.id.btnClose);
        btnClose.setOnClickListener((MainActivity)this.getActivity());

        return view;
    }
}