package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetBusinessServiceSupportingServiceImpacts200ResponseAllOfAdditionalFields
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "total_impacted_count"
})
@JsonTypeName("getBusinessServiceSupportingServiceImpacts_200_response_allOf_additional_fields")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetBusinessServiceSupportingServiceImpacts200ResponseAllOfAdditionalFields {

    @JsonProperty("total_impacted_count")
    private Integer totalImpactedCount;


}
