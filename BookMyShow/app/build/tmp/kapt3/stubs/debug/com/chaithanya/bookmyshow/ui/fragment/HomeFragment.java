package com.chaithanya.bookmyshow.ui.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001c\u001a\u00020\u001dH\u0002J$\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010&\u001a\u00020\u001dH\u0016J\u0010\u0010\'\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u001dH\u0002J\b\u0010+\u001a\u00020\u001dH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006,"}, d2 = {"Lcom/chaithanya/bookmyshow/ui/fragment/HomeFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/chaithanya/bookmyshow/ui/adapter/itemclicklistener/HomeFeaturesItemClickListener;", "()V", "_binding", "Lcom/chaithanya/bookmyshow/databinding/FragmentHomeBinding;", "binding", "getBinding", "()Lcom/chaithanya/bookmyshow/databinding/FragmentHomeBinding;", "database", "Lcom/google/firebase/database/DatabaseReference;", "homeBestOfList", "", "Lcom/chaithanya/bookmyshow/data/model/HomeHeaderModel;", "homeEventsParentAdapter", "Lcom/chaithanya/bookmyshow/ui/adapter/HomeEventsParentAdapter;", "homeEventsParentList", "Lcom/chaithanya/bookmyshow/data/model/HomeEventsParentModel;", "homeFeaturesList", "homeHeaderList", "homeStreamList", "Lcom/chaithanya/bookmyshow/data/model/HomeStreamModel;", "viewModel", "Lcom/chaithanya/bookmyshow/viewmodel/HomeViewModel;", "getViewModel", "()Lcom/chaithanya/bookmyshow/viewmodel/HomeViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "initData", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onFeaturesItemClicked", "position", "", "readDataFromFirebase", "setRecyclerView", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class HomeFragment extends androidx.fragment.app.Fragment implements com.chaithanya.bookmyshow.ui.adapter.itemclicklistener.HomeFeaturesItemClickListener {
    private final kotlin.Lazy viewModel$delegate = null;
    private final com.google.firebase.database.DatabaseReference database = null;
    private com.chaithanya.bookmyshow.ui.adapter.HomeEventsParentAdapter homeEventsParentAdapter;
    private com.chaithanya.bookmyshow.databinding.FragmentHomeBinding _binding;
    private final java.util.List<com.chaithanya.bookmyshow.data.model.HomeEventsParentModel> homeEventsParentList = null;
    private final java.util.List<com.chaithanya.bookmyshow.data.model.HomeHeaderModel> homeHeaderList = null;
    private final java.util.List<com.chaithanya.bookmyshow.data.model.HomeHeaderModel> homeFeaturesList = null;
    private final java.util.List<com.chaithanya.bookmyshow.data.model.HomeStreamModel> homeStreamList = null;
    private final java.util.List<com.chaithanya.bookmyshow.data.model.HomeHeaderModel> homeBestOfList = null;
    
    public HomeFragment() {
        super();
    }
    
    private final com.chaithanya.bookmyshow.viewmodel.HomeViewModel getViewModel() {
        return null;
    }
    
    private final com.chaithanya.bookmyshow.databinding.FragmentHomeBinding getBinding() {
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
    
    private final void readDataFromFirebase() {
    }
    
    private final void setRecyclerView() {
    }
    
    private final void initData() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onFeaturesItemClicked(int position) {
    }
}