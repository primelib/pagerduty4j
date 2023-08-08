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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateAutomationActionsRunnerRequestRunner
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
    "name",
    "description",
    "runbook_base_uri",
    "runbook_api_key"
})
@JsonTypeName("updateAutomationActionsRunner_request_runner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateAutomationActionsRunnerRequestRunner {

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
     * Constructs a validated instance of {@link UpdateAutomationActionsRunnerRequestRunner}.
     *
     * @param spec the specification to process
     */
    public UpdateAutomationActionsRunnerRequestRunner(Consumer<UpdateAutomationActionsRunnerRequestRunner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UpdateAutomationActionsRunnerRequestRunner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UpdateAutomationActionsRunnerRequestRunner(Consumer)} instead.
     * @param name name
     * @param description description
     * @param runbookBaseUri The base URI of the Runbook server to connect to. May only contain alphanumeric characters, periods, underscores and dashes. Specified as the subdomain portion of an RBA host, as in &amp;lt;runbook_base_uri&amp;gt;.runbook.pagerduty.cloud
     * @param runbookApiKey The API key to connect to the Runbook server with. If omitted, the previously stored value will remain unchanged
     */
    @ApiStatus.Internal
    public UpdateAutomationActionsRunnerRequestRunner(String name, String description, String runbookBaseUri, String runbookApiKey) {
        this.name = name;
        this.description = description;
        this.runbookBaseUri = runbookBaseUri;
        this.runbookApiKey = runbookApiKey;
    }

}
