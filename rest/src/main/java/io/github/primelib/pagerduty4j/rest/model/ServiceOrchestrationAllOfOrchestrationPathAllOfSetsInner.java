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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ServiceOrchestrationAllOfOrchestrationPathAllOfSetsInner
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
    "rules"
})
@JsonTypeName("ServiceOrchestration_allOf_orchestration_path_allOf_sets_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceOrchestrationAllOfOrchestrationPathAllOfSetsInner {

    @JsonProperty("rules")
    protected List<ServiceOrchestrationAllOfOrchestrationPathAllOfSetsInnerRulesInner> rules;

    /**
     * Constructs a validated instance of {@link ServiceOrchestrationAllOfOrchestrationPathAllOfSetsInner}.
     *
     * @param spec the specification to process
     */
    public ServiceOrchestrationAllOfOrchestrationPathAllOfSetsInner(Consumer<ServiceOrchestrationAllOfOrchestrationPathAllOfSetsInner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ServiceOrchestrationAllOfOrchestrationPathAllOfSetsInner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ServiceOrchestrationAllOfOrchestrationPathAllOfSetsInner(Consumer)} instead.
     * @param rules rules
     */
    @ApiStatus.Internal
    public ServiceOrchestrationAllOfOrchestrationPathAllOfSetsInner(List<ServiceOrchestrationAllOfOrchestrationPathAllOfSetsInnerRulesInner> rules) {
        this.rules = rules;
    }

}
