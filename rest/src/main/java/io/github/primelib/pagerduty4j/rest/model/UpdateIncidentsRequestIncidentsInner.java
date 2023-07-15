package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateIncidentsRequestIncidentsInner
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "type",
    "status",
    "resolution",
    "title",
    "priority",
    "escalation_level",
    "assignments",
    "escalation_policy",
    "conference_bridge"
})
@JsonTypeName("updateIncidents_request_incidents_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateIncidentsRequestIncidentsInner {

    /**
     * Constructs a validated implementation of {@link UpdateIncidentsRequestIncidentsInner}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateIncidentsRequestIncidentsInner(Consumer<UpdateIncidentsRequestIncidentsInner> spec) {
        spec.accept(this);
    }

    /**
     * The id of the incident to update.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The incident type.
     */
    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * The new status of the incident.
     */
    @JsonProperty("status")
    protected StatusEnum status;

    /**
     * The resolution for this incident if status is set to resolved.
     */
    @JsonProperty("resolution")
    protected String resolution;

    /**
     * A succinct description of the nature, symptoms, cause, or effect of the incident.
     */
    @JsonProperty("title")
    protected String title;

    @JsonProperty("priority")
    protected PriorityReference priority;

    /**
     * Escalate the incident to this level in the escalation policy.
     */
    @JsonProperty("escalation_level")
    protected Integer escalationLevel;

    /**
     * Assign the incident to these assignees.
     */
    @JsonProperty("assignments")
    protected List<UpdateIncidentsRequestIncidentsInnerAssignmentsInner> assignments;

    @JsonProperty("escalation_policy")
    protected EscalationPolicyReference escalationPolicy;

    @JsonProperty("conference_bridge")
    protected ConferenceBridge conferenceBridge;


    /**
     * The incident type.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        INCIDENT("incident"),
        INCIDENT_REFERENCE("incident_reference");

        private final String value;
    }

    /**
     * The new status of the incident.
     */
    @AllArgsConstructor
    public enum StatusEnum {
        RESOLVED("resolved"),
        ACKNOWLEDGED("acknowledged");

        private final String value;
    }

}
