package io.github.primelib.pagerduty4j.rest.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.pagerduty4j.rest.model.CreateUserHandoffNotificationRuleRequest;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * UpdateUserHandoffNotificationSpec
 * <p>
 * Specification for the UpdateUserHandoffNotification operation.
 * <p>
 * Update a User's Handoff Notification Rule
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateUserHandoffNotificationOperationSpec {
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
     * The oncall handoff notification rule ID on the user.
     */
    @NotNull 
    private String oncallHandoffNotificationRuleId;

    /**
     * The User's Handoff Notification Rule to be updated.
     */
    @Nullable 
    private CreateUserHandoffNotificationRuleRequest createUserHandoffNotificationRuleRequest;

    /**
     * Constructs a validated implementation of {@link UpdateUserHandoffNotificationOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateUserHandoffNotificationOperationSpec(Consumer<UpdateUserHandoffNotificationOperationSpec> spec) {
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
        Objects.requireNonNull(id, "id is a required parameter!");
        Objects.requireNonNull(oncallHandoffNotificationRuleId, "oncallHandoffNotificationRuleId is a required parameter!");
    }

}
