package com.example.tyler.resume;

/**
 * Created by tyler on 12/10/15.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/*
 * Creates View for the Contact Tab in application
 */

public class TabFragment1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // inflate Contact View
        // pass contact layout and null as parameters into the inflate
        // method
        View rootView = inflater.inflate(R.layout.contact, null);

        return rootView;
    }
}