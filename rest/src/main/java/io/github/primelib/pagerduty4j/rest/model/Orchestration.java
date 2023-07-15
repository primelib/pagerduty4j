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
 * Orchestration
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "self",
    "name",
    "description",
    "team",
    "integrations",
    "routes",
    "created_at",
    "created_by",
    "updated_at",
    "updated_by",
    "version"
})
@JsonTypeName("Orchestration")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Orchestration {

    /**
     * Constructs a validated implementation of {@link Orchestration}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Orchestration(Consumer<Orchestration> spec) {
        spec.accept(this);
    }

    /**
     * ID of the Orchestration.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The API show URL at which the object is accessible
     */
    @JsonProperty("self")
    protected String self;

    /**
     * Name of the Orchestration.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * A description of this Orchestration's purpose.
     */
    @JsonProperty("description")
    protected String description;

    @JsonProperty("team")
    protected ListEventOrchestrations200ResponseAllOfOrchestrationsInnerTeam team;

    @JsonProperty("integrations")
    protected List<OrchestrationIntegration> integrations;

    /**
     * Number of different Service Orchestration being routed to
     */
    @JsonProperty("routes")
    protected Integer routes;

    /**
     * The date the Orchestration was created at.
     */
    @JsonProperty("created_at")
    protected OffsetDateTime createdAt;

    @JsonProperty("created_by")
    protected ListEventOrchestrations200ResponseAllOfOrchestrationsInnerCreatedBy createdBy;

    /**
     * The date the Orchestration was last updated.
     */
    @JsonProperty("updated_at")
    protected OffsetDateTime updatedAt;

    @JsonProperty("updated_by")
    protected ListEventOrchestrations200ResponseAllOfOrchestrationsInnerUpdatedBy updatedBy;

    /**
     * Version of the Orchestration.
     */
    @JsonProperty("version")
    protected String version;


}
