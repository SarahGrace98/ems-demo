package com.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.dao.BillabilityDao;
import com.ems.entity.Billability;


@Service
public class IBillabilityService implements BillabilityService
{
	@Autowired
	private BillabilityDao billabilityDao;

	@Override
	public Billability saveBillability(Billability billability) {
		return billabilityDao.save(billability);
	}

	@Override
	public List<Billability> getBillabilityList() {
		return billabilityDao.findAll();
	}	
}
