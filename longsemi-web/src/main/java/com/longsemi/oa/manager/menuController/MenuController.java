package com.longsemi.oa.manager.menuController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.longsemi.oa.manager.bean.Menu;
import com.longsemi.oa.manager.service.MenuServiceIml;

@Controller
public class MenuController {
	@Autowired
	MenuServiceIml menuService;
	@RequestMapping("/hello1")
	public String getHello() {
		System.out.println(123);
		List<Menu> menus = menuService.getMenus();
		System.out.println(menus);
		return null;
	}
	

}
