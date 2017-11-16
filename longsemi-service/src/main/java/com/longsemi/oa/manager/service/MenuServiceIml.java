package com.longsemi.oa.manager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.druid.filter.AutoLoad;
import com.longsemi.oa.manager.bean.Menu;
import com.longsemi.oa.manager.dao.MenuMapper;

@Service
public class MenuServiceIml {
	
	@Autowired
	MenuMapper menuMapper;
	public List<Menu> getMenus(){
		
          List<Menu> selectByExample = menuMapper.selectByExample(null);
		
		
		
		return selectByExample;
	}
}
