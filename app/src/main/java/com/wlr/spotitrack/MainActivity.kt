package com.wlr.spotitrack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wlr.spotitrack.connection.SpotifyConnection
import com.spotify.android.appremote.api.ConnectionParams
import com.spotify.android.appremote.api.Connector
import com.spotify.android.appremote.api.SpotifyAppRemote

import com.spotify.protocol.client.Subscription
import com.spotify.protocol.types.PlayerState
import com.spotify.protocol.types.Track
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        connectButton.setOnClickListener {
            SpotifyConnection.connect(this){
                //val intent = Intent(this, PlayerA)
            }
        }
    }

    override fun onStart(){
        super.onStart()
    }

    private fun connected(){}

    override fun onStop()
    {
        super.onStop()
    }
}
