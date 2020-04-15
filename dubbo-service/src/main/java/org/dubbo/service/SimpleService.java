package org.dubbo.service;

import org.apache.dubbo.config.annotation.Service;
import org.dubbo.api.dto.SimpleDto;
import org.dubbo.api.provider.ISimpleProvider;

@Service(interfaceClass=org.dubbo.api.provider.ISimpleProvider.class)
public class SimpleService implements ISimpleProvider{

	@Override
	public SimpleDto demo(SimpleDto simpleDto) {
		return simpleDto;
	}

}
