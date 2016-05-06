package com.mars.vo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * CheckDetail entity. @author MyEclipse Persistence Tools
 */

public class CheckDetail implements java.io.Serializable {

	// Fields

	private Integer cdid;
	private Asset asset;
	private Integer cdresult;
	private Date cddate;
	private Set checkeds = new HashSet(0);

	// Constructors

	/** default constructor */
	public CheckDetail() {
	}

	/** full constructor */
	public CheckDetail(Asset asset, Integer cdresult, Date cddate, Set checkeds) {
		this.asset = asset;
		this.cdresult = cdresult;
		this.cddate = cddate;
		this.checkeds = checkeds;
	}

	// Property accessors

	public Integer getCdid() {
		return this.cdid;
	}

	public void setCdid(Integer cdid) {
		this.cdid = cdid;
	}

	public Asset getAsset() {
		return this.asset;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	public Integer getCdresult() {
		return this.cdresult;
	}

	public void setCdresult(Integer cdresult) {
		this.cdresult = cdresult;
	}

	public Date getCddate() {
		return this.cddate;
	}

	public void setCddate(Date cddate) {
		this.cddate = cddate;
	}

	public Set getCheckeds() {
		return this.checkeds;
	}

	public void setCheckeds(Set checkeds) {
		this.checkeds = checkeds;
	}

}