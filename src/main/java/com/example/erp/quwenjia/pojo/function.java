package com.example.erp.quwenjia.pojo;



import java.util.Date;

public class function  {
    private Integer fid;

    private String fcode;

    private String fname;

    private String furl;

    private String ficon;

    private Integer fpid;

    private Date createdate;

    private Integer istrue;

    private function functionf;   //父集合

    public function getFunctionf() {
		return functionf;
	}

	public void setFunctionf(function functionf) {
		this.functionf = functionf;
	}

	public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getFcode() {
        return fcode;
    }

    public void setFcode(String fcode) {
        this.fcode = fcode == null ? null : fcode.trim();
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname == null ? null : fname.trim();
    }

    public String getFurl() {
        return furl;
    }

    public void setFurl(String furl) {
        this.furl = furl == null ? null : furl.trim();
    }

    public String getFicon() {
        return ficon;
    }

    public void setFicon(String ficon) {
        this.ficon = ficon == null ? null : ficon.trim();
    }

    public Integer getFpid() {
        return fpid;
    }

    public void setFpid(Integer fpid) {
        this.fpid = fpid;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getIstrue() {
        return istrue;
    }

    public void setIstrue(Integer istrue) {
        this.istrue = istrue;
    }

	public function(Integer fid, String fcode, String fname, String furl, String ficon, Integer fpid, Date createdate,
			Integer istrue, function functionf) {
		super();
		this.fid = fid;
		this.fcode = fcode;
		this.fname = fname;
		this.furl = furl;
		this.ficon = ficon;
		this.fpid = fpid;
		this.createdate = createdate;
		this.istrue = istrue;
		this.functionf = functionf;
	}  

	public function() {
		super();
	}
    
    
}