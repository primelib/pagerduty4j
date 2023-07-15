package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AlertGroupingParameters
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "type",
    "config"
})
@JsonTypeName("AlertGroupingParameters")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AlertGroupingParameters {

    /**
     * Constructs a validated implementation of {@link AlertGroupingParameters}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AlertGroupingParameters(Consumer<AlertGroupingParameters> spec) {
        spec.accept(this);
    }

    @JsonProperty("type")
    protected TypeEnum type;

    @JsonProperty("config")
    protected AlertGroupingParametersConfig config;


    @AllArgsConstructor
    public enum TypeEnum {
        TIME("time"),
        INTELLIGENT("intelligent"),
        CONTENT_BASED("content_based"),
        NULL("null");

        private final String value;
    }

}
