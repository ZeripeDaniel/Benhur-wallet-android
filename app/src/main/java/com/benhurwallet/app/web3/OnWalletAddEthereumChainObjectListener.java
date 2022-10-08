package com.benhurwallet.app.web3;

import com.benhurwallet.app.web3.entity.WalletAddEthereumChainObject;

public interface OnWalletAddEthereumChainObjectListener
{
    void onWalletAddEthereumChainObject(long callbackId, WalletAddEthereumChainObject chainObject);
}
