package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MatchPredicate
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "type",
    "matcher",
    "part",
    "children"
})
@JsonTypeName("MatchPredicate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MatchPredicate {

    /**
     * Constructs a validated implementation of {@link MatchPredicate}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public MatchPredicate(Consumer<MatchPredicate> spec) {
        spec.accept(this);
    }

    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * Required if the type is `contains`, `exactly` or `regex`.
     */
    @JsonProperty("matcher")
    protected String matcher;

    /**
     * The email field that will attempt to use the matcher expression. Required if the type is `contains`, `exactly` or `regex`.
     */
    @JsonProperty("part")
    protected PartEnum part;

    /**
     * Additional matchers to be run. Must be not empty if the type is `all`, `any`, or `not`.
     */
    @JsonProperty("children")
    protected List<MatchPredicate> children = new ArrayList<>();


    @AllArgsConstructor
    public enum TypeEnum {
        ALL("all"),
        ANY("any"),
        NOT("not"),
        CONTAINS("contains"),
        EXACTLY("exactly"),
        REGEX("regex");

        private final String value;
    }

    /**
     * The email field that will attempt to use the matcher expression. Required if the type is `contains`, `exactly` or `regex`.
     */
    @AllArgsConstructor
    public enum PartEnum {
        BODY("body"),
        SUBJECT("subject"),
        FROM_ADDRESSES("from_addresses");

        private final String value;
    }

}
