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
 * GetOutlierIncident200ResponseOutlierIncident
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "incident",
    "incident_template"
})
@JsonTypeName("getOutlierIncident_200_response_outlier_incident")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetOutlierIncident200ResponseOutlierIncident {

    /**
     * Constructs a validated implementation of {@link GetOutlierIncident200ResponseOutlierIncident}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetOutlierIncident200ResponseOutlierIncident(Consumer<GetOutlierIncident200ResponseOutlierIncident> spec) {
        spec.accept(this);
    }

    @JsonProperty("incident")
    protected Incident incident;

    @JsonProperty("incident_template")
    protected GetOutlierIncident200ResponseOutlierIncidentIncidentTemplate incidentTemplate;


}
