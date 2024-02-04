package io.github.primelib.pagerduty4j.rest.spec;

import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
 * ListStatusPagesSpec
 * <p>
 * Specification for the ListStatusPages operation.
 * <p>
 * List Status Pages
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListStatusPagesOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * This header indicates that this API endpoint is __UNDER CONSTRUCTION__ and may change at any time. You __MUST__ pass in this header with the value {@code status-pages-early-access}. Do not use this endpoint in production, as it may change!
     */
    @NotNull 
    private String X_EARLY_ACCESS;

    /**
     * The type of the Status Page.
     */
    @Nullable 
    private String statusPageType;

    /**
     * Constructs a validated instance of {@link ListStatusPagesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ListStatusPagesOperationSpec(Consumer<ListStatusPagesOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link ListStatusPagesOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param X_EARLY_ACCESS       This header indicates that this API endpoint is __UNDER CONSTRUCTION__ and may change at any time. You __MUST__ pass in this header with the value {@code status-pages-early-access}. Do not use this endpoint in production, as it may change!
     * @param statusPageType       The type of the Status Page.
     */
    @ApiStatus.Internal
    public ListStatusPagesOperationSpec(String X_EARLY_ACCESS, String statusPageType) {
        this.X_EARLY_ACCESS = X_EARLY_ACCESS;
        this.statusPageType = statusPageType;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(X_EARLY_ACCESS, "X_EARLY_ACCESS is a required parameter!");
    }
}