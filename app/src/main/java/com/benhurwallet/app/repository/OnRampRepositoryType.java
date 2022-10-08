package com.benhurwallet.app.repository;

import com.benhurwallet.app.entity.OnRampContract;
import com.benhurwallet.app.entity.tokens.Token;

public interface OnRampRepositoryType {
    String getUri(String address, Token token);

    OnRampContract getContract(Token token);
}
