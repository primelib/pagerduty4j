package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.time.OffsetDateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OrchestrationGlobalAllOfOrchestrationPath
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "type",
    "parent",
    "sets",
    "catch_all",
    "created_at",
    "created_by",
    "updated_at",
    "updated_by",
    "version"
})
@JsonTypeName("OrchestrationGlobal_allOf_orchestration_path")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationGlobalAllOfOrchestrationPath {

    /**
     * Constructs a validated implementation of {@link OrchestrationGlobalAllOfOrchestrationPath}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public OrchestrationGlobalAllOfOrchestrationPath(Consumer<OrchestrationGlobalAllOfOrchestrationPath> spec) {
        spec.accept(this);
    }

    @JsonProperty("type")
    protected String type = "service";

    @JsonProperty("parent")
    protected OrchestrationGlobalAllOfOrchestrationPathParent parent;

    /**
     * Must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph of rules.
     */
    @JsonProperty("sets")
    protected List<OrchestrationGlobalAllOfOrchestrationPathSets> sets;

    @JsonProperty("catch_all")
    protected OrchestrationGlobalAllOfOrchestrationPathCatchAll catchAll;

    /**
     * The date/time the object was created.
     */
    @JsonProperty("created_at")
    protected OffsetDateTime createdAt;

    @JsonProperty("created_by")
    protected OrchestrationGlobalAllOfOrchestrationPathCreatedBy createdBy;

    /**
     * The date/time the object was last updated.
     */
    @JsonProperty("updated_at")
    protected OffsetDateTime updatedAt;

    @JsonProperty("updated_by")
    protected OrchestrationGlobalAllOfOrchestrationPathUpdatedBy updatedBy;

    /**
     * Version of these Orchestration Rules
     */
    @JsonProperty("version")
    protected String version;


}
