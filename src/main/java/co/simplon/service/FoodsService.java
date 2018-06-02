package co.simplon.service;

import java.util.List;

import javax.inject.Named;

import co.simplon.model.Foods;

@Named
public interface FoodsService {

	public Foods saveFoods(Foods foods);
	
	public List<Foods> readAllFoods();
	
}
