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
 * AutomationActionsRunnerRunbookPostBody
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
    "runbook_base_uri",
    "runbook_api_key",
    "teams"
})
@JsonTypeName("AutomationActionsRunnerRunbookPostBody")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AutomationActionsRunnerRunbookPostBody {

    @JsonProperty("runner_type")
    protected AutomationActionsRunnerTypeEnum runnerType;

    @JsonProperty("name")
    protected String name;

    @JsonProperty("description")
    protected String description;

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

    /**
     * The list of teams associated with the Runner
     */
    @JsonProperty("teams")
    protected List<TeamReference> teams;

    /**
     * Constructs a validated instance of {@link AutomationActionsRunnerRunbookPostBody}.
     *
     * @param spec the specification to process
     */
    public AutomationActionsRunnerRunbookPostBody(Consumer<AutomationActionsRunnerRunbookPostBody> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AutomationActionsRunnerRunbookPostBody}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AutomationActionsRunnerRunbookPostBody(Consumer)} instead.
     * @param runnerType runnerType
     * @param name name
     * @param description description
     * @param runbookBaseUri The base URI of the Runbook server to connect to. May only contain alphanumeric characters, periods, underscores and dashes. Specified as the subdomain portion of an RBA host, as in &amp;lt;runbook_base_uri&amp;gt;.runbook.pagerduty.cloud
     * @param runbookApiKey The API key to connect to the Runbook server with. If omitted, the previously stored value will remain unchanged
     * @param teams The list of teams associated with the Runner
     */
    @ApiStatus.Internal
    public AutomationActionsRunnerRunbookPostBody(AutomationActionsRunnerTypeEnum runnerType, String name, String description, String runbookBaseUri, String runbookApiKey, List<TeamReference> teams) {
        this.runnerType = runnerType;
        this.name = name;
        this.description = description;
        this.runbookBaseUri = runbookBaseUri;
        this.runbookApiKey = runbookApiKey;
        this.teams = teams;
    }

}
