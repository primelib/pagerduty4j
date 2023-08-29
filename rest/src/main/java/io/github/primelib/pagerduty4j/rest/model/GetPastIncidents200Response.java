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
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetPastIncidents200Response
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
    "past_incidents",
    "total",
    "limit"
})
@JsonTypeName("getPastIncidents_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetPastIncidents200Response {

    /**
     * Aggregate of past incidents
     */
    @JsonProperty("past_incidents")
    protected List<GetPastIncidents200ResponsePastIncidentsInner> pastIncidents;

    /**
     * The total number of Past Incidents if the total parameter was set in the request
     */
    @JsonProperty("total")
    protected BigDecimal total;

    /**
     * The maximum number of Incidents requested
     */
    @JsonProperty("limit")
    protected BigDecimal limit;

    /**
     * Constructs a validated instance of {@link GetPastIncidents200Response}.
     *
     * @param spec the specification to process
     */
    public GetPastIncidents200Response(Consumer<GetPastIncidents200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetPastIncidents200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetPastIncidents200Response(Consumer)} instead.
     * @param pastIncidents Aggregate of past incidents
     * @param total The total number of Past Incidents if the total parameter was set in the request
     * @param limit The maximum number of Incidents requested
     */
    @ApiStatus.Internal
    public GetPastIncidents200Response(List<GetPastIncidents200ResponsePastIncidentsInner> pastIncidents, BigDecimal total, BigDecimal limit) {
        this.pastIncidents = pastIncidents;
        this.total = total;
        this.limit = limit;
    }

}
