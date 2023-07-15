package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetOutlierIncident200ResponseOutlierIncidentIncidentTemplate
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "id",
    "cluster_id",
    "mined_text"
})
@JsonTypeName("getOutlierIncident_200_response_outlier_incident_incident_template")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetOutlierIncident200ResponseOutlierIncidentIncidentTemplate {

    @JsonProperty("id")
    private String id;

    /**
     * The cluster the Incident Template pattern belongs to
     */
    @JsonProperty("cluster_id")
    private String clusterId;

    /**
     * The Incident Template mined pattern text
     */
    @JsonProperty("mined_text")
    private String minedText;


}
