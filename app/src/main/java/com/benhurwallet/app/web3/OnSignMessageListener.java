package com.benhurwallet.app.web3;

import com.benhurwallet.token.entity.EthereumMessage;

public interface OnSignMessageListener {
    void onSignMessage(EthereumMessage message);
}
