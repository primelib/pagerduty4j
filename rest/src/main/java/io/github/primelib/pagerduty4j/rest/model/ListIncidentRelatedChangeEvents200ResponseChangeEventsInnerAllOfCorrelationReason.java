package io.github.primelib.pagerduty4j.rest.model;

import java.util.List;
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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ListIncidentRelatedChangeEvents200ResponseChangeEventsInnerAllOfCorrelationReason
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
    "reason"
})
@JsonTypeName("listIncidentRelatedChangeEvents_200_response_change_events_inner_allOf_correlation_reason")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListIncidentRelatedChangeEvents200ResponseChangeEventsInnerAllOfCorrelationReason {

    /**
     * The reason a change event was determined to be related to the given incident.
     */
    @JsonProperty("reason")
    protected ReasonEnum reason;

    /**
     * Constructs a validated instance of {@link ListIncidentRelatedChangeEvents200ResponseChangeEventsInnerAllOfCorrelationReason}.
     *
     * @param spec the specification to process
     */
    public ListIncidentRelatedChangeEvents200ResponseChangeEventsInnerAllOfCorrelationReason(Consumer<ListIncidentRelatedChangeEvents200ResponseChangeEventsInnerAllOfCorrelationReason> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ListIncidentRelatedChangeEvents200ResponseChangeEventsInnerAllOfCorrelationReason}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ListIncidentRelatedChangeEvents200ResponseChangeEventsInnerAllOfCorrelationReason(Consumer)} instead.
     * @param reason The reason a change event was determined to be related to the given incident.
     */
    @ApiStatus.Internal
    public ListIncidentRelatedChangeEvents200ResponseChangeEventsInnerAllOfCorrelationReason(ReasonEnum reason) {
        this.reason = reason;
    }

    /**
     * The reason a change event was determined to be related to the given incident.
     */
    @AllArgsConstructor
    public enum ReasonEnum {
        MOST_RECENT("most_recent"),
        RELATED_SERVICE("related_service"),
        INTELLIGENT("intelligent");

        private static final ReasonEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static ReasonEnum of(String input) {
            if (input != null) {
                for (ReasonEnum v : VALUES) {
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
