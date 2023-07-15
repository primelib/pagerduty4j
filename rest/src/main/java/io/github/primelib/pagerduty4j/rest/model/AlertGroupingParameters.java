package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AlertGroupingParameters
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "type",
    "config"
})
@JsonTypeName("AlertGroupingParameters")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AlertGroupingParameters {

    @JsonProperty("type")
    private TypeEnum type;

    @JsonProperty("config")
    private AlertGroupingParametersConfig config;


    @AllArgsConstructor
    public enum TypeEnum {
        TIME("time"),
        INTELLIGENT("intelligent"),
        CONTENT_BASED("content_based"),
        NULL("null");

        private final String value;
    }

}
