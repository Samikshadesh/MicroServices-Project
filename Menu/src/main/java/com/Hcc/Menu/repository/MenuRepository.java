package com.Hcc.Menu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hcc.Menu.entity.Menu;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {

	Menu save(Menu menu);

}
