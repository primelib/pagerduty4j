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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * CreateIncidentRequestIncident
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

    /**
     * Constructs a validated instance of {@link CreateIncidentRequestIncident}.
     *
     * @param spec the specification to process
     */
    public CreateIncidentRequestIncident(Consumer<CreateIncidentRequestIncident> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateIncidentRequestIncident}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateIncidentRequestIncident(Consumer)} instead.
     * @param type var.name
     * @param title A succinct description of the nature, symptoms, cause, or effect of the incident.
     * @param service var.name
     * @param priority var.name
     * @param urgency The urgency of the incident
     * @param body var.name
     * @param incidentKey A string which identifies the incident. Sending subsequent requests referencing the same service and with the same incident_key will result in those requests being rejected if an open incident matches that incident_key.
     * @param assignments Assign the incident to these assignees. Cannot be specified if an escalation policy is given.
     * @param escalationPolicy var.name
     * @param conferenceBridge var.name
     */
    @ApiStatus.Internal
    public CreateIncidentRequestIncident(TypeEnum type, String title, ServiceReference service, PriorityReference priority, UrgencyEnum urgency, IncidentBody body, String incidentKey, List<UpdateIncidentsRequestIncidentsInnerAssignmentsInner> assignments, EscalationPolicyReference escalationPolicy, ConferenceBridge conferenceBridge) {
        this.type = type;
        this.title = title;
        this.service = service;
        this.priority = priority;
        this.urgency = urgency;
        this.body = body;
        this.incidentKey = incidentKey;
        this.assignments = assignments;
        this.escalationPolicy = escalationPolicy;
        this.conferenceBridge = conferenceBridge;
    }

    @AllArgsConstructor
    public enum TypeEnum {
        INCIDENT("incident");

        private static final TypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static TypeEnum of(String input) {
            if (input != null) {
                for (TypeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

    /**
     * The urgency of the incident
     */
    @AllArgsConstructor
    public enum UrgencyEnum {
        HIGH("high"),
        LOW("low");

        private static final UrgencyEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static UrgencyEnum of(String input) {
            if (input != null) {
                for (UrgencyEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
