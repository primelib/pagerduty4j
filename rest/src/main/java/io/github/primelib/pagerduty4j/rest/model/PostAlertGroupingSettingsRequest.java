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
 * PostAlertGroupingSettingsRequest
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
    "alert_grouping_setting"
})
@JsonTypeName("postAlertGroupingSettings_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PostAlertGroupingSettingsRequest {

    @JsonProperty("alert_grouping_setting")
    protected AlertGroupingSetting alertGroupingSetting;

    /**
     * Constructs a validated instance of {@link PostAlertGroupingSettingsRequest}.
     *
     * @param spec the specification to process
     */
    public PostAlertGroupingSettingsRequest(Consumer<PostAlertGroupingSettingsRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PostAlertGroupingSettingsRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PostAlertGroupingSettingsRequest(Consumer)} instead.
     * @param alertGroupingSetting alertGroupingSetting
     */
    @ApiStatus.Internal
    public PostAlertGroupingSettingsRequest(AlertGroupingSetting alertGroupingSetting) {
        this.alertGroupingSetting = alertGroupingSetting;
    }

}
