package S1112API;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;

public class S1decoupling implements RequestAware,SessionAware,ApplicationAware{
	
	Map<String,Object> request=null;
	Map<String,Object> session=null;
	Map<String,Object> application=null;
//1.���ͨ��ActionContex��ȡ
	public void decouplingActionContext(){
		Map<String,Object> request=(Map<String,Object>)ActionContext.getContext().get("request");
		Map<String,Object> session=(Map<String,Object>)ActionContext.getContext().getSession();
		Map<String,Object> application=(Map<String,Object>)ActionContext.getContext().get("application");
		System.out.println("decouplinrequest:"+request+"\n+session:"+session);
	}
//2.���ͨ��ʵ��xxxAware��set������ȡ
	@Override
	public void setApplication(Map<String, Object> application) {
		this.application=application;
		
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session=session;
		
	}
	@Override
	public void setRequest(Map<String, Object> request) {
		this.request=request;
		
	}
	public static void main(String[] args) {
		new S1decoupling().decouplingActionContext();
	}
}
