package S1113DynamicMethodInvocation;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import S1112API.S1decoupling;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class S1DynamicMethodInvocation extends ActionSupport {
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String dynamicValidate(){
		System.out.println("username!:"+username+"\npassword:"+password);
		if("li".equals(username)&&"123".equals(password)){
			return "logindynamic_success";
		}else{
			return "logindynamic_fail";
		}
	}	


}
