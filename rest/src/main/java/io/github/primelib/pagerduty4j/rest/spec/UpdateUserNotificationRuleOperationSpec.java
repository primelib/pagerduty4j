package io.github.primelib.pagerduty4j.rest.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.pagerduty4j.rest.model.CreateUserNotificationRuleRequest;
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
 * UpdateUserNotificationRuleSpec
 * <p>
 * Specification for the UpdateUserNotificationRule operation.
 * <p>
 * Update a user's notification rule
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateUserNotificationRuleOperationSpec {
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
     * The notification rule ID on the user.
     */
    @NotNull 
    private String notificationRuleId;

    /**
     * The user's notification rule to be updated.
     */
    @Nullable 
    private CreateUserNotificationRuleRequest createUserNotificationRuleRequest;

    /**
     * Constructs a validated instance of {@link UpdateUserNotificationRuleOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateUserNotificationRuleOperationSpec(Consumer<UpdateUserNotificationRuleOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link UpdateUserNotificationRuleOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the resource.
     * @param notificationRuleId   The notification rule ID on the user.
     * @param createUserNotificationRuleRequest The user's notification rule to be updated.
     */
    @ApiStatus.Internal
    public UpdateUserNotificationRuleOperationSpec(String id, String notificationRuleId, CreateUserNotificationRuleRequest createUserNotificationRuleRequest) {
        this.id = id;
        this.notificationRuleId = notificationRuleId;
        this.createUserNotificationRuleRequest = createUserNotificationRuleRequest;

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
        Objects.requireNonNull(notificationRuleId, "notificationRuleId is a required parameter!");
    }
}
