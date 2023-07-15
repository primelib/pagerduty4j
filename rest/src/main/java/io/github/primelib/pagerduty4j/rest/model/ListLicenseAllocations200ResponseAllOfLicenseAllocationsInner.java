package io.github.primelib.pagerduty4j.rest.model;

import java.util.List;
import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListLicenseAllocations200ResponseAllOfLicenseAllocationsInner
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "user",
    "license",
    "allocated_at"
})
@JsonTypeName("listLicenseAllocations_200_response_allOf_license_allocations_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListLicenseAllocations200ResponseAllOfLicenseAllocationsInner {

    /**
     * Constructs a validated implementation of {@link ListLicenseAllocations200ResponseAllOfLicenseAllocationsInner}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ListLicenseAllocations200ResponseAllOfLicenseAllocationsInner(Consumer<ListLicenseAllocations200ResponseAllOfLicenseAllocationsInner> spec) {
        spec.accept(this);
    }

    @JsonProperty("user")
    protected UserReference user;

    @JsonProperty("license")
    protected ListLicenseAllocations200ResponseAllOfLicenseAllocationsInnerLicense license;

    /**
     * Indicates the date and time the License was allocated to the User
     */
    @JsonProperty("allocated_at")
    protected OffsetDateTime allocatedAt;


}
