package com.example.erp.wenwei.pojo;

import java.util.Date;

public class ChangebilEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 1576892627932150883L;


    private String incsubjectid;


    private String decsubjectid;

    private Date adjustDate;

    /** checkbillno3 */
    
    private String checkbillno3;

   
    private String voucherno;

   
    private Integer makerid;

    private Integer permitterid;

   
    private String changedetailno;

    /* This code was generated by TableGo tools, mark 1 end. */

    /* This code was generated by TableGo tools, mark 2 begin. */

    /**
     * 获取incsubjectid
     * 
     * @return incsubjectid
     */
    public String getIncsubjectid() {
        return this.incsubjectid;
    }

    /**
     * 设置incsubjectid
     * 
     * @param incsubjectid
     */
    public void setIncsubjectid(String incsubjectid) {
        this.incsubjectid = incsubjectid;
    }

    /**
     * 获取decsubjectid
     * 
     * @return decsubjectid
     */
    public String getDecsubjectid() {
        return this.decsubjectid;
    }

    /**
     * 设置decsubjectid
     * 
     * @param decsubjectid
     */
    public void setDecsubjectid(String decsubjectid) {
        this.decsubjectid = decsubjectid;
    }

    /**
     * 获取adjustDate
     * 
     * @return adjustDate
     */
    public Date getAdjustDate() {
        return this.adjustDate;
    }

    /**
     * 设置adjustDate
     * 
     * @param adjustDate
     */
    public void setAdjustDate(Date adjustDate) {
        this.adjustDate = adjustDate;
    }

    /**
     * 获取checkbillno3
     * 
     * @return checkbillno3
     */
    public String getCheckbillno3() {
        return this.checkbillno3;
    }

    /**
     * 设置checkbillno3
     * 
     * @param checkbillno3
     */
    public void setCheckbillno3(String checkbillno3) {
        this.checkbillno3 = checkbillno3;
    }

    /**
     * 获取voucherno
     * 
     * @return voucherno
     */
    public String getVoucherno() {
        return this.voucherno;
    }

    /**
     * 设置voucherno
     * 
     * @param voucherno
     */
    public void setVoucherno(String voucherno) {
        this.voucherno = voucherno;
    }

    /**
     * 获取makerid
     * 
     * @return makerid
     */
    public Integer getMakerid() {
        return this.makerid;
    }

    /**
     * 设置makerid
     * 
     * @param makerid
     */
    public void setMakerid(Integer makerid) {
        this.makerid = makerid;
    }

    /**
     * 获取permitterid
     * 
     * @return permitterid
     */
    public Integer getPermitterid() {
        return this.permitterid;
    }

    /**
     * 设置permitterid
     * 
     * @param permitterid
     */
    public void setPermitterid(Integer permitterid) {
        this.permitterid = permitterid;
    }

    /**
     * 获取changedetailno
     * 
     * @return changedetailno
     */
    public String getChangedetailno() {
        return this.changedetailno;
    }

    /**
     * 设置changedetailno
     * 
     * @param changedetailno
     */
    public void setChangedetailno(String changedetailno) {
        this.changedetailno = changedetailno;
    }

    /* This code was generated by TableGo tools, mark 2 end. */
}