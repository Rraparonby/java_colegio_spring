package com.bydan.colegio.financiero.sueldo.infrastructure.data;

import org.springframework.data.repository.CrudRepository;

import com.bydan.colegio.financiero.sueldo.domain.model.Sueldo;

public interface SueldoCrudRepositoryI extends CrudRepository<Sueldo,Long>{
}
