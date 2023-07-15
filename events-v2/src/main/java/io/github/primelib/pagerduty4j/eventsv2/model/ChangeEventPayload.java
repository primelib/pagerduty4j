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
 * ChangeEventPayload
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "summary",
    "timestamp",
    "source",
    "custom_details"
})
@JsonTypeName("ChangeEventPayload")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ChangeEventPayload {

    /**
     * Constructs a validated implementation of {@link ChangeEventPayload}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ChangeEventPayload(Consumer<ChangeEventPayload> spec) {
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
     * The unique location of the affected system, preferably a hostname or FQDN.
     */
    @JsonProperty("source")
    protected String source;

    /**
     * Additional details about the event and affected system.
     */
    @JsonProperty("custom_details")
    protected Object customDetails;


}
