package com.demo.analytic.gateway.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Component;
import com.demo.analytic.gateway.util.*;


@Configuration
@Component
@PropertySource("classpath:application.properties")
public class SpringAppConfig {
	
		@Value("${test.start.time}")
		private String testStartTime;

		@Value("${test.end.time}")
		private String testEndTime;
	
	    @Value("${test.archive.objectName}")
	    private String objectName;
    
	    @Value("${test.archive.srcdest}")
	    private String srcDest;

	    
	    	
	    private String testClientId;	
	   
	   
	    private String gatewayUrl;
	  
	
	    public SpringAppConfig() { }
	    
	    public String getArchiveSrcDest() {
	    	return srcDest;
	    }

	    public void setArchiveSrcDest(String srcDest) {
	    	this.srcDest = srcDest;
	    }

	    public String getArchiveObjName() {
	    	return objectName;
	    }

	    public void setArchiveObjName(String objectName) {
	    	this.objectName = objectName;
	    }

	    public String getTestStartTime() {
	    	return testStartTime;
	    }

	    public void setTestStartTime(String testStartTime) {
	    	this.testStartTime = testStartTime;
	    }

	    public String getTestEndTime() {
	    	return testEndTime;
	    }

	    public void setTestEndTime(String testEndTime) {
	    	this.testEndTime = testEndTime;
	    }

	   

	    public String getTestClientId() {
	    	return System.getProperty(AppConstants.TEST_CLIENT_ID);
	    }

	    public void setTestClientId(String testClientId) {
	    	this.testClientId = testClientId;
	    }

	   

	    public String getGatewayUrl() {
	    	return System.getProperty(AppConstants.TEST_GATEWAY_URL);
	    }

	    public void setGatewayUrl(String gatewayUrl) {
	    	this.gatewayUrl = gatewayUrl;
	    }

  

    //To resolve ${} in @Value
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
         return new PropertySourcesPlaceholderConfigurer();
    }
}
