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
 * EventRuleActionsCommonSeverity
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "value"
})
@JsonTypeName("EventRuleActionsCommon_severity")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EventRuleActionsCommonSeverity {

    /**
     * Constructs a validated implementation of {@link EventRuleActionsCommonSeverity}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public EventRuleActionsCommonSeverity(Consumer<EventRuleActionsCommonSeverity> spec) {
        spec.accept(this);
    }

    @JsonProperty("value")
    protected ValueEnum value;


    @AllArgsConstructor
    public enum ValueEnum {
        INFO("info"),
        WARNING("warning"),
        ERROR("error"),
        CRITICAL("critical");

        private final String value;
    }

}
