
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
    "G. V. Prakash Kumar",
    "Kay Kay",
    "Prashanthini",
    "S. P. B. Charan",
    "S. P. Balasubramanyam",
    "Velmurugan"
})
public class Singers {

    @JsonProperty("G. V. Prakash Kumar")
    private Integer gVPrakashKumar;
    @JsonProperty("Kay Kay")
    private Integer kayKay;
    @JsonProperty("Prashanthini")
    private Integer prashanthini;
    @JsonProperty("S. P. B. Charan")
    private Integer sPBCharan;
    @JsonProperty("S. P. Balasubramanyam")
    private Integer sPBalasubramanyam;
    @JsonProperty("Velmurugan")
    private Integer velmurugan;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The gVPrakashKumar
     */
    @JsonProperty("G. V. Prakash Kumar")
    public Integer getGVPrakashKumar() {
        return gVPrakashKumar;
    }

    /**
     * 
     * @param gVPrakashKumar
     *     The G. V. Prakash Kumar
     */
    @JsonProperty("G. V. Prakash Kumar")
    public void setGVPrakashKumar(Integer gVPrakashKumar) {
        this.gVPrakashKumar = gVPrakashKumar;
    }

    /**
     * 
     * @return
     *     The kayKay
     */
    @JsonProperty("Kay Kay")
    public Integer getKayKay() {
        return kayKay;
    }

    /**
     * 
     * @param kayKay
     *     The Kay Kay
     */
    @JsonProperty("Kay Kay")
    public void setKayKay(Integer kayKay) {
        this.kayKay = kayKay;
    }

    /**
     * 
     * @return
     *     The prashanthini
     */
    @JsonProperty("Prashanthini")
    public Integer getPrashanthini() {
        return prashanthini;
    }

    /**
     * 
     * @param prashanthini
     *     The Prashanthini
     */
    @JsonProperty("Prashanthini")
    public void setPrashanthini(Integer prashanthini) {
        this.prashanthini = prashanthini;
    }

    /**
     * 
     * @return
     *     The sPBCharan
     */
    @JsonProperty("S. P. B. Charan")
    public Integer getSPBCharan() {
        return sPBCharan;
    }

    /**
     * 
     * @param sPBCharan
     *     The S. P. B. Charan
     */
    @JsonProperty("S. P. B. Charan")
    public void setSPBCharan(Integer sPBCharan) {
        this.sPBCharan = sPBCharan;
    }

    /**
     * 
     * @return
     *     The sPBalasubramanyam
     */
    @JsonProperty("S. P. Balasubramanyam")
    public Integer getSPBalasubramanyam() {
        return sPBalasubramanyam;
    }

    /**
     * 
     * @param sPBalasubramanyam
     *     The S. P. Balasubramanyam
     */
    @JsonProperty("S. P. Balasubramanyam")
    public void setSPBalasubramanyam(Integer sPBalasubramanyam) {
        this.sPBalasubramanyam = sPBalasubramanyam;
    }

    /**
     * 
     * @return
     *     The velmurugan
     */
    @JsonProperty("Velmurugan")
    public Integer getVelmurugan() {
        return velmurugan;
    }

    /**
     * 
     * @param velmurugan
     *     The Velmurugan
     */
    @JsonProperty("Velmurugan")
    public void setVelmurugan(Integer velmurugan) {
        this.velmurugan = velmurugan;
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
