
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
    "Title",
    "Movie",
    "Lyrics By",
    "Music By",
    "Singers",
    "Img",
    "URL",
    "objectID",
    "_highlightResult"
})
public class Hit {

    @JsonProperty("Title")
    private String title;
    @JsonProperty("Movie")
    private String movie;
    @JsonProperty("Lyrics By")
    private List<String> lyricsBy = new ArrayList<String>();
    @JsonProperty("Music By")
    private List<String> musicBy = new ArrayList<String>();
    @JsonProperty("Singers")
    private List<String> singers = new ArrayList<String>();
    @JsonProperty("Img")
    private String img;
    @JsonProperty("URL")
    private String uRL;
    @JsonProperty("objectID")
    private String objectID;
    @JsonProperty("_highlightResult")
    private HighlightResult highlightResult;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The title
     */
    @JsonProperty("Title")
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The Title
     */
    @JsonProperty("Title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The movie
     */
    @JsonProperty("Movie")
    public String getMovie() {
        return movie;
    }

    /**
     * 
     * @param movie
     *     The Movie
     */
    @JsonProperty("Movie")
    public void setMovie(String movie) {
        this.movie = movie;
    }

    /**
     * 
     * @return
     *     The lyricsBy
     */
    @JsonProperty("Lyrics By")
    public List<String> getLyricsBy() {
        return lyricsBy;
    }

    /**
     * 
     * @param lyricsBy
     *     The Lyrics By
     */
    @JsonProperty("Lyrics By")
    public void setLyricsBy(List<String> lyricsBy) {
        this.lyricsBy = lyricsBy;
    }

    /**
     * 
     * @return
     *     The musicBy
     */
    @JsonProperty("Music By")
    public List<String> getMusicBy() {
        return musicBy;
    }

    /**
     * 
     * @param musicBy
     *     The Music By
     */
    @JsonProperty("Music By")
    public void setMusicBy(List<String> musicBy) {
        this.musicBy = musicBy;
    }

    /**
     * 
     * @return
     *     The singers
     */
    @JsonProperty("Singers")
    public List<String> getSingers() {
        return singers;
    }

    /**
     * 
     * @param singers
     *     The Singers
     */
    @JsonProperty("Singers")
    public void setSingers(List<String> singers) {
        this.singers = singers;
    }

    /**
     * 
     * @return
     *     The img
     */
    @JsonProperty("Img")
    public String getImg() {
        return img;
    }

    /**
     * 
     * @param img
     *     The Img
     */
    @JsonProperty("Img")
    public void setImg(String img) {
        this.img = img;
    }

    /**
     * 
     * @return
     *     The uRL
     */
    @JsonProperty("URL")
    public String getURL() {
        return uRL;
    }

    /**
     * 
     * @param uRL
     *     The URL
     */
    @JsonProperty("URL")
    public void setURL(String uRL) {
        this.uRL = uRL;
    }

    /**
     * 
     * @return
     *     The objectID
     */
    @JsonProperty("objectID")
    public String getObjectID() {
        return objectID;
    }

    /**
     * 
     * @param objectID
     *     The objectID
     */
    @JsonProperty("objectID")
    public void setObjectID(String objectID) {
        this.objectID = objectID;
    }

    /**
     * 
     * @return
     *     The highlightResult
     */
    @JsonProperty("_highlightResult")
    public HighlightResult getHighlightResult() {
        return highlightResult;
    }

    /**
     * 
     * @param highlightResult
     *     The _highlightResult
     */
    @JsonProperty("_highlightResult")
    public void setHighlightResult(HighlightResult highlightResult) {
        this.highlightResult = highlightResult;
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
