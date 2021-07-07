package com.chaithanya.bookmyshow.ui.adapter.itemclicklistener;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/chaithanya/bookmyshow/ui/adapter/itemclicklistener/StreamChildItemClickListener;", "", "onStreamChildItemClicked", "", "homeStreamList", "", "Lcom/chaithanya/bookmyshow/data/model/HomeStreamModel;", "app_debug"})
public abstract interface StreamChildItemClickListener {
    
    public abstract void onStreamChildItemClicked(@org.jetbrains.annotations.NotNull()
    java.util.List<com.chaithanya.bookmyshow.data.model.HomeStreamModel> homeStreamList);
}