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
 * PutBusinessServicePriorityThresholds200ResponseGlobalThreshold
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "id",
    "order"
})
@JsonTypeName("putBusinessServicePriorityThresholds_200_response_global_threshold")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PutBusinessServicePriorityThresholds200ResponseGlobalThreshold {

    @JsonProperty("id")
    private String id;

    @JsonProperty("order")
    private BigDecimal order;


}
