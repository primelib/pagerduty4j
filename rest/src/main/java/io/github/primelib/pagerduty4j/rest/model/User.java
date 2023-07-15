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
 * User
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated implementation of {@link User}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public User(Consumer<User> spec) {
        spec.accept(this);
    }

    @JsonProperty("id")
    protected String id;

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
     */
    @JsonProperty("summary")
    protected String summary;

    /**
     * The type of object being created.
     */
    @JsonProperty("type")
    protected TypeEnum type = TypeEnum.USER;

    /**
     * the API show URL at which the object is accessible
     */
    @JsonProperty("self")
    protected String self;

    /**
     * a URL at which the entity is uniquely displayed in the Web app
     */
    @JsonProperty("html_url")
    protected String htmlUrl;

    /**
     * The name of the user.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The user's email address.
     */
    @JsonProperty("email")
    protected String email;

    /**
     * The preferred time zone name. If null, the account's time zone will be used.
     */
    @JsonProperty("time_zone")
    protected String timeZone;

    /**
     * The schedule color.
     */
    @JsonProperty("color")
    protected String color;

    /**
     * The user role. Account must have the `read_only_users` ability to set a user as a `read_only_user` or a `read_only_limited_user`, and must have advanced permissions abilities to set a user as `observer` or `restricted_access`.
     */
    @JsonProperty("role")
    protected RoleEnum role;

    /**
     * The URL of the user's avatar.
     */
    @JsonProperty("avatar_url")
    protected String avatarUrl;

    /**
     * The user's bio.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * If true, the user has an outstanding invitation.
     */
    @JsonProperty("invitation_sent")
    protected Boolean invitationSent;

    /**
     * The user's title.
     */
    @JsonProperty("job_title")
    protected String jobTitle;

    /**
     * The list of teams to which the user belongs. Account must have the `teams` ability to set this.
     */
    @JsonProperty("teams")
    protected List<TeamReference> teams;

    /**
     * The list of contact methods for the user.
     */
    @JsonProperty("contact_methods")
    protected List<ContactMethodReference> contactMethods;

    /**
     * The list of notification rules for the user.
     */
    @JsonProperty("notification_rules")
    protected List<NotificationRuleReference> notificationRules;

    @JsonProperty("license")
    protected UserAllOfLicense license;


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
