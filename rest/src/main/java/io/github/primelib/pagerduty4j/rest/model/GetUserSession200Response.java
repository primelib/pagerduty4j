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
 * GetUserSession200Response
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
    "user_session"
})
@JsonTypeName("getUserSession_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetUserSession200Response {

    @JsonProperty("user_session")
    protected UserSession userSession;

    /**
     * Constructs a validated instance of {@link GetUserSession200Response}.
     *
     * @param spec the specification to process
     */
    public GetUserSession200Response(Consumer<GetUserSession200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetUserSession200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetUserSession200Response(Consumer)} instead.
     * @param userSession userSession
     */
    @ApiStatus.Internal
    public GetUserSession200Response(UserSession userSession) {
        this.userSession = userSession;
    }

}
