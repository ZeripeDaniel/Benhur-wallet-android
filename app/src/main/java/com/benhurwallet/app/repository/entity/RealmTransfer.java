package com.benhurwallet.app.repository.entity;

import android.content.Context;
import android.text.TextUtils;

import com.benhurwallet.app.R;
import com.benhurwallet.app.entity.Transaction;
import com.benhurwallet.app.entity.tokens.Token;
import com.benhurwallet.app.repository.EventResult;
import com.benhurwallet.app.ui.widget.entity.ENSHandler;
import com.benhurwallet.app.ui.widget.entity.StatusType;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import io.realm.Realm;
import io.realm.RealmObject;
import io.realm.RealmQuery;
import io.realm.RealmResults;
import io.realm.Sort;

import static com.benhurwallet.app.repository.TokensRealmSource.EVENT_CARDS;

/**
 * Created by JB on 17/12/2020.
 */
public class RealmTransfer extends RealmObject
{
    private String hash;
    private String tokenAddress;
    private String eventName;
    private String transferDetail;

    public String getHash()
    {
        return hash;
    }
    public void setHash(String hash) { this.hash = hash; }

    public String getTokenAddress()
    {
        return tokenAddress;
    }

    public void setTokenAddress(String address)
    {
        tokenAddress = address;
    }

    public void setTransferDetail(String transferDetail)
    {
        this.transferDetail = transferDetail;
    }

    public String getTransferDetail()
    {
        return transferDetail;
    }

    public String getEventName()
    {
        return eventName;
    }

    public void setEventName(String eventName)
    {
        this.eventName = eventName;
    }
}
