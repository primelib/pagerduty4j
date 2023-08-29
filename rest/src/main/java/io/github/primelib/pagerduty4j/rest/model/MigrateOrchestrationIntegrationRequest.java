package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * MigrateOrchestrationIntegrationRequest
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
    protected String sourceId;

    /**
     * The type of of the {@code source_id} object
     */
    @JsonProperty("source_type")
    protected SourceTypeEnum sourceType;

    /**
     * The ID of the Integration you'll be moving
     */
    @JsonProperty("integration_id")
    protected String integrationId;

    /**
     * Constructs a validated instance of {@link MigrateOrchestrationIntegrationRequest}.
     *
     * @param spec the specification to process
     */
    public MigrateOrchestrationIntegrationRequest(Consumer<MigrateOrchestrationIntegrationRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link MigrateOrchestrationIntegrationRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #MigrateOrchestrationIntegrationRequest(Consumer)} instead.
     * @param sourceId The ID of the Event Orchestration you'll be moving the Integration away from
     * @param sourceType The type of of the {@code source_id} object
     * @param integrationId The ID of the Integration you'll be moving
     */
    @ApiStatus.Internal
    public MigrateOrchestrationIntegrationRequest(String sourceId, SourceTypeEnum sourceType, String integrationId) {
        this.sourceId = sourceId;
        this.sourceType = sourceType;
        this.integrationId = integrationId;
    }

    /**
     * The type of of the {@code source_id} object
     */
    @AllArgsConstructor
    public enum SourceTypeEnum {
        ORCHESTRATION("orchestration");

        private static final SourceTypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static SourceTypeEnum of(String input) {
            if (input != null) {
                for (SourceTypeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
