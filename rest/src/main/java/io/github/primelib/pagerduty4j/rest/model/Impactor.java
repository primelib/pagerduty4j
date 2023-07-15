package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Impactor
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "id",
    "type"
})
@JsonTypeName("Impactor")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Impactor {

    @JsonProperty("id")
    private String id;

    /**
     * The kind of object that is impacting
     */
    @JsonProperty("type")
    private TypeEnum type;


    /**
     * The kind of object that is impacting
     */
    @AllArgsConstructor
    public enum TypeEnum {
        INCIDENT("incident");

        private final String value;
    }

}
