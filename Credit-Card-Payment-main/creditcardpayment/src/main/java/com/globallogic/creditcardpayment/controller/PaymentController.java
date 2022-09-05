package com.globallogic.creditcardpayment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.globallogic.creditcardpayment.entity.Payment;

import com.globallogic.creditcardpayment.services.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	@Autowired
	PaymentService paymentservice; 
	@GetMapping("/")
	public List<Payment> getPayment() {
          return paymentservice.getPayment();
	}
	@GetMapping("/{id}")
	public Payment getPayment(@PathVariable ("id") long id) {
          return paymentservice.getPayment(id);
	}
	

	@PostMapping("/")
	public void addPayment(@RequestBody Payment pay) {
		paymentservice.addPayment(pay);
	}
    
	@PutMapping("/")
	public Payment updatePayment(@RequestBody Payment pay) {
		return paymentservice.updatePayment(pay);
	}

	@DeleteMapping("/")
	public void removeAccount(long id) {
		paymentservice.removePayment(id);
	}
	
}

