// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.docker.core.util.versioncontrol;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;

public final class VersionManager_Factory implements Factory<VersionManager> {
  private final MembersInjector<VersionManager> versionManagerMembersInjector;

  public VersionManager_Factory(MembersInjector<VersionManager> versionManagerMembersInjector) {
    assert versionManagerMembersInjector != null;
    this.versionManagerMembersInjector = versionManagerMembersInjector;
  }

  @Override
  public VersionManager get() {
    return MembersInjectors.injectMembers(versionManagerMembersInjector, new VersionManager());
  }

  public static Factory<VersionManager> create(
      MembersInjector<VersionManager> versionManagerMembersInjector) {
    return new VersionManager_Factory(versionManagerMembersInjector);
  }
}
