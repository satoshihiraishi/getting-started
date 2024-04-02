package org.acme

import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class GreetingService {

    fun greeting(name: String) = "hello " + name

}