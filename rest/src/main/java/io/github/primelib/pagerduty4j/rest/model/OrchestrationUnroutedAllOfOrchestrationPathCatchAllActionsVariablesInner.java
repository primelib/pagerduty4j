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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * OrchestrationUnroutedAllOfOrchestrationPathCatchAllActionsVariablesInner
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
     * Constructs a validated instance of {@link OrchestrationUnroutedAllOfOrchestrationPathCatchAllActionsVariablesInner}.
     *
     * @param spec the specification to process
     */
    public OrchestrationUnroutedAllOfOrchestrationPathCatchAllActionsVariablesInner(Consumer<OrchestrationUnroutedAllOfOrchestrationPathCatchAllActionsVariablesInner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link OrchestrationUnroutedAllOfOrchestrationPathCatchAllActionsVariablesInner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #OrchestrationUnroutedAllOfOrchestrationPathCatchAllActionsVariablesInner(Consumer)} instead.
     * @param name The name of the variable
     * @param path Path to a field in an event, in dot-notation.
     * @param type The type of operation to populate the variable. Currently only Regex-based variable extraction is supported.
     * @param value A RE2 regular expression. If it contains one or more capture groups, their values will be extracted and appended together. If it contains no capture groups, the whole match is used.
     */
    @ApiStatus.Internal
    public OrchestrationUnroutedAllOfOrchestrationPathCatchAllActionsVariablesInner(String name, String path, TypeEnum type, String value) {
        this.name = name;
        this.path = path;
        this.type = type;
        this.value = value;
    }

    /**
     * The type of operation to populate the variable. Currently only Regex-based variable extraction is supported.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        REGEX("regex");

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
