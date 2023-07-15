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
 * ImpactAdditionalFields
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "highest_impacting_priority"
})
@JsonTypeName("Impact_additional_fields")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ImpactAdditionalFields {

    /**
     * Constructs a validated implementation of {@link ImpactAdditionalFields}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ImpactAdditionalFields(Consumer<ImpactAdditionalFields> spec) {
        spec.accept(this);
    }

    @JsonProperty("highest_impacting_priority")
    protected ImpactAdditionalFieldsHighestImpactingPriority highestImpactingPriority;


}
