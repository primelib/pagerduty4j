package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RelatedIncidentServiceDependencyBase
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "id",
    "type",
    "self"
})
@JsonTypeName("RelatedIncidentServiceDependencyBase")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RelatedIncidentServiceDependencyBase {

    /**
     * The ID of the Service referenced.
     */
    @JsonProperty("id")
    private String id;

    /**
     * The type of the related Service.
     */
    @JsonProperty("type")
    private TypeEnum type;

    /**
     * The API show URL at which the object is accessible.
     */
    @JsonProperty("self")
    private String self;


    /**
     * The type of the related Service.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        BUSINESS_SERVICE_REFERENCE("business_service_reference"),
        TECHNICAL_SERVICE_REFERENCE("technical_service_reference");

        private final String value;
    }

}
