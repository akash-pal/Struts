package com.zensar.project.validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.validation.ValidatorHandler;

import com.opensymphony.xwork2.validator.ValidationException;
import com.opensymphony.xwork2.validator.Validator;
import com.opensymphony.xwork2.validator.validators.FieldValidatorSupport;
import com.opensymphony.xwork2.validator.validators.ValidatorSupport;


public class PasswordSpecialCharValidator extends FieldValidatorSupport{
	
	private String specialChar;

	public String getSpecialChar() {
		return specialChar;
	}

	public void setSpecialChar(String specialChar) {
		this.specialChar = specialChar;
	}
	@Override
	public void validate(Object object) throws ValidationException {
		String fieldName = getFieldName();
		String fieldValue= (String)getFieldValue(fieldName, object);
		Pattern pattern = Pattern.compile("["+getSpecialChar()+"]");
		Matcher matcher = pattern.matcher(fieldValue);
		if(!matcher.find()){
			addFieldError(fieldName,object);
		}
	}

}
