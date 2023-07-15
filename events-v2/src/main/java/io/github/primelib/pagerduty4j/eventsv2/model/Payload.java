package io.github.primelib.pagerduty4j.eventsv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Payload
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "summary",
    "timestamp",
    "severity",
    "source",
    "component",
    "group",
    "class",
    "custom_details"
})
@JsonTypeName("Payload")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Payload {

    /**
     * Constructs a validated implementation of {@link Payload}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Payload(Consumer<Payload> spec) {
        spec.accept(this);
    }

    /**
     * A brief text summary of the event, used to generate the summaries/titles of any associated alerts.
     */
    @JsonProperty("summary")
    protected String summary;

    /**
     * The time at which the emitting tool detected or generated the event.
     */
    @JsonProperty("timestamp")
    protected OffsetDateTime timestamp;

    /**
     * The perceived severity of the status the event is describing withrespect to the affected system.
     */
    @JsonProperty("severity")
    protected SeverityEnum severity;

    /**
     * The unique location of the affected system, preferably a hostname or FQDN.
     */
    @JsonProperty("source")
    protected String source;

    /**
     * Component of the source machine that is responsible for the event.
     */
    @JsonProperty("component")
    protected String component;

    /**
     * Logical grouping of components of a service.
     */
    @JsonProperty("group")
    protected String group;

    /**
     * The class/type of the event.
     */
    @JsonProperty("class")
    protected String propertyClass;

    /**
     * Additional details about the event and affected system.
     */
    @JsonProperty("custom_details")
    protected Object customDetails;


    /**
     * The perceived severity of the status the event is describing withrespect to the affected system.
     */
    @AllArgsConstructor
    public enum SeverityEnum {
        CRITICAL("critical"),
        WARNING("warning"),
        ERROR("error"),
        INFO("info");

        private final String value;
    }

}
