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
 * MigrateOrchestrationIntegrationRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "source_id",
    "source_type",
    "integration_id"
})
@JsonTypeName("migrateOrchestrationIntegration_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MigrateOrchestrationIntegrationRequest {

    /**
     * Constructs a validated implementation of {@link MigrateOrchestrationIntegrationRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public MigrateOrchestrationIntegrationRequest(Consumer<MigrateOrchestrationIntegrationRequest> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the Event Orchestration you'll be moving the Integration away from
     */
    @JsonProperty("source_id")
    protected String sourceId;

    /**
     * The type of of the `source_id` object
     */
    @JsonProperty("source_type")
    protected SourceTypeEnum sourceType;

    /**
     * The ID of the Integration you'll be moving
     */
    @JsonProperty("integration_id")
    protected String integrationId;


    /**
     * The type of of the `source_id` object
     */
    @AllArgsConstructor
    public enum SourceTypeEnum {
        ORCHESTRATION("orchestration");

        private final String value;
    }

}
