package com.chaithanya.bookmyshow.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.chaithanya.bookmyshow.data.local.BookedEventEntity
import com.chaithanya.bookmyshow.data.model.HomeEventsParentModel
import com.chaithanya.bookmyshow.repository.EventsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
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

    fun insertBookedEvent(event: BookedEventEntity){
        viewModelScope.launch(Dispatchers.IO) {

            repository.insertBookedEvent(event)
        }
    }

    fun getAllBookedEvent(): LiveData<MutableList<BookedEventEntity>>{
        return repository.getAllBookedEvent()
    }

}