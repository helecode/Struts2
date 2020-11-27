package S1117uploaddown;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
public class S2FileDownload extends ActionSupport{
	    //读取下载文件的目录
		private String inputPath;
		//下载文件的文件名
		private String fileName;//请求参数传输
		// 读取下载文件的输入流
		private InputStream inputStream;
		
		//重写方法
		public String execute() throws Exception{
			System.out.println("进入文件下载action");
			return SUCCESS;
		}
		
		public String getInputPath() {
			return inputPath;
		}
		public void setInputPath(String inputPath) {
			this.inputPath = inputPath;
		}
		public String getFileName() {
			return fileName;
		}
		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public InputStream getInputStream() throws FileNotFoundException{
			//找到下载文件的路径
			//还是原来的配方
			String path=ServletActionContext.getServletContext().getRealPath(inputPath);
			return new BufferedInputStream(new FileInputStream(path+"/"+fileName));
		}
		public void setInputStream(InputStream inputStream) {
			this.inputStream = inputStream;
		}
	
}
