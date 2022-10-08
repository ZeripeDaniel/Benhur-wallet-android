package com.benhurwallet.app.repository;

import com.benhurwallet.app.entity.lifi.SwapProvider;

import java.util.List;

public interface SwapRepositoryType
{
    public List<SwapProvider> getProviders();
}
