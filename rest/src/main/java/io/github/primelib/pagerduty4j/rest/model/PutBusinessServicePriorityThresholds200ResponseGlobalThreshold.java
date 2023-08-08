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

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PutBusinessServicePriorityThresholds200ResponseGlobalThreshold
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
@JsonTypeName("putBusinessServicePriorityThresholds_200_response_global_threshold")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PutBusinessServicePriorityThresholds200ResponseGlobalThreshold {

    @JsonProperty("id")
    protected String id;

    @JsonProperty("order")
    protected BigDecimal order;

    /**
     * Constructs a validated instance of {@link PutBusinessServicePriorityThresholds200ResponseGlobalThreshold}.
     *
     * @param spec the specification to process
     */
    public PutBusinessServicePriorityThresholds200ResponseGlobalThreshold(Consumer<PutBusinessServicePriorityThresholds200ResponseGlobalThreshold> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PutBusinessServicePriorityThresholds200ResponseGlobalThreshold}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PutBusinessServicePriorityThresholds200ResponseGlobalThreshold(Consumer)} instead.
     * @param id id
     * @param order order
     */
    @ApiStatus.Internal
    public PutBusinessServicePriorityThresholds200ResponseGlobalThreshold(String id, BigDecimal order) {
        this.id = id;
        this.order = order;
    }

}
