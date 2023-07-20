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
 * ImpactAdditionalFields
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
    "highest_impacting_priority"
})
@JsonTypeName("Impact_additional_fields")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ImpactAdditionalFields {

    @JsonProperty("highest_impacting_priority")
    protected ImpactAdditionalFieldsHighestImpactingPriority highestImpactingPriority;

    /**
     * Constructs a validated instance of {@link ImpactAdditionalFields}.
     *
     * @param spec the specification to process
     */
    public ImpactAdditionalFields(Consumer<ImpactAdditionalFields> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ImpactAdditionalFields}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ImpactAdditionalFields(Consumer)} instead.
     * @param highestImpactingPriority var.name
     */
    @ApiStatus.Internal
    public ImpactAdditionalFields(ImpactAdditionalFieldsHighestImpactingPriority highestImpactingPriority) {
        this.highestImpactingPriority = highestImpactingPriority;
    }

}
