package com.product.api.exception;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
@ApiModel
@Scope(value="prototype")
public class Fault {
	@ApiModelProperty(value="error reason typically maps with the actual reason ")
	private String errorReason;
	@ApiModelProperty(value="error reason typically maps with the actual error message ")
	private String errorMsg;
	@ApiModelProperty(value="error reason typically maps with HttpStatus Code ")
	private HttpStatus code;
	
	public String getErrorReason() {
		return errorReason;
	}
	public void setErrorReason(String errorReason) {
		this.errorReason = errorReason;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public HttpStatus getCode() {
		return code;
	}
	public void setCode(HttpStatus code) {
		this.code = code;
	}
	
	

}
