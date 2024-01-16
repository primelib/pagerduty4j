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
 * CreateAddon201Response
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
    "addon"
})
@JsonTypeName("createAddon_201_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateAddon201Response {

    @JsonProperty("addon")
    protected AddonReference addon;

    /**
     * Constructs a validated instance of {@link CreateAddon201Response}.
     *
     * @param spec the specification to process
     */
    public CreateAddon201Response(Consumer<CreateAddon201Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateAddon201Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateAddon201Response(Consumer)} instead.
     * @param addon addon
     */
    @ApiStatus.Internal
    public CreateAddon201Response(AddonReference addon) {
        this.addon = addon;
    }

}
