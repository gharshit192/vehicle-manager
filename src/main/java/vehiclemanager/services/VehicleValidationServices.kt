package vehiclemanager.services

import vehiclemanager.model.Vehicle
import kotlin.jvm.Throws

class VehicleValidationServices {

    @Throws(Exception::class)
    fun throwOnInvalidRequest(vehicle: Vehicle) {
        if (vehicle.getRegistrationNo() == null || vehicle.getModelNo() == null) {
            throw Exception("Registration or Model No is Invalid")
        }
    }

    fun throwOnInvalidId(_id: String) {
        if (_id.isEmpty()) {
            throw Exception("Please Enter Id")
        }
    }
}

