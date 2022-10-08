package com.benhurwallet.app.web3.entity;

import com.benhurwallet.app.entity.DAppFunction;
import com.benhurwallet.token.entity.Signable;

/**
 * Created by James on 6/04/2019.
 * Stormbird in Singapore
 */
public interface FunctionCallback
{
    void signMessage(Signable sign, DAppFunction dAppFunction);
    void functionSuccess();
    void functionFailed();
}
