package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateScheduleOverride201ResponseInner
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "status",
    "errors",
    "override"
})
@JsonTypeName("createScheduleOverride_201_response_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateScheduleOverride201ResponseInner {

    /**
     * HTTP Status Code reflecting the result of creating this specific override, e.g. 201 for success, 400 for invalid parameters.
     */
    @JsonProperty("status")
    private BigDecimal status;

    /**
     * If present, an array of strings representing human-readable explanations for errors found.
     */
    @JsonProperty("errors")
    private List<String> errors;

    @JsonProperty("override")
    private ScheduleOverride override;


}
