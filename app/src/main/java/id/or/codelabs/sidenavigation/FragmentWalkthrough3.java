package id.or.codelabs.sidenavigation;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentWalkthrough3 extends Fragment {
    private static String resId = "RES_ID";

    public FragmentWalkthrough3() {
        // Required empty public constructor
    }

    public static FragmentWalkthrough3 newInstance(int id) {
        Bundle args = new Bundle();
        args.putInt(resId, id);
        FragmentWalkthrough3 fragment = new FragmentWalkthrough3();
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_walkthrough_3, container, false);
        return rootView;
    }

}
