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
 * ImpactAdditionalFieldsHighestImpactingPriority
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
@JsonTypeName("Impact_additional_fields_highest_impacting_priority")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ImpactAdditionalFieldsHighestImpactingPriority {

    /**
     * Constructs a validated implementation of {@link ImpactAdditionalFieldsHighestImpactingPriority}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ImpactAdditionalFieldsHighestImpactingPriority(Consumer<ImpactAdditionalFieldsHighestImpactingPriority> spec) {
        spec.accept(this);
    }

    @JsonProperty("id")
    protected String id;

    @JsonProperty("order")
    protected Integer order;


}
