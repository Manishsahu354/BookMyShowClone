package com.chaithanya.bookmyshow.ui.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J$\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0013H\u0016J\b\u0010 \u001a\u00020\u001dH\u0002J\b\u0010!\u001a\u00020\u001dH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/chaithanya/bookmyshow/ui/fragment/EventsFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/chaithanya/bookmyshow/ui/adapter/itemclicklistener/EventsItemClickListener;", "()V", "_binding", "Lcom/chaithanya/bookmyshow/databinding/FragmentEventsBinding;", "binding", "getBinding", "()Lcom/chaithanya/bookmyshow/databinding/FragmentEventsBinding;", "database", "Lcom/google/firebase/database/DatabaseReference;", "eventAdapter", "Lcom/chaithanya/bookmyshow/ui/adapter/EventsAdapter;", "getEventAdapter", "()Lcom/chaithanya/bookmyshow/ui/adapter/EventsAdapter;", "setEventAdapter", "(Lcom/chaithanya/bookmyshow/ui/adapter/EventsAdapter;)V", "eventsList", "", "Lcom/chaithanya/bookmyshow/data/model/HomeEventsChildModel;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onEventsItemClicked", "childModel", "readDataFromFirebase", "setUpRecyclerView", "app_debug"})
public final class EventsFragment extends androidx.fragment.app.Fragment implements com.chaithanya.bookmyshow.ui.adapter.itemclicklistener.EventsItemClickListener {
    private com.google.firebase.database.DatabaseReference database;
    private com.chaithanya.bookmyshow.databinding.FragmentEventsBinding _binding;
    public com.chaithanya.bookmyshow.ui.adapter.EventsAdapter eventAdapter;
    private final java.util.List<com.chaithanya.bookmyshow.data.model.HomeEventsChildModel> eventsList = null;
    
    public EventsFragment() {
        super();
    }
    
    private final com.chaithanya.bookmyshow.databinding.FragmentEventsBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.chaithanya.bookmyshow.ui.adapter.EventsAdapter getEventAdapter() {
        return null;
    }
    
    public final void setEventAdapter(@org.jetbrains.annotations.NotNull()
    com.chaithanya.bookmyshow.ui.adapter.EventsAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setUpRecyclerView() {
    }
    
    private final void readDataFromFirebase() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onEventsItemClicked(@org.jetbrains.annotations.NotNull()
    com.chaithanya.bookmyshow.data.model.HomeEventsChildModel childModel) {
    }
}