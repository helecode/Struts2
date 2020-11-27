package S1114Interceptor;

import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class S1AbstractInterceptor extends AbstractInterceptor{

	
	@Override
	public void init() {
		System.out.println("AbstractInterceptor��������ʼ��");
	}

	@Override
	public String intercept(ActionInvocation Invocation) throws Exception {
		System.out.println("�̳�AbstractInterceptor������ִ��");
		System.out.println(ServletActionContext.getRequest().getParameter("username"));
		String res=Invocation.invoke();
		//���û���������������Action
		Map<String,Object> session=Invocation.getInvocationContext().getSession();
		String url=ServletActionContext.getRequest().getRequestURI();
		System.out.println("url:"+url+"\nres:"+res);
		return res;
	}
	
	@Override
	public void destroy() {
		System.out.println("AbstractInterceptor����������");
	}

}
