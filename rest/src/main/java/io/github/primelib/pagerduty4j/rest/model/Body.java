package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Body
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "type",
    "contexts",
    "details"
})
@JsonTypeName("Body")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Body {

    /**
     * Constructs a validated implementation of {@link Body}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Body(Consumer<Body> spec) {
        spec.accept(this);
    }

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
     * The type of the body.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        ALERT_BODY("alert_body");

        private final String value;
    }

}
