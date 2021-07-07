package com.chaithanya.bookmyshow.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0014\u0010\u0013\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/chaithanya/bookmyshow/ui/adapter/BuzzArticleAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/chaithanya/bookmyshow/ui/adapter/BuzzArticleAdapter$BuzzArticleViewHolder;", "buzzArticleList", "", "Lcom/chaithanya/bookmyshow/data/model/BuzzArticlesModel;", "listener", "Lcom/chaithanya/bookmyshow/ui/adapter/itemclicklistener/BuzzArticleItemClickListener;", "(Ljava/util/List;Lcom/chaithanya/bookmyshow/ui/adapter/itemclicklistener/BuzzArticleItemClickListener;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateData", "newData", "BuzzArticleViewHolder", "app_debug"})
public final class BuzzArticleAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.chaithanya.bookmyshow.ui.adapter.BuzzArticleAdapter.BuzzArticleViewHolder> {
    private java.util.List<com.chaithanya.bookmyshow.data.model.BuzzArticlesModel> buzzArticleList;
    private final com.chaithanya.bookmyshow.ui.adapter.itemclicklistener.BuzzArticleItemClickListener listener = null;
    
    public BuzzArticleAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.chaithanya.bookmyshow.data.model.BuzzArticlesModel> buzzArticleList, @org.jetbrains.annotations.NotNull()
    com.chaithanya.bookmyshow.ui.adapter.itemclicklistener.BuzzArticleItemClickListener listener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.chaithanya.bookmyshow.ui.adapter.BuzzArticleAdapter.BuzzArticleViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.chaithanya.bookmyshow.ui.adapter.BuzzArticleAdapter.BuzzArticleViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void updateData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.chaithanya.bookmyshow.data.model.BuzzArticlesModel> newData) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\u0019\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014\u00a8\u0006\u001b"}, d2 = {"Lcom/chaithanya/bookmyshow/ui/adapter/BuzzArticleAdapter$BuzzArticleViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "imageBuzz", "Landroid/widget/ImageView;", "getImageBuzz", "()Landroid/widget/ImageView;", "imageBuzzLike", "getImageBuzzLike", "imageBuzzProfile", "Lde/hdodenhof/circleimageview/CircleImageView;", "getImageBuzzProfile", "()Lde/hdodenhof/circleimageview/CircleImageView;", "imageBuzzShare", "getImageBuzzShare", "likeCountBuzz", "Landroid/widget/TextView;", "getLikeCountBuzz", "()Landroid/widget/TextView;", "tvBuzzTime", "getTvBuzzTime", "tvBuzzTitle", "getTvBuzzTitle", "tvBuzzTopic", "getTvBuzzTopic", "app_debug"})
    public static final class BuzzArticleViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView imageBuzz = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView tvBuzzTopic = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView tvBuzzTitle = null;
        @org.jetbrains.annotations.NotNull()
        private final de.hdodenhof.circleimageview.CircleImageView imageBuzzProfile = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView tvBuzzTime = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView imageBuzzShare = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView likeCountBuzz = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView imageBuzzLike = null;
        
        public BuzzArticleViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getImageBuzz() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvBuzzTopic() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvBuzzTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final de.hdodenhof.circleimageview.CircleImageView getImageBuzzProfile() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvBuzzTime() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getImageBuzzShare() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getLikeCountBuzz() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getImageBuzzLike() {
            return null;
        }
    }
}