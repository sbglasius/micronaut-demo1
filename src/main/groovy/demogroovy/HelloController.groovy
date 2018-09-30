package demogroovy

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.HttpStatus


@Controller("/hello")
class HelloController {

    @Get("/{name}")
    String index(String name) {
        return "Hello $name"
    }
}
