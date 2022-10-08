package com.benhurwallet.app.ui.widget;

import java.io.Serializable;

import com.benhurwallet.app.entity.DApp;

public interface OnDappClickListener extends Serializable {
    void onDappClick(DApp dapp);
}
