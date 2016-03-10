package com.seed.project.results;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.Result;

public class CustomImageBytesResult implements Result {
	private static final long serialVersionUID = 1L;
	public void execute(ActionInvocation invocation) throws Exception {
		//action object need only when u required data from action
		//ImageAction action = (ImageAction) invocation.getAction();
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("image/jpg");
		OutputStream writer =response.getOutputStream();
		writer.write(getCustomImageInBytes());
		response.getOutputStream().flush();
	}
	private byte[] getCustomImageInBytes() {
		BufferedImage originalImage;
		byte[] imageInByte = null;
		try {
			originalImage = ImageIO.read(new File("D:\\Koala.jpg"));
			// convert BufferedImage to byte array
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ImageIO.write(originalImage, "jpg", baos);
			baos.flush();
			imageInByte = baos.toByteArray();
			baos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return imageInByte;
	}
}
