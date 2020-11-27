package S1114Interceptor;

import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class S2Interceptor implements Interceptor{

	
	@Override
	public void init() {
		System.out.println("Interceptor初始化");
		
	}

	@Override
	public String intercept(ActionInvocation Invocation) throws Exception {
		System.out.println("实现Interceptor拦截器执行");
		System.out.println(ServletActionContext.getRequest().getParameter("username"));
		String res=Invocation.invoke();
		//调用或唤醒其他拦截器或Action
		Map<String,Object> session=Invocation.getInvocationContext().getSession();
		String url=ServletActionContext.getRequest().getRequestURI();
		System.out.println("url:"+url+"\nres:"+res);
		return res;
	}
	
	@Override
	public void destroy() {
		System.out.println("Interceptor销毁");
		
	}


}
