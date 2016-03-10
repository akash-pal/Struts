package com.zensar.project.actions;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import com.opensymphony.xwork2.Action;
public class FileDownLoadAction implements Action{
	private InputStream sourceStream;
	public InputStream getSourceStream() {
		return sourceStream;
	}
	public void setSourceStream(InputStream sourceStream) {
		this.sourceStream = sourceStream;
	}
	@Override
	public String execute() throws Exception {
		sourceStream = new FileInputStream(new File("D:\\hadoopExample.txt"));
		return SUCCESS;
	}
	
}
