package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetRelatedIncidents200ResponseRelatedIncidentsInner
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "incident",
    "relationships"
})
@JsonTypeName("getRelatedIncidents_200_response_related_incidents_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetRelatedIncidents200ResponseRelatedIncidentsInner {

    @JsonProperty("incident")
    private Incident incident;

    /**
     * A list of reasons for why the Incident is considered related.
     */
    @JsonProperty("relationships")
    private List<GetRelatedIncidents200ResponseRelatedIncidentsInnerRelationshipsInner> relationships;


}
