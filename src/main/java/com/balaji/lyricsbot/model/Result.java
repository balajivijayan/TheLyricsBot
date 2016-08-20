
package com.balaji.lyricsbot.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
@JsonPropertyOrder({
    "hits",
    "nbHits",
    "page",
    "nbPages",
    "hitsPerPage",
    "processingTimeMS",
    "facets",
    "exhaustiveFacetsCount",
    "query",
    "params",
    "index"
})
public class Result {

    @JsonProperty("hits")
    private List<Hit> hits = new ArrayList<Hit>();
    @JsonProperty("nbHits")
    private Integer nbHits;
    @JsonProperty("page")
    private Integer page;
    @JsonProperty("nbPages")
    private Integer nbPages;
    @JsonProperty("hitsPerPage")
    private Integer hitsPerPage;
    @JsonProperty("processingTimeMS")
    private Integer processingTimeMS;
    @JsonProperty("facets")
    private Facets facets;
    @JsonProperty("exhaustiveFacetsCount")
    private Boolean exhaustiveFacetsCount;
    @JsonProperty("query")
    private String query;
    @JsonProperty("params")
    private String params;
    @JsonProperty("index")
    private String index;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The hits
     */
    @JsonProperty("hits")
    public List<Hit> getHits() {
        return hits;
    }

    /**
     * 
     * @param hits
     *     The hits
     */
    @JsonProperty("hits")
    public void setHits(List<Hit> hits) {
        this.hits = hits;
    }

    /**
     * 
     * @return
     *     The nbHits
     */
    @JsonProperty("nbHits")
    public Integer getNbHits() {
        return nbHits;
    }

    /**
     * 
     * @param nbHits
     *     The nbHits
     */
    @JsonProperty("nbHits")
    public void setNbHits(Integer nbHits) {
        this.nbHits = nbHits;
    }

    /**
     * 
     * @return
     *     The page
     */
    @JsonProperty("page")
    public Integer getPage() {
        return page;
    }

    /**
     * 
     * @param page
     *     The page
     */
    @JsonProperty("page")
    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * 
     * @return
     *     The nbPages
     */
    @JsonProperty("nbPages")
    public Integer getNbPages() {
        return nbPages;
    }

    /**
     * 
     * @param nbPages
     *     The nbPages
     */
    @JsonProperty("nbPages")
    public void setNbPages(Integer nbPages) {
        this.nbPages = nbPages;
    }

    /**
     * 
     * @return
     *     The hitsPerPage
     */
    @JsonProperty("hitsPerPage")
    public Integer getHitsPerPage() {
        return hitsPerPage;
    }

    /**
     * 
     * @param hitsPerPage
     *     The hitsPerPage
     */
    @JsonProperty("hitsPerPage")
    public void setHitsPerPage(Integer hitsPerPage) {
        this.hitsPerPage = hitsPerPage;
    }

    /**
     * 
     * @return
     *     The processingTimeMS
     */
    @JsonProperty("processingTimeMS")
    public Integer getProcessingTimeMS() {
        return processingTimeMS;
    }

    /**
     * 
     * @param processingTimeMS
     *     The processingTimeMS
     */
    @JsonProperty("processingTimeMS")
    public void setProcessingTimeMS(Integer processingTimeMS) {
        this.processingTimeMS = processingTimeMS;
    }

    /**
     * 
     * @return
     *     The facets
     */
    @JsonProperty("facets")
    public Facets getFacets() {
        return facets;
    }

    /**
     * 
     * @param facets
     *     The facets
     */
    @JsonProperty("facets")
    public void setFacets(Facets facets) {
        this.facets = facets;
    }

    /**
     * 
     * @return
     *     The exhaustiveFacetsCount
     */
    @JsonProperty("exhaustiveFacetsCount")
    public Boolean getExhaustiveFacetsCount() {
        return exhaustiveFacetsCount;
    }

    /**
     * 
     * @param exhaustiveFacetsCount
     *     The exhaustiveFacetsCount
     */
    @JsonProperty("exhaustiveFacetsCount")
    public void setExhaustiveFacetsCount(Boolean exhaustiveFacetsCount) {
        this.exhaustiveFacetsCount = exhaustiveFacetsCount;
    }

    /**
     * 
     * @return
     *     The query
     */
    @JsonProperty("query")
    public String getQuery() {
        return query;
    }

    /**
     * 
     * @param query
     *     The query
     */
    @JsonProperty("query")
    public void setQuery(String query) {
        this.query = query;
    }

    /**
     * 
     * @return
     *     The params
     */
    @JsonProperty("params")
    public String getParams() {
        return params;
    }

    /**
     * 
     * @param params
     *     The params
     */
    @JsonProperty("params")
    public void setParams(String params) {
        this.params = params;
    }

    /**
     * 
     * @return
     *     The index
     */
    @JsonProperty("index")
    public String getIndex() {
        return index;
    }

    /**
     * 
     * @param index
     *     The index
     */
    @JsonProperty("index")
    public void setIndex(String index) {
        this.index = index;
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
