package com.bignerdranch.com;

import android.support.v4.app.Fragment;

public class BeatBoxActivity extends SingleFragmentActivity{
    @Override
    protected Fragment createFragment() {
        return BeatBoxFragment.newInstance();
    }
}
