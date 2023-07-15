package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ImpactAdditionalFieldsHighestImpactingPriority
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "id",
    "order"
})
@JsonTypeName("Impact_additional_fields_highest_impacting_priority")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ImpactAdditionalFieldsHighestImpactingPriority {

    @JsonProperty("id")
    private String id;

    @JsonProperty("order")
    private Integer order;


}
