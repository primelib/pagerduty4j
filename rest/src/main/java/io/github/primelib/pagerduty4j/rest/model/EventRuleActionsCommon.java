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
 * EventRuleActionsCommon
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "annotate",
    "event_action",
    "extractions",
    "priority",
    "severity",
    "suppress",
    "suspend"
})
@JsonTypeName("EventRuleActionsCommon")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EventRuleActionsCommon {

    /**
     * Constructs a validated implementation of {@link EventRuleActionsCommon}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public EventRuleActionsCommon(Consumer<EventRuleActionsCommon> spec) {
        spec.accept(this);
    }

    @JsonProperty("annotate")
    protected EventRuleActionsCommonAnnotate annotate;

    @JsonProperty("event_action")
    protected EventRuleActionsCommonEventAction eventAction;

    /**
     * Dynamically extract values to set and modify new and existing PD-CEF fields.
     */
    @JsonProperty("extractions")
    protected List<EventRuleActionsCommonExtractionsInner> extractions;

    @JsonProperty("priority")
    protected EventRuleActionsCommonPriority priority;

    @JsonProperty("severity")
    protected EventRuleActionsCommonSeverity severity;

    @JsonProperty("suppress")
    protected EventRuleActionsCommonSuppress suppress;

    @JsonProperty("suspend")
    protected EventRuleActionsCommonSuspend suspend;


}
