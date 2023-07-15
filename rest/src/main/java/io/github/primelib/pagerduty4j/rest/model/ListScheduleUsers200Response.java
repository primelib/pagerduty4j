package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListScheduleUsers200Response
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "users"
})
@JsonTypeName("listScheduleUsers_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListScheduleUsers200Response {

    /**
     * Constructs a validated implementation of {@link ListScheduleUsers200Response}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ListScheduleUsers200Response(Consumer<ListScheduleUsers200Response> spec) {
        spec.accept(this);
    }

    @JsonProperty("users")
    protected List<User> users = new ArrayList<>();


}
