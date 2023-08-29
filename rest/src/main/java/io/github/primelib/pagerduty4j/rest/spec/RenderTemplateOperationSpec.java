package io.github.primelib.pagerduty4j.rest.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.pagerduty4j.rest.model.RenderTemplateRequest;
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
 * RenderTemplateSpec
 * <p>
 * Specification for the RenderTemplate operation.
 * <p>
 * Render a template
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RenderTemplateOperationSpec {
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
     */
    @NotNull 
    private RenderTemplateRequest renderTemplateRequest;

    /**
     * Constructs a validated instance of {@link RenderTemplateOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public RenderTemplateOperationSpec(Consumer<RenderTemplateOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link RenderTemplateOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the resource.
     * @param renderTemplateRequest 
     */
    @ApiStatus.Internal
    public RenderTemplateOperationSpec(String id, RenderTemplateRequest renderTemplateRequest) {
        this.id = id;
        this.renderTemplateRequest = renderTemplateRequest;

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
        Objects.requireNonNull(renderTemplateRequest, "renderTemplateRequest is a required parameter!");
    }
}
