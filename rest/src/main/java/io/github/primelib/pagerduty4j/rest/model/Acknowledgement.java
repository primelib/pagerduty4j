package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
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
    private OffsetDateTime at;

    @JsonProperty("acknowledger")
    private AcknowledgerReference acknowledger;


}
