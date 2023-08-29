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
 * EventRuleActionsCommonSeverity
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
@JsonTypeName("EventRuleActionsCommon_severity")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EventRuleActionsCommonSeverity {

    @JsonProperty("value")
    protected ValueEnum value;

    /**
     * Constructs a validated instance of {@link EventRuleActionsCommonSeverity}.
     *
     * @param spec the specification to process
     */
    public EventRuleActionsCommonSeverity(Consumer<EventRuleActionsCommonSeverity> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link EventRuleActionsCommonSeverity}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #EventRuleActionsCommonSeverity(Consumer)} instead.
     * @param value value
     */
    @ApiStatus.Internal
    public EventRuleActionsCommonSeverity(ValueEnum value) {
        this.value = value;
    }

    @AllArgsConstructor
    public enum ValueEnum {
        INFO("info"),
        WARNING("warning"),
        ERROR("error"),
        CRITICAL("critical");

        private static final ValueEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static ValueEnum of(String input) {
            if (input != null) {
                for (ValueEnum v : VALUES) {
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
