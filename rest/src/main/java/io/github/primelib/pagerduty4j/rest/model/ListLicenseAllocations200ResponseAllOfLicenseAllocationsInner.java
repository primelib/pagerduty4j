package io.github.primelib.pagerduty4j.rest.model;

import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
@JsonPropertyOrder({
    "user",
    "license",
    "allocated_at"
})
@JsonTypeName("listLicenseAllocations_200_response_allOf_license_allocations_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListLicenseAllocations200ResponseAllOfLicenseAllocationsInner {

    @JsonProperty("user")
    private UserReference user;

    @JsonProperty("license")
    private ListLicenseAllocations200ResponseAllOfLicenseAllocationsInnerLicense license;

    /**
     * Indicates the date and time the License was allocated to the User
     */
    @JsonProperty("allocated_at")
    private OffsetDateTime allocatedAt;


}
