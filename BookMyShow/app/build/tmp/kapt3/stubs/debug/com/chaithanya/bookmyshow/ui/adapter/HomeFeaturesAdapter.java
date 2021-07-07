package com.chaithanya.bookmyshow.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lcom/chaithanya/bookmyshow/ui/adapter/HomeFeaturesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/chaithanya/bookmyshow/ui/adapter/HomeFeaturesAdapter$HomeFeaturesViewHolder;", "homeHeaderList", "", "Lcom/chaithanya/bookmyshow/data/model/HomeHeaderModel;", "listener", "Lcom/chaithanya/bookmyshow/ui/adapter/itemclicklistener/HomeFeaturesItemClickListener;", "(Ljava/util/List;Lcom/chaithanya/bookmyshow/ui/adapter/itemclicklistener/HomeFeaturesItemClickListener;)V", "getHomeHeaderList", "()Ljava/util/List;", "getListener", "()Lcom/chaithanya/bookmyshow/ui/adapter/itemclicklistener/HomeFeaturesItemClickListener;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "HomeFeaturesViewHolder", "app_debug"})
public final class HomeFeaturesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.chaithanya.bookmyshow.ui.adapter.HomeFeaturesAdapter.HomeFeaturesViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.chaithanya.bookmyshow.data.model.HomeHeaderModel> homeHeaderList = null;
    @org.jetbrains.annotations.NotNull()
    private final com.chaithanya.bookmyshow.ui.adapter.itemclicklistener.HomeFeaturesItemClickListener listener = null;
    
    public HomeFeaturesAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.chaithanya.bookmyshow.data.model.HomeHeaderModel> homeHeaderList, @org.jetbrains.annotations.NotNull()
    com.chaithanya.bookmyshow.ui.adapter.itemclicklistener.HomeFeaturesItemClickListener listener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.chaithanya.bookmyshow.data.model.HomeHeaderModel> getHomeHeaderList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.chaithanya.bookmyshow.ui.adapter.itemclicklistener.HomeFeaturesItemClickListener getListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.chaithanya.bookmyshow.ui.adapter.HomeFeaturesAdapter.HomeFeaturesViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.chaithanya.bookmyshow.ui.adapter.HomeFeaturesAdapter.HomeFeaturesViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/chaithanya/bookmyshow/ui/adapter/HomeFeaturesAdapter$HomeFeaturesViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "featuresRecyclerImage", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "getFeaturesRecyclerImage", "()Landroid/widget/ImageView;", "app_debug"})
    public static final class HomeFeaturesViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.ImageView featuresRecyclerImage = null;
        
        public HomeFeaturesViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        public final android.widget.ImageView getFeaturesRecyclerImage() {
            return null;
        }
    }
}