package demogroovy

import io.micronaut.http.annotation.Get
import io.micronaut.http.client.Client

@Client("/hello")
interface HelloClient {

    @Get("/{text}")
    Message index(String text)
}
