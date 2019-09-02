package com.example.erp.wenwei.vo;

import java.util.Date;

public class AllotVO {
	private Integer wareoutid;

    private Integer wareinid;

    private Integer permitter;

    private Date moveDate;

    private String moveno;

    private Integer makerid;

    private String movedetailno;

    private String reason;

    private String movebillno;
    
    /** 物料编号 */
    private String prodid;

    /** 物料类别 */
    private String classid;

    /** 类别名称 */
    private String classname;

    /** 条形码编号 */
    private String barcodeid;

    /** 物料名称 */
    private String prodname;

    /** 规格型号 */
    private String prodsizi;

    /** 英文品名 */
    private String engname;

    /** 使用币别 */
    private String currid;

    /** 币别名称 */
    private String currname;

    /** 建议售价 */
    private String suggestprice;

    /** 售价A */
    private String salespricea;

    /** 售价B */
    private String salespriceb;

    /** 售价C */
    private String salespricec;

    /** 售价D */
    private String salespriced;

    /** 售价E */
    private String salespricee;

    /** 标准进价 */
    private String stdprice;

    /** 税率 */
    private String busitaxrate;

    /** 使用批号管理 */
    private String batchused;

    /** 使用出厂日期 */
    private Date effectdateused;

    /** 使用有效日期 */
    private Date validdateused;

    /** 有效天数 */
    private String defvalidday;

    /** 物料说明 */
    private String proddesc;

    /** 物料形态 */
    private String prodform;

    /** 采购提前期 */
    private String advancedays;

    /** 主供应商 */
    private String majorsupplier;

    /** 供应商名称 */
    private String majorsuppliername;

    /** 最初出库日 */
    private Date boutstockday;

    /** 最初入库日 */
    private Date binstockday;

    /** 呆滞起记天数 */
    private String sluggishdays;

    /** 停用日期 */
    private Date invaliddate;

    /** 安全存量 */
    private String safeqty;

    /** 20CY */
    private String cy20;

    /** 40CY */
    private String cy40;

    /** 40HQ */
    private String hq40;

    /** 45CY */
    private String cy45;

    /** 内包装容量 */
    private String inpackamt;

    /** 外包装容量 */
    private String outpackamt;

    /** 材积单位 */
    private String volumeunit;

    /** Measm’t */
    private String volume;

    /** N.W */
    private String netweight;

    /** G.W */
    private String grossweigh;

    /** 标准成本 */
    private String bstdcost;

    /** 平均成本 */
    private String bavgcost;

    /** 现行平均成本 */
    private String cavgcost;

    /** 物料总成本 */
    private String ctotalcost;

    /** 自定义栏一 */
    private String udef1;

    /** 自定义栏二 */
    private String udef2;

    /** 单价是否含税 */
    private String priceoftax;

    /** 期初总成本 */
    private String btotalcost;

    /** 计量单位 */
    private String stdunitid;

    /** 单位名称 */
    private String stdunitname;

    /** 英文单位 */
    private String stdunitengname;

    /** 现有总数量 */
    private String callamt;

    /** 单位净重 */
    private String nweight;

    /** 包装物重量 */
    private String gweight;

    /** 长 */
    private String Long;

    /** 长度单位 */
    private String lunit;

    /** 宽 */
    private String width;

    /** 高 */
    private String higth;

    /** Measm’t */
    private String mvolume;

    /** 产品打雷 */
    private String probigtype;

    /** 退税率% */
    private String backtaxrate;

    /** 税目 */
    private String taxitemsid;

    /** 期初总数量 */
    private String ballamt;

    /** 实际在库存 */
    private String bcurrstock;

    /** 安全总存量 */
    private String bsafeallstk;

    /** 低于安全存量 */
    private String csafeallstk;

    /** 实际在库量 */
    private String ccurrstock;

    /** 标准总成本 */
    private String cstdcost;

	public Integer getWareoutid() {
		return wareoutid;
	}

	public void setWareoutid(Integer wareoutid) {
		this.wareoutid = wareoutid;
	}

	public Integer getWareinid() {
		return wareinid;
	}

	public void setWareinid(Integer wareinid) {
		this.wareinid = wareinid;
	}

	public Integer getPermitter() {
		return permitter;
	}

	public void setPermitter(Integer permitter) {
		this.permitter = permitter;
	}

	public Date getMoveDate() {
		return moveDate;
	}

