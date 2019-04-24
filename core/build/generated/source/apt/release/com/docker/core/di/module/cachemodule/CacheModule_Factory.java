// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.docker.core.di.module.cachemodule;

import com.docker.core.base.BaseApplication;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class CacheModule_Factory implements Factory<CacheModule> {
  private final Provider<BaseApplication> applicationProvider;

  public CacheModule_Factory(Provider<BaseApplication> applicationProvider) {
    assert applicationProvider != null;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public CacheModule get() {
    return new CacheModule(applicationProvider.get());
  }

  public static Factory<CacheModule> create(Provider<BaseApplication> applicationProvider) {
    return new CacheModule_Factory(applicationProvider);
  }
}