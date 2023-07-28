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

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * EmailParser
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
    "action",
    "match_predicate",
    "value_extractors"
})
@JsonTypeName("EmailParser")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EmailParser {

    @JsonProperty("action")
    protected ActionEnum action;

    @JsonProperty("match_predicate")
    protected MatchPredicate matchPredicate;

    /**
     * Additional values that will be pulled in to the Incident object. Exactly one value extractor must have a {@code value_name} of {@code incident_key}.
     */
    @JsonProperty("value_extractors")
    protected Set<EmailParserValueExtractorsInner> valueExtractors;

    /**
     * Constructs a validated instance of {@link EmailParser}.
     *
     * @param spec the specification to process
     */
    public EmailParser(Consumer<EmailParser> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link EmailParser}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #EmailParser(Consumer)} instead.
     * @param action var.name
     * @param matchPredicate var.name
     * @param valueExtractors Additional values that will be pulled in to the Incident object. Exactly one value extractor must have a {@code value_name} of {@code incident_key}.
     */
    @ApiStatus.Internal
    public EmailParser(ActionEnum action, MatchPredicate matchPredicate, Set<EmailParserValueExtractorsInner> valueExtractors) {
        this.action = action;
        this.matchPredicate = matchPredicate;
        this.valueExtractors = valueExtractors;
    }

    @AllArgsConstructor
    public enum ActionEnum {
        TRIGGER("trigger"),
        RESOLVE("resolve");

        private static final ActionEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static ActionEnum of(String input) {
            if (input != null) {
                for (ActionEnum v : VALUES) {
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
