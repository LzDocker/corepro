// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.docker.core.di.module.httpmodule;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

public final class HttpClientModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final HttpClientModule module;

  private final Provider<Retrofit.Builder> builderProvider;

  private final Provider<OkHttpClient> clientProvider;

  private final Provider<HttpUrl> httpUrlProvider;

  public HttpClientModule_ProvideRetrofitFactory(
      HttpClientModule module,
      Provider<Retrofit.Builder> builderProvider,
      Provider<OkHttpClient> clientProvider,
      Provider<HttpUrl> httpUrlProvider) {
    assert module != null;
    this.module = module;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
    assert clientProvider != null;
    this.clientProvider = clientProvider;
    assert httpUrlProvider != null;
    this.httpUrlProvider = httpUrlProvider;
  }

  @Override
  public Retrofit get() {
    return Preconditions.checkNotNull(
        module.provideRetrofit(builderProvider.get(), clientProvider.get(), httpUrlProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Retrofit> create(
      HttpClientModule module,
      Provider<Retrofit.Builder> builderProvider,
      Provider<OkHttpClient> clientProvider,
      Provider<HttpUrl> httpUrlProvider) {
    return new HttpClientModule_ProvideRetrofitFactory(
        module, builderProvider, clientProvider, httpUrlProvider);
  }

  /** Proxies {@link HttpClientModule#provideRetrofit(Retrofit.Builder, OkHttpClient, HttpUrl)}. */
  public static Retrofit proxyProvideRetrofit(
      HttpClientModule instance, Retrofit.Builder builder, OkHttpClient client, HttpUrl httpUrl) {
    return instance.provideRetrofit(builder, client, httpUrl);
  }
}
