package vehiclemanager.resources

import vehiclemanager.services.VehicleService
import com.fasterxml.jackson.databind.ObjectMapper
import vehiclemanager.model.Vehicle
import javax.ws.rs.*
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response

@Path("vehicle/v1")
class VehicleResources(private val vehicleService :VehicleService,private val objectMapper: ObjectMapper) {
    @GET
    @Path("/status")
    @Produces(MediaType.TEXT_PLAIN)
    fun getStatus(): Response {
        return Response.status(Response.Status.OK).entity("Status of the Vehicle").build()
    }
    @POST
    @Path("/vehicle")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    fun addVehicle(request: String): Response {
        try {
            val vehicle = vehicleService.addVehicle(objectMapper.readValue(request, Vehicle::class.java))
            return Response.ok(vehicle.toString()).build()
        } catch (e: Exception) {
            e.printStackTrace()
            throw e
        }
    }
    @DELETE
    @Path("/vehicle")
    @Produces(MediaType.APPLICATION_JSON)
    fun deleteVehicle(@QueryParam("_id") _id : String):Response {
        val vehicle = vehicleService.deleteVehicle(_id)
        return if (vehicle == null)
            Response.ok().entity("Vehicle is not found in database").build()
        else
            Response.ok(vehicle.toString()).build()
    }
    @GET
    @Path("/vehicle")
    @Produces(MediaType.APPLICATION_JSON)
    fun getVehicle(@QueryParam("_id") _id : String):Response {
        val vehicle = vehicleService.getVehicle(_id)
        return if (vehicle == null)
            Response.ok().entity("Vehicle not found at $_id _id").build()
        else
            Response.ok(vehicle.toString()).build()
    }
    @PUT
    @Path("/vehicle/{_id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    fun updateVehicle(@PathParam("_id") _id: String,request: String):Response {
        val vehicle = vehicleService.updateVehicle(_id, objectMapper.readValue(request, Vehicle::class.java))
        return Response.ok(vehicle.toString()).build()
    }
}