package io.github.primelib.pagerduty4j.rest.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.pagerduty4j.rest.model.CreateTeamNotificationSubscriptionsRequest;
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
 * CreateTeamNotificationSubscriptionsSpec
 * <p>
 * Specification for the CreateTeamNotificationSubscriptions operation.
 * <p>
 * Create Team Notification Subscriptions
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateTeamNotificationSubscriptionsOperationSpec {
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
     * The entities to subscribe to.
     */
    @Nullable 
    private CreateTeamNotificationSubscriptionsRequest createTeamNotificationSubscriptionsRequest;

    /**
     * Constructs a validated instance of {@link CreateTeamNotificationSubscriptionsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateTeamNotificationSubscriptionsOperationSpec(Consumer<CreateTeamNotificationSubscriptionsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link CreateTeamNotificationSubscriptionsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the resource.
     * @param createTeamNotificationSubscriptionsRequest The entities to subscribe to.
     */
    @ApiStatus.Internal
    public CreateTeamNotificationSubscriptionsOperationSpec(String id, CreateTeamNotificationSubscriptionsRequest createTeamNotificationSubscriptionsRequest) {
        this.id = id;
        this.createTeamNotificationSubscriptionsRequest = createTeamNotificationSubscriptionsRequest;

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
