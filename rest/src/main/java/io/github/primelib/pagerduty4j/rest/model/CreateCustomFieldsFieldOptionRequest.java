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
 * CreateCustomFieldsFieldOptionRequest
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
@JsonTypeName("createCustomFieldsFieldOption_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateCustomFieldsFieldOptionRequest {

    @JsonProperty("field_option")
    protected CustomFieldsFieldOption fieldOption;

    /**
     * Constructs a validated instance of {@link CreateCustomFieldsFieldOptionRequest}.
     *
     * @param spec the specification to process
     */
    public CreateCustomFieldsFieldOptionRequest(Consumer<CreateCustomFieldsFieldOptionRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateCustomFieldsFieldOptionRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateCustomFieldsFieldOptionRequest(Consumer)} instead.
     * @param fieldOption var.name
     */
    @ApiStatus.Internal
    public CreateCustomFieldsFieldOptionRequest(CustomFieldsFieldOption fieldOption) {
        this.fieldOption = fieldOption;
    }

}
