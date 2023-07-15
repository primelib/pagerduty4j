package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetOutlierIncident200ResponseOutlierIncident
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "incident",
    "incident_template"
})
@JsonTypeName("getOutlierIncident_200_response_outlier_incident")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetOutlierIncident200ResponseOutlierIncident {

    @JsonProperty("incident")
    private Incident incident;

    @JsonProperty("incident_template")
    private GetOutlierIncident200ResponseOutlierIncidentIncidentTemplate incidentTemplate;


}
