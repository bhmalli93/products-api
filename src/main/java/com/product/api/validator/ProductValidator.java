package com.product.api.validator;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.product.api.constants.Constants;
import com.product.api.exception.Fault;

@Component
public class ProductValidator {
	
	final static Logger logger = Logger.getLogger(ProductValidator.class);
	@Autowired
	Fault fault;
	
	public Fault validate(Long id){
		if(logger.isDebugEnabled()){
			logger.debug("Inside validate Product Id is  : " + id);
		}
		if (id == null) {			
			fault.setCode(HttpStatus.BAD_REQUEST);
			fault.setErrorMsg(Constants.ERROR_MSG_BAD_REQEST);
			fault.setErrorReason(Constants.ERROR_MSG_BAD_REQEST);			
		}
		return fault;
		
	}
	
	public Fault validate(Long id,String productId){
		if(logger.isDebugEnabled()){
			logger.debug("Inside validate Path Param  Id is  : " + id);
			logger.debug("Inside validate Product Id From Body  : " + productId);
		}
		if (id == null) {		    
			fault.setCode(HttpStatus.BAD_REQUEST);
			fault.setErrorMsg(Constants.ERROR_MSG_BAD_REQEST);
			fault.setErrorReason(Constants.ERROR_MSG_BAD_REQEST);			
		}else if(!id.toString().equals(productId)){
			fault.setCode(HttpStatus.BAD_REQUEST);
			fault.setErrorMsg(Constants.ERROR_MSG_BAD_REQEST_MSG);
			fault.setErrorReason(Constants.ERROR_MSG_BAD_REQEST_MSG);
		}
		return fault;	
	}

}
