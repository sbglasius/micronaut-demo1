package demogroovy

import io.micronaut.context.ApplicationContext
import io.micronaut.runtime.server.EmbeddedServer
import spock.lang.AutoCleanup
import spock.lang.Shared
import spock.lang.Specification

class HelloClientSpec extends Specification {

    @Shared @AutoCleanup EmbeddedServer embeddedServer = ApplicationContext.run(EmbeddedServer)

    @Shared HelloClient helloClient = embeddedServer.applicationContext.getBean(HelloClient)


    void "test hello client"() {
        given:
            Message response = helloClient.index('audience')

        expect:
            response.text == 'Hello audience'

    }

}
