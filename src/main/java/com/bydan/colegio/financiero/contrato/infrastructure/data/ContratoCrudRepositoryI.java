package com.bydan.colegio.financiero.contrato.infrastructure.data;

import org.springframework.data.repository.CrudRepository;

import com.bydan.colegio.financiero.contrato.domain.model.Contrato;

public interface ContratoCrudRepositoryI extends CrudRepository<Contrato,Long>{
}
