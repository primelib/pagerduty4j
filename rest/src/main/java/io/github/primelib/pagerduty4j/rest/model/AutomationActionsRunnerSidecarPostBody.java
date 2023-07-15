package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
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
    private AutomationActionsRunnerTypeEnum runnerType;

    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    /**
     * The list of teams associated with the Runner
     */
    @JsonProperty("teams")
    private List<TeamReference> teams;


}
