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
 * ListStatusPagePosts200Response
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
    "offset",
    "limit",
    "more",
    "total",
    "posts"
})
@JsonTypeName("listStatusPagePosts_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListStatusPagePosts200Response {

    /**
     * Echoes offset pagination property.
     */
    @JsonProperty("offset")
    protected Integer offset;

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
     * The total number of records matching the given query.
     */
    @JsonProperty("total")
    protected Integer total;

    @JsonProperty("posts")
    protected List<StatusPagePost> posts;

    /**
     * Constructs a validated instance of {@link ListStatusPagePosts200Response}.
     *
     * @param spec the specification to process
     */
    public ListStatusPagePosts200Response(Consumer<ListStatusPagePosts200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ListStatusPagePosts200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ListStatusPagePosts200Response(Consumer)} instead.
     * @param offset Echoes offset pagination property.
     * @param limit Echoes limit pagination property.
     * @param more Indicates if there are additional records to return
     * @param total The total number of records matching the given query.
     * @param posts posts
     */
    @ApiStatus.Internal
    public ListStatusPagePosts200Response(Integer offset, Integer limit, Boolean more, Integer total, List<StatusPagePost> posts) {
        this.offset = offset;
        this.limit = limit;
        this.more = more;
        this.total = total;
        this.posts = posts;
    }

}
