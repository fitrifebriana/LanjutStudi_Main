package id.or.codelabs.sidenavigation;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentWalkthrough extends Fragment {
    private static String resId = "RES_ID";

    public FragmentWalkthrough() {
        // Required empty public constructor
    }

    public static FragmentWalkthrough newInstance(int id) {
        Bundle args = new Bundle();
        args.putInt(resId, id);
        FragmentWalkthrough fragment = new FragmentWalkthrough();
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_walkthrough, container, false);
        return rootView;
    }

}
