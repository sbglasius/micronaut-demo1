package demogroovy

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.HttpStatus


@Controller("/hello")
class HelloController {

    @Get("/")
    String index() {
        return "Hello world"
    }
}
