package com.Hcc.MenuItem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Hcc.MenuItem.entity.MenuItem;
import com.Hcc.MenuItem.service.MenuItemService;

@RestController
public class MenuItemController {
	@Autowired
	MenuItemService menuItemService;
	
	@PostMapping("/menuItem")
	public MenuItem addMenuItem(@RequestBody MenuItem menuItem)
	{
		return menuItemService.addMenuItems(menuItem);
	}
	
	@GetMapping("/menuItem/{id}")
	public MenuItem findMenubyId(@PathVariable("id") Long id)
	{
		return menuItemService.findMenubyId(id);
	}

}
