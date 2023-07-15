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
 * ListScheduleOverrides201Response
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "overrides"
})
@JsonTypeName("listScheduleOverrides_201_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListScheduleOverrides201Response {

    /**
     * Constructs a validated implementation of {@link ListScheduleOverrides201Response}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ListScheduleOverrides201Response(Consumer<ListScheduleOverrides201Response> spec) {
        spec.accept(this);
    }

    @JsonProperty("overrides")
    protected List<ScheduleOverride> overrides = new ArrayList<>();


}
