package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
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
    private String id;

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
     */
    @JsonProperty("summary")
    private String summary;

    /**
     * A string that determines the schema of the object. This must be the standard name for the entity, suffixed by `_reference` if the object is a reference.
     */
    @JsonProperty("type")
    private String type;

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

    @JsonProperty("runner_type")
    private AutomationActionsRunnerTypeEnum runnerType;

    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    @JsonProperty("last_seen")
    private OffsetDateTime lastSeen;

    @JsonProperty("status")
    private AutomationActionsRunnerStatusEnum status;

    @JsonProperty("creation_time")
    private OffsetDateTime creationTime;

    /**
     * The base URI of the Runbook server to connect to. May only contain alphanumeric characters, periods, underscores and dashes. Specified as the subdomain portion of an RBA host, as in &amp;lt;runbook_base_uri&amp;gt;.runbook.pagerduty.cloud
     */
    @JsonProperty("runbook_base_uri")
    private String runbookBaseUri;

    /**
     * The list of teams associated with the Runner
     */
    @JsonProperty("teams")
    private List<TeamReference> teams;

    @JsonProperty("privileges")
    private AutomationActionsUserPermissions privileges;

    @JsonProperty("associated_actions")
    private AutomationActionsRunnerAllOfAssociatedActions associatedActions;

    /**
     * Additional metadata
     */
    @JsonProperty("metadata")
    private Object metadata;


}
