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
 * AuditRecordDetailsFieldsInner
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "name",
    "description",
    "value",
    "before_value"
})
@JsonTypeName("AuditRecord_details_fields_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AuditRecordDetailsFieldsInner {

    /**
     * Constructs a validated implementation of {@link AuditRecordDetailsFieldsInner}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AuditRecordDetailsFieldsInner(Consumer<AuditRecordDetailsFieldsInner> spec) {
        spec.accept(this);
    }

    /**
     * Name of the resource field
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Human readable description of the resource field
     */
    @JsonProperty("description")
    protected String description;

    /**
     * new or updated value of the field
     */
    @JsonProperty("value")
    protected String value;

    /**
     * previous or deleted value of the field
     */
    @JsonProperty("before_value")
    protected String beforeValue;


}
