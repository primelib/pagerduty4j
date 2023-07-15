package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * User
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "id",
    "summary",
    "type",
    "self",
    "html_url",
    "name",
    "email",
    "time_zone",
    "color",
    "role",
    "avatar_url",
    "description",
    "invitation_sent",
    "job_title",
    "teams",
    "contact_methods",
    "notification_rules",
    "license"
})
@JsonTypeName("User")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class User {

    @JsonProperty("id")
    private String id;

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
     */
    @JsonProperty("summary")
    private String summary;

    /**
     * The type of object being created.
     */
    @JsonProperty("type")
    private TypeEnum type = TypeEnum.USER;

    /**
     * the API show URL at which the object is accessible
     */
    @JsonProperty("self")
    private String self;

    /**
     * a URL at which the entity is uniquely displayed in the Web app
     */
    @JsonProperty("html_url")
    private String htmlUrl;

    /**
     * The name of the user.
     */
    @JsonProperty("name")
    private String name;

    /**
     * The user's email address.
     */
    @JsonProperty("email")
    private String email;

    /**
     * The preferred time zone name. If null, the account's time zone will be used.
     */
    @JsonProperty("time_zone")
    private String timeZone;

    /**
     * The schedule color.
     */
    @JsonProperty("color")
    private String color;

    /**
     * The user role. Account must have the `read_only_users` ability to set a user as a `read_only_user` or a `read_only_limited_user`, and must have advanced permissions abilities to set a user as `observer` or `restricted_access`.
     */
    @JsonProperty("role")
    private RoleEnum role;

    /**
     * The URL of the user's avatar.
     */
    @JsonProperty("avatar_url")
    private String avatarUrl;

    /**
     * The user's bio.
     */
    @JsonProperty("description")
    private String description;

    /**
     * If true, the user has an outstanding invitation.
     */
    @JsonProperty("invitation_sent")
    private Boolean invitationSent;

    /**
     * The user's title.
     */
    @JsonProperty("job_title")
    private String jobTitle;

    /**
     * The list of teams to which the user belongs. Account must have the `teams` ability to set this.
     */
    @JsonProperty("teams")
    private List<TeamReference> teams;

    /**
     * The list of contact methods for the user.
     */
    @JsonProperty("contact_methods")
    private List<ContactMethodReference> contactMethods;

    /**
     * The list of notification rules for the user.
     */
    @JsonProperty("notification_rules")
    private List<NotificationRuleReference> notificationRules;

    @JsonProperty("license")
    private UserAllOfLicense license;


    /**
     * The type of object being created.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        USER("user");

        private final String value;
    }

    /**
     * The user role. Account must have the `read_only_users` ability to set a user as a `read_only_user` or a `read_only_limited_user`, and must have advanced permissions abilities to set a user as `observer` or `restricted_access`.
     */
    @AllArgsConstructor
    public enum RoleEnum {
        ADMIN("admin"),
        LIMITED_USER("limited_user"),
        OBSERVER("observer"),
        OWNER("owner"),
        READ_ONLY_USER("read_only_user"),
        RESTRICTED_ACCESS("restricted_access"),
        READ_ONLY_LIMITED_USER("read_only_limited_user"),
        USER("user");

        private final String value;
    }

}
