package com.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ems.entity.Billability;
import com.ems.service.BillabilityService;

@RestController
@RequestMapping("api/bill")
public class BillabilityController  {
	
	@Autowired
	private BillabilityService billabilityService;
	
	@PostMapping("add")
	public Billability saveBillability(@RequestBody Billability billability) {
		return billabilityService.saveBillability(billability);		
	}
	
	@GetMapping("getlist")
	public List<Billability> getBillabilities(){
		return billabilityService.getBillabilityList();
	}
}
