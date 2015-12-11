package com.example.tyler.resume;

/**
 * Created by tyler on 12/10/15.
 */
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabPagerAdapter extends FragmentPagerAdapter {

    public TabPagerAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        // determines which fragment will be displayed when a particular tab is selected
        switch (position) {
            // first tab
            case 0:
                // return our first tab fragment
                return new TabFragment1();
            // second tab (also default case in this circumstance)
            case 1:
                // return our second tab fragment
                return new TabFragment2();
            case 2:
                return new TabFragment3();
            case 3:
            default:
                return new TabFragment4();
        }
    }
    @Override
    public int getCount() {
        // returns the total number of tabs
        return 4;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        // returns the title displayed on each particular tab
        switch (position) {
            // first tab
            case 0:
                return "Contact";
            // second tab
            case 1:
                return "Education";
            case 2:
                return "Technical Skills";
            case 3:
            default:
                return "Work Experience";
        }
    }
}
