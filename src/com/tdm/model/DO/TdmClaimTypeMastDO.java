package com.tdm.model.DO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the TDM_CLAIM_TYPE_MAST database table.
 * 
 */
@Entity
@Table(name = "TDM_CLAIM_TYPE_MAST")
@NamedQuery(name = "TdmClaimTypeMastDO.findAll", query = "SELECT t FROM TdmClaimTypeMastDO t")
public class TdmClaimTypeMastDO implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Column(name = "CLAIM_TYPE_DESC")
	private String claimTypeDesc;

	@Id
	private BigDecimal id;

	public TdmClaimTypeMastDO()
	{
	}

	public String getClaimTypeDesc()
	{
		return this.claimTypeDesc;
	}

	public void setClaimTypeDesc(String claimTypeDesc)
	{
		this.claimTypeDesc = claimTypeDesc;
	}

	public BigDecimal getId()
	{
		return this.id;
	}

	public void setId(BigDecimal id)
	{
		this.id = id;
	}

}