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

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListLicenseAllocations200ResponseAllOfLicenseAllocationsInner
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
    "user",
    "license",
    "allocated_at"
})
@JsonTypeName("listLicenseAllocations_200_response_allOf_license_allocations_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListLicenseAllocations200ResponseAllOfLicenseAllocationsInner {

    @JsonProperty("user")
    protected UserReference user;

    @JsonProperty("license")
    protected ListLicenseAllocations200ResponseAllOfLicenseAllocationsInnerLicense license;

    /**
     * Indicates the date and time the License was allocated to the User
     */
    @JsonProperty("allocated_at")
    protected OffsetDateTime allocatedAt;

    /**
     * Constructs a validated instance of {@link ListLicenseAllocations200ResponseAllOfLicenseAllocationsInner}.
     *
     * @param spec the specification to process
     */
    public ListLicenseAllocations200ResponseAllOfLicenseAllocationsInner(Consumer<ListLicenseAllocations200ResponseAllOfLicenseAllocationsInner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ListLicenseAllocations200ResponseAllOfLicenseAllocationsInner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ListLicenseAllocations200ResponseAllOfLicenseAllocationsInner(Consumer)} instead.
     * @param user user
     * @param license license
     * @param allocatedAt Indicates the date and time the License was allocated to the User
     */
    @ApiStatus.Internal
    public ListLicenseAllocations200ResponseAllOfLicenseAllocationsInner(UserReference user, ListLicenseAllocations200ResponseAllOfLicenseAllocationsInnerLicense license, OffsetDateTime allocatedAt) {
        this.user = user;
        this.license = license;
        this.allocatedAt = allocatedAt;
    }

}
