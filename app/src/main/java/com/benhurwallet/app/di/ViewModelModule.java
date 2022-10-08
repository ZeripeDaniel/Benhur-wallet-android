package com.benhurwallet.app.di;

import com.benhurwallet.app.interact.ChangeTokenEnableInteract;
import com.benhurwallet.app.interact.CreateTransactionInteract;
import com.benhurwallet.app.interact.DeleteWalletInteract;
import com.benhurwallet.app.interact.ExportWalletInteract;
import com.benhurwallet.app.interact.FetchTokensInteract;
import com.benhurwallet.app.interact.FetchTransactionsInteract;
import com.benhurwallet.app.interact.FetchWalletsInteract;
import com.benhurwallet.app.interact.FindDefaultNetworkInteract;
import com.benhurwallet.app.interact.GenericWalletInteract;
import com.benhurwallet.app.interact.ImportWalletInteract;
import com.benhurwallet.app.interact.MemPoolInteract;
import com.benhurwallet.app.interact.SetDefaultWalletInteract;
import com.benhurwallet.app.interact.SignatureGenerateInteract;
import com.benhurwallet.app.repository.CurrencyRepository;
import com.benhurwallet.app.repository.CurrencyRepositoryType;
import com.benhurwallet.app.repository.EthereumNetworkRepositoryType;
import com.benhurwallet.app.repository.LocaleRepository;
import com.benhurwallet.app.repository.LocaleRepositoryType;
import com.benhurwallet.app.repository.PreferenceRepositoryType;
import com.benhurwallet.app.repository.TokenRepositoryType;
import com.benhurwallet.app.repository.TransactionRepositoryType;
import com.benhurwallet.app.repository.WalletRepositoryType;
import com.benhurwallet.app.router.CoinbasePayRouter;
import com.benhurwallet.app.router.ExternalBrowserRouter;
import com.benhurwallet.app.router.HomeRouter;
import com.benhurwallet.app.router.ImportTokenRouter;
import com.benhurwallet.app.router.ImportWalletRouter;
import com.benhurwallet.app.router.ManageWalletsRouter;
import com.benhurwallet.app.router.MyAddressRouter;
import com.benhurwallet.app.router.RedeemSignatureDisplayRouter;
import com.benhurwallet.app.router.SellDetailRouter;
import com.benhurwallet.app.router.TokenDetailRouter;
import com.benhurwallet.app.router.TransferTicketDetailRouter;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ViewModelComponent;

@Module
@InstallIn(ViewModelComponent.class)
/** Module for providing dependencies to viewModels.
 * All bindings of modules from BuildersModule is shifted here as they were injected in activity for ViewModelFactory but not needed in Hilt
 * */
public class ViewModelModule {

    @Provides
    FetchWalletsInteract provideFetchWalletInteract(WalletRepositoryType walletRepository) {
        return new FetchWalletsInteract(walletRepository);
    }

    @Provides
    SetDefaultWalletInteract provideSetDefaultAccountInteract(WalletRepositoryType accountRepository) {
        return new SetDefaultWalletInteract(accountRepository);
    }

    @Provides
    ImportWalletRouter provideImportAccountRouter() {
        return new ImportWalletRouter();
    }

    @Provides
    HomeRouter provideHomeRouter() {
        return new HomeRouter();
    }

    @Provides
    FindDefaultNetworkInteract provideFindDefaultNetworkInteract(
            EthereumNetworkRepositoryType networkRepository) {
        return new FindDefaultNetworkInteract(networkRepository);
    }

    @Provides
    ImportWalletInteract provideImportWalletInteract(
            WalletRepositoryType walletRepository) {
        return new ImportWalletInteract(walletRepository);
    }

    @Provides
    ExternalBrowserRouter externalBrowserRouter() {
        return new ExternalBrowserRouter();
    }

    @Provides
    FetchTransactionsInteract provideFetchTransactionsInteract(TransactionRepositoryType transactionRepository,
                                                               TokenRepositoryType tokenRepositoryType) {
        return new FetchTransactionsInteract(transactionRepository, tokenRepositoryType);
    }

    @Provides
    CreateTransactionInteract provideCreateTransactionInteract(TransactionRepositoryType transactionRepository) {
        return new CreateTransactionInteract(transactionRepository);
    }

    @Provides
    MyAddressRouter provideMyAddressRouter() {
        return new MyAddressRouter();
    }

    @Provides
    CoinbasePayRouter provideCoinbasePayRouter() {
        return new CoinbasePayRouter();
    }

    @Provides
    FetchTokensInteract provideFetchTokensInteract(TokenRepositoryType tokenRepository) {
        return new FetchTokensInteract(tokenRepository);
    }

    @Provides
    SignatureGenerateInteract provideSignatureGenerateInteract(WalletRepositoryType walletRepository) {
        return new SignatureGenerateInteract(walletRepository);
    }

    @Provides
    MemPoolInteract provideMemPoolInteract(TokenRepositoryType tokenRepository) {
        return new MemPoolInteract(tokenRepository);
    }

    @Provides
    TransferTicketDetailRouter provideTransferTicketRouter() {
        return new TransferTicketDetailRouter();
    }

    @Provides
    LocaleRepositoryType provideLocaleRepository(PreferenceRepositoryType preferenceRepository) {
        return new LocaleRepository(preferenceRepository);
    }

    @Provides
    CurrencyRepositoryType provideCurrencyRepository(PreferenceRepositoryType preferenceRepository) {
        return new CurrencyRepository(preferenceRepository);
    }

    @Provides
    TokenDetailRouter provideErc20DetailRouterRouter() {
        return new TokenDetailRouter();
    }

    @Provides
    GenericWalletInteract provideGenericWalletInteract(WalletRepositoryType walletRepository) {
        return new GenericWalletInteract(walletRepository);
    }

    @Provides
    ChangeTokenEnableInteract provideChangeTokenEnableInteract(TokenRepositoryType tokenRepository) {
        return new ChangeTokenEnableInteract(tokenRepository);
    }

    @Provides
    ManageWalletsRouter provideManageWalletsRouter() {
        return new ManageWalletsRouter();
    }

    @Provides
    SellDetailRouter provideSellDetailRouter() {
        return new SellDetailRouter();
    }

    @Provides
    DeleteWalletInteract provideDeleteAccountInteract(
            WalletRepositoryType accountRepository) {
        return new DeleteWalletInteract(accountRepository);
    }

    @Provides
    ExportWalletInteract provideExportWalletInteract(
            WalletRepositoryType walletRepository) {
        return new ExportWalletInteract(walletRepository);
    }

    @Provides
    ImportTokenRouter provideImportTokenRouter() {
        return new ImportTokenRouter();
    }

    @Provides
    RedeemSignatureDisplayRouter provideRedeemSignatureDisplayRouter() {
        return new RedeemSignatureDisplayRouter();
    }
}
