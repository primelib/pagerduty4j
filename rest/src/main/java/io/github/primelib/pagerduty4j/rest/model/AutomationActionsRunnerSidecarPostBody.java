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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AutomationActionsRunnerSidecarPostBody
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
    "runner_type",
    "name",
    "description",
    "teams"
})
@JsonTypeName("AutomationActionsRunnerSidecarPostBody")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AutomationActionsRunnerSidecarPostBody {

    @JsonProperty("runner_type")
    protected AutomationActionsRunnerTypeEnum runnerType;

    @JsonProperty("name")
    protected String name;

    @JsonProperty("description")
    protected String description;

    /**
     * The list of teams associated with the Runner
     */
    @JsonProperty("teams")
    protected List<TeamReference> teams;

    /**
     * Constructs a validated instance of {@link AutomationActionsRunnerSidecarPostBody}.
     *
     * @param spec the specification to process
     */
    public AutomationActionsRunnerSidecarPostBody(Consumer<AutomationActionsRunnerSidecarPostBody> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AutomationActionsRunnerSidecarPostBody}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AutomationActionsRunnerSidecarPostBody(Consumer)} instead.
     * @param runnerType runnerType
     * @param name name
     * @param description description
     * @param teams The list of teams associated with the Runner
     */
    @ApiStatus.Internal
    public AutomationActionsRunnerSidecarPostBody(AutomationActionsRunnerTypeEnum runnerType, String name, String description, List<TeamReference> teams) {
        this.runnerType = runnerType;
        this.name = name;
        this.description = description;
        this.teams = teams;
    }

}
