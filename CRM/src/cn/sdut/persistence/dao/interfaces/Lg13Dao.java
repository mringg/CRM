package cn.sdut.persistence.dao.interfaces;

import java.util.List;
import java.util.Map;

import cn.sdut.persistence.bean.Lg02;

public interface Lg13Dao {
	
	public void setMapDto(Map dto);
	public List queryForPage() throws Exception;
	public String getPageInfo(String url);
	/**
	 * 
	 * @函数名  queryForPageForpz
	 * @参数说明 
	 * @返回值  
	 * @功能说明 
	 * @作者    
	 * @创建日期 2014-7-24
	 * @更新日期 
	 * @更新内容
	 */
	public List queryForPageForpz() throws Exception;
	/**
	 * 
	 * @函数名  getInstance
	 * @参数说明 
	 * @返回值  
	 * @功能说明 
	 * @作者    
	 * @创建日期 2014-7-24
	 * @更新日期 
	 * @更新内容
	 */
	public Map getInstance() throws Exception;
	/**
	 * 
	 * @函数名  update
	 * @参数说明 
	 * @返回值  
	 * @功能说明 
	 * @作者    
	 * @创建日期 2014-7-24
	 * @更新日期 
	 * @更新内容
	 */
	public boolean update() throws Exception;
}
