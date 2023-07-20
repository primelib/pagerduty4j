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
 * CreateUserRequest
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
    "user"
})
@JsonTypeName("createUser_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateUserRequest {

    @JsonProperty("user")
    protected User user;

    /**
     * Constructs a validated instance of {@link CreateUserRequest}.
     *
     * @param spec the specification to process
     */
    public CreateUserRequest(Consumer<CreateUserRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateUserRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateUserRequest(Consumer)} instead.
     * @param user var.name
     */
    @ApiStatus.Internal
    public CreateUserRequest(User user) {
        this.user = user;
    }

}
