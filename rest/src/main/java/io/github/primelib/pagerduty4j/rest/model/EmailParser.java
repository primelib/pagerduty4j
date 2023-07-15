package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
@JsonPropertyOrder({
    "action",
    "match_predicate",
    "value_extractors"
})
@JsonTypeName("EmailParser")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EmailParser {

    @JsonProperty("action")
    private ActionEnum action;

    @JsonProperty("match_predicate")
    private MatchPredicate matchPredicate;

    /**
     * Additional values that will be pulled in to the Incident object. Exactly one value extractor must have a `value_name` of `incident_key`.
     */
    @JsonProperty("value_extractors")
    private Set<EmailParserValueExtractorsInner> valueExtractors;


    @AllArgsConstructor
    public enum ActionEnum {
        TRIGGER("trigger"),
        RESOLVE("resolve");

        private final String value;
    }

}
