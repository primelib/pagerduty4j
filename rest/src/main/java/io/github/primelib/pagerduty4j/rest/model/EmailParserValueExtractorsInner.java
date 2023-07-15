package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EmailParserValueExtractorsInner
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated implementation of {@link EmailParserValueExtractorsInner}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public EmailParserValueExtractorsInner(Consumer<EmailParserValueExtractorsInner> spec) {
        spec.accept(this);
    }

    @JsonProperty("type")
    protected TypeEnum type;

    @JsonProperty("part")
    protected PartEnum part;

    /**
     * The field name to set in the Incident object. Exactly one must use the `value_name` of `incident_key`
     */
    @JsonProperty("value_name")
    protected String valueName;

    @JsonProperty("regex")
    protected String regex;

    @JsonProperty("starts_after")
    protected String startsAfter;

    @JsonProperty("ends_with")
    protected String endsWith;


    @AllArgsConstructor
    public enum TypeEnum {
        ENTIRE("entire"),
        REGEX("regex"),
        BETWEEN("between");

        private final String value;
    }

    @AllArgsConstructor
    public enum PartEnum {
        BODY("body"),
        SUBJECT("subject"),
        FROM_ADDRESSES("from_addresses");

        private final String value;
    }

}
