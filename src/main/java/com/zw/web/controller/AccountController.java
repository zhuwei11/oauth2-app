package com.zw.web.controller;

import org.apache.log4j.Logger;

import com.jfinal.aop.Inject;
import com.jfinal.core.Controller;
import com.zw.common.constant.SysConstant;
import com.zw.common.dto.UserSession;
import com.zw.service.AuthorizeService;

public class AccountController extends Controller {
	
    private final static Logger LOG = Logger.getLogger(AccountController.class);

    @Inject
    AuthorizeService authorizeService;
  
    public void index() {
	  
    }
    
    public void callback() {
    	
    }
	  
	  
    
    public UserSession getUserSession() {
		return (UserSession)getSessionAttr(SysConstant.SESSION_ID_KEY);
	}
	  
}
