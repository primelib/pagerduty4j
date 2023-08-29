package io.github.primelib.pagerduty4j.rest.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.pagerduty4j.rest.model.CreateWebhookSubscriptionRequest;
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
 * CreateWebhookSubscriptionSpec
 * <p>
 * Specification for the CreateWebhookSubscription operation.
 * <p>
 * Create a webhook subscription
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateWebhookSubscriptionOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     */
    @Nullable 
    private CreateWebhookSubscriptionRequest createWebhookSubscriptionRequest;

    /**
     * Constructs a validated instance of {@link CreateWebhookSubscriptionOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateWebhookSubscriptionOperationSpec(Consumer<CreateWebhookSubscriptionOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link CreateWebhookSubscriptionOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param createWebhookSubscriptionRequest 
     */
    @ApiStatus.Internal
    public CreateWebhookSubscriptionOperationSpec(CreateWebhookSubscriptionRequest createWebhookSubscriptionRequest) {
        this.createWebhookSubscriptionRequest = createWebhookSubscriptionRequest;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
    }
}
