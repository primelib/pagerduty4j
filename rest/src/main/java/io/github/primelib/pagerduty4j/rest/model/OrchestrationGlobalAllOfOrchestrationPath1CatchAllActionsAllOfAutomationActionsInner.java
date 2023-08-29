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
 * OrchestrationGlobalAllOfOrchestrationPath1CatchAllActionsAllOfAutomationActionsInner
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
    "url",
    "auto_send",
    "headers",
    "parameters"
})
@JsonTypeName("OrchestrationGlobal_allOf_orchestration_path_1_catch_all_actions_allOf_automation_actions_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationGlobalAllOfOrchestrationPath1CatchAllActionsAllOfAutomationActionsInner {

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
    protected Boolean autoSend;

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

    /**
     * Constructs a validated instance of {@link OrchestrationGlobalAllOfOrchestrationPath1CatchAllActionsAllOfAutomationActionsInner}.
     *
     * @param spec the specification to process
     */
    public OrchestrationGlobalAllOfOrchestrationPath1CatchAllActionsAllOfAutomationActionsInner(Consumer<OrchestrationGlobalAllOfOrchestrationPath1CatchAllActionsAllOfAutomationActionsInner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link OrchestrationGlobalAllOfOrchestrationPath1CatchAllActionsAllOfAutomationActionsInner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #OrchestrationGlobalAllOfOrchestrationPath1CatchAllActionsAllOfAutomationActionsInner(Consumer)} instead.
     * @param name The name of the Webhook.
     * @param url The API endpoint where PagerDuty's servers will send the webhook request.
     * @param autoSend When true, PagerDuty's servers will automatically send this webhook request as soon as the resulting incident is created. When false, your incident responder will be able to manually trigger the Webhook via the PagerDuty website &amp; mobile app.
     * @param headers Specify custom key/value pairs that'll be sent with the webhook request as request headers.
     * @param parameters Specify custom key/value pairs that'll be included in the webhook request's JSON payload.
     */
    @ApiStatus.Internal
    public OrchestrationGlobalAllOfOrchestrationPath1CatchAllActionsAllOfAutomationActionsInner(String name, String url, Boolean autoSend, List<OrchestrationGlobalAllOfOrchestrationPath1CatchAllActionsAllOfAutomationActionsInnerHeadersInner> headers, List<OrchestrationGlobalAllOfOrchestrationPath1CatchAllActionsAllOfAutomationActionsInnerHeadersInner> parameters) {
        this.name = name;
        this.url = url;
        this.autoSend = autoSend;
        this.headers = headers;
        this.parameters = parameters;
    }

}
