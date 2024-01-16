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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * HandoffNotificationRule
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
    "id",
    "notify_advance_in_minutes",
    "handoff_type",
    "contact_method"
})
@JsonTypeName("HandoffNotificationRule")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class HandoffNotificationRule {

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
    protected HandoffTypeEnum handoffType;

    @JsonProperty("contact_method")
    protected ContactMethodReference contactMethod;

    /**
     * Constructs a validated instance of {@link HandoffNotificationRule}.
     *
     * @param spec the specification to process
     */
    public HandoffNotificationRule(Consumer<HandoffNotificationRule> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link HandoffNotificationRule}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #HandoffNotificationRule(Consumer)} instead.
     * @param id id
     * @param notifyAdvanceInMinutes The delay before firing the rule, in minutes.
     * @param handoffType The type of handoff being created.
     * @param contactMethod contactMethod
     */
    @ApiStatus.Internal
    public HandoffNotificationRule(String id, Integer notifyAdvanceInMinutes, HandoffTypeEnum handoffType, ContactMethodReference contactMethod) {
        this.id = id;
        this.notifyAdvanceInMinutes = notifyAdvanceInMinutes;
        this.handoffType = handoffType;
        this.contactMethod = contactMethod;
    }

    /**
     * The type of handoff being created.
     */
    @AllArgsConstructor
    public enum HandoffTypeEnum {
        BOTH("both"),
        ONCALL("oncall"),
        OFFCALL("offcall");

        private static final HandoffTypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static HandoffTypeEnum of(String input) {
            if (input != null) {
                for (HandoffTypeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
