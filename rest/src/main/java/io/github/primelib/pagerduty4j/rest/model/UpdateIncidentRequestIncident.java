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
 * UpdateIncidentRequestIncident
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
     * Constructs a validated instance of {@link UpdateIncidentRequestIncident}.
     *
     * @param spec the specification to process
     */
    public UpdateIncidentRequestIncident(Consumer<UpdateIncidentRequestIncident> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UpdateIncidentRequestIncident}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UpdateIncidentRequestIncident(Consumer)} instead.
     * @param type The incident type.
     * @param status The new status of the incident.
     * @param priority var.name
     * @param resolution The resolution for this incident if status is set to resolved.
     * @param title The new title of the incident.
     * @param escalationLevel Escalate the incident to this level in the escalation policy.
     * @param assignments Assign the incident to these assignees.
     * @param escalationPolicy var.name
     * @param urgency The urgency of the incident.
     * @param conferenceBridge var.name
     */
    @ApiStatus.Internal
    public UpdateIncidentRequestIncident(TypeEnum type, StatusEnum status, PriorityReference priority, String resolution, String title, Integer escalationLevel, List<UpdateIncidentsRequestIncidentsInnerAssignmentsInner> assignments, EscalationPolicyReference escalationPolicy, UrgencyEnum urgency, ConferenceBridge conferenceBridge) {
        this.type = type;
        this.status = status;
        this.priority = priority;
        this.resolution = resolution;
        this.title = title;
        this.escalationLevel = escalationLevel;
        this.assignments = assignments;
        this.escalationPolicy = escalationPolicy;
        this.urgency = urgency;
        this.conferenceBridge = conferenceBridge;
    }

    /**
     * The incident type.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        INCIDENT("incident"),
        INCIDENT_REFERENCE("incident_reference");

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
     * The new status of the incident.
     */
    @AllArgsConstructor
    public enum StatusEnum {
        RESOLVED("resolved"),
        ACKNOWLEDGED("acknowledged");

        private static final StatusEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static StatusEnum of(String input) {
            if (input != null) {
                for (StatusEnum v : VALUES) {
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
     * The urgency of the incident.
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
