package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
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

    /**
     * Constructs a validated implementation of {@link AutomationActionsRunner}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AutomationActionsRunner(Consumer<AutomationActionsRunner> spec) {
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
     * A string that determines the schema of the object. This must be the standard name for the entity, suffixed by `_reference` if the object is a reference.
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


}
