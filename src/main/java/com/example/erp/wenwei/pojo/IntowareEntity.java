package com.example.erp.wenwei.pojo;

import java.util.Date;

public class IntowareEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 6413566371711907820L;

    /* This code was generated by TableGo tools, mark 1 begin. */


    private Integer permitter;


    private Date moveDate;

    private String bilno2;


    private Integer makerid;

 
    private String voucherno;


    private Integer departid;

    private Integer intowareid;

    private Integer typeno;

    private String intoer;

    private String intodetailno;

    /* This code was generated by TableGo tools, mark 1 end. */

    /* This code was generated by TableGo tools, mark 2 begin. */

    /**
     * 获取permitter
     * 
     * @return permitter
     */
    public Integer getPermitter() {
        return this.permitter;
    }

    /**
     * 设置permitter
     * 
     * @param permitter
     */
    public void setPermitter(Integer permitter) {
        this.permitter = permitter;
    }

    /**
     * 获取moveDate
     * 
     * @return moveDate
     */
    public Date getMoveDate() {
        return this.moveDate;
    }

    /**
     * 设置moveDate
     * 
     * @param moveDate
     */
    public void setMoveDate(Date moveDate) {
        this.moveDate = moveDate;
    }

    /**
     * 获取bilno2
     * 
     * @return bilno2
     */
    public String getBilno2() {
        return this.bilno2;
    }

    /**
     * 设置bilno2
     * 
     * @param bilno2
     */
    public void setBilno2(String bilno2) {
        this.bilno2 = bilno2;
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
     * 获取departid
     * 
     * @return departid
     */
    public Integer getDepartid() {
        return this.departid;
    }

    /**
     * 设置departid
     * 
     * @param departid
     */
    public void setDepartid(Integer departid) {
        this.departid = departid;
    }

    /**
     * 获取intowareid
     * 
     * @return intowareid
     */
    public Integer getIntowareid() {
        return this.intowareid;
    }

    /**
     * 设置intowareid
     * 
     * @param intowareid
     */
    public void setIntowareid(Integer intowareid) {
        this.intowareid = intowareid;
    }

    /**
     * 获取typeno
     * 
     * @return typeno
     */
    public Integer getTypeno() {
        return this.typeno;
    }

    /**
     * 设置typeno
     * 
     * @param typeno
     */
    public void setTypeno(Integer typeno) {
        this.typeno = typeno;
    }

    /**
     * 获取intoer
     * 
     * @return intoer
     */
    public String getIntoer() {
        return this.intoer;
    }

    /**
     * 设置intoer
     * 
     * @param intoer
     */
    public void setIntoer(String intoer) {
        this.intoer = intoer;
    }

    /**
     * 获取intodetailno
     * 
     * @return intodetailno
     */
    public String getIntodetailno() {
        return this.intodetailno;
    }

    /**
     * 设置intodetailno
     * 
     * @param intodetailno
     */
    public void setIntodetailno(String intodetailno) {
        this.intodetailno = intodetailno;
    }

    /* This code was generated by TableGo tools, mark 2 end. */
}