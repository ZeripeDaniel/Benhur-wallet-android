package com.benhurwallet.app.ui.widget;

import android.app.Activity;

public interface OnImportSeedListener
{
    void onSeed(String seedPhrase, Activity ctx);
}
