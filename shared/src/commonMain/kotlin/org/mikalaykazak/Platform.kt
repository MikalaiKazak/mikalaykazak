package org.mikalaykazak

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform