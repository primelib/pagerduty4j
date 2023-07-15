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
 * Ruleset
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
@JsonTypeName("Ruleset")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Ruleset {

    /**
     * ID of the Ruleset.
     */
    @JsonProperty("id")
    private String id;

    /**
     * the API show URL at which the object is accessible
     */
    @JsonProperty("self")
    private String self;

    @JsonProperty("type")
    private TypeEnum type;

    /**
     * Name of the Ruleset.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Routing keys routed to this Ruleset.
     */
    @JsonProperty("routing_keys")
    private List<String> routingKeys;

    /**
     * The date the Ruleset was created at.
     */
    @JsonProperty("created_at")
    private OffsetDateTime createdAt;

    @JsonProperty("creator")
    private RulesetCreator creator;

    /**
     * The date the Ruleset was last updated.
     */
    @JsonProperty("updated_at")
    private OffsetDateTime updatedAt;

    @JsonProperty("updater")
    private RulesetUpdater updater;

    @JsonProperty("team")
    private RulesetTeam team;


    @AllArgsConstructor
    public enum TypeEnum {
        GLOBAL("global"),
        DEFAULT_GLOBAL("default_global");

        private final String value;
    }

}
