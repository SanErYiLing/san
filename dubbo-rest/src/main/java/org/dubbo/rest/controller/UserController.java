package org.dubbo.rest.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.dubbo.api.dto.UserDto;
import org.dubbo.api.provider.ISimpleProvider;
import org.dubbo.api.provider.IUserProvider;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户Controller
 * </p>
 *
 * @author author
 * @since 2020-04-21
 */
@RestController
public class UserController {
	
	@Reference
	private IUserProvider userProvider;
	
	@Reference
	private ISimpleProvider simpleProvider;
	
	@PostMapping("/user/listPage")
	public String listPage(@RequestBody UserDto userDto) {
		return userProvider.list(userDto).toString();
//		return simpleProvider.userList(userDto).toString();
	}
}
