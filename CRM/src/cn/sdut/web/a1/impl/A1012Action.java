package cn.sdut.web.a1.impl;

import cn.sdut.services.A1011Services;
import cn.sdut.system.Tools;
import cn.sdut.web.a1.A1010Support;

public class A1012Action extends A1010Support {

	protected A1011Services a1011Services = null;
	protected String msg = null;

	public String execute() throws Exception{
		a1011Services.setMapDto(Tools.describe());
		boolean res = a1011Services.add();
		System.out.println("ssss:::::"+res);
		if(res==false){
			this.msg = "����ʧ��";
		}
		else{
			this.msg = "����ɹ�!";
		}
		return "main";
	}

	public A1011Services getA1011Services() {
		return a1011Services;
	}

	public void setA1011Services(A1011Services a1011Services) {
		this.a1011Services = a1011Services;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}