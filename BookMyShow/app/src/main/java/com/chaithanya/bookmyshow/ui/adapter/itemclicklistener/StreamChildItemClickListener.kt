package com.chaithanya.bookmyshow.ui.adapter.itemclicklistener

import com.chaithanya.bookmyshow.data.model.HomeStreamModel

interface StreamChildItemClickListener {

    fun onStreamChildItemClicked(homeStreamList:MutableList<HomeStreamModel>)
}