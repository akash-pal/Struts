package com.zensar.project.action;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zensar.project.beans.UserBean;

@SuppressWarnings("serial")
public class RegistrationAction extends ActionSupport implements Action,
		ModelDriven<UserBean> {

	private UserBean userBean;
	private List<String> locations;

	Map languageMap;

	private File uploadFile;
	private String uploadFileContentType;
	private String uploadFileFileName;
	private List states;

	public File getUploadFile() {
		return uploadFile;
	}

	public void setUploadFile(File uploadFile) {
		this.uploadFile = uploadFile;
	}

	public String getUploadFileContentType() {
		return uploadFileContentType;
	}

	public void setUploadFileContentType(String uploadFileContentType) {
		this.uploadFileContentType = uploadFileContentType;
	}

	public String getUploadFileFileName() {
		return uploadFileFileName;
	}

	public void setUploadFileFileName(String uploadFileFileName) {
		this.uploadFileFileName = uploadFileFileName;
	}

	public Map getLanguageMap() {
		return languageMap;
	}

	public void setLanguageMap(Map languageMap) {
		this.languageMap = languageMap;
	}

	public void setStates(List states) {
		this.states = states;
	}

	@SuppressWarnings("unchecked")
	public RegistrationAction() {

		languageMap = new HashMap();

		languageMap.put(
				"Java",
				new ArrayList<String>(Arrays.asList("Spring", "Hibernate",
						"Struts 2")));
		languageMap.put(".Net",
				new ArrayList<String>(Arrays.asList("VB.Net", "C#")));
		languageMap.put("JavaScript",
				new ArrayList<String>(Arrays.asList("jQuery")));

		locations = new ArrayList<String>();
		locations.add("Pune");
		locations.add("Hyderbad");
		locations.add("Bangalore");

		states = new ArrayList();
		states.add("Alabama");
		states.add("Alaska");
		states.add("Arizona");
		states.add("Arkansas");
		states.add("California");
		states.add("Colorado");
		states.add("Connecticut");
		states.add("Delaware");
		states.add("District of Columbia");
		states.add("Florida");
		states.add("Georgia");
		states.add("Hawaii");
		states.add("Idaho");
		states.add("Illinois");
		states.add("Indiana");
		states.add("Iowa");
		states.add("Kansas");
		states.add("Kentucky");
		states.add("Louisiana");
		states.add("Maine");
		states.add("Maryland");
		states.add("Massachusetts");
		states.add("Michigan");
		states.add("Minnesota");
		states.add("Mississippi");
		states.add("Missouri");
		states.add("Montana");
		states.add("Nebraska");
		states.add("Nevada");
		states.add("New Hampshire");
		states.add("New Jersey");
		states.add("New Mexico");
		states.add("New York");
		states.add("North Carolina");
		states.add("North Dakota");
		states.add("Ohio");
		states.add("Oklahoma");
		states.add("Oregon");
		states.add("Pennsylvania");
		states.add("Rhode Island");
		states.add("South Carolina");
		states.add("South Dakota");
		states.add("Tennessee");
		states.add("Texas");
		states.add("Utah");
		states.add("Vermont");
		states.add("Virginia");
		states.add("Washington");
		states.add("West Virginia");
		states.add("Wisconsin");
		states.add("Wyoming");

	}

	public String display() {
		return NONE;
	}

	public List<String> getLocations() {
		return locations;
	}

	public void setLocations(List<String> locations) {
		this.locations = locations;
	}

	public UserBean getUserBean() {
		return userBean;
	}

	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}

	public List getStates() {
		return states;
	}

	@Override
	public String execute() {

		
		try {
			String filePath = "D:/Myuploads"; // Path where uploaded file will
												// be stored
			System.out.println("Server path:" + filePath); // check your path in
															// console
			File fileToCreate = new File(filePath, uploadFileFileName);// Create
																		// file
																		// name
																		// same
																		// as
																		// original
			FileUtils.copyFile(uploadFile, fileToCreate); // Just copy temp file
															// content to this
															// file

		} catch (Exception e) {
			e.printStackTrace();
			addActionError(e.getMessage());
			this.addFieldError("uploadFile", "no file");
			return INPUT;

		}

		return SUCCESS;
	}
	
	

	@Override
	public UserBean getModel() {
		userBean = new UserBean();
		return userBean;
	}

}
