package com.example.erp.liaoshuanchen.pojo;

import java.util.Date;
import java.util.List;

public class SellquoteLsc {
    private String billid;

    private Date billdate;

    private String cliid;

    private String clishortname;

    private String cliplaceid;

    private String cliplace;

    private Float exchrate;

    private Date effectdate;

    private String currencytypeid;

    private String currencytypename;

    private Integer pricewhethertax;

    private String empid;

    private String empname;

    private String depid;

    private String depname;

    private String makeempname;

    private String auditingempname;

    private Integer checkstate;

    private String remark;

    private Integer enables;
    
    private List<QuotedetailsLsc> qdlS;
    
    
    @Override
	public String toString() {
		return "SellquoteLsc [billid=" + billid + ", billdate=" + billdate + ", cliid=" + cliid + ", clishortname="
				+ clishortname + ", cliplaceid=" + cliplaceid + ", cliplace=" + cliplace + ", exchrate=" + exchrate
				+ ", effectdate=" + effectdate + ", currencytypeid=" + currencytypeid + ", currencytypename="
				+ currencytypename + ", pricewhethertax=" + pricewhethertax + ", empid=" + empid + ", empname="
				+ empname + ", depid=" + depid + ", depname=" + depname + ", makeempname=" + makeempname
				+ ", auditingempname=" + auditingempname + ", checkstate=" + checkstate + ", remark=" + remark
				+ ", enables=" + enables + ", qdlS=" + qdlS + "]";
	}

	public List<QuotedetailsLsc> getQdlS() {
		return qdlS;
	}

	public void setQdlS(List<QuotedetailsLsc> qdlS) {
		this.qdlS = qdlS;
	}

	public String getBillid() {
        return billid;
    }

    public void setBillid(String billid) {
        this.billid = billid;
    }

    public Date getBilldate() {
        return billdate;
    }

    public void setBilldate(Date billdate) {
        this.billdate = billdate;
    }

    public String getCliid() {
        return cliid;
    }

    public void setCliid(String cliid) {
        this.cliid = cliid;
    }

    public String getClishortname() {
        return clishortname;
    }

    public void setClishortname(String clishortname) {
        this.clishortname = clishortname;
    }

    public String getCliplaceid() {
        return cliplaceid;
    }

    public void setCliplaceid(String cliplaceid) {
        this.cliplaceid = cliplaceid;
    }

    public String getCliplace() {
        return cliplace;
    }

    public void setCliplace(String cliplace) {
        this.cliplace = cliplace;
    }

    public Float getExchrate() {
        return exchrate;
    }

    public void setExchrate(Float exchrate) {
        this.exchrate = exchrate;
    }

    public Date getEffectdate() {
        return effectdate;
    }

    public void setEffectdate(Date effectdate) {
        this.effectdate = effectdate;
    }

    public String getCurrencytypeid() {
        return currencytypeid;
    }

    public void setCurrencytypeid(String currencytypeid) {
        this.currencytypeid = currencytypeid;
    }

    public String getCurrencytypename() {
        return currencytypename;
    }

    public void setCurrencytypename(String currencytypename) {
        this.currencytypename = currencytypename;
    }

    public Integer getPricewhethertax() {
        return pricewhethertax;
    }

    public void setPricewhethertax(Integer pricewhethertax) {
        this.pricewhethertax = pricewhethertax;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getDepid() {
        return depid;
    }

    public void setDepid(String depid) {
        this.depid = depid;
    }

    public String getDepname() {
        return depname;
    }

    public void setDepname(String depname) {
        this.depname = depname;
    }

    public String getMakeempname() {
        return makeempname;
    }

    public void setMakeempname(String makeempname) {
        this.makeempname = makeempname;
    }

    public String getAuditingempname() {
        return auditingempname;
    }

    public void setAuditingempname(String auditingempname) {
        this.auditingempname = auditingempname;
    }

    public Integer getCheckstate() {
        return checkstate;
    }

    public void setCheckstate(Integer checkstate) {
        this.checkstate = checkstate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getEnables() {
        return enables;
    }

    public void setEnables(Integer enables) {
        this.enables = enables;
    }
}