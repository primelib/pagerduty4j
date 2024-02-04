package io.github.primelib.pagerduty4j.rest.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.pagerduty4j.rest.model.CreateStatusPagePostUpdateRequest;
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
 * UpdateStatusPagePostUpdateSpec
 * <p>
 * Specification for the UpdateStatusPagePostUpdate operation.
 * <p>
 * Update a Status Page Post Update
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateStatusPagePostUpdateOperationSpec {
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
     * The ID of the Status Page Post.
     */
    @NotNull 
    private String postId;

    /**
     * The ID of the Status Page Post Update.
     */
    @NotNull 
    private String postUpdateId;

    /**
     * This header indicates that this API endpoint is __UNDER CONSTRUCTION__ and may change at any time. You __MUST__ pass in this header with the value {@code status-pages-early-access}. Do not use this endpoint in production, as it may change!
     */
    @NotNull 
    private String X_EARLY_ACCESS;

    /**
     */
    @Nullable 
    private CreateStatusPagePostUpdateRequest createStatusPagePostUpdateRequest;

    /**
     * Constructs a validated instance of {@link UpdateStatusPagePostUpdateOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateStatusPagePostUpdateOperationSpec(Consumer<UpdateStatusPagePostUpdateOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link UpdateStatusPagePostUpdateOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the resource.
     * @param postId               The ID of the Status Page Post.
     * @param postUpdateId         The ID of the Status Page Post Update.
     * @param X_EARLY_ACCESS       This header indicates that this API endpoint is __UNDER CONSTRUCTION__ and may change at any time. You __MUST__ pass in this header with the value {@code status-pages-early-access}. Do not use this endpoint in production, as it may change!
     * @param createStatusPagePostUpdateRequest 
     */
    @ApiStatus.Internal
    public UpdateStatusPagePostUpdateOperationSpec(String id, String postId, String postUpdateId, String X_EARLY_ACCESS, CreateStatusPagePostUpdateRequest createStatusPagePostUpdateRequest) {
        this.id = id;
        this.postId = postId;
        this.postUpdateId = postUpdateId;
        this.X_EARLY_ACCESS = X_EARLY_ACCESS;
        this.createStatusPagePostUpdateRequest = createStatusPagePostUpdateRequest;

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
        Objects.requireNonNull(postId, "postId is a required parameter!");
        Objects.requireNonNull(postUpdateId, "postUpdateId is a required parameter!");
        Objects.requireNonNull(X_EARLY_ACCESS, "X_EARLY_ACCESS is a required parameter!");
    }
}
