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
 * ListOrchestrationIntegrations200Response
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "integrations",
    "total"
})
@JsonTypeName("listOrchestrationIntegrations_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListOrchestrationIntegrations200Response {

    @JsonProperty("integrations")
    private List<OrchestrationIntegration> integrations;

    /**
     * The total number of records matching the given query.
     */
    @JsonProperty("total")
    private Integer total;


}
