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
 * CreateRulesetRequestRuleset
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "self",
    "type",
    "name",
    "routing_keys",
    "created_at",
    "creator",
    "updated_at",
    "updater",
    "team"
})
@JsonTypeName("createRuleset_request_ruleset")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateRulesetRequestRuleset {

    /**
     * Constructs a validated implementation of {@link CreateRulesetRequestRuleset}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateRulesetRequestRuleset(Consumer<CreateRulesetRequestRuleset> spec) {
        spec.accept(this);
    }

    /**
     * ID of the Ruleset.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * the API show URL at which the object is accessible
     */
    @JsonProperty("self")
    protected String self;

    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * Name of the Ruleset.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Routing keys routed to this Ruleset.
     */
    @JsonProperty("routing_keys")
    protected List<String> routingKeys;

    /**
     * The date the Ruleset was created at.
     */
    @JsonProperty("created_at")
    protected OffsetDateTime createdAt;

    @JsonProperty("creator")
    protected RulesetCreator creator;

    /**
     * The date the Ruleset was last updated.
     */
    @JsonProperty("updated_at")
    protected OffsetDateTime updatedAt;

    @JsonProperty("updater")
    protected RulesetUpdater updater;

    @JsonProperty("team")
    protected RulesetTeam team;


    @AllArgsConstructor
    public enum TypeEnum {
        GLOBAL("global"),
        DEFAULT_GLOBAL("default_global");

        private final String value;
    }

}
