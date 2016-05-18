package id.or.codelabs.sidenavigation.adapter;

/**
 * Created by FitriFebriana on 4/23/2016.
 */
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import id.or.codelabs.sidenavigation.FragmentWalkthrough;
import id.or.codelabs.sidenavigation.FragmentWalkthrough2;
import id.or.codelabs.sidenavigation.FragmentWalkthrough3;

public class WalkthroughAdapter extends FragmentStatePagerAdapter {

    public WalkthroughAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new FragmentWalkthrough();
            case 1:
                return new FragmentWalkthrough2();
            case 2:
                return new FragmentWalkthrough3();
        }

        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}