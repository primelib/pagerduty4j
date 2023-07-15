package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OrchestrationUnroutedAllOfOrchestrationPathCatchAllActionsVariablesInner
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
     * The name of the variable
     */
    @JsonProperty("name")
    private String name;

    /**
     * Path to a field in an event, in dot-notation.
     */
    @JsonProperty("path")
    private String path;

    /**
     * The type of operation to populate the variable. Currently only Regex-based variable extraction is supported.
     */
    @JsonProperty("type")
    private TypeEnum type;

    /**
     * A RE2 regular expression. If it contains one or more capture groups, their values will be extracted and appended together. If it contains no capture groups, the whole match is used.
     */
    @JsonProperty("value")
    private String value;


    /**
     * The type of operation to populate the variable. Currently only Regex-based variable extraction is supported.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        REGEX("regex");

        private final String value;
    }

}
