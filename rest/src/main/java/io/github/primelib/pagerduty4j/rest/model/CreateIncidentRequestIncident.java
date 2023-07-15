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
 * CreateIncidentRequestIncident
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated implementation of {@link CreateIncidentRequestIncident}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateIncidentRequestIncident(Consumer<CreateIncidentRequestIncident> spec) {
        spec.accept(this);
    }

    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * A succinct description of the nature, symptoms, cause, or effect of the incident.
     */
    @JsonProperty("title")
    protected String title;

    @JsonProperty("service")
    protected ServiceReference service;

    @JsonProperty("priority")
    protected PriorityReference priority;

    /**
     * The urgency of the incident
     */
    @JsonProperty("urgency")
    protected UrgencyEnum urgency;

    @JsonProperty("body")
    protected IncidentBody body;

    /**
     * A string which identifies the incident. Sending subsequent requests referencing the same service and with the same incident_key will result in those requests being rejected if an open incident matches that incident_key.
     */
    @JsonProperty("incident_key")
    protected String incidentKey;

    /**
     * Assign the incident to these assignees. Cannot be specified if an escalation policy is given.
     */
    @JsonProperty("assignments")
    protected List<UpdateIncidentsRequestIncidentsInnerAssignmentsInner> assignments;

    @JsonProperty("escalation_policy")
    protected EscalationPolicyReference escalationPolicy;

    @JsonProperty("conference_bridge")
    protected ConferenceBridge conferenceBridge;


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
