package cn.sdut.services.impl;

import java.util.List;
import java.util.Map;

import cn.sdut.persistence.dao.interfaces.Lg07Dao;
import cn.sdut.services.A1020Services;

public class A1020ServicesImpl implements A1020Services {
	private Lg07Dao lg07Dao = null;
	private Map dto = null;
	
	@Override
	public Map getInstance() throws Exception{
		return null;
		//return this.lg07Dao.getInstance();
	}
	
	@Override
	public String getPageInfo(String url) {
		return this.lg07Dao.getPageInfo(url);
	}


	public Lg07Dao getLg07Dao() {
		return lg07Dao;
	}

	public void setLg07Dao(Lg07Dao lg07Dao) {
		this.lg07Dao = lg07Dao;
	}

	public Map getDto() {
		return dto;
	}

	public void setDto(Map dto) {
		this.dto = dto;
		this.lg07Dao.setMapDto(dto);
	}

	
	@Override
	public List query() throws Exception {
		return this.lg07Dao.queryForPage();
	}

	@Override
	public void setMapDto(Map dto) {
		this.dto = dto;
		this.lg07Dao.setMapDto(dto);
	}

	@Override
	public boolean check() throws Exception {
		return false;
		//return this.lg07Dao.check();
	}
}
