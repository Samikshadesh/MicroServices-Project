package com.Hcc.Menu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.Hcc.Menu.entity.Menu;
import com.Hcc.Menu.repository.MenuRepository;
import com.Hcc.Menu.vo.MenuItem;
import com.Hcc.Menu.vo.MenuMenuItemTemplate;

@Service
public class MenuService {

	@Autowired
	MenuRepository menuRepository;
	
	@Autowired
	RestTemplate restTemplate;
	
	public Menu addMenus(Menu menu) {
		return menuRepository.save(menu);
	}


	public MenuMenuItemTemplate findbyMenuIds(Long id) {
		
		Menu menu = menuRepository.findById(id).get();//find  by menuid
		MenuMenuItemTemplate menuMenuItemTemplate= new MenuMenuItemTemplate();//object
		
		MenuItem mn =restTemplate.getForObject("http://localhost:8085/menuItem/"+menu.getMenuItemId(), MenuItem.class);//get data meniitem 
		menuMenuItemTemplate.setMenu(menu); 
		menuMenuItemTemplate.setMenuItem(mn);
		return menuMenuItemTemplate;
		
	}
	
}
