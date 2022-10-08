package com.benhurwallet.app.entity;
import com.benhurwallet.app.entity.cryptokeys.KeyEncodingType;
import com.benhurwallet.app.service.KeyService;

public interface ImportWalletCallback
{
    void walletValidated(String address, KeyEncodingType type, KeyService.AuthenticationLevel level);
}
