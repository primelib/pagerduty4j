package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IncidentNoteChannel
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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

    /**
     * Constructs a validated instance of {@link IncidentNoteChannel}.
     *
     * @param spec the specification to process
     */
    public IncidentNoteChannel(Consumer<IncidentNoteChannel> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IncidentNoteChannel}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IncidentNoteChannel(Consumer)} instead.
     * @param summary A string describing the source of the Note.
     * @param id id
     * @param type A string that determines the schema of the object
     * @param self The API show URL at which the object is accessible
     * @param htmlUrl a URL at which the entity is uniquely displayed in the Web app
     */
    @ApiStatus.Internal
    public IncidentNoteChannel(String summary, String id, String type, String self, String htmlUrl) {
        this.summary = summary;
        this.id = id;
        this.type = type;
        this.self = self;
        this.htmlUrl = htmlUrl;
    }

}
