package com.chaithanya.bookmyshow.ui.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0002J\b\u0010\u001f\u001a\u00020\u001dH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/chaithanya/bookmyshow/ui/fragment/StreamFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/chaithanya/bookmyshow/databinding/FragmentStreamBinding;", "binding", "getBinding", "()Lcom/chaithanya/bookmyshow/databinding/FragmentStreamBinding;", "database", "Lcom/google/firebase/database/DatabaseReference;", "databaseForHandPicked", "streamHandpickedAdapter", "Lcom/chaithanya/bookmyshow/ui/adapter/StreamHandpickedAdapter;", "streamListForHandpicked", "", "Lcom/chaithanya/bookmyshow/data/model/HomeStreamModel;", "streamMoviesParentAdapter", "Lcom/chaithanya/bookmyshow/ui/adapter/StreamMoviesParentAdapter;", "streamMoviesParentList", "Lcom/chaithanya/bookmyshow/data/model/StreamMoviesParentModel;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "readDataFromFirebase", "setRecyclerview", "app_debug"})
public final class StreamFragment extends androidx.fragment.app.Fragment {
    private final com.google.firebase.database.DatabaseReference database = null;
    private final com.google.firebase.database.DatabaseReference databaseForHandPicked = null;
    private com.chaithanya.bookmyshow.ui.adapter.StreamMoviesParentAdapter streamMoviesParentAdapter;
    private final java.util.List<com.chaithanya.bookmyshow.data.model.StreamMoviesParentModel> streamMoviesParentList = null;
    private com.chaithanya.bookmyshow.ui.adapter.StreamHandpickedAdapter streamHandpickedAdapter;
    private final java.util.List<com.chaithanya.bookmyshow.data.model.HomeStreamModel> streamListForHandpicked = null;
    private com.chaithanya.bookmyshow.databinding.FragmentStreamBinding _binding;
    
    public StreamFragment() {
        super();
    }
    
    private final com.chaithanya.bookmyshow.databinding.FragmentStreamBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setRecyclerview() {
    }
    
    private final void readDataFromFirebase() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}