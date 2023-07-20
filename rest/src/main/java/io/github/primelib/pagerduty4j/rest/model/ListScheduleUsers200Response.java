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
 * ListScheduleUsers200Response
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
    "users"
})
@JsonTypeName("listScheduleUsers_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListScheduleUsers200Response {

    @JsonProperty("users")
    protected List<User> users;

    /**
     * Constructs a validated instance of {@link ListScheduleUsers200Response}.
     *
     * @param spec the specification to process
     */
    public ListScheduleUsers200Response(Consumer<ListScheduleUsers200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ListScheduleUsers200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ListScheduleUsers200Response(Consumer)} instead.
     * @param users var.name
     */
    @ApiStatus.Internal
    public ListScheduleUsers200Response(List<User> users) {
        this.users = users;
    }

}
