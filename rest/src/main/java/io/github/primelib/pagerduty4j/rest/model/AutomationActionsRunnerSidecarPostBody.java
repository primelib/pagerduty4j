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
 * AutomationActionsRunnerSidecarPostBody
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "runner_type",
    "name",
    "description",
    "teams"
})
@JsonTypeName("AutomationActionsRunnerSidecarPostBody")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AutomationActionsRunnerSidecarPostBody {

    /**
     * Constructs a validated implementation of {@link AutomationActionsRunnerSidecarPostBody}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AutomationActionsRunnerSidecarPostBody(Consumer<AutomationActionsRunnerSidecarPostBody> spec) {
        spec.accept(this);
    }

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


}
