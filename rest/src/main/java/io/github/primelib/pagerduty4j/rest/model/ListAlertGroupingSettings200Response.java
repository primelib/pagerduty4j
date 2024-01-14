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
 * ListAlertGroupingSettings200Response
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
    "alert_grouping_settings"
})
@JsonTypeName("listAlertGroupingSettings_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListAlertGroupingSettings200Response {

    /**
     * The list of alert grouping settings your account has.
     */
    @JsonProperty("alert_grouping_settings")
    protected List<AlertGroupingSetting> alertGroupingSettings;

    /**
     * Constructs a validated instance of {@link ListAlertGroupingSettings200Response}.
     *
     * @param spec the specification to process
     */
    public ListAlertGroupingSettings200Response(Consumer<ListAlertGroupingSettings200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ListAlertGroupingSettings200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ListAlertGroupingSettings200Response(Consumer)} instead.
     * @param alertGroupingSettings The list of alert grouping settings your account has.
     */
    @ApiStatus.Internal
    public ListAlertGroupingSettings200Response(List<AlertGroupingSetting> alertGroupingSettings) {
        this.alertGroupingSettings = alertGroupingSettings;
    }

}
