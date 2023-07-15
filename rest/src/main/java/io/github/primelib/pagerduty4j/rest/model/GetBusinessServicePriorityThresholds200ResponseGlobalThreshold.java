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
 * GetBusinessServicePriorityThresholds200ResponseGlobalThreshold
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "order"
})
@JsonTypeName("getBusinessServicePriorityThresholds_200_response_global_threshold")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetBusinessServicePriorityThresholds200ResponseGlobalThreshold {

    /**
     * Constructs a validated implementation of {@link GetBusinessServicePriorityThresholds200ResponseGlobalThreshold}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetBusinessServicePriorityThresholds200ResponseGlobalThreshold(Consumer<GetBusinessServicePriorityThresholds200ResponseGlobalThreshold> spec) {
        spec.accept(this);
    }

    @JsonProperty("id")
    protected String id;

    @JsonProperty("order")
    protected Integer order;


}
