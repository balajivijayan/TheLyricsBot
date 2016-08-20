package com.balaji.lyricsbot.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "indexName", "params" })
public class Request {

	@JsonProperty("indexName")
	private String indexName;
	@JsonProperty("params")
	private String params;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return The indexName
	 */
	@JsonProperty("indexName")
	public String getIndexName() {
		return indexName;
	}

	/**
	 * 
	 * @param indexName
	 *            The indexName
	 */
	@JsonProperty("indexName")
	public void setIndexName(String indexName) {
		this.indexName = indexName;
	}

	/**
	 * 
	 * @return The params
	 */
	@JsonProperty("params")
	public String getParams() {
		return params;
	}

	/**
	 * 
	 * @param params
	 *            The params
	 */
	@JsonProperty("params")
	public void setParams(String movieName) {
		String defaultParam = "&hitsPerPage=7&maxValuesPerFacet=7&page=0&facets=%5B%22singers%22%2C%22Lyrics%20By%22%2C%22Music%20By%22%2C%22Singers%22%5D&tagFilters=";
		this.params = "query=" + movieName + defaultParam;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
