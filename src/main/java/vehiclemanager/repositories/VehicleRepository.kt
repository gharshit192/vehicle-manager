package vehiclemanager.repositories

import com.fasterxml.jackson.databind.ObjectMapper
import com.mongodb.BasicDBObject
import com.mongodb.MongoClient
import com.mongodb.client.MongoCollection
import com.mongodb.client.MongoDatabase
import com.mongodb.client.model.Filters
import com.mongodb.util.JSON
import org.bson.Document
import org.bson.conversions.Bson
import vehiclemanager.model.Vehicle


class VehicleRepository(
    private val mongoClient: MongoClient,
    private val database: MongoDatabase = mongoClient.getDatabase("v"),
    private var collection: MongoCollection<Document> = database.getCollection("users"),
    private val objectMapper: ObjectMapper
) {
    fun addVehicle(vehicle: Vehicle): Vehicle? {
    val doc = Document.parse(vehicle.toString())
    doc["_id"] = vehicle.getRegistrationNo()
        val existingVehiclesInDb  = collection.find(Filters.eq("registrationNo",vehicle.getRegistrationNo())).limit(1).iterator()
        if(existingVehiclesInDb.hasNext()){
            println("already in db with registration number ${vehicle.getRegistrationNo()}")
            return null
        }
        collection.insertOne(doc)
        return vehicle
    }

    fun deleteVehicle(_id: String): Vehicle? {
        val query = BasicDBObject()
        query["_id"] = _id
        val doc = database.getCollection("users").findOneAndDelete(Filters.eq("_id", _id))
        if (doc!=null){
            doc.remove("_id")
            val json = JSON.serialize(doc)
            return objectMapper.readValue(json, Vehicle::class.java)
        }
        return null
    }

    fun getVehicle(_id: String): Vehicle? {
        val query = BasicDBObject()
        query["_id"] = _id
        collection.find(query).iterator().use { c ->
            if (c.hasNext()) {
                val doc = c.next()
                doc.remove("_id")
                val json = JSON.serialize(doc)
                return objectMapper.readValue(json, Vehicle::class.java)
            }
        }
        return null
    }

    fun updateVehicle(_id: String, vehicle: Vehicle): Vehicle {
        val query = BasicDBObject()
        query["_id"] = _id
        if (query.containsValue(_id)) {
//            "RJ33"
            val doc = Document.parse(vehicle.toString())
//            {
//                "registrationNo":"RJ33"
//            }

            doc[vehicle.getRegistrationNo() as String?] = _id

//            {
//                "registrationNo":"RJ33"
//                "RJ33":_id
//            }
            doc.remove("registrationNo")
            val dbObj = BasicDBObject()
            val update: Bson = Document("\$set", doc)
            collection.findOneAndUpdate(query, update)
        }
        return vehicle
    }


}


