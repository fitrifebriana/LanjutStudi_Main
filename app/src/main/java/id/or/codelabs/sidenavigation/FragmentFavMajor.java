package id.or.codelabs.sidenavigation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FragmentFavMajor extends Fragment {

    private ListView listView;
    private String[] favMajors;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_fav_major, null);

        listView = (ListView) rootView.findViewById(R.id.major_list);

        favMajors = getResources().getStringArray(R.array.fav_majors);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_list_item_1, favMajors);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                //Toast.makeText(getActivity().getApplicationContext(), "CLICKED", Toast.LENGTH_SHORT).show();
                Intent majorInfo = new Intent(getActivity(), MajorIF.class);
                startActivity(majorInfo);
            }
        });

        return rootView;
    }
}
