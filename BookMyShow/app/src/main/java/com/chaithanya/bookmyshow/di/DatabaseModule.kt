package com.chaithanya.bookmyshow.di

import android.content.Context
import androidx.room.Room
import com.chaithanya.bookmyshow.data.local.BookMyShowDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(
        context,
        BookMyShowDatabase::class.java,
        "news_database"
    ).build()

    @Singleton
    @Provides
    fun provideDao(database: BookMyShowDatabase) = database.bookedEventDao()

}