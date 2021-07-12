package com.chaithanya.bookmyshow.repository;

import java.lang.System;

@dagger.hilt.android.scopes.ActivityRetainedScoped()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\b0\u000bJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/chaithanya/bookmyshow/repository/EventsRepository;", "", "bookedEventDAO", "Lcom/chaithanya/bookmyshow/data/local/BookedEventDAO;", "(Lcom/chaithanya/bookmyshow/data/local/BookedEventDAO;)V", "database", "Lcom/google/firebase/database/DatabaseReference;", "homeEventsParentList", "", "Lcom/chaithanya/bookmyshow/data/model/HomeEventsParentModel;", "getAllBookedEvent", "Landroidx/lifecycle/LiveData;", "Lcom/chaithanya/bookmyshow/data/local/BookedEventEntity;", "getEventListForHome", "insertBookedEvent", "", "event", "(Lcom/chaithanya/bookmyshow/data/local/BookedEventEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class EventsRepository {
    private final com.chaithanya.bookmyshow.data.local.BookedEventDAO bookedEventDAO = null;
    private final com.google.firebase.database.DatabaseReference database = null;
    private final java.util.List<com.chaithanya.bookmyshow.data.model.HomeEventsParentModel> homeEventsParentList = null;
    
    @javax.inject.Inject()
    public EventsRepository(@org.jetbrains.annotations.NotNull()
    com.chaithanya.bookmyshow.data.local.BookedEventDAO bookedEventDAO) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.chaithanya.bookmyshow.data.model.HomeEventsParentModel> getEventListForHome() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertBookedEvent(@org.jetbrains.annotations.NotNull()
    com.chaithanya.bookmyshow.data.local.BookedEventEntity event, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.chaithanya.bookmyshow.data.local.BookedEventEntity>> getAllBookedEvent() {
        return null;
    }
}