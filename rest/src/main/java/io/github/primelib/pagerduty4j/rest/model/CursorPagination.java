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
 * CursorPagination
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
    "next_cursor"
})
@JsonTypeName("CursorPagination")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CursorPagination {

    /**
     * The minimum of the {@code limit} parameter used in the request or the maximum request size of the API.
     */
    @JsonProperty("limit")
    protected Integer limit;

    /**
     * An opaque string than will deliver the next set of results when provided as the {@code cursor} parameter in a subsequent request.
     * A {@code null} value for this field indicates that there are no additional results. 
     */
    @JsonProperty("next_cursor")
    protected String nextCursor;

    /**
     * Constructs a validated instance of {@link CursorPagination}.
     *
     * @param spec the specification to process
     */
    public CursorPagination(Consumer<CursorPagination> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CursorPagination}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CursorPagination(Consumer)} instead.
     * @param limit The minimum of the {@code limit} parameter used in the request or the maximum request size of the API.
     * @param nextCursor An opaque string than will deliver the next set of results when provided as the {@code cursor} parameter in a subsequent request.  A {@code null} value for this field indicates that there are no additional results. 
     */
    @ApiStatus.Internal
    public CursorPagination(Integer limit, String nextCursor) {
        this.limit = limit;
        this.nextCursor = nextCursor;
    }

}
