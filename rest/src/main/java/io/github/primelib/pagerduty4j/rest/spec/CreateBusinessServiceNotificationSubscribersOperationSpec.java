package io.github.primelib.pagerduty4j.rest.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.pagerduty4j.rest.model.CreateBusinessServiceNotificationSubscribersRequest;
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
 * CreateBusinessServiceNotificationSubscribersSpec
 * <p>
 * Specification for the CreateBusinessServiceNotificationSubscribers operation.
 * <p>
 * Create Business Service Subscribers
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateBusinessServiceNotificationSubscribersOperationSpec {
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
     * The entities to subscribe.
     */
    @Nullable 
    private CreateBusinessServiceNotificationSubscribersRequest createBusinessServiceNotificationSubscribersRequest;

    /**
     * Constructs a validated instance of {@link CreateBusinessServiceNotificationSubscribersOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateBusinessServiceNotificationSubscribersOperationSpec(Consumer<CreateBusinessServiceNotificationSubscribersOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link CreateBusinessServiceNotificationSubscribersOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the resource.
     * @param createBusinessServiceNotificationSubscribersRequest The entities to subscribe.
     */
    @ApiStatus.Internal
    public CreateBusinessServiceNotificationSubscribersOperationSpec(String id, CreateBusinessServiceNotificationSubscribersRequest createBusinessServiceNotificationSubscribersRequest) {
        this.id = id;
        this.createBusinessServiceNotificationSubscribersRequest = createBusinessServiceNotificationSubscribersRequest;

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
    }
}
