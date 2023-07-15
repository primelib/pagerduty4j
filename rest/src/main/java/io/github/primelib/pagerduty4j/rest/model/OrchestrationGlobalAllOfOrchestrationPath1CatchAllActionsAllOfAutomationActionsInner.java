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
 * OrchestrationGlobalAllOfOrchestrationPath1CatchAllActionsAllOfAutomationActionsInner
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "name",
    "url",
    "auto_send",
    "headers",
    "parameters"
})
@JsonTypeName("OrchestrationGlobal_allOf_orchestration_path_1_catch_all_actions_allOf_automation_actions_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationGlobalAllOfOrchestrationPath1CatchAllActionsAllOfAutomationActionsInner {

    /**
     * Constructs a validated implementation of {@link OrchestrationGlobalAllOfOrchestrationPath1CatchAllActionsAllOfAutomationActionsInner}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public OrchestrationGlobalAllOfOrchestrationPath1CatchAllActionsAllOfAutomationActionsInner(Consumer<OrchestrationGlobalAllOfOrchestrationPath1CatchAllActionsAllOfAutomationActionsInner> spec) {
        spec.accept(this);
    }

    /**
     * The name of the Webhook.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The API endpoint where PagerDuty's servers will send the webhook request.
     */
    @JsonProperty("url")
    protected String url;

    /**
     * When true, PagerDuty's servers will automatically send this webhook request as soon as the resulting incident is created. When false, your incident responder will be able to manually trigger the Webhook via the PagerDuty website &amp; mobile app.
     */
    @JsonProperty("auto_send")
    protected Boolean autoSend = false;

    /**
     * Specify custom key/value pairs that'll be sent with the webhook request as request headers.
     */
    @JsonProperty("headers")
    protected List<OrchestrationGlobalAllOfOrchestrationPath1CatchAllActionsAllOfAutomationActionsInnerHeadersInner> headers;

    /**
     * Specify custom key/value pairs that'll be included in the webhook request's JSON payload.
     */
    @JsonProperty("parameters")
    protected List<OrchestrationGlobalAllOfOrchestrationPath1CatchAllActionsAllOfAutomationActionsInnerHeadersInner> parameters;


}
