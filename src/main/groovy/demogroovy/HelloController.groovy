package demogroovy

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.reactivex.Single

import javax.inject.Inject

@Controller("/hello")
class HelloController {
    @Inject HelloService helloService
    @Get("/{name}")
    Single<Message> index(String name) {
        return Single.just(helloService.sayHello(name))
    }
}
