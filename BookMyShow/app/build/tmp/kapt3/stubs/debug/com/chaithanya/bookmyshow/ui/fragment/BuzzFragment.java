package com.chaithanya.bookmyshow.ui.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rH\u0016J$\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0011H\u0016J\b\u0010\u001c\u001a\u00020\u0011H\u0002J\b\u0010\u001d\u001a\u00020\u0011H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/chaithanya/bookmyshow/ui/fragment/BuzzFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/chaithanya/bookmyshow/ui/adapter/itemclicklistener/BuzzArticleItemClickListener;", "()V", "_binding", "Lcom/chaithanya/bookmyshow/databinding/FragmentBuzzBinding;", "binding", "getBinding", "()Lcom/chaithanya/bookmyshow/databinding/FragmentBuzzBinding;", "buzzArticleAdapter", "Lcom/chaithanya/bookmyshow/ui/adapter/BuzzArticleAdapter;", "buzzArticleList", "", "Lcom/chaithanya/bookmyshow/data/model/BuzzArticlesModel;", "database", "Lcom/google/firebase/database/DatabaseReference;", "onArticleItemClicked", "", "buzzArticlesModel", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "readDataFromFirebase", "setUpRecyclerview", "app_debug"})
public final class BuzzFragment extends androidx.fragment.app.Fragment implements com.chaithanya.bookmyshow.ui.adapter.itemclicklistener.BuzzArticleItemClickListener {
    private com.chaithanya.bookmyshow.ui.adapter.BuzzArticleAdapter buzzArticleAdapter;
    private final java.util.List<com.chaithanya.bookmyshow.data.model.BuzzArticlesModel> buzzArticleList = null;
    private final com.google.firebase.database.DatabaseReference database = null;
    private com.chaithanya.bookmyshow.databinding.FragmentBuzzBinding _binding;
    
    public BuzzFragment() {
        super();
    }
    
    private final com.chaithanya.bookmyshow.databinding.FragmentBuzzBinding getBinding() {
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
    
    private final void setUpRecyclerview() {
    }
    
    private final void readDataFromFirebase() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onArticleItemClicked(@org.jetbrains.annotations.NotNull()
    com.chaithanya.bookmyshow.data.model.BuzzArticlesModel buzzArticlesModel) {
    }
}