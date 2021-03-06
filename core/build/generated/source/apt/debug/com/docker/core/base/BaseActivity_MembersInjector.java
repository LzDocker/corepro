package com.docker.core.base;

import android.databinding.ViewDataBinding;
import android.support.v4.app.Fragment;
import com.docker.core.util.Empty;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BaseActivity_MembersInjector<
        VM extends BaseViewModel, VB extends ViewDataBinding>
    implements MembersInjector<BaseActivity<VM, VB>> {
  private final Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider;

  private final Provider<DispatchingAndroidInjector<android.app.Fragment>>
      frameworkFragmentInjectorProvider;

  private final Provider<Empty> emptyProvider;

  public BaseActivity_MembersInjector(
      Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider,
      Provider<DispatchingAndroidInjector<android.app.Fragment>> frameworkFragmentInjectorProvider,
      Provider<Empty> emptyProvider) {
    assert supportFragmentInjectorProvider != null;
    this.supportFragmentInjectorProvider = supportFragmentInjectorProvider;
    assert frameworkFragmentInjectorProvider != null;
    this.frameworkFragmentInjectorProvider = frameworkFragmentInjectorProvider;
    assert emptyProvider != null;
    this.emptyProvider = emptyProvider;
  }

  public static <VM extends BaseViewModel, VB extends ViewDataBinding>
      MembersInjector<BaseActivity<VM, VB>> create(
          Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider,
          Provider<DispatchingAndroidInjector<android.app.Fragment>>
              frameworkFragmentInjectorProvider,
          Provider<Empty> emptyProvider) {
    return new BaseActivity_MembersInjector<VM, VB>(
        supportFragmentInjectorProvider, frameworkFragmentInjectorProvider, emptyProvider);
  }

  @Override
  public void injectMembers(BaseActivity<VM, VB> instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseInjectActivity) instance).supportFragmentInjector = supportFragmentInjectorProvider.get();
    ((BaseInjectActivity) instance).frameworkFragmentInjector =
        frameworkFragmentInjectorProvider.get();
    instance.empty = emptyProvider.get();
  }

  public static <VM extends BaseViewModel, VB extends ViewDataBinding> void injectEmpty(
      BaseActivity<VM, VB> instance, Provider<Empty> emptyProvider) {
    instance.empty = emptyProvider.get();
  }
}
