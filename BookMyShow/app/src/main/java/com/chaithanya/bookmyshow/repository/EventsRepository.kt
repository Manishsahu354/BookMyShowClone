package com.chaithanya.bookmyshow.repository

import androidx.lifecycle.LiveData
import com.chaithanya.bookmyshow.data.local.BookedEventDAO
import com.chaithanya.bookmyshow.data.local.BookedEventEntity
import com.chaithanya.bookmyshow.data.model.ArtistModel
import com.chaithanya.bookmyshow.data.model.HomeEventsChildModel
import com.chaithanya.bookmyshow.data.model.HomeEventsParentModel
import com.google.firebase.database.*
import dagger.hilt.android.scopes.ActivityRetainedScoped
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import javax.inject.Inject

@ActivityRetainedScoped
class EventsRepository @Inject constructor(
    private val bookedEventDAO: BookedEventDAO
) {

    private val database = FirebaseDatabase.getInstance().getReference("homeNested")
    private val homeEventsParentList:MutableList<HomeEventsParentModel> = mutableListOf()


    fun getEventListForHome():MutableList<HomeEventsParentModel>{


      database.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                if(snapshot.exists()){
                    for (userSnapshot in snapshot.children){

                        //  val nestedValue  = userSnapshot.getValue(HomeEventsParentModel::class.java)

                        val eventName = userSnapshot.child("eventsName").value.toString()

                        val homeEventsChildList:MutableList<HomeEventsChildModel> = ArrayList<HomeEventsChildModel>()

                        for (childSnapshot in userSnapshot.child("childList").children) {

                            val about =    childSnapshot.child("about").value.toString()
                            val categoryName =  childSnapshot.child("categoryName").value.toString()
                            val date =   childSnapshot.child("date").value.toString()
                            val free =   childSnapshot.child("free").value.toString()
                            val imageUrl = childSnapshot.child("imageUrl").value.toString()
                            val interested =  childSnapshot.child("interested").value.toString()
                            val language =  childSnapshot.child("language").value.toString()
                            val price =  childSnapshot.child("price").value.toString()
                            val time =   childSnapshot.child("time").value.toString()
                            val title =  childSnapshot.child("title").value.toString()
                            val venue =  childSnapshot.child("venue").value.toString()
                            val fullImage =  childSnapshot.child("fullImage").value.toString()


                            val artistList:MutableList<ArtistModel> = ArrayList<ArtistModel>()

                            for (artistSnapshot in userSnapshot.child("Artist").children) {
                                artistList.add(artistSnapshot.getValue(ArtistModel::class.java)!!)
                            }

                            val eventsValues = HomeEventsChildModel(imageUrl,title,time,about,date,free,interested,language,price,venue,categoryName,fullImage,artistList)
                            homeEventsChildList.add(eventsValues)
                        }
                        val homeEventsParentModelTemp = HomeEventsParentModel(eventName,homeEventsChildList)
                        homeEventsParentList.add(homeEventsParentModelTemp)

                    }
                }
            }

            override fun onCancelled(error: DatabaseError) {

            }

        })
        return homeEventsParentList

    }

    suspend fun insertBookedEvent(event: BookedEventEntity){
        bookedEventDAO.insertBookedEvent(event)
    }

    fun getAllBookedEvent(): LiveData<MutableList<BookedEventEntity>>{
       return bookedEventDAO.getAllBookedEvent()
    }
}