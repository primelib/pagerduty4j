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
 * GetIncidentFieldValues200Response
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
@JsonTypeName("getIncidentFieldValues_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetIncidentFieldValues200Response {

    @JsonProperty("custom_fields")
    protected List<CustomFieldsFieldValue> customFields;

    /**
     * Constructs a validated instance of {@link GetIncidentFieldValues200Response}.
     *
     * @param spec the specification to process
     */
    public GetIncidentFieldValues200Response(Consumer<GetIncidentFieldValues200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetIncidentFieldValues200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetIncidentFieldValues200Response(Consumer)} instead.
     * @param customFields var.name
     */
    @ApiStatus.Internal
    public GetIncidentFieldValues200Response(List<CustomFieldsFieldValue> customFields) {
        this.customFields = customFields;
    }

}
