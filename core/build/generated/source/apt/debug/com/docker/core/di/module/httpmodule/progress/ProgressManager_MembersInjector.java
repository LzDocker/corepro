package com.docker.core.di.module.httpmodule.progress;

import com.docker.core.di.module.httpmodule.MHeader;
import com.docker.core.util.AppExecutors;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProgressManager_MembersInjector implements MembersInjector<ProgressManager> {
  private final Provider<AppExecutors> appExecutorsProvider;

  private final Provider<MHeader> mHeaderProvider;

  private final Provider<OkHttpClient.Builder> builderProvider;

  private final Provider<Retrofit> retrofitProvider;

  public ProgressManager_MembersInjector(
      Provider<AppExecutors> appExecutorsProvider,
      Provider<MHeader> mHeaderProvider,
      Provider<OkHttpClient.Builder> builderProvider,
      Provider<Retrofit> retrofitProvider) {
    assert appExecutorsProvider != null;
    this.appExecutorsProvider = appExecutorsProvider;
    assert mHeaderProvider != null;
    this.mHeaderProvider = mHeaderProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
    assert retrofitProvider != null;
    this.retrofitProvider = retrofitProvider;
  }

  public static MembersInjector<ProgressManager> create(
      Provider<AppExecutors> appExecutorsProvider,
      Provider<MHeader> mHeaderProvider,
      Provider<OkHttpClient.Builder> builderProvider,
      Provider<Retrofit> retrofitProvider) {
    return new ProgressManager_MembersInjector(
        appExecutorsProvider, mHeaderProvider, builderProvider, retrofitProvider);
  }

  @Override
  public void injectMembers(ProgressManager instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.appExecutors = appExecutorsProvider.get();
    instance.mHeader = mHeaderProvider.get();
    instance.builder = builderProvider.get();
    instance.retrofit = retrofitProvider.get();
  }

  public static void injectAppExecutors(
      ProgressManager instance, Provider<AppExecutors> appExecutorsProvider) {
    instance.appExecutors = appExecutorsProvider.get();
  }

  public static void injectMHeader(ProgressManager instance, Provider<MHeader> mHeaderProvider) {
    instance.mHeader = mHeaderProvider.get();
  }

  public static void injectBuilder(
      ProgressManager instance, Provider<OkHttpClient.Builder> builderProvider) {
    instance.builder = builderProvider.get();
  }

  public static void injectRetrofit(ProgressManager instance, Provider<Retrofit> retrofitProvider) {
    instance.retrofit = retrofitProvider.get();
  }
}
