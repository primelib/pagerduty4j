package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Team
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
    "description",
    "default_role"
})
@JsonTypeName("Team")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Team {

    /**
     * Constructs a validated implementation of {@link Team}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Team(Consumer<Team> spec) {
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
    protected TypeEnum type = TypeEnum.TEAM;

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
     * The name of the team.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The description of the team.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The team is private if the value is "none", or public if it is "manager" (the default permissions for a non-member of the team are either "none", or their base role up until "manager").
     */
    @JsonProperty("default_role")
    protected DefaultRoleEnum defaultRole = DefaultRoleEnum.MANAGER;


    /**
     * The type of object being created.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        TEAM("team");

        private final String value;
    }

    /**
     * The team is private if the value is "none", or public if it is "manager" (the default permissions for a non-member of the team are either "none", or their base role up until "manager").
     */
    @AllArgsConstructor
    public enum DefaultRoleEnum {
        MANAGER("manager"),
        NONE("none");

        private final String value;
    }

}
