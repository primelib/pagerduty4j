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
 * UpdateIncidentRequestIncident
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "type",
    "status",
    "priority",
    "resolution",
    "title",
    "escalation_level",
    "assignments",
    "escalation_policy",
    "urgency",
    "conference_bridge"
})
@JsonTypeName("updateIncident_request_incident")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateIncidentRequestIncident {

    /**
     * Constructs a validated implementation of {@link UpdateIncidentRequestIncident}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateIncidentRequestIncident(Consumer<UpdateIncidentRequestIncident> spec) {
        spec.accept(this);
    }

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

    @JsonProperty("priority")
    protected PriorityReference priority;

    /**
     * The resolution for this incident if status is set to resolved.
     */
    @JsonProperty("resolution")
    protected String resolution;

    /**
     * The new title of the incident.
     */
    @JsonProperty("title")
    protected String title;

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

    /**
     * The urgency of the incident.
     */
    @JsonProperty("urgency")
    protected UrgencyEnum urgency;

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

    /**
     * The urgency of the incident.
     */
    @AllArgsConstructor
    public enum UrgencyEnum {
        HIGH("high"),
        LOW("low");

        private final String value;
    }

}
