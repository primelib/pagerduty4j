package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
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
     * The incident type.
     */
    @JsonProperty("type")
    private TypeEnum type;

    /**
     * The new status of the incident.
     */
    @JsonProperty("status")
    private StatusEnum status;

    @JsonProperty("priority")
    private PriorityReference priority;

    /**
     * The resolution for this incident if status is set to resolved.
     */
    @JsonProperty("resolution")
    private String resolution;

    /**
     * The new title of the incident.
     */
    @JsonProperty("title")
    private String title;

    /**
     * Escalate the incident to this level in the escalation policy.
     */
    @JsonProperty("escalation_level")
    private Integer escalationLevel;

    /**
     * Assign the incident to these assignees.
     */
    @JsonProperty("assignments")
    private List<UpdateIncidentsRequestIncidentsInnerAssignmentsInner> assignments;

    @JsonProperty("escalation_policy")
    private EscalationPolicyReference escalationPolicy;

    /**
     * The urgency of the incident.
     */
    @JsonProperty("urgency")
    private UrgencyEnum urgency;

    @JsonProperty("conference_bridge")
    private ConferenceBridge conferenceBridge;


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
