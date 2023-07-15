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
 * OrchestrationGlobalAllOfOrchestrationPathUpdatedBy
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "type",
    "self"
})
@JsonTypeName("OrchestrationGlobal_allOf_orchestration_path_updated_by")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationGlobalAllOfOrchestrationPathUpdatedBy {

    /**
     * Constructs a validated implementation of {@link OrchestrationGlobalAllOfOrchestrationPathUpdatedBy}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public OrchestrationGlobalAllOfOrchestrationPathUpdatedBy(Consumer<OrchestrationGlobalAllOfOrchestrationPathUpdatedBy> spec) {
        spec.accept(this);
    }

    @JsonProperty("id")
    protected String id;

    /**
     * A string that determines the schema of the object. This must be the standard name for the entity, suffixed by `_reference` if the object is a reference.
     */
    @JsonProperty("type")
    protected String type;

    /**
     * The API show URL at which the object is accessible
     */
    @JsonProperty("self")
    protected String self;


}
