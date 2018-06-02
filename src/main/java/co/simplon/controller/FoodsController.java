package co.simplon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import co.simplon.model.Foods;
import co.simplon.model.FoodsGroup;
import co.simplon.service.FoodsService;
import co.simplon.service.GroupService;

import java.util.List;

import javax.inject.Inject;

@Controller
@RequestMapping("/foods")
public class FoodsController {

	@Inject
	FoodsService foodsService;
	@Inject
	GroupService groupService;
	
	
	/* CODE JavaScript à lancer depuis la console HTML
	    var xmlhttp = new XMLHttpRequest();
        xmlhttp.open("POST", "/foods/");
        xmlhttp.setRequestHeader("Content-Type", "application/json");
        xmlhttp.send(JSON.stringify({name:"Tomate", glycIndex:50,energy:2,carboHydrates:8,proteins:12,lipids:9,comment:"essai"    
        }));

    	xmlhttp.response
	*/
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public Long createfoods(@RequestBody Foods foods) {
		Foods resp = foodsService.saveFoods(foods);
		 System.out.println(resp.getName());
	
		return resp.getId();
	}
	
	public FoodsGroup createGroup() {
		FoodsGroup groupName = new FoodsGroup("Légumes");
		groupService.saveGroup(groupName);
		
		return groupName;
		
	}
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public List<Foods>listFoods() {
		List<Foods> list = foodsService.readAllFoods();
		return list;
	}
}
