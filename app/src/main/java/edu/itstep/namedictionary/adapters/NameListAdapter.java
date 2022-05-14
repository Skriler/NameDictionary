package edu.itstep.namedictionary.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import edu.itstep.namedictionary.R;

public class NameListAdapter extends BaseAdapter {
    Context context;
    LayoutInflater inflater;

    ArrayList<String> names;

    public NameListAdapter(Context context, ArrayList<String> names) {
        this.context = context;
        this.names = names;

        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return names.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null)
            convertView = inflater.inflate(R.layout.custom_grid_item, null);

        TextView tvItemTitle = convertView.findViewById(R.id.tvItemName);
        tvItemTitle.setText(names.get(position));

        return convertView;
    }
}
