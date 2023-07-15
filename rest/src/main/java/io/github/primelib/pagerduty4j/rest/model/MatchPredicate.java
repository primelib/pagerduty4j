package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
@JsonPropertyOrder({
    "type",
    "matcher",
    "part",
    "children"
})
@JsonTypeName("MatchPredicate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MatchPredicate {

    @JsonProperty("type")
    private TypeEnum type;

    /**
     * Required if the type is `contains`, `exactly` or `regex`.
     */
    @JsonProperty("matcher")
    private String matcher;

    /**
     * The email field that will attempt to use the matcher expression. Required if the type is `contains`, `exactly` or `regex`.
     */
    @JsonProperty("part")
    private PartEnum part;

    /**
     * Additional matchers to be run. Must be not empty if the type is `all`, `any`, or `not`.
     */
    @JsonProperty("children")
    private List<MatchPredicate> children = new ArrayList<>();


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
