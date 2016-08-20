
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
@JsonPropertyOrder({
    "Snehan",
    "Yegathasi"
})
public class LyricsBy {

    @JsonProperty("Snehan")
    private Integer snehan;
    @JsonProperty("Yegathasi")
    private Integer yegathasi;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The snehan
     */
    @JsonProperty("Snehan")
    public Integer getSnehan() {
        return snehan;
    }

    /**
     * 
     * @param snehan
     *     The Snehan
     */
    @JsonProperty("Snehan")
    public void setSnehan(Integer snehan) {
        this.snehan = snehan;
    }

    /**
     * 
     * @return
     *     The yegathasi
     */
    @JsonProperty("Yegathasi")
    public Integer getYegathasi() {
        return yegathasi;
    }

    /**
     * 
     * @param yegathasi
     *     The Yegathasi
     */
    @JsonProperty("Yegathasi")
    public void setYegathasi(Integer yegathasi) {
        this.yegathasi = yegathasi;
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
