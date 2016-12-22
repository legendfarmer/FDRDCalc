package com.legendfarmer.android.rdfdcalculator;

import android.app.Application;

import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;
import com.legendfarmer.android.rdfdcalculator.R;

/**
 * Created by Boosan on 18/12/16.
 */

public class AnalyticsApplication extends Application
{

    private Tracker mTracker;

    synchronized public Tracker getDefaultTracker()
    {
        if (mTracker == null)
        {
            GoogleAnalytics analytics = GoogleAnalytics.getInstance(this);
            mTracker = analytics.newTracker(R.xml.global_tracker);
        }
        return mTracker;
    }
}