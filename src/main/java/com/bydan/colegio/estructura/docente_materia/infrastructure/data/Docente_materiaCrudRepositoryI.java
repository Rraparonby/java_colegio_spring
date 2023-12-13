package com.bydan.colegio.estructura.docente_materia.infrastructure.data;

import org.springframework.data.repository.CrudRepository;

import com.bydan.colegio.estructura.docente_materia.domain.model.Docente_materia;

public interface Docente_materiaCrudRepositoryI extends CrudRepository<Docente_materia,Long>{
}
