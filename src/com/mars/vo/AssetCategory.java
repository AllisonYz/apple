package com.mars.vo;

/**
 * AssetCategory entity. @author MyEclipse Persistence Tools
 */

public class AssetCategory implements java.io.Serializable {

	// Fields

	private Integer acid;
	private String accode;
	private String acname;
	private Integer supacid;
	private String supacname;

	// Constructors

	/** default constructor */
	public AssetCategory() {
	}

	/** full constructor */
	public AssetCategory(String accode, String acname, Integer supacid,
			String supacname) {
		this.accode = accode;
		this.acname = acname;
		this.supacid = supacid;
		this.supacname = supacname;
	}

	// Property accessors

	public Integer getAcid() {
		return this.acid;
	}

	public void setAcid(Integer acid) {
		this.acid = acid;
	}

	public String getAccode() {
		return this.accode;
	}

	public void setAccode(String accode) {
		this.accode = accode;
	}

	public String getAcname() {
		return this.acname;
	}

	public void setAcname(String acname) {
		this.acname = acname;
	}

	public Integer getSupacid() {
		return this.supacid;
	}

	public void setSupacid(Integer supacid) {
		this.supacid = supacid;
	}

	public String getSupacname() {
		return this.supacname;
	}

	public void setSupacname(String supacname) {
		this.supacname = supacname;
	}

}