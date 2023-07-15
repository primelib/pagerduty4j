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
 * OrchestrationGlobalAllOfOrchestrationPath1CatchAllActionsAllOfAutomationActionsInner
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private String name;

    /**
     * The API endpoint where PagerDuty's servers will send the webhook request.
     */
    @JsonProperty("url")
    private String url;

    /**
     * When true, PagerDuty's servers will automatically send this webhook request as soon as the resulting incident is created. When false, your incident responder will be able to manually trigger the Webhook via the PagerDuty website &amp; mobile app.
     */
    @JsonProperty("auto_send")
    private Boolean autoSend = false;

    /**
     * Specify custom key/value pairs that'll be sent with the webhook request as request headers.
     */
    @JsonProperty("headers")
    private List<OrchestrationGlobalAllOfOrchestrationPath1CatchAllActionsAllOfAutomationActionsInnerHeadersInner> headers;

    /**
     * Specify custom key/value pairs that'll be included in the webhook request's JSON payload.
     */
    @JsonProperty("parameters")
    private List<OrchestrationGlobalAllOfOrchestrationPath1CatchAllActionsAllOfAutomationActionsInnerHeadersInner> parameters;


}
