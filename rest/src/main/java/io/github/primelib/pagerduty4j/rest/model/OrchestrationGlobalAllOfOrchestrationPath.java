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
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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

    @JsonProperty("type")
    protected String type;

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

    /**
     * Constructs a validated instance of {@link OrchestrationGlobalAllOfOrchestrationPath}.
     *
     * @param spec the specification to process
     */
    public OrchestrationGlobalAllOfOrchestrationPath(Consumer<OrchestrationGlobalAllOfOrchestrationPath> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link OrchestrationGlobalAllOfOrchestrationPath}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #OrchestrationGlobalAllOfOrchestrationPath(Consumer)} instead.
     * @param type type
     * @param parent parent
     * @param sets Must contain at least a "start" set, but can contain any number of additional sets that are routed to by other rules to form a directional graph of rules.
     * @param catchAll catchAll
     * @param createdAt The date/time the object was created.
     * @param createdBy createdBy
     * @param updatedAt The date/time the object was last updated.
     * @param updatedBy updatedBy
     * @param version Version of these Orchestration Rules
     */
    @ApiStatus.Internal
    public OrchestrationGlobalAllOfOrchestrationPath(String type, OrchestrationGlobalAllOfOrchestrationPathParent parent, List<OrchestrationGlobalAllOfOrchestrationPathSets> sets, OrchestrationGlobalAllOfOrchestrationPathCatchAll catchAll, OffsetDateTime createdAt, OrchestrationGlobalAllOfOrchestrationPathCreatedBy createdBy, OffsetDateTime updatedAt, OrchestrationGlobalAllOfOrchestrationPathUpdatedBy updatedBy, String version) {
        this.type = type;
        this.parent = parent;
        this.sets = sets;
        this.catchAll = catchAll;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
        this.version = version;
    }

}
