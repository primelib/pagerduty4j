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
 * ScheduleLayerUser
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
@JsonTypeName("ScheduleLayerUser")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ScheduleLayerUser {

    @JsonProperty("user")
    protected UserReference user;

    /**
     * Constructs a validated instance of {@link ScheduleLayerUser}.
     *
     * @param spec the specification to process
     */
    public ScheduleLayerUser(Consumer<ScheduleLayerUser> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ScheduleLayerUser}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ScheduleLayerUser(Consumer)} instead.
     * @param user var.name
     */
    @ApiStatus.Internal
    public ScheduleLayerUser(UserReference user) {
        this.user = user;
    }

}
