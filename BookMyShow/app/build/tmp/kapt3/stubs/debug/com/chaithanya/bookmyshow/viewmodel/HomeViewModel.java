package com.chaithanya.bookmyshow.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/chaithanya/bookmyshow/viewmodel/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/chaithanya/bookmyshow/repository/EventsRepository;", "(Lcom/chaithanya/bookmyshow/repository/EventsRepository;)V", "getEventList", "Landroidx/lifecycle/LiveData;", "", "Lcom/chaithanya/bookmyshow/data/model/HomeEventsParentModel;", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    private final com.chaithanya.bookmyshow.repository.EventsRepository repository = null;
    
    @javax.inject.Inject()
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.chaithanya.bookmyshow.repository.EventsRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.chaithanya.bookmyshow.data.model.HomeEventsParentModel>> getEventList() {
        return null;
    }
}