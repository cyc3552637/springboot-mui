package com.digital.mobile.api;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

public interface UserService {
	public List query();
	 public int insert(@RequestParam("id") String id,@RequestParam("name") String name);
}
