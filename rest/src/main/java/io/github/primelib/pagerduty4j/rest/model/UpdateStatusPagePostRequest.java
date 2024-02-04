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
 * UpdateStatusPagePostRequest
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
    "post"
})
@JsonTypeName("updateStatusPagePost_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateStatusPagePostRequest {

    @JsonProperty("post")
    protected StatusPagePostPutRequest post;

    /**
     * Constructs a validated instance of {@link UpdateStatusPagePostRequest}.
     *
     * @param spec the specification to process
     */
    public UpdateStatusPagePostRequest(Consumer<UpdateStatusPagePostRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UpdateStatusPagePostRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UpdateStatusPagePostRequest(Consumer)} instead.
     * @param post post
     */
    @ApiStatus.Internal
    public UpdateStatusPagePostRequest(StatusPagePostPutRequest post) {
        this.post = post;
    }

}
