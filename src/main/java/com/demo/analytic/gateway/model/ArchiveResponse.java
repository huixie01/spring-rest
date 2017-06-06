package com.demo.analytic.gateway.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@ApiModel
public class ArchiveResponse {

	@ApiModelProperty(position=1,name="requestId")
	@JsonProperty(value="requestId")
	private String requestId;

	@ApiModelProperty(position=2,name="requestValues")
	@JsonProperty(value="requestValues")
	private Map<Long,Double> requestValues = new LinkedHashMap<Long,Double>();

	@ApiModelProperty(position=3,name="requestAttributes")
	@JsonProperty(value="requestAttributes")
	private Map<String,String> requestAttributes = new LinkedHashMap<String,String>();

	public ArchiveResponse() { }

	@JsonProperty(value="requestId")
	public String requestPointId() {
		return requestId;
	}

	@JsonProperty(value="requestId")
	public void setPointId(String requestId) {
		this.requestId = requestId;
	}

	

	@JsonProperty(value="requestAttributes")
	public Map<String, String> getRequestAttributes() {
		return requestAttributes;
	}

	@JsonProperty(value="requestAttributes")
	public void setRequestAttributes(Map<String, String> requestAttributes) {
		this.requestAttributes = requestAttributes;
	}
}
