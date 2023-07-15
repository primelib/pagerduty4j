package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IncidentNote
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "id",
    "user",
    "channel",
    "content",
    "created_at"
})
@JsonTypeName("IncidentNote")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IncidentNote {

    @JsonProperty("id")
    private String id;

    @JsonProperty("user")
    private IncidentNoteUser user;

    @JsonProperty("channel")
    private IncidentNoteChannel channel;

    /**
     * The note content
     */
    @JsonProperty("content")
    private String content;

    /**
     * The time at which the note was submitted
     */
    @JsonProperty("created_at")
    private OffsetDateTime createdAt;


}
