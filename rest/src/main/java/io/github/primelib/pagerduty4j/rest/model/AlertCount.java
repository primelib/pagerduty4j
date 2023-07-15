package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AlertCount
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "triggered",
    "resolved",
    "all"
})
@JsonTypeName("AlertCount")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AlertCount {

    /**
     * The count of triggered alerts
     */
    @JsonProperty("triggered")
    private Integer triggered;

    /**
     * The count of resolved alerts
     */
    @JsonProperty("resolved")
    private Integer resolved;

    /**
     * The total count of alerts
     */
    @JsonProperty("all")
    private Integer all;


}
