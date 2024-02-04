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
 * CreateStatusPagePostUpdate201Response
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
    "post_update"
})
@JsonTypeName("createStatusPagePostUpdate_201_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateStatusPagePostUpdate201Response {

    @JsonProperty("post_update")
    protected StatusPagePostUpdate postUpdate;

    /**
     * Constructs a validated instance of {@link CreateStatusPagePostUpdate201Response}.
     *
     * @param spec the specification to process
     */
    public CreateStatusPagePostUpdate201Response(Consumer<CreateStatusPagePostUpdate201Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateStatusPagePostUpdate201Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateStatusPagePostUpdate201Response(Consumer)} instead.
     * @param postUpdate postUpdate
     */
    @ApiStatus.Internal
    public CreateStatusPagePostUpdate201Response(StatusPagePostUpdate postUpdate) {
        this.postUpdate = postUpdate;
    }

}
