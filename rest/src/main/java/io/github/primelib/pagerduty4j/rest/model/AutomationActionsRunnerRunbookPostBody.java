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
 * AutomationActionsRunnerRunbookPostBody
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private AutomationActionsRunnerTypeEnum runnerType;

    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    /**
     * The base URI of the Runbook server to connect to. May only contain alphanumeric characters, periods, underscores and dashes. Specified as the subdomain portion of an RBA host, as in &amp;lt;runbook_base_uri&amp;gt;.runbook.pagerduty.cloud
     */
    @JsonProperty("runbook_base_uri")
    private String runbookBaseUri;

    /**
     * The API key to connect to the Runbook server with. If omitted, the previously stored value will remain unchanged
     */
    @JsonProperty("runbook_api_key")
    private String runbookApiKey;

    /**
     * The list of teams associated with the Runner
     */
    @JsonProperty("teams")
    private List<TeamReference> teams;


}
