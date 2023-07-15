package io.github.primelib.pagerduty4j.rest.model;

import java.util.List;
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
 * ListIncidentRelatedChangeEvents200ResponseChangeEventsInnerAllOfCorrelationReason
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "reason"
})
@JsonTypeName("listIncidentRelatedChangeEvents_200_response_change_events_inner_allOf_correlation_reason")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListIncidentRelatedChangeEvents200ResponseChangeEventsInnerAllOfCorrelationReason {

    /**
     * Constructs a validated implementation of {@link ListIncidentRelatedChangeEvents200ResponseChangeEventsInnerAllOfCorrelationReason}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ListIncidentRelatedChangeEvents200ResponseChangeEventsInnerAllOfCorrelationReason(Consumer<ListIncidentRelatedChangeEvents200ResponseChangeEventsInnerAllOfCorrelationReason> spec) {
        spec.accept(this);
    }

    /**
     * The reason a change event was determined to be related to the given incident.
     */
    @JsonProperty("reason")
    protected ReasonEnum reason;


    /**
     * The reason a change event was determined to be related to the given incident.
     */
    @AllArgsConstructor
    public enum ReasonEnum {
        MOST_RECENT("most_recent"),
        RELATED_SERVICE("related_service"),
        INTELLIGENT("intelligent");

        private final String value;
    }

}
