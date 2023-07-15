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
 * TagsToAdd
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "type",
    "label",
    "id"
})
@JsonTypeName("Tags_to_add")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class TagsToAdd {

    /**
     * Constructs a validated implementation of {@link TagsToAdd}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public TagsToAdd(Consumer<TagsToAdd> spec) {
        spec.accept(this);
    }

    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * The label of the tag. Should be used when type is "tag".
     */
    @JsonProperty("label")
    protected String label;

    /**
     * The id of the tag. Should be used when type is "tag_reference".
     */
    @JsonProperty("id")
    protected String id;


    @AllArgsConstructor
    public enum TypeEnum {
        TAG("tag"),
        TAG_REFERENCE("tag_reference");

        private final String value;
    }

}
