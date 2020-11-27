package S1101Struts2First;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 控制层，相当于Servlet与javaBean的结合
 * @author lgm
 *该类默认继承ActionSupport类
 */
public class S1LoginAction extends ActionSupport{
	private String username;
	private String password;
	@Override//处理方法与Sevlet中的Service方法类似
	public String execute() throws Exception {
		Map<String,Object> request=(Map<String,Object>)ActionContext. getContext ().get("request");
		Map<String,Object> session=(Map<String,Object>)ActionContext. getContext ().getSession();
		Map<String,Object> application=(Map<String,Object>)ActionContext. getContext ().getApplication();
		System.out.println("request:"+request+"\nsession:"+session);
		
		if("li".equals(username)&& "123".equals(password)){
			return "success";
		}else{
			return "fail";
		}
	}
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
	
	
}
