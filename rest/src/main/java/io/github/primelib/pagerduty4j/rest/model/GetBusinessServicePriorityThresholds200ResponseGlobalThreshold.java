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
 * GetBusinessServicePriorityThresholds200ResponseGlobalThreshold
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
    "id",
    "order"
})
@JsonTypeName("getBusinessServicePriorityThresholds_200_response_global_threshold")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetBusinessServicePriorityThresholds200ResponseGlobalThreshold {

    @JsonProperty("id")
    protected String id;

    @JsonProperty("order")
    protected Integer order;

    /**
     * Constructs a validated instance of {@link GetBusinessServicePriorityThresholds200ResponseGlobalThreshold}.
     *
     * @param spec the specification to process
     */
    public GetBusinessServicePriorityThresholds200ResponseGlobalThreshold(Consumer<GetBusinessServicePriorityThresholds200ResponseGlobalThreshold> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetBusinessServicePriorityThresholds200ResponseGlobalThreshold}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetBusinessServicePriorityThresholds200ResponseGlobalThreshold(Consumer)} instead.
     * @param id id
     * @param order order
     */
    @ApiStatus.Internal
    public GetBusinessServicePriorityThresholds200ResponseGlobalThreshold(String id, Integer order) {
        this.id = id;
        this.order = order;
    }

}
