package com.docker.core.di.module.httpmodule;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GlobalConfigModule_ProvideHttpRequestHandlerFactory
    implements Factory<HttpRequestHandler> {
  private final GlobalConfigModule module;

  public GlobalConfigModule_ProvideHttpRequestHandlerFactory(GlobalConfigModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public HttpRequestHandler get() {
    return Preconditions.checkNotNull(
        module.provideHttpRequestHandler(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<HttpRequestHandler> create(GlobalConfigModule module) {
    return new GlobalConfigModule_ProvideHttpRequestHandlerFactory(module);
  }

  /** Proxies {@link GlobalConfigModule#provideHttpRequestHandler()}. */
  public static HttpRequestHandler proxyProvideHttpRequestHandler(GlobalConfigModule instance) {
    return instance.provideHttpRequestHandler();
  }
}
