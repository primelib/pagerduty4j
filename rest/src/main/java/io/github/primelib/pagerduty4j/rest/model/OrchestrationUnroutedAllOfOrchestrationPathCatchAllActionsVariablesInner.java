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
 * OrchestrationUnroutedAllOfOrchestrationPathCatchAllActionsVariablesInner
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "name",
    "path",
    "type",
    "value"
})
@JsonTypeName("OrchestrationUnrouted_allOf_orchestration_path_catch_all_actions_variables_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationUnroutedAllOfOrchestrationPathCatchAllActionsVariablesInner {

    /**
     * Constructs a validated implementation of {@link OrchestrationUnroutedAllOfOrchestrationPathCatchAllActionsVariablesInner}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public OrchestrationUnroutedAllOfOrchestrationPathCatchAllActionsVariablesInner(Consumer<OrchestrationUnroutedAllOfOrchestrationPathCatchAllActionsVariablesInner> spec) {
        spec.accept(this);
    }

    /**
     * The name of the variable
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Path to a field in an event, in dot-notation.
     */
    @JsonProperty("path")
    protected String path;

    /**
     * The type of operation to populate the variable. Currently only Regex-based variable extraction is supported.
     */
    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * A RE2 regular expression. If it contains one or more capture groups, their values will be extracted and appended together. If it contains no capture groups, the whole match is used.
     */
    @JsonProperty("value")
    protected String value;


    /**
     * The type of operation to populate the variable. Currently only Regex-based variable extraction is supported.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        REGEX("regex");

        private final String value;
    }

}
