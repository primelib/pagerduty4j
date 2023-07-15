package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ScheduledActionAt
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "type",
    "name"
})
@JsonTypeName("ScheduledAction_at")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ScheduledActionAt {

    /**
     * Must be set to named_time.
     */
    @JsonProperty("type")
    private TypeEnum type;

    /**
     * Designates either the start or the end of support hours.
     */
    @JsonProperty("name")
    private NameEnum name;


    /**
     * Must be set to named_time.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        NAMED_TIME("named_time");

        private final String value;
    }

    /**
     * Designates either the start or the end of support hours.
     */
    @AllArgsConstructor
    public enum NameEnum {
        START("support_hours_start"),
        END("support_hours_end");

        private final String value;
    }

}
