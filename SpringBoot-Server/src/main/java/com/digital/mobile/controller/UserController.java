package com.digital.mobile.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.digital.mobile.api.UserService;
import com.digital.mobile.entity.UserEntity;
import com.digital.mobile.util.JsonUtil;





@RestController
public class UserController {
	private static Logger log=LoggerFactory.getLogger(UserController.class);
    @Autowired
    UserService userservice;
    @RequestMapping(value="/mobile/action/userActionFind",produces = "application/json; charset=utf-8")
    public  String  testActionFind() {
		List<UserEntity> list=userservice.query();
		JsonUtil ju=new JsonUtil();
		Map<String, Object> modelMap =new HashMap<String, Object>(3);
		String json=ju.list2json(list);
		return json;
    }
    @RequestMapping("/mobile/action/userActionAdd")
	public @ResponseBody String testActionAdd(@ModelAttribute("userentity")UserEntity userentity) {
        
		int num = userservice.insert(userentity.getUserid(), userentity.getUser());
		if (num>0){
			String result="true";
		    return result;
		}
		else{
			String result="false";
		    return result;
	}
    }
}
