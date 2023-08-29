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

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * IncidentAction
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
    "to"
})
@JsonTypeName("IncidentAction")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IncidentAction {

    @JsonProperty("type")
    protected TypeEnum type;

    @JsonProperty("at")
    protected OffsetDateTime at;

    /**
     * The urgency that the incident will change to. This field is only present when the type is {@code urgency_change}.
     */
    @JsonProperty("to")
    protected ToEnum to;

    /**
     * Constructs a validated instance of {@link IncidentAction}.
     *
     * @param spec the specification to process
     */
    public IncidentAction(Consumer<IncidentAction> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IncidentAction}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IncidentAction(Consumer)} instead.
     * @param type type
     * @param at at
     * @param to The urgency that the incident will change to. This field is only present when the type is {@code urgency_change}.
     */
    @ApiStatus.Internal
    public IncidentAction(TypeEnum type, OffsetDateTime at, ToEnum to) {
        this.type = type;
        this.at = at;
        this.to = to;
    }

    @AllArgsConstructor
    public enum TypeEnum {
        UNACKNOWLEDGE("unacknowledge"),
        ESCALATE("escalate"),
        RESOLVE("resolve"),
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
     * The urgency that the incident will change to. This field is only present when the type is {@code urgency_change}.
     */
    @AllArgsConstructor
    public enum ToEnum {
        HIGH("high");

        private static final ToEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static ToEnum of(String input) {
            if (input != null) {
                for (ToEnum v : VALUES) {
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
