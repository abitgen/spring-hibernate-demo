package io.github.abitgen.springhibernatedemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringHibernateDemoApplication

fun main(args: Array<String>) {
	runApplication<SpringHibernateDemoApplication>(*args)
}
