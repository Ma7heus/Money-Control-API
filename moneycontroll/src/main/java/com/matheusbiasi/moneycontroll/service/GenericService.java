package com.matheusbiasi.moneycontroll.service;

import java.util.List;
import java.util.Optional;

public interface GenericService<T> {

	public T save(T model);
	
	public List<T> findAll();
	
	public Optional<T> findById(Long id);
	
	public T update(T model);
	
	public void delete(Long id);
	
}	