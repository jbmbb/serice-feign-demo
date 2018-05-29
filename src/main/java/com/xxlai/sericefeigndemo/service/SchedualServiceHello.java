package com.xxlai.sericefeigndemo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.xxlai.sericefeigndemo.service.impl.SchedualServiceHelloHystric;

/**
 * feign负载均衡器
 * fallback指定熔断后执行类
 * @author xxlai
 *
 */
@FeignClient(value = "service-hello1",fallback=SchedualServiceHelloHystric.class)
public interface SchedualServiceHello {
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	String sayHelloFromClientOne(@RequestParam(value = "name") String name);
}
