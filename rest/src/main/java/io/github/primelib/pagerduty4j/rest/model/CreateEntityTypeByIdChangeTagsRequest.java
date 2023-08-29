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
 * CreateEntityTypeByIdChangeTagsRequest
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
    "add",
    "remove"
})
@JsonTypeName("createEntityTypeByIdChangeTags_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateEntityTypeByIdChangeTagsRequest {

    /**
     * Array of tags and/or tag references to add to the entity. For elements with type {@code tag_reference}, the tag with the corresponding {@code id} is added to the entity. For elements with type {@code tag}, if there is an existing tag with the given label that tag is added to the entity. If there is no existing tag with that label and the user has permission to create tags, a new tag is created with that label and assigned to the entity. 
     */
    @JsonProperty("add")
    protected List<TagsToAdd> add;

    /**
     * Array of tag references to remove from the entity.
     */
    @JsonProperty("remove")
    protected List<TagsToRemove> remove;

    /**
     * Constructs a validated instance of {@link CreateEntityTypeByIdChangeTagsRequest}.
     *
     * @param spec the specification to process
     */
    public CreateEntityTypeByIdChangeTagsRequest(Consumer<CreateEntityTypeByIdChangeTagsRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateEntityTypeByIdChangeTagsRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateEntityTypeByIdChangeTagsRequest(Consumer)} instead.
     * @param add Array of tags and/or tag references to add to the entity. For elements with type {@code tag_reference}, the tag with the corresponding {@code id} is added to the entity. For elements with type {@code tag}, if there is an existing tag with the given label that tag is added to the entity. If there is no existing tag with that label and the user has permission to create tags, a new tag is created with that label and assigned to the entity. 
     * @param remove Array of tag references to remove from the entity.
     */
    @ApiStatus.Internal
    public CreateEntityTypeByIdChangeTagsRequest(List<TagsToAdd> add, List<TagsToRemove> remove) {
        this.add = add;
        this.remove = remove;
    }

}
