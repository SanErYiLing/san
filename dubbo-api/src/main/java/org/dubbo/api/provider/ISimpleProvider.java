package org.dubbo.api.provider;

import java.util.List;

import org.dubbo.api.dto.SimpleDto;
import org.dubbo.api.dto.UserDto;

public interface ISimpleProvider {

	public SimpleDto demo(SimpleDto simpleDto);

	List<UserDto> userList(UserDto userDto);
}
