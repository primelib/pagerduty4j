package io.github.primelib.pagerduty4j.rest.model;

import java.util.List;
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
 * GetUserLicense200Response
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
    "license"
})
@JsonTypeName("getUserLicense_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetUserLicense200Response {

    @JsonProperty("license")
    protected ListLicenseAllocations200ResponseAllOfLicenseAllocationsInnerLicense license;

    /**
     * Constructs a validated instance of {@link GetUserLicense200Response}.
     *
     * @param spec the specification to process
     */
    public GetUserLicense200Response(Consumer<GetUserLicense200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetUserLicense200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetUserLicense200Response(Consumer)} instead.
     * @param license license
     */
    @ApiStatus.Internal
    public GetUserLicense200Response(ListLicenseAllocations200ResponseAllOfLicenseAllocationsInnerLicense license) {
        this.license = license;
    }

}
