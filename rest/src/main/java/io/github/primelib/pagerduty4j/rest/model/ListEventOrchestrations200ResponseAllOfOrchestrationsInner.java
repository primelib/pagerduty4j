package io.github.primelib.pagerduty4j.rest.model;

import java.util.List;
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListEventOrchestrations200ResponseAllOfOrchestrationsInner
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
    "id",
    "self",
    "name",
    "description",
    "team",
    "routes",
    "created_at",
    "created_by",
    "updated_at",
    "updated_by",
    "version"
})
@JsonTypeName("listEventOrchestrations_200_response_allOf_orchestrations_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListEventOrchestrations200ResponseAllOfOrchestrationsInner {

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

    /**
     * Constructs a validated instance of {@link ListEventOrchestrations200ResponseAllOfOrchestrationsInner}.
     *
     * @param spec the specification to process
     */
    public ListEventOrchestrations200ResponseAllOfOrchestrationsInner(Consumer<ListEventOrchestrations200ResponseAllOfOrchestrationsInner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ListEventOrchestrations200ResponseAllOfOrchestrationsInner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ListEventOrchestrations200ResponseAllOfOrchestrationsInner(Consumer)} instead.
     * @param id ID of the Orchestration.
     * @param self The API show URL at which the object is accessible
     * @param name Name of the Orchestration.
     * @param description A description of this Orchestration's purpose.
     * @param team var.name
     * @param routes Number of different Service Orchestration being routed to
     * @param createdAt The date the Orchestration was created at.
     * @param createdBy var.name
     * @param updatedAt The date the Orchestration was last updated.
     * @param updatedBy var.name
     * @param version Version of the Orchestration.
     */
    @ApiStatus.Internal
    public ListEventOrchestrations200ResponseAllOfOrchestrationsInner(String id, String self, String name, String description, ListEventOrchestrations200ResponseAllOfOrchestrationsInnerTeam team, Integer routes, OffsetDateTime createdAt, ListEventOrchestrations200ResponseAllOfOrchestrationsInnerCreatedBy createdBy, OffsetDateTime updatedAt, ListEventOrchestrations200ResponseAllOfOrchestrationsInnerUpdatedBy updatedBy, String version) {
        this.id = id;
        this.self = self;
        this.name = name;
        this.description = description;
        this.team = team;
        this.routes = routes;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
        this.version = version;
    }

}
