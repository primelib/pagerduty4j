package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AuditRecordDetails
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "resource",
    "fields",
    "references"
})
@JsonTypeName("AuditRecord_details")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AuditRecordDetails {

    /**
     * Constructs a validated implementation of {@link AuditRecordDetails}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AuditRecordDetails(Consumer<AuditRecordDetails> spec) {
        spec.accept(this);
    }

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


}
