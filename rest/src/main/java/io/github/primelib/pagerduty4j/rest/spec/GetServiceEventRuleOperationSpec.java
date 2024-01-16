package io.github.primelib.pagerduty4j.rest.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import java.util.Set;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetServiceEventRuleSpec
 * <p>
 * Specification for the GetServiceEventRule operation.
 * <p>
 * Get an Event Rule from a Service
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetServiceEventRuleOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the resource.
     */
    @NotNull 
    private String id;

    /**
     * The id of the Event Rule to retrieve.
     */
    @NotNull 
    private String ruleId;

    /**
     * Constructs a validated instance of {@link GetServiceEventRuleOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetServiceEventRuleOperationSpec(Consumer<GetServiceEventRuleOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetServiceEventRuleOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the resource.
     * @param ruleId               The id of the Event Rule to retrieve.
     */
    @ApiStatus.Internal
    public GetServiceEventRuleOperationSpec(String id, String ruleId) {
        this.id = id;
        this.ruleId = ruleId;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(id, "id is a required parameter!");
        Objects.requireNonNull(ruleId, "ruleId is a required parameter!");
    }
}
