
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
    "Singers",
    "Music By",
    "Lyrics By"
})
public class Facets {

    @JsonProperty("Singers")
    private Singers singers;
    @JsonProperty("Music By")
    private MusicBy musicBy;
    @JsonProperty("Lyrics By")
    private LyricsBy lyricsBy;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The singers
     */
    @JsonProperty("Singers")
    public Singers getSingers() {
        return singers;
    }

    /**
     * 
     * @param singers
     *     The Singers
     */
    @JsonProperty("Singers")
    public void setSingers(Singers singers) {
        this.singers = singers;
    }

    /**
     * 
     * @return
     *     The musicBy
     */
    @JsonProperty("Music By")
    public MusicBy getMusicBy() {
        return musicBy;
    }

    /**
     * 
     * @param musicBy
     *     The Music By
     */
    @JsonProperty("Music By")
    public void setMusicBy(MusicBy musicBy) {
        this.musicBy = musicBy;
    }

    /**
     * 
     * @return
     *     The lyricsBy
     */
    @JsonProperty("Lyrics By")
    public LyricsBy getLyricsBy() {
        return lyricsBy;
    }

    /**
     * 
     * @param lyricsBy
     *     The Lyrics By
     */
    @JsonProperty("Lyrics By")
    public void setLyricsBy(LyricsBy lyricsBy) {
        this.lyricsBy = lyricsBy;
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
