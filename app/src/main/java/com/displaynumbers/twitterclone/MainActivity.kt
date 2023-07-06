package com.displaynumbers.twitterclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.displaynumbers.twitterclone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun displayTweets(){
        var tweetOne=TweetData("","Samia","@samiasuluhuhassan","I really love our president mama Samia Suluhu Hassan because she is a hardworking woman who only wants the best for her citizens",3,5,10)
        var tweetTwo=TweetData("","Samia","@samiasuluhuhassan","I really love our president mama Samia Suluhu Hassan because she is a hardworking woman who only wants the best for her citizens",3,5,10)
        var tweetThree=TweetData("","Samia","@samiasuluhuhassan","I really love our president mama Samia Suluhu Hassan because she is a hardworking woman who only wants the best for her citizens",3,5,10)
        var tweetFour=TweetData("","Samia","@samiasuluhuhassan","I really love our president mama Samia Suluhu Hassan because she is a hardworking woman who only wants the best for her citizens",3,5,10)
        var tweetFive=TweetData("","Samia","@samiasuluhuhassan","I really love our president mama Samia Suluhu Hassan because she is a hardworking woman who only wants the best for her citizens",3,5,10)
        var tweetSix=TweetData("","Samia","@samiasuluhuhassan","I really love our president mama Samia Suluhu Hassan because she is a hardworking woman who only wants the best for her citizens",3,5,10)
        var tweetSeven=TweetData("","Samia","@samiasuluhuhassan","I really love our president mama Samia Suluhu Hassan because she is a hardworking woman who only wants the best for her citizens",3,5,10)
        var tweetEight=TweetData("","Samia","@samiasuluhuhassan","I really love our president mama Samia Suluhu Hassan because she is a hardworking woman who only wants the best for her citizens",3,5,10)
        var tweetNine=TweetData("","Samia","@samiasuluhuhassan","I really love our president mama Samia Suluhu Hassan because she is a hardworking woman who only wants the best for her citizens",3,5,10)
        var tweetTen=TweetData("","Samia","@samiasuluhuhassan","I really love our president mama Samia Suluhu Hassan because she is a hardworking woman who only wants the best for her citizens",3,5,10)
        var tweetEleven=TweetData("","Samia","@samiasuluhuhassan","I really love our president mama Samia Suluhu Hassan because she is a hardworking woman who only wants the best for her citizens",3,5,10)
        var tweetTwelve=TweetData("","Samia","@samiasuluhuhassan","I really love our president mama Samia Suluhu Hassan because she is a hardworking woman who only wants the best for her citizens",3,5,10)

    }
    var tweetList= listOf<TweetData>()
}
