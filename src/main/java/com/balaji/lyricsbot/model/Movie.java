
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
    "value",
    "matchLevel",
    "fullyHighlighted",
    "matchedWords"
})
public class Movie {

    @JsonProperty("value")
    private String value;
    @JsonProperty("matchLevel")
    private String matchLevel;
    @JsonProperty("fullyHighlighted")
    private Boolean fullyHighlighted;
    @JsonProperty("matchedWords")
    private List<String> matchedWords = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The value
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * 
     * @param value
     *     The value
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 
     * @return
     *     The matchLevel
     */
    @JsonProperty("matchLevel")
    public String getMatchLevel() {
        return matchLevel;
    }

    /**
     * 
     * @param matchLevel
     *     The matchLevel
     */
    @JsonProperty("matchLevel")
    public void setMatchLevel(String matchLevel) {
        this.matchLevel = matchLevel;
    }

    /**
     * 
     * @return
     *     The fullyHighlighted
     */
    @JsonProperty("fullyHighlighted")
    public Boolean getFullyHighlighted() {
        return fullyHighlighted;
    }

    /**
     * 
     * @param fullyHighlighted
     *     The fullyHighlighted
     */
    @JsonProperty("fullyHighlighted")
    public void setFullyHighlighted(Boolean fullyHighlighted) {
        this.fullyHighlighted = fullyHighlighted;
    }

    /**
     * 
     * @return
     *     The matchedWords
     */
    @JsonProperty("matchedWords")
    public List<String> getMatchedWords() {
        return matchedWords;
    }

    /**
     * 
     * @param matchedWords
     *     The matchedWords
     */
    @JsonProperty("matchedWords")
    public void setMatchedWords(List<String> matchedWords) {
        this.matchedWords = matchedWords;
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
