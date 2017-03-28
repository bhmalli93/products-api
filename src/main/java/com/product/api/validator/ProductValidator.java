package com.product.api.validator;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.product.api.constants.Constants;
import com.product.api.controller.ProductController;
import com.product.api.exception.Fault;
import com.product.api.model.Products;

@Component
public class ProductValidator {
	
	final static Logger logger = Logger.getLogger(ProductValidator.class);
	@Autowired
	Fault falut;
	public Fault validate(Long id){
		if(logger.isDebugEnabled()){
			logger.debug("Inside validate Product Id is  : " + id);
		}
		if (id == null) {		    
			falut.setCode(HttpStatus.BAD_REQUEST);
			falut.setErrorMsg(Constants.ERROR_MSG_BAD_REQEST);
			falut.setErrorReason(Constants.ERROR_MSG_BAD_REQEST);			
		}
		return falut;
		
	}
	
	public Fault validate(Long id,String productId){
		if(logger.isDebugEnabled()){
			logger.debug("Inside validate Path Param  Id is  : " + id);
			logger.debug("Inside validate Product Id From Body  : " + productId);
		}
		if (id == null) {		    
			falut.setCode(HttpStatus.BAD_REQUEST);
			falut.setErrorMsg(Constants.ERROR_MSG_BAD_REQEST);
			falut.setErrorReason(Constants.ERROR_MSG_BAD_REQEST);			
		}else if(!id.toString().equals(productId)){
			falut.setCode(HttpStatus.BAD_REQUEST);
			falut.setErrorMsg(Constants.ERROR_MSG_BAD_REQEST);
			falut.setErrorReason(Constants.ERROR_MSG_BAD_REQEST);
		}
		return falut;	
	}

}
