package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TagsToRemove
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "type",
    "id"
})
@JsonTypeName("Tags_to_remove_")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class TagsToRemove {

    /**
     * Constructs a validated implementation of {@link TagsToRemove}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public TagsToRemove(Consumer<TagsToRemove> spec) {
        spec.accept(this);
    }

    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * The id of the tag
     */
    @JsonProperty("id")
    protected String id;


    @AllArgsConstructor
    public enum TypeEnum {
        TAG_REFERENCE("tag_reference");

        private final String value;
    }

}
