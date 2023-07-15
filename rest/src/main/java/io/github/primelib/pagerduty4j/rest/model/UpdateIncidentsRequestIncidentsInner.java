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
 * UpdateIncidentsRequestIncidentsInner
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
     * The id of the incident to update.
     */
    @JsonProperty("id")
    private String id;

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

    /**
     * The resolution for this incident if status is set to resolved.
     */
    @JsonProperty("resolution")
    private String resolution;

    /**
     * A succinct description of the nature, symptoms, cause, or effect of the incident.
     */
    @JsonProperty("title")
    private String title;

    @JsonProperty("priority")
    private PriorityReference priority;

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

}
