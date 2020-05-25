package com.wlr.spotitrack.connection

import android.content.Context
import android.util.Log
import com.spotify.android.appremote.api.ConnectionParams
import com.spotify.android.appremote.api.Connector
import com.spotify.android.appremote.api.SpotifyAppRemote

object SpotifyConnection {
    private const val CLIENT_ID = ""
    private const val  REDIRECT_URI = "com.wlr.spotifyplayer://callback"

    private var spotifyAppRemote : SpotifyAppRemote? = null
    private var connectionParams: ConnectionParams = ConnectionParams.Builder(CLIENT_ID)
        .setRedirectUri(REDIRECT_URI)
        .showAuthView(true)
        .build()

    fun connect(context: Context, handler: (connected: Boolean) -> Unit){
        if (spotifyAppRemote?.isConnected == true){
            handler(true)
            return
        }
        val connectionListener = object : Connector.ConnectionListener {
            override fun onConnected(p0: SpotifyAppRemote?) {
                this@SpotifyConnection.spotifyAppRemote
                handler(true)
            }

            override fun onFailure(throwable: Throwable?) {
                Log.e("SpotifyConnection", throwable?.message, throwable)
                handler(false)
            }
        }
        SpotifyAppRemote.connect(context, connectionParams, connectionListener)
    }
}