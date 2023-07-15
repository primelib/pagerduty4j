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
 * IncidentAction
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "type",
    "at"
})
@JsonTypeName("IncidentAction")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IncidentAction {

    @JsonProperty("type")
    private TypeEnum type;

    @JsonProperty("at")
    private OffsetDateTime at;


    @AllArgsConstructor
    public enum TypeEnum {
        UNACKNOWLEDGE("unacknowledge"),
        ESCALATE("escalate"),
        RESOLVE("resolve"),
        URGENCY_CHANGE("urgency_change");

        private final String value;
    }

}
