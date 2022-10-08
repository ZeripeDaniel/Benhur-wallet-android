package com.benhurwallet.app.ui;

import static org.junit.Assert.assertEquals;
import static org.robolectric.Shadows.shadowOf;

import android.content.Intent;

import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.benhurwallet.shadows.ShadowAnalyticsService;
import com.benhurwallet.shadows.ShadowApp;
import com.benhurwallet.shadows.ShadowKeyProviderFactory;
import com.benhurwallet.shadows.ShadowKeyService;
import com.benhurwallet.shadows.ShadowRealmManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowPackageManager;

@RunWith(AndroidJUnit4.class)
@Config(shadows = {ShadowApp.class, ShadowKeyProviderFactory.class, ShadowRealmManager.class, ShadowKeyService.class, ShadowAnalyticsService.class, ShadowPackageManager.class})
public class HomeActivityTest
{
    @Test
    public void should_show_splash_when_first_launch()
    {
        ShadowPackageManager shadowPackageManager = new ShadowPackageManager();
        shadowPackageManager.setInstallSourceInfo(RuntimeEnvironment.getApplication().getPackageName(), "", "");

        ActivityScenario<HomeActivity> launch = ActivityScenario.launch(HomeActivity.class);
        launch.onActivity(activity -> {
            Intent expectedIntent = new Intent(activity, SplashActivity.class);
            Intent actual = shadowOf(RuntimeEnvironment.getApplication()).getNextStartedActivity();
            assertEquals(expectedIntent.getComponent(), actual.getComponent());
        });
    }
}
