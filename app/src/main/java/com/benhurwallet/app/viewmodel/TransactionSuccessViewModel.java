package com.benhurwallet.app.viewmodel;

import android.app.Activity;

import com.benhurwallet.app.repository.PreferenceRepositoryType;
import com.benhurwallet.app.util.RateApp;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class TransactionSuccessViewModel extends BaseViewModel {

    private final PreferenceRepositoryType preferenceRepository;

    @Inject
    public TransactionSuccessViewModel(
            PreferenceRepositoryType preferenceRepository
    ) {
        this.preferenceRepository = preferenceRepository;
    }

    public void tryToShowRateAppDialog(Activity context) {
        RateApp.showRateTheApp(context, preferenceRepository, true);
    }
}
