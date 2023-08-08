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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * MatchPredicate
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
    "type",
    "matcher",
    "part",
    "children"
})
@JsonTypeName("MatchPredicate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MatchPredicate {

    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * Required if the type is {@code contains}, {@code exactly} or {@code regex}.
     */
    @JsonProperty("matcher")
    protected String matcher;

    /**
     * The email field that will attempt to use the matcher expression. Required if the type is {@code contains}, {@code exactly} or {@code regex}.
     */
    @JsonProperty("part")
    protected PartEnum part;

    /**
     * Additional matchers to be run. Must be not empty if the type is {@code all}, {@code any}, or {@code not}.
     */
    @JsonProperty("children")
    protected List<MatchPredicate> children;

    /**
     * Constructs a validated instance of {@link MatchPredicate}.
     *
     * @param spec the specification to process
     */
    public MatchPredicate(Consumer<MatchPredicate> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link MatchPredicate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #MatchPredicate(Consumer)} instead.
     * @param type type
     * @param matcher Required if the type is {@code contains}, {@code exactly} or {@code regex}.
     * @param part The email field that will attempt to use the matcher expression. Required if the type is {@code contains}, {@code exactly} or {@code regex}.
     * @param children Additional matchers to be run. Must be not empty if the type is {@code all}, {@code any}, or {@code not}.
     */
    @ApiStatus.Internal
    public MatchPredicate(TypeEnum type, String matcher, PartEnum part, List<MatchPredicate> children) {
        this.type = type;
        this.matcher = matcher;
        this.part = part;
        this.children = children;
    }

    @AllArgsConstructor
    public enum TypeEnum {
        ALL("all"),
        ANY("any"),
        NOT("not"),
        CONTAINS("contains"),
        EXACTLY("exactly"),
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

    /**
     * The email field that will attempt to use the matcher expression. Required if the type is {@code contains}, {@code exactly} or {@code regex}.
     */
    @AllArgsConstructor
    public enum PartEnum {
        BODY("body"),
        SUBJECT("subject"),
        FROM_ADDRESSES("from_addresses");

        private static final PartEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static PartEnum of(String input) {
            if (input != null) {
                for (PartEnum v : VALUES) {
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
