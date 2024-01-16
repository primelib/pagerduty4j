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
import lombok.experimental.Accessors;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Acknowledgement
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
    "at",
    "acknowledger"
})
@JsonTypeName("Acknowledgement")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Acknowledgement {

    /**
     * Time at which the acknowledgement was created.
     */
    @JsonProperty("at")
    protected OffsetDateTime at;

    @JsonProperty("acknowledger")
    protected AcknowledgementAcknowledger acknowledger;

    /**
     * Constructs a validated instance of {@link Acknowledgement}.
     *
     * @param spec the specification to process
     */
    public Acknowledgement(Consumer<Acknowledgement> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Acknowledgement}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Acknowledgement(Consumer)} instead.
     * @param at Time at which the acknowledgement was created.
     * @param acknowledger acknowledger
     */
    @ApiStatus.Internal
    public Acknowledgement(OffsetDateTime at, AcknowledgementAcknowledger acknowledger) {
        this.at = at;
        this.acknowledger = acknowledger;
    }

}
