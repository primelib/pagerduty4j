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
 * EventRuleAllOfActionsAllOfRoute
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "value"
})
@JsonTypeName("EventRule_allOf_actions_allOf_route")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EventRuleAllOfActionsAllOfRoute {

    /**
     * Constructs a validated implementation of {@link EventRuleAllOfActionsAllOfRoute}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public EventRuleAllOfActionsAllOfRoute(Consumer<EventRuleAllOfActionsAllOfRoute> spec) {
        spec.accept(this);
    }

    /**
     * The target service's ID.
     */
    @JsonProperty("value")
    protected String value;


}
