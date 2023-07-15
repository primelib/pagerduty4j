package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
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
     * ID of the Orchestration.
     */
    @JsonProperty("id")
    private String id;

    /**
     * The API show URL at which the object is accessible
     */
    @JsonProperty("self")
    private String self;

    /**
     * Name of the Orchestration.
     */
    @JsonProperty("name")
    private String name;

    /**
     * A description of this Orchestration's purpose.
     */
    @JsonProperty("description")
    private String description;

    @JsonProperty("team")
    private ListEventOrchestrations200ResponseAllOfOrchestrationsInnerTeam team;

    @JsonProperty("integrations")
    private List<OrchestrationIntegration> integrations;

    /**
     * Number of different Service Orchestration being routed to
     */
    @JsonProperty("routes")
    private Integer routes;

    /**
     * The date the Orchestration was created at.
     */
    @JsonProperty("created_at")
    private OffsetDateTime createdAt;

    @JsonProperty("created_by")
    private ListEventOrchestrations200ResponseAllOfOrchestrationsInnerCreatedBy createdBy;

    /**
     * The date the Orchestration was last updated.
     */
    @JsonProperty("updated_at")
    private OffsetDateTime updatedAt;

    @JsonProperty("updated_by")
    private ListEventOrchestrations200ResponseAllOfOrchestrationsInnerUpdatedBy updatedBy;

    /**
     * Version of the Orchestration.
     */
    @JsonProperty("version")
    private String version;


}
