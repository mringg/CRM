package cn.sdut.persistence.dao.interfaces;

import java.util.List;
import java.util.Map;

public interface Lg20Dao {
	
	public void setMapDto(Map dto);
	
	//��������
	public boolean add() throws Exception;
	
	//׷������
	public boolean append() throws Exception;
	
	//�޸�����
	public boolean modify() throws Exception;
	
	//��ѯ����
	public List query() throws Exception;
	
	//ɾ������
	public boolean delete() throws Exception;
	
}