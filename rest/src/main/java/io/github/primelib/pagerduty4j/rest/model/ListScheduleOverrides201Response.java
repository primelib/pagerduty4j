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
 * ListScheduleOverrides201Response
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
    "overrides"
})
@JsonTypeName("listScheduleOverrides_201_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListScheduleOverrides201Response {

    @JsonProperty("overrides")
    protected List<ScheduleOverride> overrides;

    /**
     * Constructs a validated instance of {@link ListScheduleOverrides201Response}.
     *
     * @param spec the specification to process
     */
    public ListScheduleOverrides201Response(Consumer<ListScheduleOverrides201Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ListScheduleOverrides201Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ListScheduleOverrides201Response(Consumer)} instead.
     * @param overrides var.name
     */
    @ApiStatus.Internal
    public ListScheduleOverrides201Response(List<ScheduleOverride> overrides) {
        this.overrides = overrides;
    }

}
