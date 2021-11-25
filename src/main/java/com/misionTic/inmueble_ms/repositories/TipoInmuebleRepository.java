package com.misionTic.inmueble_ms.repositories;

import com.misionTic.inmueble_ms.models.TipoInmueble;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TipoInmuebleRepository extends MongoRepository<TipoInmueble, String> {

}
