package com.bydan.colegio.financiero.pension.infrastructure.data;

import org.springframework.data.repository.CrudRepository;

import com.bydan.colegio.financiero.pension.domain.model.Pension;

public interface PensionCrudRepositoryI extends CrudRepository<Pension,Long>{
}
