<h1 align="center">BookMyShow App-Clone</h1>

<p align="center">
  <a href="https://android-arsenal.com/api?level=21"><img alt="API" src="https://img.shields.io/badge/API-21%2B-brightgreen.svg?style=flat"/></a>
</p>

<p align="center">  
This is an android demo project based on modern Android application tech-stacks and MVVM architecture. The app simulates the working of the ticket booking app, BookMyShow. The app uses firebase for user authentication(Google & mobile number) and realtime database. Events and movie details can be stored in the database. Payment is also included for the events. Trailers can also be watched within the app and user's bookings are stored.
</p>

## App Screenshots

<table>
  <tr>
    <td><img src="" width="200"/></td>
    <td><img src="" width="200"/></td>
    <td><img src="" width="200"/></td>
    <td><img src="" width="200"/></td>
  </tr>
  
  <tr>
    <td><img src="" width="200"/></td>
    <td><img src="" width="200"/></td>
    <td><img src="" width="200"/></td>
    <td><img src="" width="200"/></td>
  </tr>
 
 </table>

## Libraries & Tech Used
- Minimum SDK level 21
- [Kotlin](https://kotlinlang.org/) based, [Coroutines](https://github.com/Kotlin/kotlinx.coroutines) for asynchronous handling.
- [Hilt](https://dagger.dev/hilt/) for dependency injection.
- JetPack
  - LiveData - notify domain layer data to views.
  - Lifecycle - observing data when lifecycle state changes.
  - ViewModel - lifecycle aware UI related data holder.
  - [Room Database](https://developer.android.com/training/data-storage/room) - for local storage
- Architecture
  - MVVM Architecture (View - ViewModel) 
- [Firebase](https://firebase.google.com/) - for user authentication and realtime database. 
- [Glide](https://github.com/bumptech/glide) - loading images.
- [Navigation Component](https://developer.android.com/jetpack/androidx/releases/navigation) for bottom-bar navigation.
- [Youtube Player](https://developers.google.com/youtube/android/player) for playing trailers
- [Razorpay Payment Integration](https://razorpay.com/docs/partners/aggregators-integration/) for payments

