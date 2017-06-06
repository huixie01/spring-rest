package com.demo.analytic.gateway.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
/*
{
	  "objectName": "obj_name1",
	  "objectCategory": "obj_cat1",
	  "source": "test/",
	  "mediaType": "disk1"
}
*/

@ApiModel
public class ArchiveRequest {

	@ApiModelProperty(position=1,name="objectName",required=true)
	@JsonProperty(value="objectName")
    private String objectName;

	@ApiModelProperty(position=2,name="objectCategory",required=true)
	@JsonProperty(value="objectCategory")
    private String objectCategory;

	@ApiModelProperty(position=3,name="source",required=true)
	@JsonProperty(value="source")
	private String source;
    
    public ArchiveRequest() { }

	@JsonProperty(value="objectName")
    public String getObjectName() {
		return objectName;
	}

	@JsonProperty(value="objectName")
    public String setObjectName() {
		return objectName;
	}
	
	@JsonProperty(value="objectCategory")
	public void getObjectCategory(String objectCategory) {
		this.objectCategory = objectCategory;
	}
	
	@JsonProperty(value="objectCategory")
	public void setObjectCategory(String objectCategory) {
		this.objectCategory = objectCategory;
	}

	@JsonProperty(value="source")
	public String getSource() {
		return source;
	}

	@JsonProperty(value="source")
	public void setSource(String source) {
		this.source = source;
	}

	
	
}
