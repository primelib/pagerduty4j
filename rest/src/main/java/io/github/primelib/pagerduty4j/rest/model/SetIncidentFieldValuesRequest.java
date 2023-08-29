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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SetIncidentFieldValuesRequest
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
    "custom_fields"
})
@JsonTypeName("setIncidentFieldValues_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SetIncidentFieldValuesRequest {

    @JsonProperty("custom_fields")
    protected List<CustomFieldsEditableFieldValue> customFields;

    /**
     * Constructs a validated instance of {@link SetIncidentFieldValuesRequest}.
     *
     * @param spec the specification to process
     */
    public SetIncidentFieldValuesRequest(Consumer<SetIncidentFieldValuesRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SetIncidentFieldValuesRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SetIncidentFieldValuesRequest(Consumer)} instead.
     * @param customFields customFields
     */
    @ApiStatus.Internal
    public SetIncidentFieldValuesRequest(List<CustomFieldsEditableFieldValue> customFields) {
        this.customFields = customFields;
    }

}
