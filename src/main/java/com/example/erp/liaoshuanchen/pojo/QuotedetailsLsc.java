package com.example.erp.liaoshuanchen.pojo;

public class QuotedetailsLsc {
    private String billid;

    private String cotemark;

    private String matid;

    private String matname;

    private String matspec;

    private String matunit;

    private Integer number;

    private Float agioagoprice;

    private Float agio;

    private Float price;

    private Float money;

    private Float cess;

    private Float taxmoney;

    private Float intaxmoney;

    private Integer present;

    private Float factcost;

    private Float criterioncost;

    private String remark1;

    private String remark2;

    
    
    @Override
	public String toString() {
		return "QuotedetailsLsc [billid=" + billid + ", cotemark=" + cotemark + ", matid=" + matid + ", matname="
				+ matname + ", matspec=" + matspec + ", matunit=" + matunit + ", number=" + number + ", agioagoprice="
				+ agioagoprice + ", agio=" + agio + ", price=" + price + ", money=" + money + ", cess=" + cess
				+ ", taxmoney=" + taxmoney + ", intaxmoney=" + intaxmoney + ", present=" + present + ", factcost="
				+ factcost + ", criterioncost=" + criterioncost + ", remark1=" + remark1 + ", remark2=" + remark2 + "]";
	}

	public String getBillid() {
        return billid;
    }

    public void setBillid(String billid) {
        this.billid = billid;
    }

    public String getCotemark() {
        return cotemark;
    }

    public void setCotemark(String cotemark) {
        this.cotemark = cotemark;
    }

    public String getMatid() {
        return matid;
    }

    public void setMatid(String matid) {
        this.matid = matid;
    }

    public String getMatname() {
        return matname;
    }

    public void setMatname(String matname) {
        this.matname = matname;
    }

    public String getMatspec() {
        return matspec;
    }

    public void setMatspec(String matspec) {
        this.matspec = matspec;
    }

    public String getMatunit() {
        return matunit;
    }

    public void setMatunit(String matunit) {
        this.matunit = matunit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Float getAgioagoprice() {
        return agioagoprice;
    }

    public void setAgioagoprice(Float agioagoprice) {
        this.agioagoprice = agioagoprice;
    }

    public Float getAgio() {
        return agio;
    }

    public void setAgio(Float agio) {
        this.agio = agio;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    public Float getCess() {
        return cess;
    }

    public void setCess(Float cess) {
        this.cess = cess;
    }

    public Float getTaxmoney() {
        return taxmoney;
    }

    public void setTaxmoney(Float taxmoney) {
        this.taxmoney = taxmoney;
    }

    public Float getIntaxmoney() {
        return intaxmoney;
    }

    public void setIntaxmoney(Float intaxmoney) {
        this.intaxmoney = intaxmoney;
    }

    public Integer getPresent() {
        return present;
    }

    public void setPresent(Integer present) {
        this.present = present;
    }

    public Float getFactcost() {
        return factcost;
    }

    public void setFactcost(Float factcost) {
        this.factcost = factcost;
    }

    public Float getCriterioncost() {
        return criterioncost;
    }

    public void setCriterioncost(Float criterioncost) {
        this.criterioncost = criterioncost;
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1;
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2;
    }
}