package S1117uploaddown;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
public class S2FileDownload extends ActionSupport{
	    //��ȡ�����ļ���Ŀ¼
		private String inputPath;
		//�����ļ����ļ���
		private String fileName;//�����������
		// ��ȡ�����ļ���������
		private InputStream inputStream;
		
		//��д����
		public String execute() throws Exception{
			System.out.println("�����ļ�����action");
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
			//�ҵ������ļ���·��
			//����ԭ�����䷽
			String path=ServletActionContext.getServletContext().getRealPath(inputPath);
			return new BufferedInputStream(new FileInputStream(path+"/"+fileName));
		}
		public void setInputStream(InputStream inputStream) {
			this.inputStream = inputStream;
		}
	
}
