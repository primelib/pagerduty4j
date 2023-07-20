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

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetPastIncidents200ResponsePastIncidentsInner
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
    "incident",
    "score"
})
@JsonTypeName("getPastIncidents_200_response_past_incidents_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetPastIncidents200ResponsePastIncidentsInner {

    @JsonProperty("incident")
    protected GetPastIncidents200ResponsePastIncidentsInnerIncident incident;

    /**
     * The computed similarity score associated with the incident and parent incident 
     */
    @JsonProperty("score")
    protected BigDecimal score;

    /**
     * Constructs a validated instance of {@link GetPastIncidents200ResponsePastIncidentsInner}.
     *
     * @param spec the specification to process
     */
    public GetPastIncidents200ResponsePastIncidentsInner(Consumer<GetPastIncidents200ResponsePastIncidentsInner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetPastIncidents200ResponsePastIncidentsInner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetPastIncidents200ResponsePastIncidentsInner(Consumer)} instead.
     * @param incident var.name
     * @param score The computed similarity score associated with the incident and parent incident 
     */
    @ApiStatus.Internal
    public GetPastIncidents200ResponsePastIncidentsInner(GetPastIncidents200ResponsePastIncidentsInnerIncident incident, BigDecimal score) {
        this.incident = incident;
        this.score = score;
    }

}
