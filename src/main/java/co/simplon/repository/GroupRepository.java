package co.simplon.repository;

import javax.inject.Named;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.model.FoodsGroup;


@Named
public interface GroupRepository extends JpaRepository <FoodsGroup, Long>{

}
