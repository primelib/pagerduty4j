package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EmailParser
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "action",
    "match_predicate",
    "value_extractors"
})
@JsonTypeName("EmailParser")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EmailParser {

    /**
     * Constructs a validated implementation of {@link EmailParser}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public EmailParser(Consumer<EmailParser> spec) {
        spec.accept(this);
    }

    @JsonProperty("action")
    protected ActionEnum action;

    @JsonProperty("match_predicate")
    protected MatchPredicate matchPredicate;

    /**
     * Additional values that will be pulled in to the Incident object. Exactly one value extractor must have a `value_name` of `incident_key`.
     */
    @JsonProperty("value_extractors")
    protected Set<EmailParserValueExtractorsInner> valueExtractors;


    @AllArgsConstructor
    public enum ActionEnum {
        TRIGGER("trigger"),
        RESOLVE("resolve");

        private final String value;
    }

}
