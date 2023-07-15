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
 * CreateAutomationActionsRunnerRequestRunner
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
    "teams",
    "runbook_base_uri",
    "runbook_api_key"
})
@JsonTypeName("createAutomationActionsRunner_request_runner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateAutomationActionsRunnerRequestRunner {

    /**
     * Constructs a validated implementation of {@link CreateAutomationActionsRunnerRequestRunner}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateAutomationActionsRunnerRequestRunner(Consumer<CreateAutomationActionsRunnerRequestRunner> spec) {
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

    /**
     * The base URI of the Runbook server to connect to. May only contain alphanumeric characters, periods, underscores and dashes. Specified as the subdomain portion of an RBA host, as in &amp;lt;runbook_base_uri&amp;gt;.runbook.pagerduty.cloud
     */
    @JsonProperty("runbook_base_uri")
    protected String runbookBaseUri;

    /**
     * The API key to connect to the Runbook server with. If omitted, the previously stored value will remain unchanged
     */
    @JsonProperty("runbook_api_key")
    protected String runbookApiKey;


}
