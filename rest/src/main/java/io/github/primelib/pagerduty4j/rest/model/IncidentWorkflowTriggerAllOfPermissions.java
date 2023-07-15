package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IncidentWorkflowTriggerAllOfPermissions
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "restricted",
    "team_id"
})
@JsonTypeName("IncidentWorkflowTrigger_allOf_permissions")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IncidentWorkflowTriggerAllOfPermissions {

    /**
     * Constructs a validated implementation of {@link IncidentWorkflowTriggerAllOfPermissions}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IncidentWorkflowTriggerAllOfPermissions(Consumer<IncidentWorkflowTriggerAllOfPermissions> spec) {
        spec.accept(this);
    }

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


}
