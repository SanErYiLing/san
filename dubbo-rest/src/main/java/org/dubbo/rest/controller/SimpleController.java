package org.dubbo.rest.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.dubbo.api.dto.SimpleDto;
import org.dubbo.api.provider.ISimpleProvider;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SimpleController {
	
	@Reference
	private ISimpleProvider simpleProvider;

	@RequestMapping("/simple/demo")
	public String demo(@RequestBody SimpleDto simpleDto) {
		return simpleProvider.demo(simpleDto).toString();
	}
}
