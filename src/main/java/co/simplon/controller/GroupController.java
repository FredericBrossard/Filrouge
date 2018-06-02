package co.simplon.controller;

import javax.inject.Inject;


import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import co.simplon.model.FoodsGroup;
import co.simplon.service.GroupService;


@Controller
@RequestMapping("/groupfoods")
public class GroupController {
	
	@Inject
	GroupService groupService;
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public Long createGroup(@RequestBody FoodsGroup goup) {
		FoodsGroup resp = groupService.saveGroup(goup);
		 System.out.println(resp.getName());
		return resp.getId();
	}

}
