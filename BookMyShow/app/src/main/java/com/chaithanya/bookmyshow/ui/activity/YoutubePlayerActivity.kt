package com.chaithanya.bookmyshow.ui.activity

import android.os.Bundle
import androidx.navigation.navArgs
import com.chaithanya.bookmyshow.constant.Constants
import com.chaithanya.bookmyshow.databinding.ActivityYoutubePlayerBinding
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer

class YoutubePlayerActivity : YouTubeBaseActivity() {

    private val args by navArgs<YoutubePlayerActivityArgs>()
    private lateinit var binding: ActivityYoutubePlayerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityYoutubePlayerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.youtubePlayerView.initialize(Constants.YOUTUBE_API_KEY,object : YouTubePlayer.OnInitializedListener{
            override fun onInitializationSuccess(
                p0: YouTubePlayer.Provider?,
                p1: YouTubePlayer?,
                p2: Boolean
            ) {
                p1?.loadVideo(args.youtubelink)
                p1?.play()
            }

            override fun onInitializationFailure(
                p0: YouTubePlayer.Provider?,
                p1: YouTubeInitializationResult?
            ) {
                TODO("Not yet implemented")
            }


        })
    }
}