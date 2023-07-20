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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AuditRecordDetails
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
    "resource",
    "fields",
    "references"
})
@JsonTypeName("AuditRecord_details")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AuditRecordDetails {

    @JsonProperty("resource")
    protected Reference resource;

    /**
     * A set of fields that have been affected. The fields that have not been affected MAY be returned. 
     */
    @JsonProperty("fields")
    protected List<AuditRecordDetailsFieldsInner> fields;

    /**
     * A set of references that have been affected.
     */
    @JsonProperty("references")
    protected List<AuditRecordDetailsReferencesInner> references;

    /**
     * Constructs a validated instance of {@link AuditRecordDetails}.
     *
     * @param spec the specification to process
     */
    public AuditRecordDetails(Consumer<AuditRecordDetails> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AuditRecordDetails}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AuditRecordDetails(Consumer)} instead.
     * @param resource var.name
     * @param fields A set of fields that have been affected. The fields that have not been affected MAY be returned. 
     * @param references A set of references that have been affected.
     */
    @ApiStatus.Internal
    public AuditRecordDetails(Reference resource, List<AuditRecordDetailsFieldsInner> fields, List<AuditRecordDetailsReferencesInner> references) {
        this.resource = resource;
        this.fields = fields;
        this.references = references;
    }

}
