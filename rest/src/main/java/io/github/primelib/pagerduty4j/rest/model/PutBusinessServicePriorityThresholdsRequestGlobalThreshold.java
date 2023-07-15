package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PutBusinessServicePriorityThresholdsRequestGlobalThreshold
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "id",
    "order"
})
@JsonTypeName("putBusinessServicePriorityThresholds_request_global_threshold")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PutBusinessServicePriorityThresholdsRequestGlobalThreshold {

    @JsonProperty("id")
    private String id;

    @JsonProperty("order")
    private BigDecimal order;


}
