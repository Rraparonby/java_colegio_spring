package com.bydan.colegio.estructura.docente.infrastructure.data;

import org.springframework.data.repository.CrudRepository;

import com.bydan.colegio.estructura.docente.domain.model.Docente;

public interface DocenteCrudRepositoryI extends CrudRepository<Docente,Long>{
}
