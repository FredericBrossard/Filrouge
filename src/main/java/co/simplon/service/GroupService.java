package co.simplon.service;

import javax.inject.Named;

import co.simplon.model.FoodsGroup;

@Named
public interface GroupService  {

	public FoodsGroup saveGroup(FoodsGroup g);
}
