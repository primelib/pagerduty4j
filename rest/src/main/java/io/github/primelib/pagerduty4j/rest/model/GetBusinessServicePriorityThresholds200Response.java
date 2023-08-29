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
 * GetBusinessServicePriorityThresholds200Response
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
    "global_threshold"
})
@JsonTypeName("getBusinessServicePriorityThresholds_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetBusinessServicePriorityThresholds200Response {

    @JsonProperty("global_threshold")
    protected GetBusinessServicePriorityThresholds200ResponseGlobalThreshold globalThreshold;

    /**
     * Constructs a validated instance of {@link GetBusinessServicePriorityThresholds200Response}.
     *
     * @param spec the specification to process
     */
    public GetBusinessServicePriorityThresholds200Response(Consumer<GetBusinessServicePriorityThresholds200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetBusinessServicePriorityThresholds200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetBusinessServicePriorityThresholds200Response(Consumer)} instead.
     * @param globalThreshold globalThreshold
     */
    @ApiStatus.Internal
    public GetBusinessServicePriorityThresholds200Response(GetBusinessServicePriorityThresholds200ResponseGlobalThreshold globalThreshold) {
        this.globalThreshold = globalThreshold;
    }

}
