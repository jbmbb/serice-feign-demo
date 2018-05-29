package com.xxlai.sericefeigndemo.service.impl;

import org.springframework.stereotype.Component;

import com.xxlai.sericefeigndemo.service.SchedualServiceHello;

/**
 * 熔断器fallback指定类，实现SchedualServiceHello接口，并注入到ioc容器中
 * @author xxlai
 *
 */
@Component
public class SchedualServiceHelloHystric implements SchedualServiceHello{

	@Override
	public String sayHelloFromClientOne(String name) {
		return "sorry "+name;
	}

}
