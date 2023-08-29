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
 * GetStatusDashboardByUrlSlugSpec
 * <p>
 * Specification for the GetStatusDashboardByUrlSlug operation.
 * <p>
 * Get a single Status Dashboard by {@code url_slug}
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetStatusDashboardByUrlSlugOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The {@code url_slug} for a status dashboard
     */
    @NotNull 
    private String urlSlug;

    /**
     * Constructs a validated instance of {@link GetStatusDashboardByUrlSlugOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetStatusDashboardByUrlSlugOperationSpec(Consumer<GetStatusDashboardByUrlSlugOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetStatusDashboardByUrlSlugOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param urlSlug              The {@code url_slug} for a status dashboard
     */
    @ApiStatus.Internal
    public GetStatusDashboardByUrlSlugOperationSpec(String urlSlug) {
        this.urlSlug = urlSlug;

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
