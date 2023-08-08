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
 * EventRuleActionsCommon
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

    /**
     * Constructs a validated instance of {@link EventRuleActionsCommon}.
     *
     * @param spec the specification to process
     */
    public EventRuleActionsCommon(Consumer<EventRuleActionsCommon> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link EventRuleActionsCommon}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #EventRuleActionsCommon(Consumer)} instead.
     * @param annotate annotate
     * @param eventAction eventAction
     * @param extractions Dynamically extract values to set and modify new and existing PD-CEF fields.
     * @param priority priority
     * @param severity severity
     * @param suppress suppress
     * @param suspend suspend
     */
    @ApiStatus.Internal
    public EventRuleActionsCommon(EventRuleActionsCommonAnnotate annotate, EventRuleActionsCommonEventAction eventAction, List<EventRuleActionsCommonExtractionsInner> extractions, EventRuleActionsCommonPriority priority, EventRuleActionsCommonSeverity severity, EventRuleActionsCommonSuppress suppress, EventRuleActionsCommonSuspend suspend) {
        this.annotate = annotate;
        this.eventAction = eventAction;
        this.extractions = extractions;
        this.priority = priority;
        this.severity = severity;
        this.suppress = suppress;
        this.suspend = suspend;
    }

}
