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
 * UpdateAutomationActionsRunnerRequestRunner
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "name",
    "description",
    "runbook_base_uri",
    "runbook_api_key"
})
@JsonTypeName("updateAutomationActionsRunner_request_runner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateAutomationActionsRunnerRequestRunner {

    /**
     * Constructs a validated implementation of {@link UpdateAutomationActionsRunnerRequestRunner}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateAutomationActionsRunnerRequestRunner(Consumer<UpdateAutomationActionsRunnerRequestRunner> spec) {
        spec.accept(this);
    }

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


}
