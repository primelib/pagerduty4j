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
 * StatusDashboard
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
    "id",
    "url_slug",
    "name"
})
@JsonTypeName("StatusDashboard")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class StatusDashboard {

    @JsonProperty("id")
    protected String id;

    @JsonProperty("url_slug")
    protected String urlSlug;

    @JsonProperty("name")
    protected String name;

    /**
     * Constructs a validated instance of {@link StatusDashboard}.
     *
     * @param spec the specification to process
     */
    public StatusDashboard(Consumer<StatusDashboard> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link StatusDashboard}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #StatusDashboard(Consumer)} instead.
     * @param id var.name
     * @param urlSlug var.name
     * @param name var.name
     */
    @ApiStatus.Internal
    public StatusDashboard(String id, String urlSlug, String name) {
        this.id = id;
        this.urlSlug = urlSlug;
        this.name = name;
    }

}
