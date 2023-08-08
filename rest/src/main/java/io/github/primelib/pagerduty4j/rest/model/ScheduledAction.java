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
 * ScheduledAction
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
    "type",
    "at",
    "to_urgency"
})
@JsonTypeName("ScheduledAction")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ScheduledAction {

    /**
     * The type of schedule action. Must be set to urgency_change.
     */
    @JsonProperty("type")
    protected TypeEnum type;

    @JsonProperty("at")
    protected ScheduledActionAt at;

    /**
     * Urgency level. Must be set to high.
     */
    @JsonProperty("to_urgency")
    protected ToUrgencyEnum toUrgency;

    /**
     * Constructs a validated instance of {@link ScheduledAction}.
     *
     * @param spec the specification to process
     */
    public ScheduledAction(Consumer<ScheduledAction> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ScheduledAction}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ScheduledAction(Consumer)} instead.
     * @param type The type of schedule action. Must be set to urgency_change.
     * @param at at
     * @param toUrgency Urgency level. Must be set to high.
     */
    @ApiStatus.Internal
    public ScheduledAction(TypeEnum type, ScheduledActionAt at, ToUrgencyEnum toUrgency) {
        this.type = type;
        this.at = at;
        this.toUrgency = toUrgency;
    }

    /**
     * The type of schedule action. Must be set to urgency_change.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        URGENCY_CHANGE("urgency_change");

        private static final TypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static TypeEnum of(String input) {
            if (input != null) {
                for (TypeEnum v : VALUES) {
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

    /**
     * Urgency level. Must be set to high.
     */
    @AllArgsConstructor
    public enum ToUrgencyEnum {
        HIGH("high");

        private static final ToUrgencyEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static ToUrgencyEnum of(String input) {
            if (input != null) {
                for (ToUrgencyEnum v : VALUES) {
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
