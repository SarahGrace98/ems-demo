package com.ems.service;

import java.util.List;

import com.ems.entity.Billability;

public interface BillabilityService 
{
	public Billability saveBillability(Billability billability);
	public List<Billability> getBillabilityList();
}
