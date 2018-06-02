package co.simplon.service;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.stereotype.Service;

import co.simplon.model.FoodsGroup;
import co.simplon.repository.GroupRepository;

@Service
@Named
public class GroupServiceImpl implements GroupService {

	@Inject
	GroupRepository grouprepository;
	
	public FoodsGroup saveGroup(FoodsGroup g) {
		grouprepository.save(g);
		return g;
	}


}
