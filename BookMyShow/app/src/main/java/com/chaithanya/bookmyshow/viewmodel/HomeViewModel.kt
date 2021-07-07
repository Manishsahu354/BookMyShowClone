package com.chaithanya.bookmyshow.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.chaithanya.bookmyshow.data.model.HomeEventsParentModel
import com.chaithanya.bookmyshow.repository.EventsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val repository: EventsRepository
):ViewModel(
) {

    fun getEventList():LiveData<MutableList<HomeEventsParentModel>>{

        return flow {

            emit(repository.getEventListForHome())

        }.asLiveData(Dispatchers.IO)

    }

}