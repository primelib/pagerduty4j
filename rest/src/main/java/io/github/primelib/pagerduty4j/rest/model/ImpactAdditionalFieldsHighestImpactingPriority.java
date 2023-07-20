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
 * ImpactAdditionalFieldsHighestImpactingPriority
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
@JsonTypeName("Impact_additional_fields_highest_impacting_priority")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ImpactAdditionalFieldsHighestImpactingPriority {

    @JsonProperty("id")
    protected String id;

    @JsonProperty("order")
    protected Integer order;

    /**
     * Constructs a validated instance of {@link ImpactAdditionalFieldsHighestImpactingPriority}.
     *
     * @param spec the specification to process
     */
    public ImpactAdditionalFieldsHighestImpactingPriority(Consumer<ImpactAdditionalFieldsHighestImpactingPriority> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ImpactAdditionalFieldsHighestImpactingPriority}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ImpactAdditionalFieldsHighestImpactingPriority(Consumer)} instead.
     * @param id var.name
     * @param order var.name
     */
    @ApiStatus.Internal
    public ImpactAdditionalFieldsHighestImpactingPriority(String id, Integer order) {
        this.id = id;
        this.order = order;
    }

}
