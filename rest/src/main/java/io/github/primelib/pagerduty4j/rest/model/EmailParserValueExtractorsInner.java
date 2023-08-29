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
 * EmailParserValueExtractorsInner
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
    "part",
    "value_name",
    "regex",
    "starts_after",
    "ends_with"
})
@JsonTypeName("EmailParser_value_extractors_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EmailParserValueExtractorsInner {

    @JsonProperty("type")
    protected TypeEnum type;

    @JsonProperty("part")
    protected PartEnum part;

    /**
     * The field name to set in the Incident object. Exactly one must use the {@code value_name} of {@code incident_key}
     */
    @JsonProperty("value_name")
    protected String valueName;

    @JsonProperty("regex")
    protected String regex;

    @JsonProperty("starts_after")
    protected String startsAfter;

    @JsonProperty("ends_with")
    protected String endsWith;

    /**
     * Constructs a validated instance of {@link EmailParserValueExtractorsInner}.
     *
     * @param spec the specification to process
     */
    public EmailParserValueExtractorsInner(Consumer<EmailParserValueExtractorsInner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link EmailParserValueExtractorsInner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #EmailParserValueExtractorsInner(Consumer)} instead.
     * @param type type
     * @param part part
     * @param valueName The field name to set in the Incident object. Exactly one must use the {@code value_name} of {@code incident_key}
     * @param regex regex
     * @param startsAfter startsAfter
     * @param endsWith endsWith
     */
    @ApiStatus.Internal
    public EmailParserValueExtractorsInner(TypeEnum type, PartEnum part, String valueName, String regex, String startsAfter, String endsWith) {
        this.type = type;
        this.part = part;
        this.valueName = valueName;
        this.regex = regex;
        this.startsAfter = startsAfter;
        this.endsWith = endsWith;
    }

    @AllArgsConstructor
    public enum TypeEnum {
        ENTIRE("entire"),
        REGEX("regex"),
        BETWEEN("between");

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
