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
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OrchestrationUnroutedAllOfOrchestrationPathCatchAllActionsExtractionsInner
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
    "target",
    "template",
    "regex",
    "source"
})
@JsonTypeName("OrchestrationUnrouted_allOf_orchestration_path_catch_all_actions_extractions_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationUnroutedAllOfOrchestrationPathCatchAllActionsExtractionsInner {

    /**
     * The PD-CEF field that will be set with the value from the regex.
     */
    @JsonProperty("target")
    protected String target;

    /**
     * A value that will be used to populate the target PD-CEF field. You can include variables extracted from the payload by using string interpolation.
     */
    @JsonProperty("template")
    protected String template;

    /**
     * A RE2 regular expression. If it contains one or more capture groups, their values will be extracted and appended together. If it contains no capture groups, the whole match is used.
     */
    @JsonProperty("regex")
    protected String regex;

    /**
     * The path to the event field where the regex will be applied to extract a value.
     */
    @JsonProperty("source")
    protected String source;

    /**
     * Constructs a validated instance of {@link OrchestrationUnroutedAllOfOrchestrationPathCatchAllActionsExtractionsInner}.
     *
     * @param spec the specification to process
     */
    public OrchestrationUnroutedAllOfOrchestrationPathCatchAllActionsExtractionsInner(Consumer<OrchestrationUnroutedAllOfOrchestrationPathCatchAllActionsExtractionsInner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link OrchestrationUnroutedAllOfOrchestrationPathCatchAllActionsExtractionsInner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #OrchestrationUnroutedAllOfOrchestrationPathCatchAllActionsExtractionsInner(Consumer)} instead.
     * @param target The PD-CEF field that will be set with the value from the regex.
     * @param template A value that will be used to populate the target PD-CEF field. You can include variables extracted from the payload by using string interpolation.
     * @param regex A RE2 regular expression. If it contains one or more capture groups, their values will be extracted and appended together. If it contains no capture groups, the whole match is used.
     * @param source The path to the event field where the regex will be applied to extract a value.
     */
    @ApiStatus.Internal
    public OrchestrationUnroutedAllOfOrchestrationPathCatchAllActionsExtractionsInner(String target, String template, String regex, String source) {
        this.target = target;
        this.template = template;
        this.regex = regex;
        this.source = source;
    }

}
