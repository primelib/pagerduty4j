package io.github.primelib.pagerduty4j.rest.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import java.time.OffsetDateTime;
import java.util.Set;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetOutlierIncidentSpec
 * <p>
 * Specification for the GetOutlierIncident operation.
 * <p>
 * Get Outlier Incident
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetOutlierIncidentOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the resource.
     */
    @NotNull 
    private String id;

    /**
     * The start of the date range over which you want to search.
     */
    @Nullable 
    private OffsetDateTime since;

    /**
     * Array of additional attributes to any of the returned incidents for related incidents.
     */
    @Nullable 
    private String additionalDetails;

    /**
     * Constructs a validated instance of {@link GetOutlierIncidentOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetOutlierIncidentOperationSpec(Consumer<GetOutlierIncidentOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetOutlierIncidentOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the resource.
     * @param since                The start of the date range over which you want to search.
     * @param additionalDetails    Array of additional attributes to any of the returned incidents for related incidents.
     */
    @ApiStatus.Internal
    public GetOutlierIncidentOperationSpec(String id, OffsetDateTime since, String additionalDetails) {
        this.id = id;
        this.since = since;
        this.additionalDetails = additionalDetails;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(id, "id is a required parameter!");
    }
}
