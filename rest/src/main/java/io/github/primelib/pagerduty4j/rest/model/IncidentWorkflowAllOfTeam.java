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
 * IncidentWorkflowAllOfTeam
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "type",
    "id"
})
@JsonTypeName("IncidentWorkflow_allOf_team")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IncidentWorkflowAllOfTeam {

    /**
     * Constructs a validated implementation of {@link IncidentWorkflowAllOfTeam}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IncidentWorkflowAllOfTeam(Consumer<IncidentWorkflowAllOfTeam> spec) {
        spec.accept(this);
    }

    /**
     * Type of the referenced object
     */
    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * Unique identifier for the resource
     */
    @JsonProperty("id")
    protected String id;


    /**
     * Type of the referenced object
     */
    @AllArgsConstructor
    public enum TypeEnum {
        TEAM_REFERENCE("team_reference");

        private final String value;
    }

}
