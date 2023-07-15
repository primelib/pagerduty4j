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
 * RulesetUpdater
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "type",
    "self"
})
@JsonTypeName("Ruleset_updater")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RulesetUpdater {

    /**
     * Constructs a validated implementation of {@link RulesetUpdater}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public RulesetUpdater(Consumer<RulesetUpdater> spec) {
        spec.accept(this);
    }

    @JsonProperty("id")
    protected String id;

    /**
     * A string that determines the schema of the object
     */
    @JsonProperty("type")
    protected String type;

    /**
     * The API show URL at which the object is accessible
     */
    @JsonProperty("self")
    protected String self;


}
