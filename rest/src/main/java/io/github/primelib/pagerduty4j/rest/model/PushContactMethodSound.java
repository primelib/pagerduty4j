package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PushContactMethodSound
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private TypeEnum type;

    /**
     * The sound file name.
     */
    @JsonProperty("file")
    private String _file;


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
