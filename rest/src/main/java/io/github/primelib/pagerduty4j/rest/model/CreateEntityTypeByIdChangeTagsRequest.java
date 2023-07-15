package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateEntityTypeByIdChangeTagsRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "add",
    "remove"
})
@JsonTypeName("createEntityTypeByIdChangeTags_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateEntityTypeByIdChangeTagsRequest {

    /**
     * Constructs a validated implementation of {@link CreateEntityTypeByIdChangeTagsRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateEntityTypeByIdChangeTagsRequest(Consumer<CreateEntityTypeByIdChangeTagsRequest> spec) {
        spec.accept(this);
    }

    /**
     * Array of tags and/or tag references to add to the entity. For elements with type `tag_reference`, the tag with the corresponding `id` is added to the entity. For elements with type `tag`, if there is an existing tag with the given label that tag is added to the entity. If there is no existing tag with that label and the user has permission to create tags, a new tag is created with that label and assigned to the entity. 
     */
    @JsonProperty("add")
    protected List<TagsToAdd> add;

    /**
     * Array of tag references to remove from the entity.
     */
    @JsonProperty("remove")
    protected List<TagsToRemove> remove;


}
