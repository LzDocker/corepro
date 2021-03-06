package com.docker.core.di.component;

import android.app.Activity;
import android.app.Fragment;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import com.docker.core.base.BaseApplication;
import com.docker.core.base.BaseApplication_MembersInjector;
import com.docker.core.di.module.AppModule;
import com.docker.core.di.module.AppModule_ProvideApplicationFactory;
import com.docker.core.di.module.cachemodule.CacheDatabase;
import com.docker.core.di.module.cachemodule.CacheModule;
import com.docker.core.di.module.cachemodule.CacheModule_ProvideCacheDatabaseFactory;
import com.docker.core.di.module.httpmodule.GlobalConfigModule;
import com.docker.core.di.module.httpmodule.GlobalConfigModule_ProvideBaseUrlFactory;
import com.docker.core.di.module.httpmodule.GlobalConfigModule_ProvideHttpRequestHandlerFactory;
import com.docker.core.di.module.httpmodule.GlobalConfigModule_ProvideInterceptorsFactory;
import com.docker.core.di.module.httpmodule.HttpClientModule;
import com.docker.core.di.module.httpmodule.HttpClientModule_ProvideClientBuilderFactory;
import com.docker.core.di.module.httpmodule.HttpClientModule_ProvideClientFactory;
import com.docker.core.di.module.httpmodule.HttpClientModule_ProvideGsonFactory;
import com.docker.core.di.module.httpmodule.HttpClientModule_ProvideHeaderFactory;
import com.docker.core.di.module.httpmodule.HttpClientModule_ProvideInterceptFactory;
import com.docker.core.di.module.httpmodule.HttpClientModule_ProviderCookieJarFactory;
import com.docker.core.di.module.httpmodule.HttpRequestHandler;
import com.docker.core.di.module.httpmodule.MHeader;
import com.docker.core.di.module.httpmodule.RequestInterceptor;
import com.docker.core.di.module.httpmodule.RequestInterceptor_Factory;
import com.google.gson.Gson;
import dagger.MembersInjector;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.internal.DoubleCheck;
import dagger.internal.MapProviderFactory;
import dagger.internal.Preconditions;
import java.util.List;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerBaseAppComponent implements BaseAppComponent {
  private Provider<Gson> provideGsonProvider;

  private Provider<OkHttpClient.Builder> provideClientBuilderProvider;

  private Provider<HttpRequestHandler> provideHttpRequestHandlerProvider;

  private Provider<HttpUrl> provideBaseUrlProvider;

  private Provider<MHeader> provideHeaderProvider;

  private Provider<RequestInterceptor> requestInterceptorProvider;

  private Provider<Interceptor> provideInterceptProvider;

  private Provider<List<Interceptor>> provideInterceptorsProvider;

  private Provider<CookieJar> providerCookieJarProvider;

  private Provider<OkHttpClient> provideClientProvider;

  private Provider<BaseApplication> provideApplicationProvider;

  private Provider<DispatchingAndroidInjector<Activity>> dispatchingAndroidInjectorProvider;

  private Provider<DispatchingAndroidInjector<Fragment>> dispatchingAndroidInjectorProvider2;

  private Provider<DispatchingAndroidInjector<android.support.v4.app.Fragment>>
      dispatchingAndroidInjectorProvider3;

  private Provider<DispatchingAndroidInjector<BroadcastReceiver>>
      dispatchingAndroidInjectorProvider4;

  private Provider<DispatchingAndroidInjector<Service>> dispatchingAndroidInjectorProvider5;

  private Provider<DispatchingAndroidInjector<ContentProvider>> dispatchingAndroidInjectorProvider6;

  private MembersInjector<BaseApplication> baseApplicationMembersInjector;

  private Provider<CacheDatabase> provideCacheDatabaseProvider;

  private DaggerBaseAppComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideGsonProvider =
        DoubleCheck.provider(HttpClientModule_ProvideGsonFactory.create(builder.httpClientModule));

    this.provideClientBuilderProvider =
        DoubleCheck.provider(
            HttpClientModule_ProvideClientBuilderFactory.create(builder.httpClientModule));

    this.provideHttpRequestHandlerProvider =
        DoubleCheck.provider(
            GlobalConfigModule_ProvideHttpRequestHandlerFactory.create(builder.globalConfigModule));

    this.provideBaseUrlProvider =
        DoubleCheck.provider(
            GlobalConfigModule_ProvideBaseUrlFactory.create(builder.globalConfigModule));

    this.provideHeaderProvider =
        DoubleCheck.provider(
            HttpClientModule_ProvideHeaderFactory.create(
                builder.httpClientModule, provideBaseUrlProvider));

    this.requestInterceptorProvider =
        DoubleCheck.provider(
            RequestInterceptor_Factory.create(
                provideHttpRequestHandlerProvider, provideHeaderProvider));

    this.provideInterceptProvider =
        DoubleCheck.provider(
            HttpClientModule_ProvideInterceptFactory.create(
                builder.httpClientModule, requestInterceptorProvider));

    this.provideInterceptorsProvider =
        DoubleCheck.provider(
            GlobalConfigModule_ProvideInterceptorsFactory.create(builder.globalConfigModule));

    this.providerCookieJarProvider =
        HttpClientModule_ProviderCookieJarFactory.create(builder.httpClientModule);

    this.provideClientProvider =
        DoubleCheck.provider(
            HttpClientModule_ProvideClientFactory.create(
                builder.httpClientModule,
                provideClientBuilderProvider,
                provideInterceptProvider,
                provideInterceptorsProvider,
                providerCookieJarProvider));

    this.provideApplicationProvider =
        DoubleCheck.provider(AppModule_ProvideApplicationFactory.create(builder.appModule));

    this.dispatchingAndroidInjectorProvider =
        DispatchingAndroidInjector_Factory.create(
            MapProviderFactory
                .<Class<? extends Activity>, AndroidInjector.Factory<? extends Activity>>empty());

    this.dispatchingAndroidInjectorProvider2 =
        DispatchingAndroidInjector_Factory.create(
            MapProviderFactory
                .<Class<? extends Fragment>, AndroidInjector.Factory<? extends Fragment>>empty());

    this.dispatchingAndroidInjectorProvider3 =
        DispatchingAndroidInjector_Factory.create(
            MapProviderFactory
                .<Class<? extends android.support.v4.app.Fragment>,
                    AndroidInjector.Factory<? extends android.support.v4.app.Fragment>>
                    empty());

    this.dispatchingAndroidInjectorProvider4 =
        DispatchingAndroidInjector_Factory.create(
            MapProviderFactory
                .<Class<? extends BroadcastReceiver>,
                    AndroidInjector.Factory<? extends BroadcastReceiver>>
                    empty());

    this.dispatchingAndroidInjectorProvider5 =
        DispatchingAndroidInjector_Factory.create(
            MapProviderFactory
                .<Class<? extends Service>, AndroidInjector.Factory<? extends Service>>empty());

    this.dispatchingAndroidInjectorProvider6 =
        DispatchingAndroidInjector_Factory.create(
            MapProviderFactory
                .<Class<? extends ContentProvider>,
                    AndroidInjector.Factory<? extends ContentProvider>>
                    empty());

    this.baseApplicationMembersInjector =
        BaseApplication_MembersInjector.create(
            dispatchingAndroidInjectorProvider,
            dispatchingAndroidInjectorProvider2,
            dispatchingAndroidInjectorProvider3,
            dispatchingAndroidInjectorProvider4,
            dispatchingAndroidInjectorProvider5,
            dispatchingAndroidInjectorProvider6);

    this.provideCacheDatabaseProvider =
        DoubleCheck.provider(
            CacheModule_ProvideCacheDatabaseFactory.create(
                builder.cacheModule, provideApplicationProvider));
  }

  @Override
  public Gson gson() {
    return provideGsonProvider.get();
  }

  @Override
  public OkHttpClient okHttpClient() {
    return provideClientProvider.get();
  }

  @Override
  public BaseApplication baseApplication() {
    return provideApplicationProvider.get();
  }

  @Override
  public void inject(BaseApplication application) {
    baseApplicationMembersInjector.injectMembers(application);
  }

  @Override
  public CacheDatabase cacheDatabase() {
    return provideCacheDatabaseProvider.get();
  }

  public static final class Builder {
    private HttpClientModule httpClientModule;

    private GlobalConfigModule globalConfigModule;

    private AppModule appModule;

    private CacheModule cacheModule;

    private Builder() {}

    public BaseAppComponent build() {
      if (httpClientModule == null) {
        throw new IllegalStateException(HttpClientModule.class.getCanonicalName() + " must be set");
      }
      if (globalConfigModule == null) {
        throw new IllegalStateException(
            GlobalConfigModule.class.getCanonicalName() + " must be set");
      }
      if (appModule == null) {
        throw new IllegalStateException(AppModule.class.getCanonicalName() + " must be set");
      }
      if (cacheModule == null) {
        throw new IllegalStateException(CacheModule.class.getCanonicalName() + " must be set");
      }
      return new DaggerBaseAppComponent(this);
    }

    public Builder appModule(AppModule appModule) {
      this.appModule = Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder httpClientModule(HttpClientModule httpClientModule) {
      this.httpClientModule = Preconditions.checkNotNull(httpClientModule);
      return this;
    }

    public Builder globalConfigModule(GlobalConfigModule globalConfigModule) {
      this.globalConfigModule = Preconditions.checkNotNull(globalConfigModule);
      return this;
    }

    public Builder cacheModule(CacheModule cacheModule) {
      this.cacheModule = Preconditions.checkNotNull(cacheModule);
      return this;
    }
  }
}
