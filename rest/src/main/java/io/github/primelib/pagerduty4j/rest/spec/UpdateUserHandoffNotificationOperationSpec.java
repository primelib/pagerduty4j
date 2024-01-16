package io.github.primelib.pagerduty4j.rest.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.pagerduty4j.rest.model.CreateUserHandoffNotificationRuleRequest;
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
 * UpdateUserHandoffNotificationSpec
 * <p>
 * Specification for the UpdateUserHandoffNotification operation.
 * <p>
 * Update a User's Handoff Notification Rule
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
     * Constructs a validated instance of {@link UpdateUserHandoffNotificationOperationSpec}.
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
     * Constructs a validated instance of {@link UpdateUserHandoffNotificationOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the resource.
     * @param oncallHandoffNotificationRuleId The oncall handoff notification rule ID on the user.
     * @param createUserHandoffNotificationRuleRequest The User's Handoff Notification Rule to be updated.
     */
    @ApiStatus.Internal
    public UpdateUserHandoffNotificationOperationSpec(String id, String oncallHandoffNotificationRuleId, CreateUserHandoffNotificationRuleRequest createUserHandoffNotificationRuleRequest) {
        this.id = id;
        this.oncallHandoffNotificationRuleId = oncallHandoffNotificationRuleId;
        this.createUserHandoffNotificationRuleRequest = createUserHandoffNotificationRuleRequest;

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
