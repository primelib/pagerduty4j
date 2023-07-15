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
 * PushContactMethodSound
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "type",
    "file"
})
@JsonTypeName("PushContactMethodSound")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PushContactMethodSound {

    /**
     * Constructs a validated implementation of {@link PushContactMethodSound}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PushContactMethodSound(Consumer<PushContactMethodSound> spec) {
        spec.accept(this);
    }

    /**
     * The type of sound.
     */
    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * The sound file name.
     */
    @JsonProperty("file")
    protected String _file;


    /**
     * The type of sound.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        HIGH_URGENCY("alert_high_urgency"),
        LOW_URGENCY("alert_low_urgency");

        private final String value;
    }

}
