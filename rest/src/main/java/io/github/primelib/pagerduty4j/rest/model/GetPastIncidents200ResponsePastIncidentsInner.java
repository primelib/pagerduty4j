package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetPastIncidents200ResponsePastIncidentsInner
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "incident",
    "score"
})
@JsonTypeName("getPastIncidents_200_response_past_incidents_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetPastIncidents200ResponsePastIncidentsInner {

    /**
     * Constructs a validated implementation of {@link GetPastIncidents200ResponsePastIncidentsInner}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetPastIncidents200ResponsePastIncidentsInner(Consumer<GetPastIncidents200ResponsePastIncidentsInner> spec) {
        spec.accept(this);
    }

    @JsonProperty("incident")
    protected GetPastIncidents200ResponsePastIncidentsInnerIncident incident;

    /**
     * The computed similarity score associated with the incident and parent incident 
     */
    @JsonProperty("score")
    protected BigDecimal score;


}
