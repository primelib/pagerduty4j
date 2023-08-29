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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Payload
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
     * Constructs a validated instance of {@link Payload}.
     *
     * @param spec the specification to process
     */
    public Payload(Consumer<Payload> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Payload}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Payload(Consumer)} instead.
     * @param summary A brief text summary of the event, used to generate the summaries/titles of any associated alerts.
     * @param timestamp The time at which the emitting tool detected or generated the event.
     * @param severity The perceived severity of the status the event is describing withrespect to the affected system.
     * @param source The unique location of the affected system, preferably a hostname or FQDN.
     * @param component Component of the source machine that is responsible for the event.
     * @param group Logical grouping of components of a service.
     * @param propertyClass The class/type of the event.
     * @param customDetails Additional details about the event and affected system.
     */
    @ApiStatus.Internal
    public Payload(String summary, OffsetDateTime timestamp, SeverityEnum severity, String source, String component, String group, String propertyClass, Object customDetails) {
        this.summary = summary;
        this.timestamp = timestamp;
        this.severity = severity;
        this.source = source;
        this.component = component;
        this.group = group;
        this.propertyClass = propertyClass;
        this.customDetails = customDetails;
    }

    /**
     * The perceived severity of the status the event is describing withrespect to the affected system.
     */
    @AllArgsConstructor
    public enum SeverityEnum {
        CRITICAL("critical"),
        WARNING("warning"),
        ERROR("error"),
        INFO("info");

        private static final SeverityEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static SeverityEnum of(String input) {
            if (input != null) {
                for (SeverityEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
