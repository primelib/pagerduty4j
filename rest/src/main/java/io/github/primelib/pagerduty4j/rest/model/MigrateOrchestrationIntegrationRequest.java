package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MigrateOrchestrationIntegrationRequest
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "source_id",
    "source_type",
    "integration_id"
})
@JsonTypeName("migrateOrchestrationIntegration_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MigrateOrchestrationIntegrationRequest {

    /**
     * The ID of the Event Orchestration you'll be moving the Integration away from
     */
    @JsonProperty("source_id")
    private String sourceId;

    /**
     * The type of of the `source_id` object
     */
    @JsonProperty("source_type")
    private SourceTypeEnum sourceType;

    /**
     * The ID of the Integration you'll be moving
     */
    @JsonProperty("integration_id")
    private String integrationId;


    /**
     * The type of of the `source_id` object
     */
    @AllArgsConstructor
    public enum SourceTypeEnum {
        ORCHESTRATION("orchestration");

        private final String value;
    }

}
