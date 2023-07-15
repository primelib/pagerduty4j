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
 * Impactor
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "type"
})
@JsonTypeName("Impactor")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Impactor {

    /**
     * Constructs a validated implementation of {@link Impactor}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Impactor(Consumer<Impactor> spec) {
        spec.accept(this);
    }

    @JsonProperty("id")
    protected String id;

    /**
     * The kind of object that is impacting
     */
    @JsonProperty("type")
    protected TypeEnum type;


    /**
     * The kind of object that is impacting
     */
    @AllArgsConstructor
    public enum TypeEnum {
        INCIDENT("incident");

        private final String value;
    }

}
