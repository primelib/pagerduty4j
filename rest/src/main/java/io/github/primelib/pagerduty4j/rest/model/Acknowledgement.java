package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Acknowledgement
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "at",
    "acknowledger"
})
@JsonTypeName("Acknowledgement")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Acknowledgement {

    /**
     * Constructs a validated implementation of {@link Acknowledgement}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Acknowledgement(Consumer<Acknowledgement> spec) {
        spec.accept(this);
    }

    /**
     * Time at which the acknowledgement was created.
     */
    @JsonProperty("at")
    protected OffsetDateTime at;

    @JsonProperty("acknowledger")
    protected AcknowledgerReference acknowledger;


}
