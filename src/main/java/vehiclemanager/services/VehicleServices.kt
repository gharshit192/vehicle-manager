package vehiclemanager.services

import vehiclemanager.model.Vehicle
import vehiclemanager.repositories.VehicleRepository

class VehicleService(
    private val repository: VehicleRepository,
    private val vehicleValidationServices: VehicleValidationServices
) {

    fun addVehicle(vehicle: Vehicle): Vehicle? {
        vehicleValidationServices.throwOnInvalidRequest(vehicle)
        return repository.addVehicle(vehicle)
    }
    fun deleteVehicle(_id: String): Vehicle ?{
        vehicleValidationServices.throwOnInvalidId(_id)
        return repository.deleteVehicle(_id)
    }
    fun updateVehicle(_id: String, vehicle: Vehicle): Vehicle {
        vehicleValidationServices.throwOnInvalidId(_id)
        return repository.updateVehicle(_id, vehicle)
    }
    fun getVehicle(_id: String): Vehicle? {
        vehicleValidationServices.throwOnInvalidId(_id)
        return repository.getVehicle(_id)
    }
}