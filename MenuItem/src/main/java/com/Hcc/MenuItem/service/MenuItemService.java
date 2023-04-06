package com.Hcc.MenuItem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hcc.MenuItem.entity.MenuItem;
import com.Hcc.MenuItem.repository.MenuItemRepository;

@Service
public class MenuItemService {
	
	@Autowired
	MenuItemRepository menuItemRepository;

	public MenuItem addMenuItems(MenuItem menuItem) {
		return menuItemRepository.save(menuItem);
	}

	public MenuItem findMenubyId(Long id) {
		return menuItemRepository.findById(id).get();
	}

}
