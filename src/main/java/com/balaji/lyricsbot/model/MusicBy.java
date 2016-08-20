
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
    "G.V. Prakash Kumar"
})
public class MusicBy {

    @JsonProperty("G.V. Prakash Kumar")
    private Integer gVPrakashKumar;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The gVPrakashKumar
     */
    @JsonProperty("G.V. Prakash Kumar")
    public Integer getGVPrakashKumar() {
        return gVPrakashKumar;
    }

    /**
     * 
     * @param gVPrakashKumar
     *     The G.V. Prakash Kumar
     */
    @JsonProperty("G.V. Prakash Kumar")
    public void setGVPrakashKumar(Integer gVPrakashKumar) {
        this.gVPrakashKumar = gVPrakashKumar;
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
