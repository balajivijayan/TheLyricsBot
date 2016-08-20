
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
    "Title",
    "Movie"
})
public class HighlightResult {

    @JsonProperty("Title")
    private Title title;
    @JsonProperty("Movie")
    private Movie movie;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The title
     */
    @JsonProperty("Title")
    public Title getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The Title
     */
    @JsonProperty("Title")
    public void setTitle(Title title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The movie
     */
    @JsonProperty("Movie")
    public Movie getMovie() {
        return movie;
    }

    /**
     * 
     * @param movie
     *     The Movie
     */
    @JsonProperty("Movie")
    public void setMovie(Movie movie) {
        this.movie = movie;
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
