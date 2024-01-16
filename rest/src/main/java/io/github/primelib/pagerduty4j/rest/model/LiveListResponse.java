package io.github.primelib.pagerduty4j.rest.model;

import java.util.List;
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
 * LiveListResponse
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
    "more"
})
@JsonTypeName("LiveListResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class LiveListResponse {

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

    /**
     * Constructs a validated instance of {@link LiveListResponse}.
     *
     * @param spec the specification to process
     */
    public LiveListResponse(Consumer<LiveListResponse> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link LiveListResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #LiveListResponse(Consumer)} instead.
     * @param limit Echoes limit pagination property.
     * @param more Indicates if there are additional records to return
     */
    @ApiStatus.Internal
    public LiveListResponse(Integer limit, Boolean more) {
        this.limit = limit;
        this.more = more;
    }

}
