package com.hermesandroid.bridge.service

import android.service.voice.VoiceInteractionService

class HermesAssistantService : VoiceInteractionService() {
    override fun onReady() {
        super.onReady()
        // Assistant is ready to serve the Sovereign
    }
}
