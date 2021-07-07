// Generated by Dagger (https://dagger.dev).
package com.chaithanya.bookmyshow.di;

import com.chaithanya.bookmyshow.repository.EventsRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideEventsRepositoryFactory implements Factory<EventsRepository> {
  @Override
  public EventsRepository get() {
    return provideEventsRepository();
  }

  public static AppModule_ProvideEventsRepositoryFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static EventsRepository provideEventsRepository() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideEventsRepository());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideEventsRepositoryFactory INSTANCE = new AppModule_ProvideEventsRepositoryFactory();
  }
}