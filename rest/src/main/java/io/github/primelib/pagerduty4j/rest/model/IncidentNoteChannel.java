package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IncidentNoteChannel
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link IncidentNoteChannel}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IncidentNoteChannel(Consumer<IncidentNoteChannel> spec) {
        spec.accept(this);
    }

    /**
     * A string describing the source of the Note.
     */
    @JsonProperty("summary")
    protected String summary;

    @JsonProperty("id")
    protected String id;

    /**
     * A string that determines the schema of the object
     */
    @JsonProperty("type")
    protected String type;

    /**
     * The API show URL at which the object is accessible
     */
    @JsonProperty("self")
    protected String self;

    /**
     * a URL at which the entity is uniquely displayed in the Web app
     */
    @JsonProperty("html_url")
    protected String htmlUrl;


}
