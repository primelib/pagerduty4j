package io.github.primelib.pagerduty4j.eventsv2.model;

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

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ChangeEventPayload
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
    "timestamp",
    "source",
    "custom_details"
})
@JsonTypeName("ChangeEventPayload")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ChangeEventPayload {

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

    /**
     * Constructs a validated instance of {@link ChangeEventPayload}.
     *
     * @param spec the specification to process
     */
    public ChangeEventPayload(Consumer<ChangeEventPayload> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ChangeEventPayload}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ChangeEventPayload(Consumer)} instead.
     * @param summary A brief text summary of the event, used to generate the summaries/titles of any associated alerts.
     * @param timestamp The time at which the emitting tool detected or generated the event.
     * @param source The unique location of the affected system, preferably a hostname or FQDN.
     * @param customDetails Additional details about the event and affected system.
     */
    @ApiStatus.Internal
    public ChangeEventPayload(String summary, OffsetDateTime timestamp, String source, Object customDetails) {
        this.summary = summary;
        this.timestamp = timestamp;
        this.source = source;
        this.customDetails = customDetails;
    }

}
