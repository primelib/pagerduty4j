package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListLicenseAllocations200ResponseAllOfLicenseAllocationsInnerLicense
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "description",
    "name",
    "valid_roles",
    "role_group",
    "type",
    "self",
    "html_url",
    "summary"
})
@JsonTypeName("listLicenseAllocations_200_response_allOf_license_allocations_inner_license")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListLicenseAllocations200ResponseAllOfLicenseAllocationsInnerLicense {

    /**
     * Constructs a validated implementation of {@link ListLicenseAllocations200ResponseAllOfLicenseAllocationsInnerLicense}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ListLicenseAllocations200ResponseAllOfLicenseAllocationsInnerLicense(Consumer<ListLicenseAllocations200ResponseAllOfLicenseAllocationsInnerLicense> spec) {
        spec.accept(this);
    }

    /**
     * Uniquely identifies the resource
     */
    @JsonProperty("id")
    protected String id;

    /**
     * Description of the License. May include the names of add-ons associated with the License, if there are any. 
     */
    @JsonProperty("description")
    protected String description;

    /**
     * Name of the License. 
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The roles a User with this License can have
     */
    @JsonProperty("valid_roles")
    protected List<String> validRoles = new ArrayList<>();

    /**
     * Indicates whether this License is assignable to full or stakeholder Users
     */
    @JsonProperty("role_group")
    protected RoleGroupEnum roleGroup;

    /**
     * Type of object
     */
    @JsonProperty("type")
    protected String type;

    /**
     * API URL to access the License
     */
    @JsonProperty("self")
    protected String self;

    /**
     * HTML URL to access the License
     */
    @JsonProperty("html_url")
    protected String htmlUrl;

    /**
     * Summary of the License
     */
    @JsonProperty("summary")
    protected String summary;


    /**
     * Indicates whether this License is assignable to full or stakeholder Users
     */
    @AllArgsConstructor
    public enum RoleGroupEnum {
        FULLUSER("FullUser"),
        STAKEHOLDER("Stakeholder");

        private final String value;
    }

}
