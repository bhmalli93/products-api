package com.product.api.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.product.api.constants.Constants;
import com.product.api.exception.Fault;

@Component
public class ProductValidator {
	@Autowired
	Fault falut;
	public Fault validate(Long id){
		if (id == null) {		    
			falut.setCode(HttpStatus.BAD_REQUEST);
			falut.setErrorMsg(Constants.ERROR_MSG_BAD_REQEST);
			falut.setErrorReason(Constants.ERROR_MSG_BAD_REQEST);			
		}
		return falut;
		
	}

}
