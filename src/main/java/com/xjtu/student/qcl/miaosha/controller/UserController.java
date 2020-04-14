package com.xjtu.student.qcl.miaosha.controller;

import com.xjtu.student.qcl.miaosha.redis.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xjtu.student.qcl.miaosha.domain.MiaoshaUser;
import com.xjtu.student.qcl.miaosha.result.Result;
import com.xjtu.student.qcl.miaosha.service.MiaoshaUserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	MiaoshaUserService userService;
	
	@Autowired
    RedisService redisService;
	
    @RequestMapping("/info")
    @ResponseBody
    public Result<MiaoshaUser> info(Model model,MiaoshaUser user) {
        return Result.success(user);
    }
    
}
