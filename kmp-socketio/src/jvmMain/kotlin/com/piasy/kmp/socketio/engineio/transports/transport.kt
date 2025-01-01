package com.piasy.kmp.socketio.engineio.transports

import io.ktor.client.HttpClientConfig
import io.ktor.client.HttpClient
import io.ktor.client.engine.java.Java

actual fun httpClient(config: HttpClientConfig<*>.() -> Unit): HttpClient = HttpClient(Java) {
    config(this)
}
