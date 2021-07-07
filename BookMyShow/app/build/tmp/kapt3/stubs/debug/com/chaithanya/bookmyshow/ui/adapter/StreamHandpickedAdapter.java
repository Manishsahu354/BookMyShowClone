package com.chaithanya.bookmyshow.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0014\u0010\u0011\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/chaithanya/bookmyshow/ui/adapter/StreamHandpickedAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/chaithanya/bookmyshow/ui/adapter/StreamHandpickedAdapter$StreamHandpickedViewHolder;", "homeStreamList", "", "Lcom/chaithanya/bookmyshow/data/model/HomeStreamModel;", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateData", "newData", "StreamHandpickedViewHolder", "app_debug"})
public final class StreamHandpickedAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.chaithanya.bookmyshow.ui.adapter.StreamHandpickedAdapter.StreamHandpickedViewHolder> {
    private java.util.List<com.chaithanya.bookmyshow.data.model.HomeStreamModel> homeStreamList;
    
    public StreamHandpickedAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.chaithanya.bookmyshow.data.model.HomeStreamModel> homeStreamList) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.chaithanya.bookmyshow.ui.adapter.StreamHandpickedAdapter.StreamHandpickedViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.chaithanya.bookmyshow.ui.adapter.StreamHandpickedAdapter.StreamHandpickedViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void updateData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.chaithanya.bookmyshow.data.model.HomeStreamModel> newData) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u000f0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0012\u001a\n \u0007*\u0004\u0018\u00010\u000f0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0019\u0010\u0014\u001a\n \u0007*\u0004\u0018\u00010\u000f0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011\u00a8\u0006\u0016"}, d2 = {"Lcom/chaithanya/bookmyshow/ui/adapter/StreamHandpickedAdapter$StreamHandpickedViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "constraintStreamHandpicked", "Landroidx/constraintlayout/widget/ConstraintLayout;", "kotlin.jvm.PlatformType", "getConstraintStreamHandpicked", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "imageHomeStreamItem", "Landroid/widget/ImageView;", "getImageHomeStreamItem", "()Landroid/widget/ImageView;", "tvStreamCategory", "Landroid/widget/TextView;", "getTvStreamCategory", "()Landroid/widget/TextView;", "tvStreamHandpickedTitle", "getTvStreamHandpickedTitle", "tvStreamLanguage", "getTvStreamLanguage", "app_debug"})
    public static final class StreamHandpickedViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final androidx.constraintlayout.widget.ConstraintLayout constraintStreamHandpicked = null;
        private final android.widget.ImageView imageHomeStreamItem = null;
        private final android.widget.TextView tvStreamHandpickedTitle = null;
        private final android.widget.TextView tvStreamLanguage = null;
        private final android.widget.TextView tvStreamCategory = null;
        
        public StreamHandpickedViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        public final androidx.constraintlayout.widget.ConstraintLayout getConstraintStreamHandpicked() {
            return null;
        }
        
        public final android.widget.ImageView getImageHomeStreamItem() {
            return null;
        }
        
        public final android.widget.TextView getTvStreamHandpickedTitle() {
            return null;
        }
        
        public final android.widget.TextView getTvStreamLanguage() {
            return null;
        }
        
        public final android.widget.TextView getTvStreamCategory() {
            return null;
        }
    }
}