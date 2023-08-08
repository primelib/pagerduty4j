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
 * GetBusinessServiceTopLevelImpactors200Response
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
    "limit",
    "more",
    "impactors"
})
@JsonTypeName("getBusinessServiceTopLevelImpactors_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetBusinessServiceTopLevelImpactors200Response {

    /**
     * Echoes limit pagination property.
     */
    @JsonProperty("limit")
    protected Integer limit;

    /**
     * Indicates if there are additional records to return
     */
    @JsonProperty("more")
    protected Boolean more;

    @JsonProperty("impactors")
    protected List<Impactor> impactors;

    /**
     * Constructs a validated instance of {@link GetBusinessServiceTopLevelImpactors200Response}.
     *
     * @param spec the specification to process
     */
    public GetBusinessServiceTopLevelImpactors200Response(Consumer<GetBusinessServiceTopLevelImpactors200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetBusinessServiceTopLevelImpactors200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetBusinessServiceTopLevelImpactors200Response(Consumer)} instead.
     * @param limit Echoes limit pagination property.
     * @param more Indicates if there are additional records to return
     * @param impactors impactors
     */
    @ApiStatus.Internal
    public GetBusinessServiceTopLevelImpactors200Response(Integer limit, Boolean more, List<Impactor> impactors) {
        this.limit = limit;
        this.more = more;
        this.impactors = impactors;
    }

}
