package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateCustomFieldsFieldOptionRequest
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@JsonPropertyOrder({
    "field_option"
})
@JsonTypeName("updateCustomFieldsFieldOption_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateCustomFieldsFieldOptionRequest {

    @JsonProperty("field_option")
    protected CustomFieldsEditableFieldOption fieldOption;

    /**
     * Constructs a validated instance of {@link UpdateCustomFieldsFieldOptionRequest}.
     *
     * @param spec the specification to process
     */
    public UpdateCustomFieldsFieldOptionRequest(Consumer<UpdateCustomFieldsFieldOptionRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UpdateCustomFieldsFieldOptionRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UpdateCustomFieldsFieldOptionRequest(Consumer)} instead.
     * @param fieldOption var.name
     */
    @ApiStatus.Internal
    public UpdateCustomFieldsFieldOptionRequest(CustomFieldsEditableFieldOption fieldOption) {
        this.fieldOption = fieldOption;
    }

}
