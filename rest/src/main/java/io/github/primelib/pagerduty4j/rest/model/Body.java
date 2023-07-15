package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
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
    private TypeEnum type;

    /**
     * Contexts to be included with the body such as links to graphs or images.
     */
    @JsonProperty("contexts")
    private List<Context> contexts;

    /**
     * An arbitrary JSON object or string containing any data explaining the nature of the alert.
     */
    @JsonProperty("details")
    private Object details;


    /**
     * The type of the body.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        ALERT_BODY("alert_body");

        private final String value;
    }

}
