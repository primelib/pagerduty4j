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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PushContactMethodSound
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
    "file"
})
@JsonTypeName("PushContactMethodSound")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PushContactMethodSound {

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
     * Constructs a validated instance of {@link PushContactMethodSound}.
     *
     * @param spec the specification to process
     */
    public PushContactMethodSound(Consumer<PushContactMethodSound> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PushContactMethodSound}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PushContactMethodSound(Consumer)} instead.
     * @param type The type of sound.
     * @param _file The sound file name.
     */
    @ApiStatus.Internal
    public PushContactMethodSound(TypeEnum type, String _file) {
        this.type = type;
        this._file = _file;
    }

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
