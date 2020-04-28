package org.dubbo.user.service.impl;

import org.dubbo.user.entity.User;

import java.util.ArrayList;
import java.util.List;

import org.apache.dubbo.config.annotation.Service;
import org.dubbo.api.dto.UserDto;
import org.dubbo.api.provider.IUserProvider;
import org.dubbo.user.dao.UserDao;
import org.dubbo.user.service.UserService;
import org.dubbo.utils.BeanUtils;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author author
 * @since 2020-04-28
 */
@Service(interfaceClass = org.dubbo.api.provider.IUserProvider.class)
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService ,IUserProvider{

	@Override
	public List<UserDto> list(UserDto userDto) {
		User user = new User();
		BeanUtils.copyProperties(userDto, user);
		QueryWrapper<User> wrapper = new QueryWrapper<>(user);
		List<User> list = super.list(wrapper);
		List<UserDto> dtoList = new ArrayList<>();
		BeanUtils.copyListPoperties(list, dtoList, UserDto.class);
		return dtoList;
	}

}
