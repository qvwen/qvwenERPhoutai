package com.example.erp.chenhan.pojo;

import java.util.Date;
import java.util.List;

public class Stockapply {
    private String billno;

    private Date billdate;

    private String billstypeid;
    
    private String classname;

	private Integer billstatus;

    private String salesname;

    private String salesid;

    private String departname;

    private String departid;

    private String maker;

    private String permitter;

    private String appauditing;

    private String stockapplyname;

    private Integer enables;

    private String safetyone;
    
    private List<Stockapplydetails> sds;

     
	 

	public List<Stockapplydetails> getSds() {
		return sds;
	}

	public void setSds(List<Stockapplydetails> sds) {
		this.sds = sds;
	}

	public String getBillno() {
        return billno;
    }

    public void setBillno(String billno) {
        this.billno = billno;
    }

    public Date getBilldate() {
        return billdate;
    }

    public void setBilldate(Date billdate) {
        this.billdate = billdate;
    }

    public String getBillstypeid() {
        return billstypeid;
    }

    public void setBillstypeid(String billstypeid) {
        this.billstypeid = billstypeid;
    }

    public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

    public Integer getBillstatus() {
        return billstatus;
    }

    public void setBillstatus(Integer billstatus) {
        this.billstatus = billstatus;
    }

    public String getSalesname() {
        return salesname;
    }

    public void setSalesname(String salesname) {
        this.salesname = salesname;
    }

    public String getSalesid() {
        return salesid;
    }

    public void setSalesid(String salesid) {
        this.salesid = salesid;
    }

    public String getDepartname() {
        return departname;
    }

    public void setDepartname(String departname) {
        this.departname = departname;
    }

    public String getDepartid() {
        return departid;
    }

    public void setDepartid(String departid) {
        this.departid = departid;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getPermitter() {
        return permitter;
    }

    public void setPermitter(String permitter) {
        this.permitter = permitter;
    }

    public String getAppauditing() {
        return appauditing;
    }

    public void setAppauditing(String appauditing) {
        this.appauditing = appauditing;
    }

    public String getStockapplyname() {
        return stockapplyname;
    }

    public void setStockapplyname(String stockapplyname) {
        this.stockapplyname = stockapplyname;
    }

    public Integer getEnables() {
        return enables;
    }

    public void setEnables(Integer enables) {
        this.enables = enables;
    }

    public String getSafetyone() {
        return safetyone;
    }

    public void setSafetyone(String safetyone) {
        this.safetyone = safetyone;
    }
}