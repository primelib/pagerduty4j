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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * LicenseWithCounts
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
    "id",
    "description",
    "name",
    "valid_roles",
    "role_group",
    "type",
    "self",
    "html_url",
    "summary",
    "current_value",
    "allocations_available"
})
@JsonTypeName("LicenseWithCounts")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class LicenseWithCounts {

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
    protected List<String> validRoles;

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
     * How many of these Licenses are currently allocated to Users
     */
    @JsonProperty("current_value")
    protected Integer currentValue;

    /**
     * How many of these licenses are available to be allocated to a user. If this value is "null" then there is no limit on the number of allocations allowed. 
     */
    @JsonProperty("allocations_available")
    protected Integer allocationsAvailable;

    /**
     * Constructs a validated instance of {@link LicenseWithCounts}.
     *
     * @param spec the specification to process
     */
    public LicenseWithCounts(Consumer<LicenseWithCounts> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link LicenseWithCounts}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #LicenseWithCounts(Consumer)} instead.
     * @param id Uniquely identifies the resource
     * @param description Description of the License. May include the names of add-ons associated with the License, if there are any. 
     * @param name Name of the License. 
     * @param validRoles The roles a User with this License can have
     * @param roleGroup Indicates whether this License is assignable to full or stakeholder Users
     * @param type Type of object
     * @param self API URL to access the License
     * @param htmlUrl HTML URL to access the License
     * @param summary Summary of the License
     * @param currentValue How many of these Licenses are currently allocated to Users
     * @param allocationsAvailable How many of these licenses are available to be allocated to a user. If this value is "null" then there is no limit on the number of allocations allowed. 
     */
    @ApiStatus.Internal
    public LicenseWithCounts(String id, String description, String name, List<String> validRoles, RoleGroupEnum roleGroup, String type, String self, String htmlUrl, String summary, Integer currentValue, Integer allocationsAvailable) {
        this.id = id;
        this.description = description;
        this.name = name;
        this.validRoles = validRoles;
        this.roleGroup = roleGroup;
        this.type = type;
        this.self = self;
        this.htmlUrl = htmlUrl;
        this.summary = summary;
        this.currentValue = currentValue;
        this.allocationsAvailable = allocationsAvailable;
    }

    /**
     * Indicates whether this License is assignable to full or stakeholder Users
     */
    @AllArgsConstructor
    public enum RoleGroupEnum {
        FULLUSER("FullUser"),
        STAKEHOLDER("Stakeholder");

        private static final RoleGroupEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static RoleGroupEnum of(String input) {
            if (input != null) {
                for (RoleGroupEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
