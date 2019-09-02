package com.example.erp.commonality.util;

import javax.servlet.http.HttpSession;

public  class   intercept {
    public static boolean  interceptQ(HttpSession session,String code) {
    	if(code=="-1") {
    		return true;
    	}else {
    		 session.getAttribute("user");
    	}
    	return false;
    }
}
