package com.Hcc.Menu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Hcc.Menu.entity.Menu;
import com.Hcc.Menu.service.MenuService;
import com.Hcc.Menu.vo.MenuMenuItemTemplate;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@EnableHystrix
public class MenuController {
	
	@Autowired
	MenuService menuService;
	
	@PostMapping("/myMenu")
	public Menu addMenu(@RequestBody Menu menu)
	{
		return menuService.addMenus(menu);
	}
	
//	@HystrixCommand(groupKey = "Micro", commandKey = "Micro" ,   fallbackMethod = "welcomeFallBak")
	@GetMapping("/myMenu/{id}")
	@HystrixCommand(groupKey = "Micro", commandKey = "Micro" ,   fallbackMethod = "welcomeFallBak")
	
	public MenuMenuItemTemplate findbyMenuId(@PathVariable("id") Long id)
	{
		return menuService.findbyMenuIds(id);
	}
	
	public String welcomeFallBak() {
		return " Service not available!....";
	}
	

}
