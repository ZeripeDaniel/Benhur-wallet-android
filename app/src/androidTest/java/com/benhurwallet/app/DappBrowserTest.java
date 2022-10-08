package com.benhurwallet.app;

import static androidx.test.espresso.Espresso.pressBack;
import static com.benhurwallet.app.assertions.Should.shouldSee;
import static com.benhurwallet.app.steps.Steps.createNewWallet;
import static com.benhurwallet.app.steps.Steps.navigateToBrowser;
import static com.benhurwallet.app.steps.Steps.selectTestNet;
import static com.benhurwallet.app.steps.Steps.visit;

import com.benhurwallet.app.util.Helper;
import com.benhurwallet.app.util.SnapshotUtil;

import org.junit.Test;

public class DappBrowserTest extends BaseE2ETest
{

    @Test
    public void should_switch_network()
    {
        String urlString = "https://opensea.io";

        createNewWallet();
        visit(urlString);
        shouldSee("Ethereum");
        Helper.wait(5);
        SnapshotUtil.take("1");
        selectTestNet("Görli");
        navigateToBrowser();
        Helper.wait(3);
        pressBack();
        shouldSee("Görli");
    }
}
