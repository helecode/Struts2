package S1117uploaddown;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class S1Fileupload extends ActionSupport{
	private File upload;    //��ʾ�ϴ��ļ�
	private String uploadContentType;//��ʾ�ϴ��ļ�������
	private String uploadFileName;  //��ʾ�ϴ��ļ�������
	private String savePath;   //��ʾ�ϴ��ļ���·��
	@Override
	public String execute() throws Exception {
		byte[] b=new byte[1024000];
		FileInputStream fis=new FileInputStream(this.getUpload());
		//�����������ڴ��е��ļ��������վ�㷢�����ָ���ļ���
		FileOutputStream fos=new FileOutputStream(this.getSavePath()+"\\"+this.getUploadFileName());
		int length=fis.read(b);
		System.out.println("legnth:"+length);
		fos.write(b,0,length);
		fis.close();
		fos.flush();
		fos.close();
		System.out.println(this.getUploadContentType()+"--"+this.getUploadFileName()+"---"+this.getSavePath());
		return "FileUpSuccess";
	}
	
	public File getUpload() {
		return upload;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public String getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	public String getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public String getSavePath() {
		return ServletActionContext.getServletContext().getRealPath(savePath);
	}
	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}
	

}