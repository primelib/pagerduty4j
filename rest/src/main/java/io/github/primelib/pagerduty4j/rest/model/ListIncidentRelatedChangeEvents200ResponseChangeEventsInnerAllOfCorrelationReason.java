package io.github.primelib.pagerduty4j.rest.model;

import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListIncidentRelatedChangeEvents200ResponseChangeEventsInnerAllOfCorrelationReason
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private ReasonEnum reason;


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
