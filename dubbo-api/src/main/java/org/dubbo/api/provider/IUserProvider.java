package org.dubbo.api.provider;

import java.util.List;

import org.dubbo.api.dto.UserDto;

public interface IUserProvider {

	List<UserDto> list(UserDto userDto);

}
