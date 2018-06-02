package co.simplon.service;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import co.simplon.model.Foods;
import co.simplon.repository.FoodsRepository;

@Named
public class FoodsServiceImpl implements FoodsService {

	@Inject
	FoodsRepository foodsrepository;
	
	public Foods saveFoods(Foods f) {
		foodsrepository.save(f);
		return f;	
	};
	
	public List<Foods> readAllFoods(){
		return foodsrepository.findAll();
	}

}
