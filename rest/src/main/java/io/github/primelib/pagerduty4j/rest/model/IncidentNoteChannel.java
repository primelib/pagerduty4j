package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IncidentNoteChannel
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "summary",
    "id",
    "type",
    "self",
    "html_url"
})
@JsonTypeName("IncidentNote_channel")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IncidentNoteChannel {

    /**
     * A string describing the source of the Note.
     */
    @JsonProperty("summary")
    private String summary;

    @JsonProperty("id")
    private String id;

    /**
     * A string that determines the schema of the object
     */
    @JsonProperty("type")
    private String type;

    /**
     * The API show URL at which the object is accessible
     */
    @JsonProperty("self")
    private String self;

    /**
     * a URL at which the entity is uniquely displayed in the Web app
     */
    @JsonProperty("html_url")
    private String htmlUrl;


}
