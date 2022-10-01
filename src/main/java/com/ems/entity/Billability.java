package com.ems.entity;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Billability 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private Boolean billabilitystatus;
	private Date startdate;
	private Date enddate;
}
