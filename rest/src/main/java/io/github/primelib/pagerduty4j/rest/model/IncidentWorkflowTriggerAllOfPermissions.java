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
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IncidentWorkflowTriggerAllOfPermissions
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
    "restricted",
    "team_id"
})
@JsonTypeName("IncidentWorkflowTrigger_allOf_permissions")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IncidentWorkflowTriggerAllOfPermissions {

    /**
     * If true, indicates that the Trigger can only be started by authorized Users. If false, any user can start this Trigger. Applicable only to manual Triggers.
     */
    @JsonProperty("restricted")
    protected Boolean restricted;

    /**
     * The ID of the team whose members can manually start this Trigger. Required and allowed if and only if permissions.restricted is true.
     */
    @JsonProperty("team_id")
    protected String teamId;

    /**
     * Constructs a validated instance of {@link IncidentWorkflowTriggerAllOfPermissions}.
     *
     * @param spec the specification to process
     */
    public IncidentWorkflowTriggerAllOfPermissions(Consumer<IncidentWorkflowTriggerAllOfPermissions> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IncidentWorkflowTriggerAllOfPermissions}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IncidentWorkflowTriggerAllOfPermissions(Consumer)} instead.
     * @param restricted If true, indicates that the Trigger can only be started by authorized Users. If false, any user can start this Trigger. Applicable only to manual Triggers.
     * @param teamId The ID of the team whose members can manually start this Trigger. Required and allowed if and only if permissions.restricted is true.
     */
    @ApiStatus.Internal
    public IncidentWorkflowTriggerAllOfPermissions(Boolean restricted, String teamId) {
        this.restricted = restricted;
        this.teamId = teamId;
    }

}
