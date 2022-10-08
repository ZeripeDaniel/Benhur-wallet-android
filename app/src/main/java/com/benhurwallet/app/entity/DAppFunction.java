package com.benhurwallet.app.entity;

import com.benhurwallet.token.entity.Signable;

public interface DAppFunction
{
    void DAppError(Throwable error, Signable message);
    void DAppReturn(byte[] data, Signable message);
}