	public void setMoveDate(Date moveDate) {
		this.moveDate = moveDate;
	}

	public String getMoveno() {
		return moveno;
	}

	public void setMoveno(String moveno) {
		this.moveno = moveno;
	}

	public Integer getMakerid() {
		return makerid;
	}

	public void setMakerid(Integer makerid) {
		this.makerid = makerid;
	}

	public String getMovedetailno() {
		return movedetailno;
	}

	public void setMovedetailno(String movedetailno) {
		this.movedetailno = movedetailno;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getMovebillno() {
		return movebillno;
	}

	public void setMovebillno(String movebillno) {
		this.movebillno = movebillno;
	}

	public String getProdid() {
		return prodid;
	}

	public void setProdid(String prodid) {
		this.prodid = prodid;
	}

	public String getClassid() {
		return classid;
	}

	public void setClassid(String classid) {
		this.classid = classid;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public String getBarcodeid() {
		return barcodeid;
	}

	public void setBarcodeid(String barcodeid) {
		this.barcodeid = barcodeid;
	}

	public String getProdname() {
		return prodname;
	}

	public void setProdname(String prodname) {
		this.prodname = prodname;
	}

	public String getProdsizi() {
		return prodsizi;
	}

	public void setProdsizi(String prodsizi) {
		this.prodsizi = prodsizi;
	}

	public String getEngname() {
		return engname;
	}

	public void setEngname(String engname) {
		this.engname = engname;
	}

	public String getCurrid() {
		return currid;
	}

	public void setCurrid(String currid) {
		this.currid = currid;
	}

	public String getCurrname() {
		return currname;
	}

	public void setCurrname(String currname) {
		this.currname = currname;
	}

	public String getSuggestprice() {
		return suggestprice;
	}

	public void setSuggestprice(String suggestprice) {
		this.suggestprice = suggestprice;
	}

	public String getSalespricea() {
		return salespricea;
	}

	public void setSalespricea(String salespricea) {
		this.salespricea = salespricea;
	}

	public String getSalespriceb() {
		return salespriceb;
	}

	public void setSalespriceb(String salespriceb) {
		this.salespriceb = salespriceb;
	}

	public String getSalespricec() {
		return salespricec;
	}

	public void setSalespricec(String salespricec) {
		this.salespricec = salespricec;
	}

	public String getSalespriced() {
		return salespriced;
	}

	public void setSalespriced(String salespriced) {
		this.salespriced = salespriced;
	}

	public String getSalespricee() {
		return salespricee;
	}

	public void setSalespricee(String salespricee) {
		this.salespricee = salespricee;
	}

	public String getStdprice() {
		return stdprice;
	}

	public void setStdprice(String stdprice) {
		this.stdprice = stdprice;
	}

	public String getBusitaxrate() {
		return busitaxrate;
	}

	public void setBusitaxrate(String busitaxrate) {
		this.busitaxrate = busitaxrate;
	}

	public String getBatchused() {
		return batchused;
	}

	public void setBatchused(String batchused) {
		this.batchused = batchused;
	}

	public Date getEffectdateused() {
		return effectdateused;
	}

	public void setEffectdateused(Date effectdateused) {
		this.effectdateused = effectdateused;
	}

	public Date getValiddateused() {
		return validdateused;
	}

	public void setValiddateused(Date validdateused) {
		this.validdateused = validdateused;
	}

	public String getDefvalidday() {
		return defvalidday;
	}

	public void setDefvalidday(String defvalidday) {
		this.defvalidday = defvalidday;
	}

	public String getProddesc() {
		return proddesc;
	}

	public void setProddesc(String proddesc) {
		this.proddesc = proddesc;
	}

	public String getProdform() {
		return prodform;
	}

	public void setProdform(String prodform) {
		this.prodform = prodform;
	}

	public String getAdvancedays() {
		return advancedays;
	}

	public void setAdvancedays(String advancedays) {
		this.advancedays = advancedays;
	}

	public String getMajorsupplier() {
		return majorsupplier;
	}

	public void setMajorsupplier(String majorsupplier) {
		this.majorsupplier = majorsupplier;
	}

	public String getMajorsuppliername() {
		return majorsuppliername;
	}

	public void setMajorsuppliername(String majorsuppliername) {
		this.majorsuppliername = majorsuppliername;
	}

	public Date getBoutstockday() {
		return boutstockday;
	}

	public void setBoutstockday(Date boutstockday) {
		this.boutstockday = boutstockday;
	}

	public Date getBinstockday() {
		return binstockday;
	}

	public void setBinstockday(Date binstockday) {
		this.binstockday = binstockday;
	}

	public String getSluggishdays() {
		return sluggishdays;
	}

	public void setSluggishdays(String sluggishdays) {
		this.sluggishdays = sluggishdays;
	}

	public Date getInvaliddate() {
		return invaliddate;
	}

	public void setInvaliddate(Date invaliddate) {
		this.invaliddate = invaliddate;
	}

	public String getSafeqty() {
		return safeqty;
	}

	public void setSafeqty(String safeqty) {
		this.safeqty = safeqty;
	}

	public String getCy20() {
		return cy20;
	}

	public void setCy20(String cy20) {
		this.cy20 = cy20;
	}

	public String getCy40() {
		return cy40;
	}

	public void setCy40(String cy40) {
		this.cy40 = cy40;
	}

	public String getHq40() {
		return hq40;
	}

	public void setHq40(String hq40) {
		this.hq40 = hq40;
	}

	public String getCy45() {
		return cy45;
	}

	public void setCy45(String cy45) {
		this.cy45 = cy45;
	}

	public String getInpackamt() {
		return inpackamt;
	}

	public void setInpackamt(String inpackamt) {
		this.inpackamt = inpackamt;
	}

	public String getOutpackamt() {
		return outpackamt;
	}

	public void setOutpackamt(String outpackamt) {
		this.outpackamt = outpackamt;
	}

	public String getVolumeunit() {
		return volumeunit;
	}

	public void setVolumeunit(String volumeunit) {
		this.volumeunit = volumeunit;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getNetweight() {
		return netweight;
	}

	public void setNetweight(String netweight) {
		this.netweight = netweight;
	}

	public String getGrossweigh() {
		return grossweigh;
	}

	public void setGrossweigh(String grossweigh) {
		this.grossweigh = grossweigh;
	}

	public String getBstdcost() {
		return bstdcost;
	}

	public void setBstdcost(String bstdcost) {
		this.bstdcost = bstdcost;
	}

	public String getBavgcost() {
		return bavgcost;
	}

	public void setBavgcost(String bavgcost) {
		this.bavgcost = bavgcost;
	}

	public String getCavgcost() {
		return cavgcost;
	}

	public void setCavgcost(String cavgcost) {
		this.cavgcost = cavgcost;
	}

	public String getCtotalcost() {
		return ctotalcost;
	}

	public void setCtotalcost(String ctotalcost) {
		this.ctotalcost = ctotalcost;
	}

	public String getUdef1() {
		return udef1;
	}

	public void setUdef1(String udef1) {
		this.udef1 = udef1;
	}

	public String getUdef2() {
		return udef2;
	}

	public void setUdef2(String udef2) {
		this.udef2 = udef2;
	}

	public String getPriceoftax() {
		return priceoftax;
	}

	public void setPriceoftax(String priceoftax) {
		this.priceoftax = priceoftax;
	}

	public String getBtotalcost() {
		return btotalcost;
	}

	public void setBtotalcost(String btotalcost) {
		this.btotalcost = btotalcost;
	}

	public String getStdunitid() {
		return stdunitid;
	}

	public void setStdunitid(String stdunitid) {
		this.stdunitid = stdunitid;
	}

	public String getStdunitname() {
		return stdunitname;
	}

	public void setStdunitname(String stdunitname) {
		this.stdunitname = stdunitname;
	}

	public String getStdunitengname() {
		return stdunitengname;
	}

	public void setStdunitengname(String stdunitengname) {
		this.stdunitengname = stdunitengname;
	}

	public String getCallamt() {
		return callamt;
	}

	public void setCallamt(String callamt) {
		this.callamt = callamt;
	}

	public String getNweight() {
		return nweight;
	}

	public void setNweight(String nweight) {
		this.nweight = nweight;
	}

	public String getGweight() {
		return gweight;
	}

	public void setGweight(String gweight) {
		this.gweight = gweight;
	}

	public String getLong() {
		return Long;
	}

	public void setLong(String l) {
		Long = l;
	}

	public String getLunit() {
		return lunit;
	}

	public void setLunit(String lunit) {
		this.lunit = lunit;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public String getHigth() {
		return higth;
	}

	public void setHigth(String higth) {
		this.higth = higth;
	}

	public String getMvolume() {
		return mvolume;
	}

	public void setMvolume(String mvolume) {
		this.mvolume = mvolume;
	}

	public String getProbigtype() {
		return probigtype;
	}

	public void setProbigtype(String probigtype) {
		this.probigtype = probigtype;
	}

	public String getBacktaxrate() {
		return backtaxrate;
	}

	public void setBacktaxrate(String backtaxrate) {
		this.backtaxrate = backtaxrate;
	}

	public String getTaxitemsid() {
		return taxitemsid;
	}

	public void setTaxitemsid(String taxitemsid) {
		this.taxitemsid = taxitemsid;
	}

	public String getBallamt() {
		return ballamt;
	}

	public void setBallamt(String ballamt) {
		this.ballamt = ballamt;
	}

	public String getBcurrstock() {
		return bcurrstock;
	}

	public void setBcurrstock(String bcurrstock) {
		this.bcurrstock = bcurrstock;
	}

	public String getBsafeallstk() {
		return bsafeallstk;
	}

	public void setBsafeallstk(String bsafeallstk) {
		this.bsafeallstk = bsafeallstk;
	}

	public String getCsafeallstk() {
		return csafeallstk;
	}

	public void setCsafeallstk(String csafeallstk) {
		this.csafeallstk = csafeallstk;
	}

	public String getCcurrstock() {
		return ccurrstock;
	}

	public void setCcurrstock(String ccurrstock) {
		this.ccurrstock = ccurrstock;
	}

	public String getCstdcost() {
		return cstdcost;
	}

	public void setCstdcost(String cstdcost) {
		this.cstdcost = cstdcost;
	}

	@Override
	public String toString() {
		return "AllotVO [wareoutid=" + wareoutid + ", wareinid=" + wareinid + ", permitter=" + permitter + ", moveDate="
				+ moveDate + ", moveno=" + moveno + ", makerid=" + makerid + ", movedetailno=" + movedetailno
				+ ", reason=" + reason + ", movebillno=" + movebillno + ", prodid=" + prodid + ", classid=" + classid
				+ ", classname=" + classname + ", barcodeid=" + barcodeid + ", prodname=" + prodname + ", prodsizi="
				+ prodsizi + ", engname=" + engname + ", currid=" + currid + ", currname=" + currname
				+ ", suggestprice=" + suggestprice + ", salespricea=" + salespricea + ", salespriceb=" + salespriceb
				+ ", salespricec=" + salespricec + ", salespriced=" + salespriced + ", salespricee=" + salespricee
				+ ", stdprice=" + stdprice + ", busitaxrate=" + busitaxrate + ", batchused=" + batchused
				+ ", effectdateused=" + effectdateused + ", validdateused=" + validdateused + ", defvalidday="
				+ defvalidday + ", proddesc=" + proddesc + ", prodform=" + prodform + ", advancedays=" + advancedays
				+ ", majorsupplier=" + majorsupplier + ", majorsuppliername=" + majorsuppliername + ", boutstockday="
				+ boutstockday + ", binstockday=" + binstockday + ", sluggishdays=" + sluggishdays + ", invaliddate="
				+ invaliddate + ", safeqty=" + safeqty + ", cy20=" + cy20 + ", cy40=" + cy40 + ", hq40=" + hq40
				+ ", cy45=" + cy45 + ", inpackamt=" + inpackamt + ", outpackamt=" + outpackamt + ", volumeunit="
				+ volumeunit + ", volume=" + volume + ", netweight=" + netweight + ", grossweigh=" + grossweigh
				+ ", bstdcost=" + bstdcost + ", bavgcost=" + bavgcost + ", cavgcost=" + cavgcost + ", ctotalcost="
				+ ctotalcost + ", udef1=" + udef1 + ", udef2=" + udef2 + ", priceoftax=" + priceoftax + ", btotalcost="
				+ btotalcost + ", stdunitid=" + stdunitid + ", stdunitname=" + stdunitname + ", stdunitengname="
				+ stdunitengname + ", callamt=" + callamt + ", nweight=" + nweight + ", gweight=" + gweight + ", Long="
				+ Long + ", lunit=" + lunit + ", width=" + width + ", higth=" + higth + ", mvolume=" + mvolume
				+ ", probigtype=" + probigtype + ", backtaxrate=" + backtaxrate + ", taxitemsid=" + taxitemsid
				+ ", ballamt=" + ballamt + ", bcurrstock=" + bcurrstock + ", bsafeallstk=" + bsafeallstk
				+ ", csafeallstk=" + csafeallstk + ", ccurrstock=" + ccurrstock + ", cstdcost=" + cstdcost + "]";
	}

	public AllotVO(Integer wareoutid, Integer wareinid, Integer permitter, Date moveDate, String moveno,
			Integer makerid, String movedetailno, String reason, String movebillno, String prodid, String classid,
			String classname, String barcodeid, String prodname, String prodsizi, String engname, String currid,
			String currname, String suggestprice, String salespricea, String salespriceb, String salespricec,
			String salespriced, String salespricee, String stdprice, String busitaxrate, String batchused,
			Date effectdateused, Date validdateused, String defvalidday, String proddesc, String prodform,
			String advancedays, String majorsupplier, String majorsuppliername, Date boutstockday, Date binstockday,
			String sluggishdays, Date invaliddate, String safeqty, String cy20, String cy40, String hq40, String cy45,
			String inpackamt, String outpackamt, String volumeunit, String volume, String netweight, String grossweigh,
			String bstdcost, String bavgcost, String cavgcost, String ctotalcost, String udef1, String udef2,
			String priceoftax, String btotalcost, String stdunitid, String stdunitname, String stdunitengname,
			String callamt, String nweight, String gweight, String l, String lunit, String width, String higth,
			String mvolume, String probigtype, String backtaxrate, String taxitemsid, String ballamt, String bcurrstock,
			String bsafeallstk, String csafeallstk, String ccurrstock, String cstdcost) {
		super();
		this.wareoutid = wareoutid;
		this.wareinid = wareinid;
		this.permitter = permitter;
		this.moveDate = moveDate;
		this.moveno = moveno;
		this.makerid = makerid;
		this.movedetailno = movedetailno;
		this.reason = reason;
		this.movebillno = movebillno;
		this.prodid = prodid;
		this.classid = classid;
		this.classname = classname;
		this.barcodeid = barcodeid;
		this.prodname = prodname;
		this.prodsizi = prodsizi;
		this.engname = engname;
		this.currid = currid;
		this.currname = currname;
		this.suggestprice = suggestprice;
		this.salespricea = salespricea;
		this.salespriceb = salespriceb;
		this.salespricec = salespricec;
		this.salespriced = salespriced;
		this.salespricee = salespricee;
		this.stdprice = stdprice;
		this.busitaxrate = busitaxrate;
		this.batchused = batchused;
		this.effectdateused = effectdateused;
		this.validdateused = validdateused;
		this.defvalidday = defvalidday;
		this.proddesc = proddesc;
		this.prodform = prodform;
		this.advancedays = advancedays;
		this.majorsupplier = majorsupplier;
		this.majorsuppliername = majorsuppliername;
		this.boutstockday = boutstockday;
		this.binstockday = binstockday;
		this.sluggishdays = sluggishdays;
		this.invaliddate = invaliddate;
		this.safeqty = safeqty;
		this.cy20 = cy20;
		this.cy40 = cy40;
		this.hq40 = hq40;
		this.cy45 = cy45;
		this.inpackamt = inpackamt;
		this.outpackamt = outpackamt;
		this.volumeunit = volumeunit;
		this.volume = volume;
		this.netweight = netweight;
		this.grossweigh = grossweigh;
		this.bstdcost = bstdcost;
		this.bavgcost = bavgcost;
		this.cavgcost = cavgcost;
		this.ctotalcost = ctotalcost;
		this.udef1 = udef1;
		this.udef2 = udef2;
		this.priceoftax = priceoftax;
		this.btotalcost = btotalcost;
		this.stdunitid = stdunitid;
		this.stdunitname = stdunitname;
		this.stdunitengname = stdunitengname;
		this.callamt = callamt;
		this.nweight = nweight;
		this.gweight = gweight;
		Long = l;
		this.lunit = lunit;
		this.width = width;
		this.higth = higth;
		this.mvolume = mvolume;
		this.probigtype = probigtype;
		this.backtaxrate = backtaxrate;
		this.taxitemsid = taxitemsid;
		this.ballamt = ballamt;
		this.bcurrstock = bcurrstock;
		this.bsafeallstk = bsafeallstk;
		this.csafeallstk = csafeallstk;
		this.ccurrstock = ccurrstock;
		this.cstdcost = cstdcost;
	}
	
	public AllotVO() {
		// TODO Auto-generated constructor stub
	}
}
