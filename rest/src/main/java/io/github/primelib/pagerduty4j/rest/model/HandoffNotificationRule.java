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
 * HandoffNotificationRule
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "notify_advance_in_minutes",
    "handoff_type",
    "contact_method"
})
@JsonTypeName("HandoffNotificationRule")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class HandoffNotificationRule {

    /**
     * Constructs a validated implementation of {@link HandoffNotificationRule}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public HandoffNotificationRule(Consumer<HandoffNotificationRule> spec) {
        spec.accept(this);
    }

    @JsonProperty("id")
    protected String id;

    /**
     * The delay before firing the rule, in minutes.
     */
    @JsonProperty("notify_advance_in_minutes")
    protected Integer notifyAdvanceInMinutes;

    /**
     * The type of handoff being created.
     */
    @JsonProperty("handoff_type")
    protected HandoffTypeEnum handoffType = HandoffTypeEnum.BOTH;

    @JsonProperty("contact_method")
    protected ContactMethodReference contactMethod;


    /**
     * The type of handoff being created.
     */
    @AllArgsConstructor
    public enum HandoffTypeEnum {
        BOTH("both"),
        ONCALL("oncall"),
        OFFCALL("offcall");

        private final String value;
    }

}
