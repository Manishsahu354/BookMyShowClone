package com.chaithanya.bookmyshow.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0014\u0010\u0011\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/chaithanya/bookmyshow/ui/adapter/StreamMoviesParentAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/chaithanya/bookmyshow/ui/adapter/StreamMoviesParentAdapter$StreamMoviesParentViewHolder;", "streamMoviesParentList", "", "Lcom/chaithanya/bookmyshow/data/model/StreamMoviesParentModel;", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateData", "newData", "StreamMoviesParentViewHolder", "app_debug"})
public final class StreamMoviesParentAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.chaithanya.bookmyshow.ui.adapter.StreamMoviesParentAdapter.StreamMoviesParentViewHolder> {
    private java.util.List<com.chaithanya.bookmyshow.data.model.StreamMoviesParentModel> streamMoviesParentList;
    
    public StreamMoviesParentAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.chaithanya.bookmyshow.data.model.StreamMoviesParentModel> streamMoviesParentList) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.chaithanya.bookmyshow.ui.adapter.StreamMoviesParentAdapter.StreamMoviesParentViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.chaithanya.bookmyshow.ui.adapter.StreamMoviesParentAdapter.StreamMoviesParentViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void updateData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.chaithanya.bookmyshow.data.model.StreamMoviesParentModel> newData) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f\u00a8\u0006\u000f"}, d2 = {"Lcom/chaithanya/bookmyshow/ui/adapter/StreamMoviesParentAdapter$StreamMoviesParentViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "streamMoviesChildRecycleView", "Landroidx/recyclerview/widget/RecyclerView;", "getStreamMoviesChildRecycleView", "()Landroidx/recyclerview/widget/RecyclerView;", "tvMovieType", "Landroid/widget/TextView;", "getTvMovieType", "()Landroid/widget/TextView;", "tvSeeAllStream", "getTvSeeAllStream", "app_debug"})
    public static final class StreamMoviesParentViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView tvMovieType = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView tvSeeAllStream = null;
        @org.jetbrains.annotations.NotNull()
        private final androidx.recyclerview.widget.RecyclerView streamMoviesChildRecycleView = null;
        
        public StreamMoviesParentViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvMovieType() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvSeeAllStream() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.recyclerview.widget.RecyclerView getStreamMoviesChildRecycleView() {
            return null;
        }
    }
}