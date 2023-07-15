package io.github.primelib.pagerduty4j.rest.model;

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
 * GetPausedIncidentReportCounts200Response
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "paused_incident_reporting_counts"
})
@JsonTypeName("getPausedIncidentReportCounts_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetPausedIncidentReportCounts200Response {

    /**
     * Constructs a validated implementation of {@link GetPausedIncidentReportCounts200Response}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetPausedIncidentReportCounts200Response(Consumer<GetPausedIncidentReportCounts200Response> spec) {
        spec.accept(this);
    }

    @JsonProperty("paused_incident_reporting_counts")
    protected GetPausedIncidentReportCounts200ResponsePausedIncidentReportingCounts pausedIncidentReportingCounts;


}
