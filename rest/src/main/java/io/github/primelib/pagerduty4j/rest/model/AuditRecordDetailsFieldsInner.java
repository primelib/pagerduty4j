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
 * AuditRecordDetailsFieldsInner
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
    "name",
    "description",
    "value",
    "before_value"
})
@JsonTypeName("AuditRecord_details_fields_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AuditRecordDetailsFieldsInner {

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

    /**
     * Constructs a validated instance of {@link AuditRecordDetailsFieldsInner}.
     *
     * @param spec the specification to process
     */
    public AuditRecordDetailsFieldsInner(Consumer<AuditRecordDetailsFieldsInner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AuditRecordDetailsFieldsInner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AuditRecordDetailsFieldsInner(Consumer)} instead.
     * @param name Name of the resource field
     * @param description Human readable description of the resource field
     * @param value new or updated value of the field
     * @param beforeValue previous or deleted value of the field
     */
    @ApiStatus.Internal
    public AuditRecordDetailsFieldsInner(String name, String description, String value, String beforeValue) {
        this.name = name;
        this.description = description;
        this.value = value;
        this.beforeValue = beforeValue;
    }

}
