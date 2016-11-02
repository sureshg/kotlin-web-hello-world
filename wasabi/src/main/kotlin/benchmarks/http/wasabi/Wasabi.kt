package benchmarks.http.wasabi

import benchmarks.http.common.HELLO_WORLD
import org.wasabifx.wasabi.app.AppConfiguration
import org.wasabifx.wasabi.app.AppServer

fun main(args: Array<String>) {
  val server = AppServer(AppConfiguration(port = 8080, enableLogging = false))

  server.get("/", {
    response.contentType = "text/plain"
    response.send(HELLO_WORLD)
  } )

  server.start()
}