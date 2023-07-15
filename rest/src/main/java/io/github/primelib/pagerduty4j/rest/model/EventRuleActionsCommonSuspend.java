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
 * EventRuleActionsCommonSuspend
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "value"
})
@JsonTypeName("EventRuleActionsCommon_suspend")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EventRuleActionsCommonSuspend {

    /**
     * Constructs a validated implementation of {@link EventRuleActionsCommonSuspend}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public EventRuleActionsCommonSuspend(Consumer<EventRuleActionsCommonSuspend> spec) {
        spec.accept(this);
    }

    /**
     * The amount of time to suspend the alert in seconds.
     */
    @JsonProperty("value")
    protected Integer value;


}
