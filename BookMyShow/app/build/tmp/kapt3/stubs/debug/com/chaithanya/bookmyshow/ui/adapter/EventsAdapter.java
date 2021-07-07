package com.chaithanya.bookmyshow.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016J\u0014\u0010\u0017\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/chaithanya/bookmyshow/ui/adapter/EventsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/chaithanya/bookmyshow/ui/adapter/EventsAdapter$EventsViewHolder;", "homeEventsChildModelList", "", "Lcom/chaithanya/bookmyshow/data/model/HomeEventsChildModel;", "listener", "Lcom/chaithanya/bookmyshow/ui/adapter/itemclicklistener/EventsItemClickListener;", "(Ljava/util/List;Lcom/chaithanya/bookmyshow/ui/adapter/itemclicklistener/EventsItemClickListener;)V", "getHomeEventsChildModelList", "()Ljava/util/List;", "setHomeEventsChildModelList", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateData", "newData", "EventsViewHolder", "app_debug"})
public final class EventsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.chaithanya.bookmyshow.ui.adapter.EventsAdapter.EventsViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.chaithanya.bookmyshow.data.model.HomeEventsChildModel> homeEventsChildModelList;
    private final com.chaithanya.bookmyshow.ui.adapter.itemclicklistener.EventsItemClickListener listener = null;
    
    public EventsAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.chaithanya.bookmyshow.data.model.HomeEventsChildModel> homeEventsChildModelList, @org.jetbrains.annotations.NotNull()
    com.chaithanya.bookmyshow.ui.adapter.itemclicklistener.EventsItemClickListener listener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.chaithanya.bookmyshow.data.model.HomeEventsChildModel> getHomeEventsChildModelList() {
        return null;
    }
    
    public final void setHomeEventsChildModelList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.chaithanya.bookmyshow.data.model.HomeEventsChildModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.chaithanya.bookmyshow.ui.adapter.EventsAdapter.EventsViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.chaithanya.bookmyshow.ui.adapter.EventsAdapter.EventsViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void updateData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.chaithanya.bookmyshow.data.model.HomeEventsChildModel> newData) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u000f0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0012\u001a\n \u0007*\u0004\u0018\u00010\u000f0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0019\u0010\u0014\u001a\n \u0007*\u0004\u0018\u00010\u000f0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011\u00a8\u0006\u0016"}, d2 = {"Lcom/chaithanya/bookmyshow/ui/adapter/EventsAdapter$EventsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "EventsConstraint", "Landroidx/constraintlayout/widget/ConstraintLayout;", "kotlin.jvm.PlatformType", "getEventsConstraint", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "imageEvents", "Landroid/widget/ImageView;", "getImageEvents", "()Landroid/widget/ImageView;", "tvEventsCategory", "Landroid/widget/TextView;", "getTvEventsCategory", "()Landroid/widget/TextView;", "tvEventsPrice", "getTvEventsPrice", "tvEventsTitle", "getTvEventsTitle", "app_debug"})
    public static final class EventsViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final androidx.constraintlayout.widget.ConstraintLayout EventsConstraint = null;
        private final android.widget.ImageView imageEvents = null;
        private final android.widget.TextView tvEventsTitle = null;
        private final android.widget.TextView tvEventsCategory = null;
        private final android.widget.TextView tvEventsPrice = null;
        
        public EventsViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        public final androidx.constraintlayout.widget.ConstraintLayout getEventsConstraint() {
            return null;
        }
        
        public final android.widget.ImageView getImageEvents() {
            return null;
        }
        
        public final android.widget.TextView getTvEventsTitle() {
            return null;
        }
        
        public final android.widget.TextView getTvEventsCategory() {
            return null;
        }
        
        public final android.widget.TextView getTvEventsPrice() {
            return null;
        }
    }
}