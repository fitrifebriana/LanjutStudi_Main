package id.or.codelabs.sidenavigation;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FragmentSoshum extends Fragment {

    private ListView listView;
    private String[] soshumMajors;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_soshum, null);

        listView = (ListView) rootView.findViewById(R.id.soshum_list);

        soshumMajors = getResources().getStringArray(R.array.soshum_majors);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(),android.R.layout.simple_list_item_1, soshumMajors);
        listView.setAdapter(adapter);

        return rootView;
    }
}
