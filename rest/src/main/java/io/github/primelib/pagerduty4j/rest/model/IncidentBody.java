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
 * IncidentBody
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
    "details"
})
@JsonTypeName("IncidentBody")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IncidentBody {

    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * Additional incident details.
     */
    @JsonProperty("details")
    protected String details;

    /**
     * Constructs a validated instance of {@link IncidentBody}.
     *
     * @param spec the specification to process
     */
    public IncidentBody(Consumer<IncidentBody> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IncidentBody}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IncidentBody(Consumer)} instead.
     * @param type type
     * @param details Additional incident details.
     */
    @ApiStatus.Internal
    public IncidentBody(TypeEnum type, String details) {
        this.type = type;
        this.details = details;
    }

    @AllArgsConstructor
    public enum TypeEnum {
        INCIDENT_BODY("incident_body");

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

}
