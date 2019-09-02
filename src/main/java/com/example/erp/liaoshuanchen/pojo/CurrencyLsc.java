package com.example.erp.liaoshuanchen.pojo;

import java.util.Date;

public class CurrencyLsc {
    private String currencyno;

    private String currencyname;

    private String currencyname2;

    private String englishname;

    private Date transactiondate;

    private Float fixedexchangerate;

    private Float buyingexchange;

    private Float sellingrates;

    private Integer pricepost;

    private String thousandcomma1;

    private Integer figurepost;

    private String thousandcomma2;

    public String getCurrencyno() {
        return currencyno;
    }

    public void setCurrencyno(String currencyno) {
        this.currencyno = currencyno;
    }

    public String getCurrencyname() {
        return currencyname;
    }

    public void setCurrencyname(String currencyname) {
        this.currencyname = currencyname;
    }

    public String getCurrencyname2() {
        return currencyname2;
    }

    public void setCurrencyname2(String currencyname2) {
        this.currencyname2 = currencyname2;
    }

    public String getEnglishname() {
        return englishname;
    }

    public void setEnglishname(String englishname) {
        this.englishname = englishname;
    }

    public Date getTransactiondate() {
        return transactiondate;
    }

    public void setTransactiondate(Date transactiondate) {
        this.transactiondate = transactiondate;
    }

    public Float getFixedexchangerate() {
        return fixedexchangerate;
    }

    public void setFixedexchangerate(Float fixedexchangerate) {
        this.fixedexchangerate = fixedexchangerate;
    }

    public Float getBuyingexchange() {
        return buyingexchange;
    }

    public void setBuyingexchange(Float buyingexchange) {
        this.buyingexchange = buyingexchange;
    }

    public Float getSellingrates() {
        return sellingrates;
    }

    public void setSellingrates(Float sellingrates) {
        this.sellingrates = sellingrates;
    }

    public Integer getPricepost() {
        return pricepost;
    }

    public void setPricepost(Integer pricepost) {
        this.pricepost = pricepost;
    }

    public String getThousandcomma1() {
        return thousandcomma1;
    }

    public void setThousandcomma1(String thousandcomma1) {
        this.thousandcomma1 = thousandcomma1;
    }

    public Integer getFigurepost() {
        return figurepost;
    }

    public void setFigurepost(Integer figurepost) {
        this.figurepost = figurepost;
    }

    public String getThousandcomma2() {
        return thousandcomma2;
    }

    public void setThousandcomma2(String thousandcomma2) {
        this.thousandcomma2 = thousandcomma2;
    }
}