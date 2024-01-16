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
 * EventRuleActionsCommonSuspend
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
    "value"
})
@JsonTypeName("EventRuleActionsCommon_suspend")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EventRuleActionsCommonSuspend {

    /**
     * The amount of time to suspend the alert in seconds.
     */
    @JsonProperty("value")
    protected Integer value;

    /**
     * Constructs a validated instance of {@link EventRuleActionsCommonSuspend}.
     *
     * @param spec the specification to process
     */
    public EventRuleActionsCommonSuspend(Consumer<EventRuleActionsCommonSuspend> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link EventRuleActionsCommonSuspend}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #EventRuleActionsCommonSuspend(Consumer)} instead.
     * @param value The amount of time to suspend the alert in seconds.
     */
    @ApiStatus.Internal
    public EventRuleActionsCommonSuspend(Integer value) {
        this.value = value;
    }

}
