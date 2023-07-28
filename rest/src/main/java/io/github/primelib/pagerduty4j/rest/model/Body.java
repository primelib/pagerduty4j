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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Body
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
    "contexts",
    "details"
})
@JsonTypeName("Body")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Body {

    /**
     * The type of the body.
     */
    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * Contexts to be included with the body such as links to graphs or images.
     */
    @JsonProperty("contexts")
    protected List<Context> contexts;

    /**
     * An arbitrary JSON object or string containing any data explaining the nature of the alert.
     */
    @JsonProperty("details")
    protected Object details;

    /**
     * Constructs a validated instance of {@link Body}.
     *
     * @param spec the specification to process
     */
    public Body(Consumer<Body> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Body}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Body(Consumer)} instead.
     * @param type The type of the body.
     * @param contexts Contexts to be included with the body such as links to graphs or images.
     * @param details An arbitrary JSON object or string containing any data explaining the nature of the alert.
     */
    @ApiStatus.Internal
    public Body(TypeEnum type, List<Context> contexts, Object details) {
        this.type = type;
        this.contexts = contexts;
        this.details = details;
    }

    /**
     * The type of the body.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        ALERT_BODY("alert_body");

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
