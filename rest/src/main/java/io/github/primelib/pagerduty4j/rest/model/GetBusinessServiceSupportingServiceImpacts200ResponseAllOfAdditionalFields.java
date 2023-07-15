package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetBusinessServiceSupportingServiceImpacts200ResponseAllOfAdditionalFields
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "total_impacted_count"
})
@JsonTypeName("getBusinessServiceSupportingServiceImpacts_200_response_allOf_additional_fields")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetBusinessServiceSupportingServiceImpacts200ResponseAllOfAdditionalFields {

    /**
     * Constructs a validated implementation of {@link GetBusinessServiceSupportingServiceImpacts200ResponseAllOfAdditionalFields}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetBusinessServiceSupportingServiceImpacts200ResponseAllOfAdditionalFields(Consumer<GetBusinessServiceSupportingServiceImpacts200ResponseAllOfAdditionalFields> spec) {
        spec.accept(this);
    }

    @JsonProperty("total_impacted_count")
    protected Integer totalImpactedCount;


}
