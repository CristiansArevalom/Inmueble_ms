package com.misionTic.inmueble_ms.repositories;

import com.misionTic.inmueble_ms.models.Inmueble;
import org.springframework.data.mongodb.repository.MongoRepository; //Hace la conexion con la Base de datos
import java.util.List;

public interface InmuebleRepository extends MongoRepository<Inmueble, String>{
    List<Inmueble> findOwnerPropertyByUsername (String username);

}
