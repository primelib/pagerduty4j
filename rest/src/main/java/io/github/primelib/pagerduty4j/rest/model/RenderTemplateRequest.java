package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RenderTemplateRequest
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "incident_id",
    "status_update",
    "external"
})
@JsonTypeName("renderTemplate_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RenderTemplateRequest {

    /**
     * The incident id to render the template for
     */
    @JsonProperty("incident_id")
    private String incidentId;

    @JsonProperty("status_update")
    private StatusUpdateTemplateInputStatusUpdate statusUpdate;

    /**
     * An optional object collection that can be referenced in the template.
     */
    @JsonProperty("external")
    private Object external = null;


}
