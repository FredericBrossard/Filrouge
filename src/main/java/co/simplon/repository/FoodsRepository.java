package co.simplon.repository;

import co.simplon.model.Foods;

import javax.inject.Named;

import org.springframework.data.jpa.repository.JpaRepository;

@Named
public interface FoodsRepository extends JpaRepository<Foods, Long>{

	
}
