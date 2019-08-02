package com.itc.trn.mis.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itc.trn.mis.model.PaymentInfo;
import com.itc.trn.mis.model.TransactionInfo;

@RestController
@RequestMapping("/paymentgateway")
public class PaymentGateWayController {

	private static final Logger logger = LoggerFactory.getLogger(PaymentGateWayController.class);
	
	
	@PostMapping(value = "/moneytransfer", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> transferMoney(@RequestBody PaymentInfo paymentInfo){
		try {
			logger.info("PaymentGateWay-Payload::"+paymentInfo);
			//			
			TransactionInfo transactionInfo = new TransactionInfo(String.valueOf(Math.round(Math.random() * 10000)),"Success", new Date());
			return new ResponseEntity<TransactionInfo>(transactionInfo, HttpStatus.OK);
		} catch (Exception ex) {
			ex.printStackTrace();
			logger.error("Error while Merchant Payment: ", ex);
			return new ResponseEntity<String>(ex.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
}
