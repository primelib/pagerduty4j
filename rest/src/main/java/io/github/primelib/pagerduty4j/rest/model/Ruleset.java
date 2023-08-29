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

import java.time.OffsetDateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Ruleset
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

    /**
     * Constructs a validated instance of {@link Ruleset}.
     *
     * @param spec the specification to process
     */
    public Ruleset(Consumer<Ruleset> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Ruleset}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Ruleset(Consumer)} instead.
     * @param id ID of the Ruleset.
     * @param self the API show URL at which the object is accessible
     * @param type type
     * @param name Name of the Ruleset.
     * @param routingKeys Routing keys routed to this Ruleset.
     * @param createdAt The date the Ruleset was created at.
     * @param creator creator
     * @param updatedAt The date the Ruleset was last updated.
     * @param updater updater
     * @param team team
     */
    @ApiStatus.Internal
    public Ruleset(String id, String self, TypeEnum type, String name, List<String> routingKeys, OffsetDateTime createdAt, RulesetCreator creator, OffsetDateTime updatedAt, RulesetUpdater updater, RulesetTeam team) {
        this.id = id;
        this.self = self;
        this.type = type;
        this.name = name;
        this.routingKeys = routingKeys;
        this.createdAt = createdAt;
        this.creator = creator;
        this.updatedAt = updatedAt;
        this.updater = updater;
        this.team = team;
    }

    @AllArgsConstructor
    public enum TypeEnum {
        GLOBAL("global"),
        DEFAULT_GLOBAL("default_global");

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

}
