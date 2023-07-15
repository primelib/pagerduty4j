package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
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
     * Uniquely identifies the resource
     */
    @JsonProperty("id")
    private String id;

    /**
     * Description of the License. May include the names of add-ons associated with the License, if there are any. 
     */
    @JsonProperty("description")
    private String description;

    /**
     * Name of the License. 
     */
    @JsonProperty("name")
    private String name;

    /**
     * The roles a User with this License can have
     */
    @JsonProperty("valid_roles")
    private List<String> validRoles = new ArrayList<>();

    /**
     * Indicates whether this License is assignable to full or stakeholder Users
     */
    @JsonProperty("role_group")
    private RoleGroupEnum roleGroup;

    /**
     * Type of object
     */
    @JsonProperty("type")
    private String type;

    /**
     * API URL to access the License
     */
    @JsonProperty("self")
    private String self;

    /**
     * HTML URL to access the License
     */
    @JsonProperty("html_url")
    private String htmlUrl;

    /**
     * Summary of the License
     */
    @JsonProperty("summary")
    private String summary;


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
