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
 * ListStatusPageSubscriptionsSpec
 * <p>
 * Specification for the ListStatusPageSubscriptions operation.
 * <p>
 * List Status Page Subscriptions
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListStatusPageSubscriptionsOperationSpec {
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
     * This header indicates that this API endpoint is __UNDER CONSTRUCTION__ and may change at any time. You __MUST__ pass in this header with the value {@code status-pages-early-access}. Do not use this endpoint in production, as it may change!
     */
    @NotNull 
    private String X_EARLY_ACCESS;

    /**
     * Filter by Subscription status.
     */
    @Nullable 
    private String status;

    /**
     * Filter by Subscription channel.
     */
    @Nullable 
    private String channel;

    /**
     * Constructs a validated instance of {@link ListStatusPageSubscriptionsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ListStatusPageSubscriptionsOperationSpec(Consumer<ListStatusPageSubscriptionsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link ListStatusPageSubscriptionsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the resource.
     * @param X_EARLY_ACCESS       This header indicates that this API endpoint is __UNDER CONSTRUCTION__ and may change at any time. You __MUST__ pass in this header with the value {@code status-pages-early-access}. Do not use this endpoint in production, as it may change!
     * @param status               Filter by Subscription status.
     * @param channel              Filter by Subscription channel.
     */
    @ApiStatus.Internal
    public ListStatusPageSubscriptionsOperationSpec(String id, String X_EARLY_ACCESS, String status, String channel) {
        this.id = id;
        this.X_EARLY_ACCESS = X_EARLY_ACCESS;
        this.status = status;
        this.channel = channel;

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
        Objects.requireNonNull(X_EARLY_ACCESS, "X_EARLY_ACCESS is a required parameter!");
    }
}
