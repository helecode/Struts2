package S1112API;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.mysql.jdbc.EscapeTokenizer;
import com.opensymphony.xwork2.ActionSupport;

public class S2coupled implements ServletRequestAware{
	private HttpServletRequest request=null;
	private HttpSession session=null;
	private ServletContext application;
	//1.���1��ͨ��ServletAPI��ʽ��ȡ
	public void coupledServletActionContext(){	
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpSession session=ServletActionContext.getRequest().getSession();
		ServletContext application=ServletActionContext.getServletContext();
		System.out.println("coupledrequest:"+request+"\tsession:"+session+"\napplication:"+application);	
	}
	//2.ͨ��ʵ��ServletRequestAware
	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request=request;
		this.session=request.getSession();
		this.application=session.getServletContext();	
	}
}
