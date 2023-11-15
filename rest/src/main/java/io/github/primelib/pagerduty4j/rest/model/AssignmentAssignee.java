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
 * AssignmentAssignee
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
@JsonTypeName("Assignment_assignee")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AssignmentAssignee {

    @JsonProperty("id")
    protected String id;

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to {@code name}, though it is not intended to be an identifier.
     */
    @JsonProperty("summary")
    protected String summary;

    @JsonProperty("type")
    protected TypeEnum type;

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
     * The user role. Account must have the {@code read_only_users} ability to set a user as a {@code read_only_user} or a {@code read_only_limited_user}, and must have advanced permissions abilities to set a user as {@code observer} or {@code restricted_access}.
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
     * The list of teams to which the user belongs. Account must have the {@code teams} ability to set this.
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
     * Constructs a validated instance of {@link AssignmentAssignee}.
     *
     * @param spec the specification to process
     */
    public AssignmentAssignee(Consumer<AssignmentAssignee> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AssignmentAssignee}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AssignmentAssignee(Consumer)} instead.
     * @param id id
     * @param summary A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to {@code name}, though it is not intended to be an identifier.
     * @param type type
     * @param self the API show URL at which the object is accessible
     * @param htmlUrl a URL at which the entity is uniquely displayed in the Web app
     * @param name The name of the user.
     * @param email The user's email address.
     * @param timeZone The preferred time zone name. If null, the account's time zone will be used.
     * @param color The schedule color.
     * @param role The user role. Account must have the {@code read_only_users} ability to set a user as a {@code read_only_user} or a {@code read_only_limited_user}, and must have advanced permissions abilities to set a user as {@code observer} or {@code restricted_access}.
     * @param avatarUrl The URL of the user's avatar.
     * @param description The user's bio.
     * @param invitationSent If true, the user has an outstanding invitation.
     * @param jobTitle The user's title.
     * @param teams The list of teams to which the user belongs. Account must have the {@code teams} ability to set this.
     * @param contactMethods The list of contact methods for the user.
     * @param notificationRules The list of notification rules for the user.
     * @param license license
     */
    @ApiStatus.Internal
    public AssignmentAssignee(String id, String summary, TypeEnum type, String self, String htmlUrl, String name, String email, String timeZone, String color, RoleEnum role, String avatarUrl, String description, Boolean invitationSent, String jobTitle, List<TeamReference> teams, List<ContactMethodReference> contactMethods, List<NotificationRuleReference> notificationRules, UserAllOfLicense license) {
        this.id = id;
        this.summary = summary;
        this.type = type;
        this.self = self;
        this.htmlUrl = htmlUrl;
        this.name = name;
        this.email = email;
        this.timeZone = timeZone;
        this.color = color;
        this.role = role;
        this.avatarUrl = avatarUrl;
        this.description = description;
        this.invitationSent = invitationSent;
        this.jobTitle = jobTitle;
        this.teams = teams;
        this.contactMethods = contactMethods;
        this.notificationRules = notificationRules;
        this.license = license;
    }

    @AllArgsConstructor
    public enum TypeEnum {
        USER_REFERENCE("user_reference"),
        USER("user");

        private static final TypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static TypeEnum of(String input) {
            if (input != null) {
                for (TypeEnum v : VALUES) {
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

    /**
     * The user role. Account must have the {@code read_only_users} ability to set a user as a {@code read_only_user} or a {@code read_only_limited_user}, and must have advanced permissions abilities to set a user as {@code observer} or {@code restricted_access}.
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

        private static final RoleEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static RoleEnum of(String input) {
            if (input != null) {
                for (RoleEnum v : VALUES) {
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
