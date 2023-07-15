package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetBusinessServiceSupportingServiceImpacts200Response
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "limit",
    "more",
    "services",
    "additional_fields"
})
@JsonTypeName("getBusinessServiceSupportingServiceImpacts_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetBusinessServiceSupportingServiceImpacts200Response {

    /**
     * Constructs a validated implementation of {@link GetBusinessServiceSupportingServiceImpacts200Response}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetBusinessServiceSupportingServiceImpacts200Response(Consumer<GetBusinessServiceSupportingServiceImpacts200Response> spec) {
        spec.accept(this);
    }

    /**
     * Echoes limit pagination property.
     */
    @JsonProperty("limit")
    protected Integer limit;

    /**
     * Indicates if there are additional records to return
     */
    @JsonProperty("more")
    protected Boolean more;

    @JsonProperty("services")
    protected List<Impact> services;

    @JsonProperty("additional_fields")
    protected GetBusinessServiceSupportingServiceImpacts200ResponseAllOfAdditionalFields additionalFields;


}
