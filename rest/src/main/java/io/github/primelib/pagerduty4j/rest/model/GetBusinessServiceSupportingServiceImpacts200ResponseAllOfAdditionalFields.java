package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetBusinessServiceSupportingServiceImpacts200ResponseAllOfAdditionalFields
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@JsonPropertyOrder({
    "total_impacted_count"
})
@JsonTypeName("getBusinessServiceSupportingServiceImpacts_200_response_allOf_additional_fields")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetBusinessServiceSupportingServiceImpacts200ResponseAllOfAdditionalFields {

    @JsonProperty("total_impacted_count")
    protected Integer totalImpactedCount;

    /**
     * Constructs a validated instance of {@link GetBusinessServiceSupportingServiceImpacts200ResponseAllOfAdditionalFields}.
     *
     * @param spec the specification to process
     */
    public GetBusinessServiceSupportingServiceImpacts200ResponseAllOfAdditionalFields(Consumer<GetBusinessServiceSupportingServiceImpacts200ResponseAllOfAdditionalFields> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetBusinessServiceSupportingServiceImpacts200ResponseAllOfAdditionalFields}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetBusinessServiceSupportingServiceImpacts200ResponseAllOfAdditionalFields(Consumer)} instead.
     * @param totalImpactedCount totalImpactedCount
     */
    @ApiStatus.Internal
    public GetBusinessServiceSupportingServiceImpacts200ResponseAllOfAdditionalFields(Integer totalImpactedCount) {
        this.totalImpactedCount = totalImpactedCount;
    }

}
