package S1116ValueStack;

import java.util.ArrayList;
import java.util.List;

public class S1ValueStack {
	private String username;
	private String password;
	private List<S2Student> studentList=new ArrayList<S2Student>();
	public String valueStack(){
		studentList.add(new S2Student("张三", 33, 33.3));
		studentList.add(new S2Student("李四", 44, 44.4));
		studentList.add(new S2Student("王五", 55, 55.5));
		return "valueStack";
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
	public List<S2Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<S2Student> studentList) {
		this.studentList = studentList;
	}
	
}
