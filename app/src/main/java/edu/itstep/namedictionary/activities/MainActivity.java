package edu.itstep.namedictionary.activities;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import java.util.ArrayList;

import edu.itstep.namedictionary.R;
import edu.itstep.namedictionary.entities.Name;
import edu.itstep.namedictionary.fragments.NameInfoFragment;
import edu.itstep.namedictionary.fragments.NameListFragment;
import edu.itstep.namedictionary.services.NameService;

@RequiresApi(api = Build.VERSION_CODES.N)
public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, View.OnClickListener {
    public static final String NAME_LIST_TAG = "names";
    public static final String NAME_TAG = "name";

    private ArrayList<Name> nameList;
    private ArrayList<String> names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameList = NameService.getNameList();
        names = NameService.getNames();

        showNameListFragment();
    }

    private void showNameListFragment() {
        Bundle args = new Bundle();
        args.putSerializable(NAME_LIST_TAG, names);
        NameListFragment nameListFragment = new NameListFragment();
        nameListFragment.setArguments(args);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frgContainerView, nameListFragment)
                .commit();
    }

    private void showNameInfoFragment(Name name) {
        Bundle args = new Bundle();
        args.putSerializable(NAME_TAG, name);
        NameInfoFragment nameInfoFragment = new NameInfoFragment();
        nameInfoFragment.setArguments(args);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frgContainerView, nameInfoFragment)
                .commit();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Name selectedName = nameList.get(position);
        showNameInfoFragment(selectedName);
    }

    @Override
    public void onClick(View view) {
        showNameListFragment();
    }
}