package demogroovy

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

import javax.inject.Inject

@Controller("/hello")
class HelloController {
    @Inject HelloService helloService
    @Get("/{name}")
    Message index(String name) {
        return helloService.sayHello(name)
    }
}
