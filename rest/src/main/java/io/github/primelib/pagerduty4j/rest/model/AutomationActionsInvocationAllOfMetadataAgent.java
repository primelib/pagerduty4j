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
 * AutomationActionsInvocationAllOfMetadataAgent
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
    "html_url"
})
@JsonTypeName("AutomationActionsInvocation_allOf_metadata_agent")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AutomationActionsInvocationAllOfMetadataAgent {

    /**
     * Constructs a validated implementation of {@link AutomationActionsInvocationAllOfMetadataAgent}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AutomationActionsInvocationAllOfMetadataAgent(Consumer<AutomationActionsInvocationAllOfMetadataAgent> spec) {
        spec.accept(this);
    }

    @JsonProperty("id")
    protected String id;

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
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


    @AllArgsConstructor
    public enum TypeEnum {
        USER_REFERENCE("user_reference"),
        ESCALATION_POLICY_REFERENCE("escalation_policy_reference"),
        TEAM_REFERENCE("team_reference");

        private final String value;
    }

}
