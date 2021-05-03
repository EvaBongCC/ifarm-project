package com.ifarm.serviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.commons.util.InetUtils;
import org.springframework.cloud.netflix.eureka.EurekaInstanceConfigBean;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;

import com.netflix.appinfo.AmazonInfo;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryApplication.class, args);
	}
	
//	@Bean
//	public EurekaInstanceConfigBean eurekaInstanceConfig(InetUtils inetUtils) {
//		  EurekaInstanceConfigBean b = new EurekaInstanceConfigBean(inetUtils);
//		  AmazonInfo info = AmazonInfo.Builder.newBuilder().autoBuild("eureka");
//		  b.setDataCenterInfo(info);
//		  return b;
//	}
	

}
