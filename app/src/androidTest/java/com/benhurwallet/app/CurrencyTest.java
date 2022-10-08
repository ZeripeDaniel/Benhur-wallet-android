package com.benhurwallet.app;

import static com.benhurwallet.app.assertions.Should.shouldSee;
import static com.benhurwallet.app.steps.Steps.createNewWallet;
import static com.benhurwallet.app.steps.Steps.gotoWalletPage;
import static com.benhurwallet.app.steps.Steps.selectCurrency;

import org.junit.Test;

public class CurrencyTest extends BaseE2ETest
{

    @Test
    public void should_switch_currency()
    {
        createNewWallet();

        selectCurrency("CNY");
        gotoWalletPage();
        shouldSee("¥");

        selectCurrency("KRW");
        gotoWalletPage();
        shouldSee("₩");

        selectCurrency("IDR");
        gotoWalletPage();
        shouldSee("Rp");
    }

}
