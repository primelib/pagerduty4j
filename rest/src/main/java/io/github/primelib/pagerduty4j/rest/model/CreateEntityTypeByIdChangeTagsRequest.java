package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
@JsonPropertyOrder({
    "add",
    "remove"
})
@JsonTypeName("createEntityTypeByIdChangeTags_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateEntityTypeByIdChangeTagsRequest {

    /**
     * Array of tags and/or tag references to add to the entity. For elements with type `tag_reference`, the tag with the corresponding `id` is added to the entity. For elements with type `tag`, if there is an existing tag with the given label that tag is added to the entity. If there is no existing tag with that label and the user has permission to create tags, a new tag is created with that label and assigned to the entity. 
     */
    @JsonProperty("add")
    private List<TagsToAdd> add;

    /**
     * Array of tag references to remove from the entity.
     */
    @JsonProperty("remove")
    private List<TagsToRemove> remove;


}
