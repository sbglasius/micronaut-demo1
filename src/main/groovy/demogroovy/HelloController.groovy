package demogroovy

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/hello")
class HelloController {

    @Get("/{name}")
    Message index(String name) {
        return new Message(text: "Hello $name")
    }
}
