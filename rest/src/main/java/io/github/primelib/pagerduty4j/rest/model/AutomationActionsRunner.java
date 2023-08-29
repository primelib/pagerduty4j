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
import lombok.experimental.Accessors;

import java.time.OffsetDateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AutomationActionsRunner
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
    "runner_type",
    "name",
    "description",
    "last_seen",
    "status",
    "creation_time",
    "runbook_base_uri",
    "teams",
    "privileges",
    "associated_actions",
    "metadata"
})
@JsonTypeName("AutomationActionsRunner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AutomationActionsRunner {

    @JsonProperty("id")
    protected String id;

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to {@code name}, though it is not intended to be an identifier.
     */
    @JsonProperty("summary")
    protected String summary;

    /**
     * A string that determines the schema of the object. This must be the standard name for the entity, suffixed by {@code _reference} if the object is a reference.
     */
    @JsonProperty("type")
    protected String type;

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

    @JsonProperty("runner_type")
    protected AutomationActionsRunnerTypeEnum runnerType;

    @JsonProperty("name")
    protected String name;

    @JsonProperty("description")
    protected String description;

    @JsonProperty("last_seen")
    protected OffsetDateTime lastSeen;

    @JsonProperty("status")
    protected AutomationActionsRunnerStatusEnum status;

    @JsonProperty("creation_time")
    protected OffsetDateTime creationTime;

    /**
     * The base URI of the Runbook server to connect to. May only contain alphanumeric characters, periods, underscores and dashes. Specified as the subdomain portion of an RBA host, as in &amp;lt;runbook_base_uri&amp;gt;.runbook.pagerduty.cloud
     */
    @JsonProperty("runbook_base_uri")
    protected String runbookBaseUri;

    /**
     * The list of teams associated with the Runner
     */
    @JsonProperty("teams")
    protected List<TeamReference> teams;

    @JsonProperty("privileges")
    protected AutomationActionsUserPermissions privileges;

    @JsonProperty("associated_actions")
    protected AutomationActionsRunnerAllOfAssociatedActions associatedActions;

    /**
     * Additional metadata
     */
    @JsonProperty("metadata")
    protected Object metadata;

    /**
     * Constructs a validated instance of {@link AutomationActionsRunner}.
     *
     * @param spec the specification to process
     */
    public AutomationActionsRunner(Consumer<AutomationActionsRunner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AutomationActionsRunner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AutomationActionsRunner(Consumer)} instead.
     * @param id id
     * @param summary A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to {@code name}, though it is not intended to be an identifier.
     * @param type A string that determines the schema of the object. This must be the standard name for the entity, suffixed by {@code _reference} if the object is a reference.
     * @param self the API show URL at which the object is accessible
     * @param htmlUrl a URL at which the entity is uniquely displayed in the Web app
     * @param runnerType runnerType
     * @param name name
     * @param description description
     * @param lastSeen lastSeen
     * @param status status
     * @param creationTime creationTime
     * @param runbookBaseUri The base URI of the Runbook server to connect to. May only contain alphanumeric characters, periods, underscores and dashes. Specified as the subdomain portion of an RBA host, as in &amp;lt;runbook_base_uri&amp;gt;.runbook.pagerduty.cloud
     * @param teams The list of teams associated with the Runner
     * @param privileges privileges
     * @param associatedActions associatedActions
     * @param metadata Additional metadata
     */
    @ApiStatus.Internal
    public AutomationActionsRunner(String id, String summary, String type, String self, String htmlUrl, AutomationActionsRunnerTypeEnum runnerType, String name, String description, OffsetDateTime lastSeen, AutomationActionsRunnerStatusEnum status, OffsetDateTime creationTime, String runbookBaseUri, List<TeamReference> teams, AutomationActionsUserPermissions privileges, AutomationActionsRunnerAllOfAssociatedActions associatedActions, Object metadata) {
        this.id = id;
        this.summary = summary;
        this.type = type;
        this.self = self;
        this.htmlUrl = htmlUrl;
        this.runnerType = runnerType;
        this.name = name;
        this.description = description;
        this.lastSeen = lastSeen;
        this.status = status;
        this.creationTime = creationTime;
        this.runbookBaseUri = runbookBaseUri;
        this.teams = teams;
        this.privileges = privileges;
        this.associatedActions = associatedActions;
        this.metadata = metadata;
    }

}
