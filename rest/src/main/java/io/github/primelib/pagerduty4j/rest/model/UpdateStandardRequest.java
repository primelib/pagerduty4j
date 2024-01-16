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
 * UpdateStandardRequest
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
    "active",
    "values",
    "description",
    "inclusions",
    "exclusions"
})
@JsonTypeName("updateStandard_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateStandardRequest {

    @JsonProperty("active")
    protected Boolean active;

    @JsonProperty("values")
    protected UpdateStandardRequestAllOfValues values;

    @JsonProperty("description")
    protected String description;

    @JsonProperty("inclusions")
    protected List<StandardInclusionExclusion> inclusions;

    @JsonProperty("exclusions")
    protected List<StandardInclusionExclusion> exclusions;

    /**
     * Constructs a validated instance of {@link UpdateStandardRequest}.
     *
     * @param spec the specification to process
     */
    public UpdateStandardRequest(Consumer<UpdateStandardRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UpdateStandardRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UpdateStandardRequest(Consumer)} instead.
     * @param active active
     * @param values values
     * @param description description
     * @param inclusions inclusions
     * @param exclusions exclusions
     */
    @ApiStatus.Internal
    public UpdateStandardRequest(Boolean active, UpdateStandardRequestAllOfValues values, String description, List<StandardInclusionExclusion> inclusions, List<StandardInclusionExclusion> exclusions) {
        this.active = active;
        this.values = values;
        this.description = description;
        this.inclusions = inclusions;
        this.exclusions = exclusions;
    }

}
