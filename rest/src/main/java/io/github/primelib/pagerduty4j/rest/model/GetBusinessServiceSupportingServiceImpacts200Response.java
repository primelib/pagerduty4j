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
 * GetBusinessServiceSupportingServiceImpacts200Response
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
    "limit",
    "more",
    "services",
    "additional_fields"
})
@JsonTypeName("getBusinessServiceSupportingServiceImpacts_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetBusinessServiceSupportingServiceImpacts200Response {

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

    /**
     * Constructs a validated instance of {@link GetBusinessServiceSupportingServiceImpacts200Response}.
     *
     * @param spec the specification to process
     */
    public GetBusinessServiceSupportingServiceImpacts200Response(Consumer<GetBusinessServiceSupportingServiceImpacts200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetBusinessServiceSupportingServiceImpacts200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetBusinessServiceSupportingServiceImpacts200Response(Consumer)} instead.
     * @param limit Echoes limit pagination property.
     * @param more Indicates if there are additional records to return
     * @param services services
     * @param additionalFields additionalFields
     */
    @ApiStatus.Internal
    public GetBusinessServiceSupportingServiceImpacts200Response(Integer limit, Boolean more, List<Impact> services, GetBusinessServiceSupportingServiceImpacts200ResponseAllOfAdditionalFields additionalFields) {
        this.limit = limit;
        this.more = more;
        this.services = services;
        this.additionalFields = additionalFields;
    }

}
