package com.shivam.urlshortner

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class UrlShortner

fun main(args: Array<String>) {
	runApplication<UrlShortner>(*args)
}
