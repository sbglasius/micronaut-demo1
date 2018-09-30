package demogroovy

import javax.inject.Singleton

@Singleton
class HelloService {
    Message sayHello(String to) {
        new Message(text: "Hello $to")
    }
}
