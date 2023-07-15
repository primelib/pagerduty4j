package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IncidentWorkflowTriggerAllOfPermissions
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private Boolean restricted;

    /**
     * The ID of the team whose members can manually start this Trigger. Required and allowed if and only if permissions.restricted is true.
     */
    @JsonProperty("team_id")
    private String teamId;


}
