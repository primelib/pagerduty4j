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
 * CreateIncidentRequestIncident
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "type",
    "title",
    "service",
    "priority",
    "urgency",
    "body",
    "incident_key",
    "assignments",
    "escalation_policy",
    "conference_bridge"
})
@JsonTypeName("createIncident_request_incident")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateIncidentRequestIncident {

    @JsonProperty("type")
    private TypeEnum type;

    /**
     * A succinct description of the nature, symptoms, cause, or effect of the incident.
     */
    @JsonProperty("title")
    private String title;

    @JsonProperty("service")
    private ServiceReference service;

    @JsonProperty("priority")
    private PriorityReference priority;

    /**
     * The urgency of the incident
     */
    @JsonProperty("urgency")
    private UrgencyEnum urgency;

    @JsonProperty("body")
    private IncidentBody body;

    /**
     * A string which identifies the incident. Sending subsequent requests referencing the same service and with the same incident_key will result in those requests being rejected if an open incident matches that incident_key.
     */
    @JsonProperty("incident_key")
    private String incidentKey;

    /**
     * Assign the incident to these assignees. Cannot be specified if an escalation policy is given.
     */
    @JsonProperty("assignments")
    private List<UpdateIncidentsRequestIncidentsInnerAssignmentsInner> assignments;

    @JsonProperty("escalation_policy")
    private EscalationPolicyReference escalationPolicy;

    @JsonProperty("conference_bridge")
    private ConferenceBridge conferenceBridge;


    @AllArgsConstructor
    public enum TypeEnum {
        INCIDENT("incident");

        private final String value;
    }

    /**
     * The urgency of the incident
     */
    @AllArgsConstructor
    public enum UrgencyEnum {
        HIGH("high"),
        LOW("low");

        private final String value;
    }

}
