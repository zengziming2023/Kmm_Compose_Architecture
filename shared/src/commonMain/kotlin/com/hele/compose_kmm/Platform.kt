package com.hele.compose_kmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform