package org.dubbo.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.dubbo.config.annotation.Service;
import org.dubbo.api.dto.SimpleDto;
import org.dubbo.api.dto.UserDto;
import org.dubbo.api.provider.ISimpleProvider;
import org.dubbo.user.entity.User;
import org.dubbo.user.dao.UserDao;
import org.dubbo.utils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

@Service(interfaceClass=org.dubbo.api.provider.ISimpleProvider.class)
public class SimpleService implements ISimpleProvider{
	
	@Autowired
	private UserDao userDao;

	@Override
	public SimpleDto demo(SimpleDto simpleDto) {
		return simpleDto;
	}
	
	@Override
	public List<UserDto> userList(UserDto userDto) {
		List<User> selectList = userDao.selectList(null);
		List<UserDto> dtoList = new ArrayList<>();
		BeanUtils.copyListPoperties(selectList, dtoList, UserDto.class);
		return dtoList;
	}

}
