package hu.netsurf.warehouse

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WarehouseApiApplication

fun main(args: Array<String>) {
    runApplication<WarehouseApiApplication>(*args)
}
