package io.github.primelib.pagerduty4j.rest.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetStatusDashboardServiceImpactsByUrlSlugSpec
 * <p>
 * Specification for the GetStatusDashboardServiceImpactsByUrlSlug operation.
 * <p>
 * Get impacted Business Services for a
 * Status Dashboard by `url_slug`
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetStatusDashboardServiceImpactsByUrlSlugOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The `url_slug` for a status dashboard
     */
    @NotNull 
    private String urlSlug;

    /**
     * Provides access to additional fields such as highest priority per business service and total impacted count
     */
    @Nullable 
    private String additionalFields;

    /**
     * Constructs a validated implementation of {@link GetStatusDashboardServiceImpactsByUrlSlugOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetStatusDashboardServiceImpactsByUrlSlugOperationSpec(Consumer<GetStatusDashboardServiceImpactsByUrlSlugOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(urlSlug, "urlSlug is a required parameter!");
    }

}
