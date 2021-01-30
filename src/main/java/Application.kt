import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.mongodb.MongoClient
import org.glassfish.grizzly.http.server.HttpServer
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory
import org.glassfish.jersey.server.ResourceConfig
import vehiclemanager.repositories.VehicleRepository
import vehiclemanager.resources.VehicleResources
import vehiclemanager.services.VehicleService
import vehiclemanager.services.VehicleValidationServices
import java.net.URI
import javax.ws.rs.core.UriBuilder

fun main() {
    var baseUri: URI = UriBuilder.fromUri("http://localhost/").port(8080).build()
    val service = VehicleService(repository = VehicleRepository(
        mongoClient = MongoClient("localhost", 27017),
        objectMapper = ObjectMapper()),
        vehicleValidationServices = VehicleValidationServices()
    )
    val objectMapper= ObjectMapper()
    objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false)

    val resources=VehicleResources(vehicleService = service,objectMapper = objectMapper)
    var config: ResourceConfig = ResourceConfig().register(resources)
    var server: HttpServer = GrizzlyHttpServerFactory.createHttpServer(baseUri, config)

}
