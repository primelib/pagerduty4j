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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IncidentWorkflowAllOfTeam
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
    "id"
})
@JsonTypeName("IncidentWorkflow_allOf_team")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IncidentWorkflowAllOfTeam {

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
     * Constructs a validated instance of {@link IncidentWorkflowAllOfTeam}.
     *
     * @param spec the specification to process
     */
    public IncidentWorkflowAllOfTeam(Consumer<IncidentWorkflowAllOfTeam> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IncidentWorkflowAllOfTeam}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IncidentWorkflowAllOfTeam(Consumer)} instead.
     * @param type Type of the referenced object
     * @param id Unique identifier for the resource
     */
    @ApiStatus.Internal
    public IncidentWorkflowAllOfTeam(TypeEnum type, String id) {
        this.type = type;
        this.id = id;
    }

    /**
     * Type of the referenced object
     */
    @AllArgsConstructor
    public enum TypeEnum {
        TEAM_REFERENCE("team_reference");

        private final String value;
    }

}
