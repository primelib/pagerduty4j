package io.github.primelib.pagerduty4j.rest.api;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.pagerduty4j.rest.model.AnalyticsModel;
import io.github.primelib.pagerduty4j.rest.model.AnalyticsRawIncident;
import io.github.primelib.pagerduty4j.rest.model.AnalyticsResponderFilter;
import io.github.primelib.pagerduty4j.rest.model.AssociateServiceToIncidentWorkflowTriggerRequest;
import io.github.primelib.pagerduty4j.rest.model.AuditRecordResponseSchema;
import io.github.primelib.pagerduty4j.rest.model.AutomationActionsActionClassificationEnum;
import io.github.primelib.pagerduty4j.rest.model.ConvertServiceEventRulesToEventOrchestration200Response;
import io.github.primelib.pagerduty4j.rest.model.CreateAddon201Response;
import io.github.primelib.pagerduty4j.rest.model.CreateAddonRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateAutomationAction201Response;
import io.github.primelib.pagerduty4j.rest.model.CreateAutomationActionInvocation201Response;
import io.github.primelib.pagerduty4j.rest.model.CreateAutomationActionInvocationRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateAutomationActionRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateAutomationActionServiceAssocationRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateAutomationActionTeamAssociationRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateAutomationActionsRunner201Response;
import io.github.primelib.pagerduty4j.rest.model.CreateAutomationActionsRunnerRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateBusinessService200Response;
import io.github.primelib.pagerduty4j.rest.model.CreateBusinessServiceAccountSubscription200Response;
import io.github.primelib.pagerduty4j.rest.model.CreateBusinessServiceNotificationSubscribers200Response;
import io.github.primelib.pagerduty4j.rest.model.CreateBusinessServiceNotificationSubscribersRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateBusinessServiceRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateCustomFieldsFieldOptionRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateCustomFieldsFieldRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateEntityTypeByIdChangeTagsRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateEscalationPolicyRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateIncident201Response;
import io.github.primelib.pagerduty4j.rest.model.CreateIncidentNote200Response;
import io.github.primelib.pagerduty4j.rest.model.CreateIncidentNoteRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateIncidentRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateIncidentResponderRequest200Response;
import io.github.primelib.pagerduty4j.rest.model.CreateIncidentResponderRequestRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateIncidentSnoozeRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateIncidentStatusUpdate200Response;
import io.github.primelib.pagerduty4j.rest.model.CreateIncidentStatusUpdateRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateIncidentWorkflowInstance201Response;
import io.github.primelib.pagerduty4j.rest.model.CreateIncidentWorkflowInstanceRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateIncidentWorkflowTriggerRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateMaintenanceWindowRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateResponsePlay201Response;
import io.github.primelib.pagerduty4j.rest.model.CreateResponsePlayRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateRuleset201Response;
import io.github.primelib.pagerduty4j.rest.model.CreateRulesetEventRule201Response;
import io.github.primelib.pagerduty4j.rest.model.CreateRulesetEventRuleRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateRulesetRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateScheduleOverride201ResponseInner;
import io.github.primelib.pagerduty4j.rest.model.CreateScheduleOverrideRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateScheduleRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateServiceDependency200Response;
import io.github.primelib.pagerduty4j.rest.model.CreateServiceDependencyRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateServiceEventRule201Response;
import io.github.primelib.pagerduty4j.rest.model.CreateServiceEventRuleRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateServiceIntegrationRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateServiceRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateTagsRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateTeamNotificationSubscriptionsRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateTeamRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateTemplate201Response;
import io.github.primelib.pagerduty4j.rest.model.CreateTemplateRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateUserContactMethod201Response;
import io.github.primelib.pagerduty4j.rest.model.CreateUserContactMethodRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateUserHandoffNotificationRuleRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateUserNotificationRuleRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateUserRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateUserStatusUpdateNotificationRule201Response;
import io.github.primelib.pagerduty4j.rest.model.CreateUserStatusUpdateNotificationRuleRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateWebhookSubscriptionRequest;
import io.github.primelib.pagerduty4j.rest.model.DeleteServiceDependencyRequest;
import io.github.primelib.pagerduty4j.rest.model.GetAllAutomationActions200Response;
import io.github.primelib.pagerduty4j.rest.model.GetAnalyticsIncidentResponsesById200Response;
import io.github.primelib.pagerduty4j.rest.model.GetAnalyticsIncidentResponsesByIdRequest;
import io.github.primelib.pagerduty4j.rest.model.GetAnalyticsIncidents200Response;
import io.github.primelib.pagerduty4j.rest.model.GetAnalyticsIncidentsRequest;
import io.github.primelib.pagerduty4j.rest.model.GetAnalyticsMetricsIncidentsAll200Response;
import io.github.primelib.pagerduty4j.rest.model.GetAnalyticsMetricsIncidentsEscalationPolicy200Response;
import io.github.primelib.pagerduty4j.rest.model.GetAnalyticsMetricsRespondersAll200Response;
import io.github.primelib.pagerduty4j.rest.model.GetAnalyticsResponderIncidents200Response;
import io.github.primelib.pagerduty4j.rest.model.GetAnalyticsResponderIncidentsRequest;
import io.github.primelib.pagerduty4j.rest.model.GetAutomationActionsActionServiceAssociation200Response;
import io.github.primelib.pagerduty4j.rest.model.GetAutomationActionsActionServiceAssociations200Response;
import io.github.primelib.pagerduty4j.rest.model.GetAutomationActionsActionTeamAssociation200Response;
import io.github.primelib.pagerduty4j.rest.model.GetAutomationActionsActionTeamAssociations200Response;
import io.github.primelib.pagerduty4j.rest.model.GetAutomationActionsInvocation200Response;
import io.github.primelib.pagerduty4j.rest.model.GetAutomationActionsRunner200Response;
import io.github.primelib.pagerduty4j.rest.model.GetAutomationActionsRunners200Response;
import io.github.primelib.pagerduty4j.rest.model.GetBusinessServicePriorityThresholds200Response;
import io.github.primelib.pagerduty4j.rest.model.GetBusinessServiceServiceDependencies200Response;
import io.github.primelib.pagerduty4j.rest.model.GetBusinessServiceSubscribers200Response;
import io.github.primelib.pagerduty4j.rest.model.GetBusinessServiceSupportingServiceImpacts200Response;
import io.github.primelib.pagerduty4j.rest.model.GetBusinessServiceTopLevelImpactors200Response;
import io.github.primelib.pagerduty4j.rest.model.GetChangeEvent200Response;
import io.github.primelib.pagerduty4j.rest.model.GetEntityTypeByIdTags200Response;
import io.github.primelib.pagerduty4j.rest.model.GetExtension200Response;
import io.github.primelib.pagerduty4j.rest.model.GetExtensionSchema200Response;
import io.github.primelib.pagerduty4j.rest.model.GetIncidentAlert200Response;
import io.github.primelib.pagerduty4j.rest.model.GetIncidentFieldValues200Response;
import io.github.primelib.pagerduty4j.rest.model.GetIncidentImpactedBusinessServices200Response;
import io.github.primelib.pagerduty4j.rest.model.GetIncidentNotificationSubscribers200Response;
import io.github.primelib.pagerduty4j.rest.model.GetIncidentWorkflowAction200Response;
import io.github.primelib.pagerduty4j.rest.model.GetIncidentWorkflowTrigger200Response;
import io.github.primelib.pagerduty4j.rest.model.GetLogEntry200Response;
import io.github.primelib.pagerduty4j.rest.model.GetOrchActiveStatus200Response;
import io.github.primelib.pagerduty4j.rest.model.GetOrchestrationIntegration200Response;
import io.github.primelib.pagerduty4j.rest.model.GetOutlierIncident200Response;
import io.github.primelib.pagerduty4j.rest.model.GetPastIncidents200Response;
import io.github.primelib.pagerduty4j.rest.model.GetPausedIncidentReportAlerts200Response;
import io.github.primelib.pagerduty4j.rest.model.GetPausedIncidentReportCounts200Response;
import io.github.primelib.pagerduty4j.rest.model.GetRelatedIncidents200Response;
import io.github.primelib.pagerduty4j.rest.model.GetStatusDashboardById200Response;
import io.github.primelib.pagerduty4j.rest.model.GetTagsByEntityType200Response;
import io.github.primelib.pagerduty4j.rest.model.GetTeamNotificationSubscriptions200Response;
import io.github.primelib.pagerduty4j.rest.model.GetTemplates200Response;
import io.github.primelib.pagerduty4j.rest.model.GetUserContactMethods200Response;
import io.github.primelib.pagerduty4j.rest.model.GetUserHandoffNotificationRules200Response;
import io.github.primelib.pagerduty4j.rest.model.GetUserLicense200Response;
import io.github.primelib.pagerduty4j.rest.model.GetUserNotificationRules200Response;
import io.github.primelib.pagerduty4j.rest.model.GetUserSession200Response;
import io.github.primelib.pagerduty4j.rest.model.GetUserSessions200Response;
import io.github.primelib.pagerduty4j.rest.model.GetUserStatusUpdateNotificationRule200Response;
import io.github.primelib.pagerduty4j.rest.model.GetUserStatusUpdateNotificationRules200Response;
import io.github.primelib.pagerduty4j.rest.model.GetVendor200Response;
import io.github.primelib.pagerduty4j.rest.model.ListAbilities200Response;
import io.github.primelib.pagerduty4j.rest.model.ListAddon200Response;
import io.github.primelib.pagerduty4j.rest.model.ListAutomationActionInvocations200Response;
import io.github.primelib.pagerduty4j.rest.model.ListBusinessServices200Response;
import io.github.primelib.pagerduty4j.rest.model.ListChangeEvents200Response;
import io.github.primelib.pagerduty4j.rest.model.ListCustomFieldsFieldOptions200Response;
import io.github.primelib.pagerduty4j.rest.model.ListCustomFieldsFields200Response;
import io.github.primelib.pagerduty4j.rest.model.ListEscalationPolicies200Response;
import io.github.primelib.pagerduty4j.rest.model.ListEventOrchestrations200Response;
import io.github.primelib.pagerduty4j.rest.model.ListExtensionSchemas200Response;
import io.github.primelib.pagerduty4j.rest.model.ListIncidentAlerts200Response;
import io.github.primelib.pagerduty4j.rest.model.ListIncidentLogEntries200Response;
import io.github.primelib.pagerduty4j.rest.model.ListIncidentNotes200Response;
import io.github.primelib.pagerduty4j.rest.model.ListIncidentRelatedChangeEvents200Response;
import io.github.primelib.pagerduty4j.rest.model.ListIncidentWorkflowActions200Response;
import io.github.primelib.pagerduty4j.rest.model.ListIncidentWorkflowTriggers200Response;
import io.github.primelib.pagerduty4j.rest.model.ListIncidentWorkflows200Response;
import io.github.primelib.pagerduty4j.rest.model.ListIncidents200Response;
import io.github.primelib.pagerduty4j.rest.model.ListLicenseAllocations200Response;
import io.github.primelib.pagerduty4j.rest.model.ListLicenses200Response;
import io.github.primelib.pagerduty4j.rest.model.ListMaintenanceWindows200Response;
import io.github.primelib.pagerduty4j.rest.model.ListNotifications200Response;
import io.github.primelib.pagerduty4j.rest.model.ListOnCalls200Response;
import io.github.primelib.pagerduty4j.rest.model.ListOrchestrationIntegrations200Response;
import io.github.primelib.pagerduty4j.rest.model.ListPriorities200Response;
import io.github.primelib.pagerduty4j.rest.model.ListResourceStandardsManyServices200Response;
import io.github.primelib.pagerduty4j.rest.model.ListResponsePlays200Response;
import io.github.primelib.pagerduty4j.rest.model.ListRulesetEventRules200Response;
import io.github.primelib.pagerduty4j.rest.model.ListRulesets200Response;
import io.github.primelib.pagerduty4j.rest.model.ListScheduleOverrides201Response;
import io.github.primelib.pagerduty4j.rest.model.ListScheduleUsers200Response;
import io.github.primelib.pagerduty4j.rest.model.ListSchedules200Response;
import io.github.primelib.pagerduty4j.rest.model.ListServiceEventRules200Response;
import io.github.primelib.pagerduty4j.rest.model.ListServices200Response;
import io.github.primelib.pagerduty4j.rest.model.ListStandards200Response;
import io.github.primelib.pagerduty4j.rest.model.ListStatusDashboards200Response;
import io.github.primelib.pagerduty4j.rest.model.ListTeamUsers200Response;
import io.github.primelib.pagerduty4j.rest.model.ListTeams200Response;
import io.github.primelib.pagerduty4j.rest.model.ListUsers200Response;
import io.github.primelib.pagerduty4j.rest.model.ListVendors200Response;
import io.github.primelib.pagerduty4j.rest.model.ListWebhookSubscriptions200Response;
import io.github.primelib.pagerduty4j.rest.model.MergeIncidents200Response;
import io.github.primelib.pagerduty4j.rest.model.MergeIncidentsRequest;
import io.github.primelib.pagerduty4j.rest.model.MigrateOrchestrationIntegrationRequest;
import java.time.OffsetDateTime;
import io.github.primelib.pagerduty4j.rest.model.OrchestrationGlobal;
import io.github.primelib.pagerduty4j.rest.model.OrchestrationRouter;
import io.github.primelib.pagerduty4j.rest.model.OrchestrationUnrouted;
import io.github.primelib.pagerduty4j.rest.model.PostIncidentWorkflowRequest;
import io.github.primelib.pagerduty4j.rest.model.PostOrchestration201Response;
import io.github.primelib.pagerduty4j.rest.model.PostOrchestrationIntegration201Response;
import io.github.primelib.pagerduty4j.rest.model.PostOrchestrationIntegrationRequest;
import io.github.primelib.pagerduty4j.rest.model.PostOrchestrationRequest;
import io.github.primelib.pagerduty4j.rest.model.PutBusinessServicePriorityThresholds200Response;
import io.github.primelib.pagerduty4j.rest.model.PutBusinessServicePriorityThresholdsRequest;
import io.github.primelib.pagerduty4j.rest.model.PutIncidentManualBusinessServiceAssociation200Response;
import io.github.primelib.pagerduty4j.rest.model.PutIncidentManualBusinessServiceAssociationRequest;
import io.github.primelib.pagerduty4j.rest.model.RemoveBusinessServiceNotificationSubscriber200Response;
import io.github.primelib.pagerduty4j.rest.model.RenderTemplateRequest;
import io.github.primelib.pagerduty4j.rest.model.RenderedTemplate;
import io.github.primelib.pagerduty4j.rest.model.RunResponsePlay200Response;
import io.github.primelib.pagerduty4j.rest.model.ServiceOrchestration;
import java.util.Set;
import io.github.primelib.pagerduty4j.rest.model.SetIncidentFieldValuesRequest;
import io.github.primelib.pagerduty4j.rest.model.Standard;
import io.github.primelib.pagerduty4j.rest.model.StandardApplied;
import io.github.primelib.pagerduty4j.rest.model.UpdateAutomationActionRequest;
import io.github.primelib.pagerduty4j.rest.model.UpdateAutomationActionsRunnerRequest;
import io.github.primelib.pagerduty4j.rest.model.UpdateBusinessServiceRequest;
import io.github.primelib.pagerduty4j.rest.model.UpdateChangeEventRequest;
import io.github.primelib.pagerduty4j.rest.model.UpdateCustomFieldsField200Response;
import io.github.primelib.pagerduty4j.rest.model.UpdateCustomFieldsFieldOptionRequest;
import io.github.primelib.pagerduty4j.rest.model.UpdateCustomFieldsFieldRequest;
import io.github.primelib.pagerduty4j.rest.model.UpdateIncident200Response;
import io.github.primelib.pagerduty4j.rest.model.UpdateIncidentAlertsRequest;
import io.github.primelib.pagerduty4j.rest.model.UpdateIncidentRequest;
import io.github.primelib.pagerduty4j.rest.model.UpdateIncidentsRequest;
import io.github.primelib.pagerduty4j.rest.model.UpdateLogEntryChannelRequest;
import io.github.primelib.pagerduty4j.rest.model.UpdateOrchPathGlobal200Response;
import io.github.primelib.pagerduty4j.rest.model.UpdateOrchPathRouter200Response;
import io.github.primelib.pagerduty4j.rest.model.UpdateOrchPathService200Response;
import io.github.primelib.pagerduty4j.rest.model.UpdateOrchPathUnrouted200Response;
import io.github.primelib.pagerduty4j.rest.model.UpdateRulesetEventRuleRequest;
import io.github.primelib.pagerduty4j.rest.model.UpdateRulesetRequest;
import io.github.primelib.pagerduty4j.rest.model.UpdateServiceEventRuleRequest;
import io.github.primelib.pagerduty4j.rest.model.UpdateStandardRequest;
import io.github.primelib.pagerduty4j.rest.model.UpdateTeamUserRequest;
import io.github.primelib.pagerduty4j.rest.model.UpdateUserHandoffNotification200Response;
import io.github.primelib.pagerduty4j.rest.model.UpdateUserNotificationRule200Response;
import io.github.primelib.pagerduty4j.rest.model.UpdateUserStatusUpdateNotificationRule200Response;
import io.github.primelib.pagerduty4j.rest.model.WebhookSubscriptionUpdate;
import java.util.concurrent.CompletableFuture;
import feign.RequestLine;
import feign.Param;
import feign.Headers;

@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public interface PagerDutyRESTAsyncApi {

    /**
     * Associate a Trigger and Service
     * <p>
     * Associate a Service with an existing Incident Workflow Trigger
     * Scoped OAuth requires: {@code incident_workflows.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param associateServiceToIncidentWorkflowTriggerRequest  (optional)
     */
    @RequestLine("POST /incident_workflows/triggers/{id}/services")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateIncidentWorkflowTriggerRequest> associateServiceToIncidentWorkflowTrigger(@Param("id") @NotNull String id, @Nullable AssociateServiceToIncidentWorkflowTriggerRequest associateServiceToIncidentWorkflowTriggerRequest);

    /**
     * Convert a Service's Event Rules into Event Orchestration Rules
     * <p>
     * Convert this Service's Event Rules into functionally equivalent Event Orchestration Rules.
     * Sending a request to this API endpoint has several effects:
     * 1. Automatically creates Event Orchestration Rules for this Service that will behave identically as this Service's currently configured Event Rules. 2. Makes all existing Event Rules for this Service read-only. All future updates need to be made via the newly created Event Orchestration rules.
     * Sending a request to this API endpoint will **not** change how future events will be processed. If past events for this Service have been evaluated via Event Rules then new events sent to this Service will also continue to be evaluated via the (now read-only) Event Rules. To change this Service so that new events start being evaluated via the newly created Event Orchestration Rules use the [Update the Service Orchestration active status for a Service API](https://developer.pagerduty.com/api-reference/855659be83d9e-update-the-service-orchestration-active-status-for-a-service).
     * &amp;gt; ### End-of-life &amp;gt; Event Rules will end-of-life soon. We highly recommend that you use this API to [migrate to Event Orchestration](https://support.pagerduty.com/docs/migrate-to-event-orchestration) as soon as possible so you can take advantage of the new functionality, such as improved UI, rule creation, APIs and Terraform support, advanced conditions, and rule nesting.
     * Scoped OAuth requires: {@code services.write} 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("POST /services/{id}/rules/convert")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<ConvertServiceEventRulesToEventOrchestration200Response> convertServiceEventRulesToEventOrchestration(@Param("id") @NotNull String id);

    /**
     * Install an Add-on
     * <p>
     * Install an Add-on for your account.
     * Addon's are pieces of functionality that developers can write to insert new functionality into PagerDuty's UI.
     * Given a configuration containing a {@code src} parameter, that URL will be embedded in an {@code iframe} on a page that's available to users from a drop-down menu.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#add-ons)
     * Scoped OAuth requires: {@code addons.write} 
     *
     * @param createAddonRequest   The Add-on to be installed. (optional)
     */
    @RequestLine("POST /addons")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateAddon201Response> createAddon(@Nullable CreateAddonRequest createAddonRequest);

    /**
     * Create an Automation Action
     * <p>
     * Create a Script, Process Automation, or Runbook Automation action 
     *
     * @param createAutomationActionRequest  (required)
     */
    @RequestLine("POST /automation_actions/actions")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateAutomationAction201Response> createAutomationAction(@NotNull CreateAutomationActionRequest createAutomationActionRequest);

    /**
     * Create an Invocation
     * <p>
     * Invokes an Action 
     *
     * @param id                   The ID of the resource. (required)
     * @param createAutomationActionInvocationRequest  (required)
     */
    @RequestLine("POST /automation_actions/actions/{id}/invocations")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateAutomationActionInvocation201Response> createAutomationActionInvocation(@Param("id") @NotNull String id, @NotNull CreateAutomationActionInvocationRequest createAutomationActionInvocationRequest);

    /**
     * Associate an Automation Action with a service
     * <p>
     * Associate an Automation Action with a service 
     *
     * @param id                   The ID of the resource. (required)
     * @param createAutomationActionServiceAssocationRequest  (required)
     */
    @RequestLine("POST /automation_actions/actions/{id}/services")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateAutomationActionServiceAssocationRequest> createAutomationActionServiceAssocation(@Param("id") @NotNull String id, @NotNull CreateAutomationActionServiceAssocationRequest createAutomationActionServiceAssocationRequest);

    /**
     * Associate an Automation Action with a team
     * <p>
     * Associate an Automation Action with a team 
     *
     * @param id                   The ID of the resource. (required)
     * @param createAutomationActionTeamAssociationRequest  (required)
     */
    @RequestLine("POST /automation_actions/actions/{id}/teams")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateAutomationActionTeamAssociationRequest> createAutomationActionTeamAssociation(@Param("id") @NotNull String id, @NotNull CreateAutomationActionTeamAssociationRequest createAutomationActionTeamAssociationRequest);

    /**
     * Create an Automation Action runner.
     * <p>
     * Create a Process Automation or a Runbook Automation runner. 
     *
     * @param createAutomationActionsRunnerRequest  (required)
     */
    @RequestLine("POST /automation_actions/runners")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateAutomationActionsRunner201Response> createAutomationActionsRunner(@NotNull CreateAutomationActionsRunnerRequest createAutomationActionsRunnerRequest);

    /**
     * Associate a runner with a team
     * <p>
     * Associate a runner with a team 
     *
     * @param id                   The ID of the resource. (required)
     * @param createAutomationActionTeamAssociationRequest  (required)
     */
    @RequestLine("POST /automation_actions/runners/{id}/teams")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateAutomationActionTeamAssociationRequest> createAutomationActionsRunnerTeamAssociation(@Param("id") @NotNull String id, @NotNull CreateAutomationActionTeamAssociationRequest createAutomationActionTeamAssociationRequest);

    /**
     * Create a Business Service
     * <p>
     * Create a new Business Service.
     * Business services model capabilities that span multiple technical services and that may be owned by several different teams.
     * There is a limit of 5,000 business services per account. If the limit is reached, the API will respond with an error.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#business-services)
     * Scoped OAuth requires: {@code services.write} 
     *
     * @param createBusinessServiceRequest  (optional)
     */
    @RequestLine("POST /business_services")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateBusinessService200Response> createBusinessService(@Nullable CreateBusinessServiceRequest createBusinessServiceRequest);

    /**
     * Create Business Service Account Subscription
     * <p>
     * Subscribe your Account to a Business Service.
     * Scoped OAuth requires: {@code subscribers.write} 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("POST /business_services/{id}/account_subscription")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2"
    })
    CompletableFuture<CreateBusinessServiceAccountSubscription200Response> createBusinessServiceAccountSubscription(@Param("id") @NotNull String id);

    /**
     * Create Business Service Subscribers
     * <p>
     * Subscribe the given entities to the given Business Service.
     * Scoped OAuth requires: {@code subscribers.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param createBusinessServiceNotificationSubscribersRequest The entities to subscribe. (optional)
     */
    @RequestLine("POST /business_services/{id}/subscribers")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateBusinessServiceNotificationSubscribers200Response> createBusinessServiceNotificationSubscribers(@Param("id") @NotNull String id, @Nullable CreateBusinessServiceNotificationSubscribersRequest createBusinessServiceNotificationSubscribersRequest);

    /**
     * Create a Change Event
     * <p>
     * Sending Change Events is documented as part of the V2 Events API. See [{@code Send Change Event}](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODI2Ng-send-change-events-to-the-pager-duty-events-api). 
     *
     */
    @RequestLine("POST /change_events")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<Void> createChangeEvent();

    /**
     * Create a Field
     * <p>
     * Create a new Field, along with the Field Options if provided. An account may have up to 10 Fields.
     * Scoped OAuth requires: {@code custom_fields.write} 
     *
     * @param createCustomFieldsFieldRequest  (optional)
     */
    @RequestLine("POST /incidents/custom_fields")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<CreateCustomFieldsFieldRequest> createCustomFieldsField(@Nullable CreateCustomFieldsFieldRequest createCustomFieldsFieldRequest);

    /**
     * Create a Field Option
     * <p>
     * Create a new Field Option. Field Options may only be created for Fields that have {@code field_options}. A Field may have no more than 10 enabled options.
     * Scoped OAuth requires: {@code custom_fields.write} 
     *
     * @param fieldId              The ID of the field. (required)
     * @param createCustomFieldsFieldOptionRequest  (optional)
     */
    @RequestLine("POST /incidents/custom_fields/{fieldId}/field_options")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<CreateCustomFieldsFieldOptionRequest> createCustomFieldsFieldOption(@Param("fieldId") @NotNull String fieldId, @Nullable CreateCustomFieldsFieldOptionRequest createCustomFieldsFieldOptionRequest);

    /**
     * Assign tags
     * <p>
     * Assign existing or new tags.
     * A Tag is applied to Escalation Policies, Teams or Users and can be used to filter them.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#tags)
     * Scoped OAuth requires: {@code tags.write} 
     *
     * @param entityType           Type of entity related with the tag (required)
     * @param id                   The ID of the resource. (required)
     * @param createEntityTypeByIdChangeTagsRequest  (optional)
     */
    @RequestLine("POST /{entityType}/{id}/change_tags")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<Object> createEntityTypeByIdChangeTags(@Param("entityType") @NotNull String entityType, @Param("id") @NotNull String id, @Nullable CreateEntityTypeByIdChangeTagsRequest createEntityTypeByIdChangeTagsRequest);

    /**
     * Create an escalation policy
     * <p>
     * Creates a new escalation policy. At least one escalation rule must be provided.
     * Escalation policies define which user should be alerted at which time.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#escalation-policies)
     * Scoped OAuth requires: {@code escalation_policies.write} 
     *
     * @param from                 The email address of a valid user associated with the account making the request. This is optional, and is only used for change tracking. (optional)
     * @param createEscalationPolicyRequest The escalation policy to be created. (optional)
     */
    @RequestLine("POST /escalation_policies")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json", 
        "From: {from}"
    })
    CompletableFuture<CreateEscalationPolicyRequest> createEscalationPolicy(@Param("from") @Nullable String from, @Nullable CreateEscalationPolicyRequest createEscalationPolicyRequest);

    /**
     * Create an Incident
     * <p>
     * Create an incident synchronously without a corresponding event from a monitoring service.
     * An incident represents a problem or an issue that needs to be addressed and resolved.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#incidents)
     * Scoped OAuth requires: {@code incidents.write} 
     *
     * @param from                 The email address of a valid user associated with the account making the request. (required)
     * @param createIncidentRequest  (optional)
     */
    @RequestLine("POST /incidents")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json", 
        "From: {from}"
    })
    CompletableFuture<CreateIncident201Response> createIncident(@Param("from") @NotNull String from, @Nullable CreateIncidentRequest createIncidentRequest);

    /**
     * Create a note on an incident
     * <p>
     * Create a new note for the specified incident.
     * An incident represents a problem or an issue that needs to be addressed and resolved.
     * A maximum of 2000 notes can be added to an incident.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#incidents)
     * Scoped OAuth requires: {@code incidents.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param from                 The email address of a valid user associated with the account making the request. (required)
     * @param createIncidentNoteRequest  (optional)
     */
    @RequestLine("POST /incidents/{id}/notes")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json", 
        "From: {from}"
    })
    CompletableFuture<CreateIncidentNote200Response> createIncidentNote(@Param("id") @NotNull String id, @Param("from") @NotNull String from, @Nullable CreateIncidentNoteRequest createIncidentNoteRequest);

    /**
     * Add Notification Subscribers
     * <p>
     * Subscribe the given entities to Incident Status Update Notifications.
     * Scoped OAuth requires: {@code subscribers.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param createBusinessServiceNotificationSubscribersRequest The entities to subscribe. (optional)
     */
    @RequestLine("POST /incidents/{id}/status_updates/subscribers")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateBusinessServiceNotificationSubscribers200Response> createIncidentNotificationSubscribers(@Param("id") @NotNull String id, @Nullable CreateBusinessServiceNotificationSubscribersRequest createBusinessServiceNotificationSubscribersRequest);

    /**
     * Create a responder request for an incident
     * <p>
     * Send a new responder request for the specified incident.
     * An incident represents a problem or an issue that needs to be addressed and resolved.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#incidents)
     * Scoped OAuth requires: {@code incidents.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param from                 The email address of a valid user associated with the account making the request. (required)
     * @param createIncidentResponderRequestRequest  (optional)
     */
    @RequestLine("POST /incidents/{id}/responder_requests")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json", 
        "From: {from}"
    })
    CompletableFuture<CreateIncidentResponderRequest200Response> createIncidentResponderRequest(@Param("id") @NotNull String id, @Param("from") @NotNull String from, @Nullable CreateIncidentResponderRequestRequest createIncidentResponderRequestRequest);

    /**
     * Snooze an incident
     * <p>
     * Snooze an incident.
     * An incident represents a problem or an issue that needs to be addressed and resolved.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#incidents)
     * Scoped OAuth requires: {@code incidents.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param from                 The email address of a valid user associated with the account making the request. (required)
     * @param createIncidentSnoozeRequest  (optional)
     */
    @RequestLine("POST /incidents/{id}/snooze")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json", 
        "From: {from}"
    })
    CompletableFuture<CreateIncident201Response> createIncidentSnooze(@Param("id") @NotNull String id, @Param("from") @NotNull String from, @Nullable CreateIncidentSnoozeRequest createIncidentSnoozeRequest);

    /**
     * Create a status update on an incident
     * <p>
     * Create a new status update for the specified incident. Optionally pass {@code subject} and {@code html_message} properties in the request body to override the email notification that gets sent.
     * An incident represents a problem or an issue that needs to be addressed and resolved.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#incidents)
     * Scoped OAuth requires: {@code incidents.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param from                 The email address of a valid user associated with the account making the request. (required)
     * @param createIncidentStatusUpdateRequest  (optional)
     */
    @RequestLine("POST /incidents/{id}/status_updates")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json", 
        "From: {from}"
    })
    CompletableFuture<CreateIncidentStatusUpdate200Response> createIncidentStatusUpdate(@Param("id") @NotNull String id, @Param("from") @NotNull String from, @Nullable CreateIncidentStatusUpdateRequest createIncidentStatusUpdateRequest);

    /**
     * Start an Incident Workflow Instance
     * <p>
     * Start an Instance of an Incident Workflow. Sometimes referred to as "triggering a workflow on an incident."
     * An Incident Workflow is a sequence of configurable Steps and associated Triggers that can execute automated Actions for a given Incident.
     * Scoped OAuth requires: {@code incident_workflows:instances.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param createIncidentWorkflowInstanceRequest  (optional)
     */
    @RequestLine("POST /incident_workflows/{id}/instances")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateIncidentWorkflowInstance201Response> createIncidentWorkflowInstance(@Param("id") @NotNull String id, @Nullable CreateIncidentWorkflowInstanceRequest createIncidentWorkflowInstanceRequest);

    /**
     * Create a Trigger
     * <p>
     * Create new Incident Workflow Trigger
     * Scoped OAuth requires: {@code incident_workflows.write} 
     *
     * @param createIncidentWorkflowTriggerRequest  (optional)
     */
    @RequestLine("POST /incident_workflows/triggers")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateIncidentWorkflowTriggerRequest> createIncidentWorkflowTrigger(@Nullable CreateIncidentWorkflowTriggerRequest createIncidentWorkflowTriggerRequest);

    /**
     * Create a maintenance window
     * <p>
     * Create a new maintenance window for the specified services. No new incidents will be created for a service that is in maintenance.
     * A Maintenance Window is used to temporarily disable one or more Services for a set period of time.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#maintenance-windows)
     * Scoped OAuth requires: {@code services.write} 
     *
     * @param from                 The email address of a valid user associated with the account making the request. (required)
     * @param createMaintenanceWindowRequest The maintenance window object. (optional)
     */
    @RequestLine("POST /maintenance_windows")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json", 
        "From: {from}"
    })
    CompletableFuture<CreateMaintenanceWindowRequest> createMaintenanceWindow(@Param("from") @NotNull String from, @Nullable CreateMaintenanceWindowRequest createMaintenanceWindowRequest);

    /**
     * Create a Response Play
     * <p>
     * Creates a new Response Plays.
     * Response Plays allow you to create packages of Incident Actions that can be applied during an Incident's life cycle.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#response-plays)
     * Scoped OAuth requires: {@code response_plays.write} 
     *
     * @param from                 The email address of a valid user associated with the account making the request. (required)
     * @param createResponsePlayRequest The Response Play to be created. (optional)
     * @deprecated
     */
    @Deprecated
    @RequestLine("POST /response_plays")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json", 
        "From: {from}"
    })
    CompletableFuture<CreateResponsePlay201Response> createResponsePlay(@Param("from") @NotNull String from, @Nullable CreateResponsePlayRequest createResponsePlayRequest);

    /**
     * Create a Ruleset
     * <p>
     * Create a new Ruleset. &amp;lt;!-- theme: warning --&amp;gt; &amp;gt; ### End-of-life &amp;gt; Rulesets and Event Rules will end-of-life soon. We highly recommend that you [migrate to Event Orchestration](https://support.pagerduty.com/docs/migrate-to-event-orchestration) as soon as possible so you can take advantage of the new functionality, such as improved UI, rule creation, APIs and Terraform support, advanced conditions, and rule nesting.
     * Rulesets allow you to route events to an endpoint and create collections of Event Rules, which define sets of actions to take based on event content.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#rulesets)
     * Scoped OAuth requires: {@code event_rules.write} 
     *
     * @param createRulesetRequest  (optional)
     */
    @RequestLine("POST /rulesets")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateRuleset201Response> createRuleset(@Nullable CreateRulesetRequest createRulesetRequest);

    /**
     * Create an Event Rule
     * <p>
     * Create a new Event Rule. &amp;lt;!-- theme: warning --&amp;gt; &amp;gt; ### End-of-life &amp;gt; Rulesets and Event Rules will end-of-life soon. We highly recommend that you [migrate to Event Orchestration](https://support.pagerduty.com/docs/migrate-to-event-orchestration) as soon as possible so you can take advantage of the new functionality, such as improved UI, rule creation, APIs and Terraform support, advanced conditions, and rule nesting.
     * Rulesets allow you to route events to an endpoint and create collections of Event Rules, which define sets of actions to take based on event content.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#rulesets)
     * Note: Create and Update on rules will accept 'description' or 'summary' interchangeably as an extraction action target. Get and List on rules will always return 'summary' as the target. If you are expecting 'description' please change your automation code to expect 'summary' instead.
     * Scoped OAuth requires: {@code event_rules.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param createRulesetEventRuleRequest  (optional)
     */
    @RequestLine("POST /rulesets/{id}/rules")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateRulesetEventRule201Response> createRulesetEventRule(@Param("id") @NotNull String id, @Nullable CreateRulesetEventRuleRequest createRulesetEventRuleRequest);

    /**
     * Create a schedule
     * <p>
     * Create a new on-call schedule.
     * A Schedule determines the time periods that users are On-Call.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#schedules)
     * Scoped OAuth requires: {@code schedules.write} 
     *
     * @param overflow             Any on-call schedule entries that pass the date range bounds will be truncated at the bounds, unless the parameter {@code overflow=true} is passed. This parameter defaults to false. For instance, if your schedule is a rotation that changes daily at midnight UTC, and your date range is from {@code 2011-06-01T10:00:00Z} to {@code 2011-06-01T14:00:00Z}:   - If you don't pass the {@code overflow=true} parameter, you will get one schedule entry returned with a start of {@code 2011-06-01T10:00:00Z} and end of {@code 2011-06-01T14:00:00Z}. - If you do pass the {@code overflow=true} parameter, you will get one schedule entry returned with a start of {@code 2011-06-01T00:00:00Z} and end of {@code 2011-06-02T00:00:00Z}.  (optional, defaults to false)
     * @param createScheduleRequest The schedule to be created. (optional)
     */
    @RequestLine("POST /schedules?overflow={overflow}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateScheduleRequest> createSchedule(@Param("overflow") @Nullable Boolean overflow, @Nullable CreateScheduleRequest createScheduleRequest);

    /**
     * Create one or more overrides
     * <p>
     * Create one or more overrides, each for a specific user covering a specified time range. If you create an override on top of an existing override, the last created override will have priority.
     * A Schedule determines the time periods that users are On-Call.
     * Note: An older implementation of this endpoint only supported creating a single ocverride per request. That functionality is still supported, but deprecated and may be removed in the future.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#schedules)
     * Scoped OAuth requires: {@code schedules.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param createScheduleOverrideRequest The overrides to be created (required)
     */
    @RequestLine("POST /schedules/{id}/overrides")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<Set<CreateScheduleOverride201ResponseInner>> createScheduleOverride(@Param("id") @NotNull String id, @NotNull CreateScheduleOverrideRequest createScheduleOverrideRequest);

    /**
     * Preview a schedule
     * <p>
     * Preview what an on-call schedule would look like without saving it.
     * A Schedule determines the time periods that users are On-Call.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#schedules)
     * Scoped OAuth requires: {@code schedules.write} 
     *
     * @param since                The start of the date range over which you want to search. (optional)
     * @param until                The end of the date range over which you want to search. (optional)
     * @param overflow             Any on-call schedule entries that pass the date range bounds will be truncated at the bounds, unless the parameter {@code overflow=true} is passed. This parameter defaults to false. For instance, if your schedule is a rotation that changes daily at midnight UTC, and your date range is from {@code 2011-06-01T10:00:00Z} to {@code 2011-06-01T14:00:00Z}:   - If you don't pass the {@code overflow=true} parameter, you will get one schedule entry returned with a start of {@code 2011-06-01T10:00:00Z} and end of {@code 2011-06-01T14:00:00Z}. - If you do pass the {@code overflow=true} parameter, you will get one schedule entry returned with a start of {@code 2011-06-01T00:00:00Z} and end of {@code 2011-06-02T00:00:00Z}.  (optional, defaults to false)
     * @param createScheduleRequest The schedule to be previewed. (optional)
     */
    @RequestLine("POST /schedules/preview?since={since}&until={until}&overflow={overflow}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateScheduleRequest> createSchedulePreview(@Param("since") @Nullable OffsetDateTime since, @Param("until") @Nullable OffsetDateTime until, @Param("overflow") @Nullable Boolean overflow, @Nullable CreateScheduleRequest createScheduleRequest);

    /**
     * Create a service
     * <p>
     * Create a new service.
     * If {@code status} is included in the request, it must have a value of {@code active} when creating a new service. If a different status is required, make a second request to update the service.
     * A service may represent an application, component, or team you wish to open incidents against.
     * There is a limit of 25,000 services per account. If the limit is reached, the API will respond with an error. There is also a limit of 100,000 open Incidents per Service. If the limit is reached and {@code auto_resolve_timeout} is disabled (set to 0 or null), the {@code auto_resolve_timeout} property will automatically be set to
     * 84600 (1 day).
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#services)
     * Scoped OAuth requires: {@code services.write} 
     *
     * @param createServiceRequest The service to be created (optional)
     */
    @RequestLine("POST /services")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateServiceRequest> createService(@Nullable CreateServiceRequest createServiceRequest);

    /**
     * Associate service dependencies
     * <p>
     * Create new dependencies between two services.
     * Business services model capabilities that span multiple technical services and that may be owned by several different teams.
     * A service can have a maximum of 2,000 dependencies with a depth limit of 100. If the limit is reached, the API will respond with an error.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#business-services)
     * Scoped OAuth requires: {@code services.write} 
     *
     * @param createServiceDependencyRequest  (optional)
     */
    @RequestLine("POST /service_dependencies/associate")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateServiceDependency200Response> createServiceDependency(@Nullable CreateServiceDependencyRequest createServiceDependencyRequest);

    /**
     * Create an Event Rule on a Service
     * <p>
     * Create a new Event Rule on a Service. &amp;lt;!-- theme: warning --&amp;gt; &amp;gt; ### End-of-life &amp;gt; Rulesets and Event Rules will end-of-life soon. We highly recommend that you [migrate to Event Orchestration](https://support.pagerduty.com/docs/migrate-to-event-orchestration) as soon as possible so you can take advantage of the new functionality, such as improved UI, rule creation, APIs and Terraform support, advanced conditions, and rule nesting.
     * Scoped OAuth requires: {@code services.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param createServiceEventRuleRequest  (optional)
     */
    @RequestLine("POST /services/{id}/rules")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateServiceEventRule201Response> createServiceEventRule(@Param("id") @NotNull String id, @Nullable CreateServiceEventRuleRequest createServiceEventRuleRequest);

    /**
     * Create a new integration
     * <p>
     * Create a new integration belonging to a Service.
     * A service may represent an application, component, or team you wish to open incidents against.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#services)
     * Scoped OAuth requires: {@code services.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param createServiceIntegrationRequest The integration to be created (optional)
     */
    @RequestLine("POST /services/{id}/integrations")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateServiceIntegrationRequest> createServiceIntegration(@Param("id") @NotNull String id, @Nullable CreateServiceIntegrationRequest createServiceIntegrationRequest);

    /**
     * Create a tag
     * <p>
     * Create a Tag.
     * A Tag is applied to Escalation Policies, Teams or Users and can be used to filter them.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#tags)
     * Scoped OAuth requires: {@code tags.write} 
     *
     * @param createTagsRequest     (optional)
     */
    @RequestLine("POST /tags")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateTagsRequest> createTags(@Nullable CreateTagsRequest createTagsRequest);

    /**
     * Create a team
     * <p>
     * Create a new Team.
     * A team is a collection of Users and Escalation Policies that represent a group of people within an organization.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#teams)
     * Scoped OAuth requires: {@code teams.write} 
     *
     * @param createTeamRequest    The team to be created. (optional)
     */
    @RequestLine("POST /teams")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateTeamRequest> createTeam(@Nullable CreateTeamRequest createTeamRequest);

    /**
     * Create Team Notification Subscriptions
     * <p>
     * Create new Notification Subscriptions for the given Team.
     * Scoped OAuth requires: {@code subscribers.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param createTeamNotificationSubscriptionsRequest The entities to subscribe to. (optional)
     */
    @RequestLine("POST /teams/{id}/notification_subscriptions")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateBusinessServiceNotificationSubscribers200Response> createTeamNotificationSubscriptions(@Param("id") @NotNull String id, @Nullable CreateTeamNotificationSubscriptionsRequest createTeamNotificationSubscriptionsRequest);

    /**
     * Create a template
     * <p>
     * Create a new template
     * Scoped OAuth requires: {@code templates.write} 
     *
     * @param createTemplateRequest  (required)
     */
    @RequestLine("POST /templates")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<CreateTemplate201Response> createTemplate(@NotNull CreateTemplateRequest createTemplateRequest);

    /**
     * Create a user
     * <p>
     * Create a new user.
     * Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users.write} 
     *
     * @param from                 The email address of a valid user associated with the account making the request. (required)
     * @param createUserRequest    The user to be created. (optional)
     */
    @RequestLine("POST /users")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json", 
        "From: {from}"
    })
    CompletableFuture<CreateUserRequest> createUser(@Param("from") @NotNull String from, @Nullable CreateUserRequest createUserRequest);

    /**
     * Create a user contact method
     * <p>
     * Create a new contact method for the User.
     * Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users:contact_methods.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param createUserContactMethodRequest The contact method to be created. (optional)
     */
    @RequestLine("POST /users/{id}/contact_methods")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateUserContactMethod201Response> createUserContactMethod(@Param("id") @NotNull String id, @Nullable CreateUserContactMethodRequest createUserContactMethodRequest);

    /**
     * Create a User Handoff Notification Rule
     * <p>
     * Create a new Handoff Notification Rule. Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account. For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param createUserHandoffNotificationRuleRequest The Handoff Notification Rule to be created. (optional)
     */
    @RequestLine("POST /users/{id}/oncall_handoff_notification_rules")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateUserHandoffNotificationRuleRequest> createUserHandoffNotificationRule(@Param("id") @NotNull String id, @Nullable CreateUserHandoffNotificationRuleRequest createUserHandoffNotificationRuleRequest);

    /**
     * Create a user notification rule
     * <p>
     * Create a new notification rule.
     * Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users:contact_methods.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param createUserNotificationRuleRequest The notification rule to be created. (optional)
     */
    @RequestLine("POST /users/{id}/notification_rules")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateUserNotificationRuleRequest> createUserNotificationRule(@Param("id") @NotNull String id, @Nullable CreateUserNotificationRuleRequest createUserNotificationRuleRequest);

    /**
     * Create Notification Subcriptions
     * <p>
     * Create new Notification Subscriptions for the given User.
     * Scoped OAuth requires: {@code subscribers.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param createTeamNotificationSubscriptionsRequest The entities to subscribe to. (optional)
     */
    @RequestLine("POST /users/{id}/notification_subscriptions")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateBusinessServiceNotificationSubscribers200Response> createUserNotificationSubscriptions(@Param("id") @NotNull String id, @Nullable CreateTeamNotificationSubscriptionsRequest createTeamNotificationSubscriptionsRequest);

    /**
     * Create a user status update notification rule
     * <p>
     * Create a new status update notification rule.
     * Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account.
     * &amp;lt;!-- theme: warning --&amp;gt; &amp;gt; ### Early Access &amp;gt; This endpoint is in Early Access and may change at any time. You must pass in the X-EARLY-ACCESS header to access it.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param createUserStatusUpdateNotificationRuleRequest The status update notification rule to be created. (optional)
     */
    @RequestLine("POST /users/{id}/status_update_notification_rules")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json", 
        "X-EARLY-ACCESS: status-update-notification-rules"
    })
    CompletableFuture<CreateUserStatusUpdateNotificationRule201Response> createUserStatusUpdateNotificationRule(@Param("id") @NotNull String id, @Nullable CreateUserStatusUpdateNotificationRuleRequest createUserStatusUpdateNotificationRuleRequest);

    /**
     * Create a webhook subscription
     * <p>
     * Creates a new webhook subscription.
     * For more information on webhook subscriptions and how they are used to configure v3 webhooks see the [Webhooks v3 Developer Documentation](https://developer.pagerduty.com/docs/webhooks/v3-overview/). 
     *
     * @param createWebhookSubscriptionRequest  (optional)
     */
    @RequestLine("POST /webhook_subscriptions")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateWebhookSubscriptionRequest> createWebhookSubscription(@Nullable CreateWebhookSubscriptionRequest createWebhookSubscriptionRequest);

    /**
     * Delete an Add-on
     * <p>
     * Remove an existing Add-on.
     * Addon's are pieces of functionality that developers can write to insert new functionality into PagerDuty's UI.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#add-ons)
     * Scoped OAuth requires: {@code addons.write} 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("DELETE /addons/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<Void> deleteAddon(@Param("id") @NotNull String id);

    /**
     * Delete an Automation Action
     * <p>
     * Delete an Automation Action 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("DELETE /automation_actions/actions/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<Void> deleteAutomationAction(@Param("id") @NotNull String id);

    /**
     * Disassociate an Automation Action from a service
     * <p>
     * Disassociate an Automation Action from a service 
     *
     * @param id                   The ID of the resource. (required)
     * @param serviceId            The service ID (required)
     */
    @RequestLine("DELETE /automation_actions/actions/{id}/services/{serviceId}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<Void> deleteAutomationActionServiceAssociation(@Param("id") @NotNull String id, @Param("serviceId") @NotNull String serviceId);

    /**
     * Disassociate an Automation Action from a team
     * <p>
     * Disassociate an Automation Action from a team 
     *
     * @param id                   The ID of the resource. (required)
     * @param teamId               The team ID (required)
     */
    @RequestLine("DELETE /automation_actions/actions/{id}/teams/{teamId}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<Void> deleteAutomationActionTeamAssociation(@Param("id") @NotNull String id, @Param("teamId") @NotNull String teamId);

    /**
     * Delete an Automation Action runner
     * <p>
     * Delete an Automation Action runner 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("DELETE /automation_actions/runners/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<Void> deleteAutomationActionsRunner(@Param("id") @NotNull String id);

    /**
     * Disassociate a runner from a team
     * <p>
     * Disassociates a runner from a team 
     *
     * @param id                   The ID of the resource. (required)
     * @param teamId               The team ID (required)
     */
    @RequestLine("DELETE /automation_actions/runners/{id}/teams/{teamId}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<Void> deleteAutomationActionsRunnerTeamAssociation(@Param("id") @NotNull String id, @Param("teamId") @NotNull String teamId);

    /**
     * Delete a Business Service
     * <p>
     * Delete an existing Business Service.
     * Once the service is deleted, it will not be accessible from the web UI and new incidents won't be able to be created for this service.
     * Business services model capabilities that span multiple technical services and that may be owned by several different teams.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#business-services)
     * Scoped OAuth requires: {@code services.write} 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("DELETE /business_services/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<Void> deleteBusinessService(@Param("id") @NotNull String id);

    /**
     * Deletes the account-level priority threshold for Business Service impact
     * <p>
     * Clears the Priority Threshold for the account.
     * If the priority threshold is cleared, any Incident with a Priority set will be able to impact Business Services. Scoped OAuth requires: {@code services.write} 
     *
     */
    @RequestLine("DELETE /business_services/priority_thresholds")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "X-EARLY-ACCESS: business-impact-early-access"
    })
    CompletableFuture<Void> deleteBusinessServicePriorityThresholds();

    /**
     * Delete a Field
     * <p>
     * Delete a Field. Fields may not be deleted if they are used by a Field Schema.
     * Scoped OAuth requires: {@code custom_fields.write} 
     *
     * @param fieldId              The ID of the field. (required)
     */
    @RequestLine("DELETE /incidents/custom_fields/{fieldId}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Void> deleteCustomFieldsField(@Param("fieldId") @NotNull String fieldId);

    /**
     * Delete a Field Option
     * <p>
     * Delete a Field Option.
     * Scoped OAuth requires: {@code custom_fields.write} 
     *
     * @param fieldId              The ID of the field. (required)
     * @param fieldOptionId        The ID of the field option. (required)
     */
    @RequestLine("DELETE /incidents/custom_fields/{fieldId}/field_options/{fieldOptionId}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Void> deleteCustomFieldsFieldOption(@Param("fieldId") @NotNull String fieldId, @Param("fieldOptionId") @NotNull String fieldOptionId);

    /**
     * Delete an escalation policy
     * <p>
     * Deletes an existing escalation policy and rules. The escalation policy must not be in use by any services.
     * Escalation policies define which user should be alerted at which time.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#escalation-policies)
     * Scoped OAuth requires: {@code escalation_policies.write} 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("DELETE /escalation_policies/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<Void> deleteEscalationPolicy(@Param("id") @NotNull String id);

    /**
     * Delete an extension
     * <p>
     * Delete an existing extension.
     * Once the extension is deleted, it will not be accessible from the web UI and new incidents won't be able to be created for this extension.
     * Extensions are representations of Extension Schema objects that are attached to Services.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#extensions)
     * Scoped OAuth requires: {@code extensions.write} 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("DELETE /extensions/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<Void> deleteExtension(@Param("id") @NotNull String id);

    /**
     * Delete an Incident Workflow
     * <p>
     * Delete an existing Incident Workflow
     * An Incident Workflow is a sequence of configurable Steps and associated Triggers that can execute automated Actions for a given Incident.
     * Scoped OAuth requires: {@code incident_workflows.write} 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("DELETE /incident_workflows/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<Void> deleteIncidentWorkflow(@Param("id") @NotNull String id);

    /**
     * Delete a Trigger
     * <p>
     * Delete an existing Incident Workflow Trigger
     * Scoped OAuth requires: {@code incident_workflows.write} 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("DELETE /incident_workflows/triggers/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<Void> deleteIncidentWorkflowTrigger(@Param("id") @NotNull String id);

    /**
     * Delete or end a maintenance window
     * <p>
     * Delete an existing maintenance window if it's in the future, or end it if it's currently on-going. If the maintenance window has already ended it cannot be deleted.
     * A Maintenance Window is used to temporarily disable one or more Services for a set period of time.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#maintenance-windows)
     * Scoped OAuth requires: {@code services.write} 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("DELETE /maintenance_windows/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<Void> deleteMaintenanceWindow(@Param("id") @NotNull String id);

    /**
     * Delete an Orchestration
     * <p>
     * Delete a Global Event Orchestration.
     * Once deleted, you will no longer be able to ingest events into PagerDuty using this Orchestration's Routing Key.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#event-orchestrations)
     * Scoped OAuth requires: {@code event_orchestrations.write} 
     *
     * @param id                   The ID of an Event Orchestration. (required)
     */
    @RequestLine("DELETE /event_orchestrations/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<Void> deleteOrchestration(@Param("id") @NotNull String id);

    /**
     * Delete an Integration for an Event Orchestration
     * <p>
     * Delete an Integration and its associated Routing Key.
     * Once deleted, PagerDuty will drop all future events sent to PagerDuty using the Routing Key.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#event-orchestrations)
     * Scoped OAuth requires: {@code event_orchestrations.write} 
     *
     * @param id                   The ID of an Event Orchestration. (required)
     * @param integrationId        The ID of an Integration. (required)
     */
    @RequestLine("DELETE /event_orchestrations/{id}/integrations/{integrationId}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<Void> deleteOrchestrationIntegration(@Param("id") @NotNull String id, @Param("integrationId") @NotNull String integrationId);

    /**
     * Delete a Response Play
     * <p>
     * Delete an existing Response Play. Once the Response Play is deleted, the action cannot be undone.
     * WARNING: When the Response Play is deleted, it is also removed from any Services that were using it.
     * Response Plays allow you to create packages of Incident Actions that can be applied to an Incident.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#response-plays)
     * Scoped OAuth requires: {@code response_plays.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param from                 The email address of a valid user associated with the account making the request. (required)
     * @deprecated
     */
    @Deprecated
    @RequestLine("DELETE /response_plays/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json", 
        "From: {from}"
    })
    CompletableFuture<Void> deleteResponsePlay(@Param("id") @NotNull String id, @Param("from") @NotNull String from);

    /**
     * Delete a Ruleset
     * <p>
     * Delete a Ruleset. &amp;lt;!-- theme: warning --&amp;gt; &amp;gt; ### End-of-life &amp;gt; Rulesets and Event Rules will end-of-life soon. We highly recommend that you [migrate to Event Orchestration](https://support.pagerduty.com/docs/migrate-to-event-orchestration) as soon as possible so you can take advantage of the new functionality, such as improved UI, rule creation, APIs and Terraform support, advanced conditions, and rule nesting.
     * Rulesets allow you to route events to an endpoint and create collections of Event Rules, which define sets of actions to take based on event content.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#rulesets)
     * Scoped OAuth requires: {@code event_rules.write} 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("DELETE /rulesets/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<Void> deleteRuleset(@Param("id") @NotNull String id);

    /**
     * Delete an Event Rule
     * <p>
     * Delete an Event Rule. &amp;lt;!-- theme: warning --&amp;gt; &amp;gt; ### End-of-life &amp;gt; Rulesets and Event Rules will end-of-life soon. We highly recommend that you [migrate to Event Orchestration](https://support.pagerduty.com/docs/migrate-to-event-orchestration) as soon as possible so you can take advantage of the new functionality, such as improved UI, rule creation, APIs and Terraform support, advanced conditions, and rule nesting.
     * Rulesets allow you to route events to an endpoint and create collections of Event Rules, which define sets of actions to take based on event content.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#rulesets)
     * Scoped OAuth requires: {@code event_rules.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param ruleId               The id of the Event Rule to retrieve. (required)
     */
    @RequestLine("DELETE /rulesets/{id}/rules/{ruleId}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<Void> deleteRulesetEventRule(@Param("id") @NotNull String id, @Param("ruleId") @NotNull String ruleId);

    /**
     * Delete a schedule
     * <p>
     * Delete an on-call schedule.
     * A Schedule determines the time periods that users are On-Call.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#schedules)
     * Scoped OAuth requires: {@code schedules.write} 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("DELETE /schedules/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<Void> deleteSchedule(@Param("id") @NotNull String id);

    /**
     * Delete an override
     * <p>
     * Remove an override.
     * You cannot remove a past override.
     * If the override start time is before the current time, but the end time is after the current time, the override will be truncated to the current time.
     * If the override is truncated, the status code will be 200 OK, as opposed to a 204 No Content for a successful delete.
     * A Schedule determines the time periods that users are On-Call.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#schedules)
     * Scoped OAuth requires: {@code schedules.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param overrideId           The override ID on the schedule. (required)
     */
    @RequestLine("DELETE /schedules/{id}/overrides/{overrideId}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<Void> deleteScheduleOverride(@Param("id") @NotNull String id, @Param("overrideId") @NotNull String overrideId);

    /**
     * Delete a service
     * <p>
     * Delete an existing service.
     * Once the service is deleted, it will not be accessible from the web UI and new incidents won't be able to be created for this service.
     * A service may represent an application, component, or team you wish to open incidents against.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#services)
     * Scoped OAuth requires: {@code services.write} 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("DELETE /services/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<Void> deleteService(@Param("id") @NotNull String id);

    /**
     * Disassociate service dependencies
     * <p>
     * Disassociate dependencies between two services.
     * Business services model capabilities that span multiple technical services and that may be owned by several different teams.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#business-services)
     * Scoped OAuth requires: {@code services.write} 
     *
     * @param deleteServiceDependencyRequest  (optional)
     */
    @RequestLine("POST /service_dependencies/disassociate")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateServiceDependency200Response> deleteServiceDependency(@Nullable DeleteServiceDependencyRequest deleteServiceDependencyRequest);

    /**
     * Delete an Event Rule from a Service
     * <p>
     * Delete an Event Rule from a Service. &amp;lt;!-- theme: warning --&amp;gt; &amp;gt; ### End-of-life &amp;gt; Rulesets and Event Rules will end-of-life soon. We highly recommend that you [migrate to Event Orchestration](https://support.pagerduty.com/docs/migrate-to-event-orchestration) as soon as possible so you can take advantage of the new functionality, such as improved UI, rule creation, APIs and Terraform support, advanced conditions, and rule nesting.
     * Scoped OAuth requires: {@code services.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param ruleId               The id of the Event Rule to retrieve. (required)
     */
    @RequestLine("DELETE /services/{id}/rules/{ruleId}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<Void> deleteServiceEventRule(@Param("id") @NotNull String id, @Param("ruleId") @NotNull String ruleId);

    /**
     * Dissociate a Trigger and Service
     * <p>
     * Remove a an existing Service from an Incident Workflow Trigger
     * Scoped OAuth requires: {@code incident_workflows.write} 
     *
     * @param triggerId            Identifier for the Trigger (required)
     * @param serviceId            Identifier for the Service (required)
     */
    @RequestLine("DELETE /incident_workflows/triggers/{triggerId}/services/{serviceId}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateIncidentWorkflowTriggerRequest> deleteServiceFromIncidentWorkflowTrigger(@Param("triggerId") @NotNull String triggerId, @Param("serviceId") @NotNull String serviceId);

    /**
     * Delete a tag
     * <p>
     * Remove an existing Tag.
     * A Tag is applied to Escalation Policies, Teams or Users and can be used to filter them.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#tags)
     * Scoped OAuth requires: {@code tags.write} 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("DELETE /tags/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<Void> deleteTag(@Param("id") @NotNull String id);

    /**
     * Delete a team
     * <p>
     * Remove an existing team.
     * Succeeds only if the team has no associated Escalation Policies, Services, Schedules and Subteams.
     * All associated unresovled incidents will be reassigned to another team (if specified) or will loose team association, thus becoming account-level (with visibility implications).
     * Note that the incidents reassignment process is asynchronous and has no guarantee to complete before the API call return.
     * A team is a collection of Users and Escalation Policies that represent a group of people within an organization.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#teams)
     * Scoped OAuth requires: {@code teams.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param reassignmentTeam     Team to reassign unresolved incident to. If an unresolved incident exists on both the reassignment team and the team being deleted, a duplicate will not be made. If not supplied, unresolved incidents will be made account-level.  (optional)
     */
    @RequestLine("DELETE /teams/{id}?reassignment_team={reassignmentTeam}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<Void> deleteTeam(@Param("id") @NotNull String id, @Param("reassignmentTeam") @Nullable String reassignmentTeam);

    /**
     * Remove an escalation policy from a team
     * <p>
     * Remove an escalation policy from a team.
     * A team is a collection of Users and Escalation Policies that represent a group of people within an organization.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#teams)
     * Scoped OAuth requires: {@code teams.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param escalationPolicyId   The escalation policy ID on the team. (required)
     */
    @RequestLine("DELETE /teams/{id}/escalation_policies/{escalationPolicyId}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<Void> deleteTeamEscalationPolicy(@Param("id") @NotNull String id, @Param("escalationPolicyId") @NotNull String escalationPolicyId);

    /**
     * Remove a user from a team
     * <p>
     * Remove a user from a team.
     * A team is a collection of Users and Escalation Policies that represent a group of people within an organization.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#teams)
     * Scoped OAuth requires: {@code teams.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param userId               The user ID on the team. (required)
     */
    @RequestLine("DELETE /teams/{id}/users/{userId}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<Void> deleteTeamUser(@Param("id") @NotNull String id, @Param("userId") @NotNull String userId);

    /**
     * Delete a template
     * <p>
     * Delete a specific of templates on the account
     * Scoped OAuth requires: {@code templates.write} 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("DELETE /templates/{id}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<Void> deleteTemplate(@Param("id") @NotNull String id);

    /**
     * Delete a user
     * <p>
     * Remove an existing user.
     * Returns 400 if the user has assigned incidents unless your [pricing plan](https://www.pagerduty.com/pricing) has the {@code offboarding} feature and the account is [configured](https://support.pagerduty.com/docs/offboarding#section-additional-configurations) appropriately.
     * Note that the incidents reassignment process is asynchronous and has no guarantee to complete before the api call return.
     * [*Learn more about {@code offboarding} feature*](https://support.pagerduty.com/docs/offboarding).
     * Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users.write} 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("DELETE /users/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<Void> deleteUser(@Param("id") @NotNull String id);

    /**
     * Delete a user's contact method
     * <p>
     * Remove a user's contact method.
     * Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users:contact_methods.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param contactMethodId      The contact method ID on the user. (required)
     */
    @RequestLine("DELETE /users/{id}/contact_methods/{contactMethodId}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<Void> deleteUserContactMethod(@Param("id") @NotNull String id, @Param("contactMethodId") @NotNull String contactMethodId);

    /**
     * Delete a User's Handoff Notification rule
     * <p>
     * Remove a User's Handoff Notification Rule. Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account. For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param oncallHandoffNotificationRuleId The oncall handoff notification rule ID on the user. (required)
     */
    @RequestLine("DELETE /users/{id}/oncall_handoff_notification_rules/{oncallHandoffNotificationRuleId}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<Void> deleteUserHandoffNotificationRule(@Param("id") @NotNull String id, @Param("oncallHandoffNotificationRuleId") @NotNull String oncallHandoffNotificationRuleId);

    /**
     * Delete a user's notification rule
     * <p>
     * Remove a user's notification rule.
     * Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users:contact_methods.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param notificationRuleId   The notification rule ID on the user. (required)
     */
    @RequestLine("DELETE /users/{id}/notification_rules/{notificationRuleId}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<Void> deleteUserNotificationRule(@Param("id") @NotNull String id, @Param("notificationRuleId") @NotNull String notificationRuleId);

    /**
     * Delete a user's session
     * <p>
     * Delete a user's session.
     * Beginning November 2021, user sessions no longer includes newly issued OAuth tokens.
     * Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users:sessions.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param type                 The session type for the user session ID. (required)
     * @param sessionId            The session ID for the user. (required)
     */
    @RequestLine("DELETE /users/{id}/sessions/{type}/{sessionId}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<Void> deleteUserSession(@Param("id") @NotNull String id, @Param("type") @NotNull String type, @Param("sessionId") @NotNull String sessionId);

    /**
     * Delete all user sessions
     * <p>
     * Delete all user sessions.
     * Beginning November 2021, user sessions no longer includes newly issued OAuth tokens.
     * Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users:sessions.write} 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("DELETE /users/{id}/sessions")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<Void> deleteUserSessions(@Param("id") @NotNull String id);

    /**
     * Delete a user's status update notification rule
     * <p>
     * Remove a user's status update notification rule.
     * Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account.
     * &amp;lt;!-- theme: warning --&amp;gt; &amp;gt; ### Early Access &amp;gt; This endpoint is in Early Access and may change at any time. You must pass in the X-EARLY-ACCESS header to access it.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param statusUpdateNotificationRuleId The status update notification rule ID on the user. (required)
     */
    @RequestLine("DELETE /users/{id}/status_update_notification_rules/{statusUpdateNotificationRuleId}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json", 
        "X-EARLY-ACCESS: status-update-notification-rules"
    })
    CompletableFuture<Void> deleteUserStatusUpdateNotificationRule(@Param("id") @NotNull String id, @Param("statusUpdateNotificationRuleId") @NotNull String statusUpdateNotificationRuleId);

    /**
     * Delete a webhook subscription
     * <p>
     * Deletes a webhook subscription. 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("DELETE /webhook_subscriptions/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2"
    })
    CompletableFuture<Void> deleteWebhookSubscription(@Param("id") @NotNull String id);

    /**
     * Enable an extension
     * <p>
     * Enable an extension that is temporarily disabled. (This API does not require a request body.)
     * Extensions are representations of Extension Schema objects that are attached to Services.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#extensions)
     * Scoped OAuth requires: {@code extensions.write} 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("POST /extensions/{id}/enable")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<GetExtension200Response> enableExtension(@Param("id") @NotNull String id);

    /**
     * Enable a webhook subscription
     * <p>
     * Enable a webhook subscription that is temporarily disabled. (This API does not require a request body.)
     * Webhook subscriptions can become temporarily disabled when the subscription's delivery method is repeatedly rejected by the server. 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("POST /webhook_subscriptions/{id}/enable")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2"
    })
    CompletableFuture<CreateWebhookSubscriptionRequest> enableWebhookSubscription(@Param("id") @NotNull String id);

    /**
     * Test an ability
     * <p>
     * Test whether your account has a given ability.
     * "Abilities" describes your account's capabilities by feature name. For example {@code "teams"}.
     * An ability may be available to your account based on things like your pricing plan or account state.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#abilities)
     * Scoped OAuth requires: {@code abilities.read} 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("GET /abilities/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<Void> getAbility(@Param("id") @NotNull String id);

    /**
     * Get an Add-on
     * <p>
     * Get details about an existing Add-on.
     * Addon's are pieces of functionality that developers can write to insert new functionality into PagerDuty's UI.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#add-ons)
     * Scoped OAuth requires: {@code addons.read} 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("GET /addons/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateAddonRequest> getAddon(@Param("id") @NotNull String id);

    /**
     * List Automation Actions
     * <p>
     * Lists Automation Actions matching provided query params.
     * The returned records are sorted by action name in alphabetical order.
     * See [{@code Cursor-based pagination}](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for instructions on how to paginate through the result set. 
     *
     * @param limit                The minimum of the {@code limit} parameter used in the request or the maximum request size of the API. (optional)
     * @param cursor               Optional parameter used to request the "next" set of results from an API.  The value provided here is most commonly obtained from the {@code next_cursor} field of the previous request.  When no value is provided, the request starts at the beginning of the result set.  (optional)
     * @param name                 Filters results to include the ones matching the name (case insensitive substring matching) (optional)
     * @param runnerId             Filters results to include the ones linked to the specified runner. Specifying the value {@code any} filters results to include the ones linked to runners only, thus omitting the results not linked to runners.  (optional)
     * @param classification       Filters results to include the ones matching the specified classification (aka category) (optional)
     * @param teamId               Filters results to include the ones associated with the specified team. (optional)
     * @param serviceId            Filters results to include the ones associated with the specified service (optional)
     * @param actionType           Filters results to include the ones matching the specified action type (optional)
     */
    @RequestLine("GET /automation_actions/actions?limit={limit}&cursor={cursor}&name={name}&runner_id={runnerId}&classification={classification}&team_id={teamId}&service_id={serviceId}&action_type={actionType}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<GetAllAutomationActions200Response> getAllAutomationActions(@Param("limit") @Nullable Integer limit, @Param("cursor") @Nullable String cursor, @Param("name") @Nullable String name, @Param("runnerId") @Nullable String runnerId, @Param("classification") @Nullable AutomationActionsActionClassificationEnum classification, @Param("teamId") @Nullable String teamId, @Param("serviceId") @Nullable String serviceId, @Param("actionType") @Nullable String actionType);

    /**
     * Get raw responses from a single incident
     * <p>
     * Provides enriched responder data for a single incident.
     * Example metrics include Time to Respond, Responder Type, and Response Status. See metric definitions below.
     * &amp;lt;!-- theme: info --&amp;gt; &amp;gt; **Note:** Analytics data is updated once per day. It takes up to 24 hours before new incident responses appear in the Analytics API. Scoped OAuth requires: {@code analytics.read} 
     *
     * @param id                   The ID of the resource. (required)
     * @param getAnalyticsIncidentResponsesByIdRequest Parameters to apply to the dataset. (optional)
     */
    @RequestLine("GET /analytics/raw/incidents/{id}/responses")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<GetAnalyticsIncidentResponsesById200Response> getAnalyticsIncidentResponsesById(@Param("id") @NotNull String id, @Nullable GetAnalyticsIncidentResponsesByIdRequest getAnalyticsIncidentResponsesByIdRequest);

    /**
     * Get raw data - multiple incidents
     * <p>
     * Provides enriched incident data and metrics for multiple incidents.
     * Example metrics include Seconds to Resolve, Seconds to Engage, Snoozed Seconds, and Sleep Hour Interruptions. Metric definitions can be found in our [Knowledge Base](https://support.pagerduty.com/docs/insights#incidents-list).
     * &amp;lt;!-- theme: info --&amp;gt; &amp;gt; A {@code team_ids} or {@code service_ids} filter is required for [user-level API keys](https://support.pagerduty.com/docs/using-the-api#section-generating-a-personal-rest-api-key) or keys generated through an OAuth flow. Account-level API keys do not have this requirement. &amp;lt;!-- theme: info --&amp;gt; &amp;gt; **Note:** Analytics data is updated once per day. It takes up to 24 hours before new incidents appear in the Analytics API.
     * Scoped OAuth requires: {@code analytics.read} 
     *
     * @param getAnalyticsIncidentsRequest Parameters and filters to apply to the dataset. (optional)
     */
    @RequestLine("POST /analytics/raw/incidents")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<GetAnalyticsIncidents200Response> getAnalyticsIncidents(@Nullable GetAnalyticsIncidentsRequest getAnalyticsIncidentsRequest);

    /**
     * Get raw data - single incident
     * <p>
     * Provides enriched incident data and metrics for a single incident.
     * Example metrics include Seconds to Resolve, Seconds to Engage, Snoozed Seconds, and Sleep Hour Interruptions. Metric definitions can be found in our [Knowledge Base](https://support.pagerduty.com/docs/insights#incidents-list).
     * &amp;lt;!-- theme: info --&amp;gt; &amp;gt; **Note:** Analytics data is updated once per day. It takes up to 24 hours before new incidents appear in the Analytics API.
     * Scoped OAuth requires: {@code analytics.read} 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("GET /analytics/raw/incidents/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<AnalyticsRawIncident> getAnalyticsIncidentsById(@Param("id") @NotNull String id);

    /**
     * Get aggregated incident data
     * <p>
     * Provides aggregated enriched metrics for incidents.
     * The provided metrics are aggregated by day, week, month using the aggregate_unit parameter, or for the entire period if no aggregate_unit is provided.
     * &amp;lt;!-- theme: info --&amp;gt; &amp;gt; A {@code team_ids} or {@code service_ids} filter is required for [user-level API keys](https://support.pagerduty.com/docs/using-the-api#section-generating-a-personal-rest-api-key) or keys generated through an OAuth flow. Account-level API keys do not have this requirement. &amp;lt;!-- theme: info --&amp;gt; &amp;gt; **Note:** Analytics data is updated once per day. It takes up to 24 hours before new incidents appear in the Analytics API.
     * Scoped OAuth requires: {@code analytics.read} 
     *
     * @param analyticsModel       Parameters and filters to apply to the dataset. (optional)
     */
    @RequestLine("POST /analytics/metrics/incidents/all")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<GetAnalyticsMetricsIncidentsAll200Response> getAnalyticsMetricsIncidentsAll(@Nullable AnalyticsModel analyticsModel);

    /**
     * Get aggregated escalation policy data
     * <p>
     * Provides aggregated metrics for incidents aggregated into units of time by escalation policy.
     * Example metrics include Seconds to Resolve, Seconds to Engage, Snoozed Seconds, and Sleep Hour Interruptions. Metric definitions can be found in our [Knowledge Base](https://support.pagerduty.com/docs/insights#escalation-policy-list).
     * &amp;lt;!-- theme: info --&amp;gt; &amp;gt; **Note:** Analytics data is updated once per day. It takes up to 24 hours before new incidents appear in the Analytics API.
     * Scoped OAuth requires: {@code analytics.read} 
     *
     * @param analyticsModel       Parameters and filters to apply to the dataset. (optional)
     */
    @RequestLine("POST /analytics/metrics/incidents/escalation_policies")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<GetAnalyticsMetricsIncidentsEscalationPolicy200Response> getAnalyticsMetricsIncidentsEscalationPolicy(@Nullable AnalyticsModel analyticsModel);

    /**
     * Get aggregated metrics for all escalation policies
     * <p>
     * Provides aggregated metrics across all escalation policies.
     * Example metrics include Seconds to Resolve, Seconds to Engage, Snoozed Seconds, and Sleep Hour Interruptions. Metric definitions can be found in our [Knowledge Base](https://support.pagerduty.com/docs/insights#escalation-policy-list).
     * &amp;lt;!-- theme: info --&amp;gt; &amp;gt; **Note:** Analytics data is updated once per day. It takes up to 24 hours before new incidents appear in the Analytics API.
     * Scoped OAuth requires: {@code analytics.read} 
     *
     * @param analyticsModel       Parameters and filters to apply to the dataset. (optional)
     */
    @RequestLine("POST /analytics/metrics/incidents/escalation_policies/all")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<GetAnalyticsMetricsIncidentsEscalationPolicy200Response> getAnalyticsMetricsIncidentsEscalationPolicyAll(@Nullable AnalyticsModel analyticsModel);

    /**
     * Get aggregated service data
     * <p>
     * Provides aggregated metrics for incidents aggregated into units of time by service.
     * Example metrics include Seconds to Resolve, Seconds to Engage, Snoozed Seconds, and Sleep Hour Interruptions. Metric definitions can be found in our [Knowledge Base](https://support.pagerduty.com/docs/insights#services-list). Data can be aggregated by day, week or month in addition to by service, or provided just as a collection of aggregates for each service in the dataset for the entire period.
     * If a unit is provided, each row in the returned dataset will include a 'range_start' timestamp.
     * &amp;lt;!-- theme: info --&amp;gt; &amp;gt; **Note:** Analytics data is updated once per day. It takes up to 24 hours before new incidents appear in the Analytics API.
     * Scoped OAuth requires: {@code analytics.read} 
     *
     * @param analyticsModel       Parameters and filters to apply to the dataset. (optional)
     */
    @RequestLine("POST /analytics/metrics/incidents/services")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<GetAnalyticsMetricsIncidentsAll200Response> getAnalyticsMetricsIncidentsService(@Nullable AnalyticsModel analyticsModel);

    /**
     * Get aggregated metrics for all services
     * <p>
     * Provides aggregated metrics across all services.
     * Example metrics include Seconds to Resolve, Seconds to Engage, Snoozed Seconds, and Sleep Hour Interruptions. Metric definitions can be found in our [Knowledge Base](https://support.pagerduty.com/docs/insights#services-list).
     * &amp;lt;!-- theme: info --&amp;gt; &amp;gt; A {@code team_ids} or {@code service_ids} filter is required for [user-level API keys](https://support.pagerduty.com/docs/using-the-api#section-generating-a-personal-rest-api-key) or keys generated through an OAuth flow. Account-level API keys do not have this requirement. &amp;lt;!-- theme: info --&amp;gt; &amp;gt; **Note:** Analytics data is updated once per day. It takes up to 24 hours before new incidents appear in the Analytics API.
     * Scoped OAuth requires: {@code analytics.read} 
     *
     * @param analyticsModel       Parameters and filters to apply to the dataset. (optional)
     */
    @RequestLine("POST /analytics/metrics/incidents/services/all")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<GetAnalyticsMetricsIncidentsAll200Response> getAnalyticsMetricsIncidentsServiceAll(@Nullable AnalyticsModel analyticsModel);

    /**
     * Get aggregated team data
     * <p>
     * Provides aggregated metrics for incidents aggregated into units of time by team.
     * Example metrics include Seconds to Resolve, Seconds to Engage, Snoozed Seconds, and Sleep Hour Interruptions. Metric definitions can be found in our [Knowledge Base](https://support.pagerduty.com/docs/insights#teams-list). Data can be aggregated by day, week or month in addition to by team, or provided just as a collection of aggregates for each team in the dataset for the entire period.
     * If a unit is provided, each row in the returned dataset will include a 'range_start' timestamp.
     * &amp;lt;!-- theme: info --&amp;gt; &amp;gt; A {@code team_ids} or {@code service_ids} filter is required for [user-level API keys](https://support.pagerduty.com/docs/using-the-api#section-generating-a-personal-rest-api-key) or keys generated through an OAuth flow. Account-level API keys do not have this requirement. &amp;lt;!-- theme: info --&amp;gt; &amp;gt; **Note:** Analytics data is updated once per day. It takes up to 24 hours before new incidents appear in the Analytics API.
     * Scoped OAuth requires: {@code analytics.read} 
     *
     * @param analyticsModel       Parameters and filters to apply to the dataset. (optional)
     */
    @RequestLine("POST /analytics/metrics/incidents/teams")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<GetAnalyticsMetricsIncidentsAll200Response> getAnalyticsMetricsIncidentsTeam(@Nullable AnalyticsModel analyticsModel);

    /**
     * Get aggregated metrics for all teams
     * <p>
     * Provides aggregated metrics across all teams.
     * Example metrics include Seconds to Resolve, Seconds to Engage, Snoozed Seconds, and Sleep Hour Interruptions. Metric definitions can be found in our [Knowledge Base](https://support.pagerduty.com/docs/insights#teams-list).
     * &amp;lt;!-- theme: info --&amp;gt; &amp;gt; A {@code team_ids} or {@code service_ids} filter is required for [user-level API keys](https://support.pagerduty.com/docs/using-the-api#section-generating-a-personal-rest-api-key) or keys generated through an OAuth flow. Account-level API keys do not have this requirement. &amp;lt;!-- theme: info --&amp;gt; &amp;gt; **Note:** Analytics data is updated once per day. It takes up to 24 hours before new incidents appear in the Analytics API.
     * Scoped OAuth requires: {@code analytics.read} 
     *
     * @param analyticsModel       Parameters and filters to apply to the dataset. (optional)
     */
    @RequestLine("POST /analytics/metrics/incidents/teams/all")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<GetAnalyticsMetricsIncidentsAll200Response> getAnalyticsMetricsIncidentsTeamAll(@Nullable AnalyticsModel analyticsModel);

    /**
     * Get aggregated metrics for all responders
     * <p>
     * Provides aggregated incident metrics for all selected responders.
     * Example metrics include Seconds to Resolve, Seconds to Engage, Snoozed Seconds, and Sleep Hour Interruptions. Metric definitions can be found in our [Knowledge Base](https://support.pagerduty.com/docs/insights#responders-list).
     * &amp;lt;!-- theme: info --&amp;gt; &amp;gt; **Note:** Analytics data is updated once per day. It takes up to 24 hours before new incidents appear in the Analytics API.
     * Scoped OAuth requires: {@code analytics.read} 
     *
     * @param analyticsResponderFilter Parameters and filters to apply to the dataset. (optional)
     */
    @RequestLine("POST /analytics/metrics/responders/all")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<GetAnalyticsMetricsRespondersAll200Response> getAnalyticsMetricsRespondersAll(@Nullable AnalyticsResponderFilter analyticsResponderFilter);

    /**
     * Get responder data aggregated by team
     * <p>
     * Provides incident metrics aggregated by responder.
     * Example metrics include Seconds to Resolve, Seconds to Engage, Snoozed Seconds, and Sleep Hour Interruptions. Metric definitions can be found in our [Knowledge Base](https://support.pagerduty.com/docs/insights#responders-list).
     * &amp;lt;!-- theme: info --&amp;gt; &amp;gt; **Note:** Analytics data is updated once per day. It takes up to 24 hours before new incidents appear in the Analytics API.
     * Scoped OAuth requires: {@code analytics.read} 
     *
     * @param analyticsResponderFilter Parameters and filters to apply to the dataset. (optional)
     */
    @RequestLine("POST /analytics/metrics/responders/teams")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<GetAnalyticsMetricsRespondersAll200Response> getAnalyticsMetricsRespondersTeam(@Nullable AnalyticsResponderFilter analyticsResponderFilter);

    /**
     * Get raw incidents for a single responder_id
     * <p>
     * Provides enriched incident data and metrics for a specific responder.
     * Example metrics include Mean Seconds to Resolve, Mean Seconds to Engage, Snoozed Seconds, and Sleep Hour Interruptions. Metric definitions can be found in our [Knowledge Base](https://support.pagerduty.com/docs/insights#incidents-list).
     * &amp;lt;!-- theme: info --&amp;gt; &amp;gt; **Note:** Analytics data is updated once per day. It takes up to 24 hours before new incidents appear in the Analytics API.
     * Scoped OAuth requires: {@code analytics.read} 
     *
     * @param responderId          The ID of the responder. (required)
     * @param getAnalyticsResponderIncidentsRequest Parameters and filters to apply to the dataset. (optional)
     */
    @RequestLine("POST /analytics/raw/responders/{responderId}/incidents")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<GetAnalyticsResponderIncidents200Response> getAnalyticsResponderIncidents(@Param("responderId") @NotNull String responderId, @Nullable GetAnalyticsResponderIncidentsRequest getAnalyticsResponderIncidentsRequest);

    /**
     * Get an Automation Action
     * <p>
     * Get an Automation Action 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("GET /automation_actions/actions/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateAutomationAction201Response> getAutomationAction(@Param("id") @NotNull String id);

    /**
     * Get the details of an Automation Action / service relation
     * <p>
     * Gets the details of a Automation Action / service relation
     *
     * @param id                   The ID of the resource. (required)
     * @param serviceId            The service ID (required)
     */
    @RequestLine("GET /automation_actions/actions/{id}/services/{serviceId}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<GetAutomationActionsActionServiceAssociation200Response> getAutomationActionsActionServiceAssociation(@Param("id") @NotNull String id, @Param("serviceId") @NotNull String serviceId);

    /**
     * Get all service references associated with an Automation Action
     * <p>
     * Gets all service references associated with an Automation Action
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("GET /automation_actions/actions/{id}/services")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<GetAutomationActionsActionServiceAssociations200Response> getAutomationActionsActionServiceAssociations(@Param("id") @NotNull String id);

    /**
     * Get the details of an Automation Action / team relation
     * <p>
     * Gets the details of an Automation Action / team relation
     *
     * @param id                   The ID of the resource. (required)
     * @param teamId               The team ID (required)
     */
    @RequestLine("GET /automation_actions/actions/{id}/teams/{teamId}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<GetAutomationActionsActionTeamAssociation200Response> getAutomationActionsActionTeamAssociation(@Param("id") @NotNull String id, @Param("teamId") @NotNull String teamId);

    /**
     * Get all team references associated with an Automation Action
     * <p>
     * Gets all team references associated with an Automation Action
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("GET /automation_actions/actions/{id}/teams")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<GetAutomationActionsActionTeamAssociations200Response> getAutomationActionsActionTeamAssociations(@Param("id") @NotNull String id);

    /**
     * Get an Invocation
     * <p>
     * Get an Automation Action Invocation 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("GET /automation_actions/invocations/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<GetAutomationActionsInvocation200Response> getAutomationActionsInvocation(@Param("id") @NotNull String id);

    /**
     * Get an Automation Action runner
     * <p>
     * Get an Automation Action runner 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("GET /automation_actions/runners/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<GetAutomationActionsRunner200Response> getAutomationActionsRunner(@Param("id") @NotNull String id);

    /**
     * Get the details of a runner / team relation
     * <p>
     * Gets the details of a runner / team relation
     *
     * @param id                   The ID of the resource. (required)
     * @param teamId               The team ID (required)
     */
    @RequestLine("GET /automation_actions/runners/{id}/teams/{teamId}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<GetAutomationActionsActionTeamAssociation200Response> getAutomationActionsRunnerTeamAssociation(@Param("id") @NotNull String id, @Param("teamId") @NotNull String teamId);

    /**
     * Get all team references associated with a runner
     * <p>
     * Gets all team references associated with a runner
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("GET /automation_actions/runners/{id}/teams")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<GetAutomationActionsActionTeamAssociations200Response> getAutomationActionsRunnerTeamAssociations(@Param("id") @NotNull String id);

    /**
     * List Automation Action runners
     * <p>
     * Lists Automation Action runners matching provided query params. The returned records are sorted by runner name in alphabetical order.
     * See [{@code Cursor-based pagination}](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for instructions on how to paginate through the result set. 
     *
     * @param limit                The minimum of the {@code limit} parameter used in the request or the maximum request size of the API. (optional)
     * @param cursor               Optional parameter used to request the "next" set of results from an API.  The value provided here is most commonly obtained from the {@code next_cursor} field of the previous request.  When no value is provided, the request starts at the beginning of the result set.  (optional)
     * @param name                 Filters results to include the ones matching the name (case insensitive substring matching) (optional)
     * @param include              Includes additional data elements into the response (optional)
     */
    @RequestLine("GET /automation_actions/runners?limit={limit}&cursor={cursor}&name={name}&include[]={include}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<GetAutomationActionsRunners200Response> getAutomationActionsRunners(@Param("limit") @Nullable Integer limit, @Param("cursor") @Nullable String cursor, @Param("name") @Nullable String name, @Param("include") @Nullable Set<String> include);

    /**
     * Get a Business Service
     * <p>
     * Get details about an existing Business Service.
     * Business services model capabilities that span multiple technical services and that may be owned by several different teams.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#business-services)
     * Scoped OAuth requires: {@code services.read} 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("GET /business_services/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateBusinessService200Response> getBusinessService(@Param("id") @NotNull String id);

    /**
     * List Business Services sorted by impacted status
     * <p>
     * Retrieve a list top-level Business Services sorted by highest Impact with {@code status} included. When called without the {@code ids[]} parameter, this endpoint does not return an exhaustive list of Business Services but rather provides access to the most impacted up to the limit of 200.
     * The returned Business Services are sorted first by Impact, secondarily by most recently impacted, and finally by name.
     * To get impact information about a specific set of Business Services, use the {@code ids[]} parameter. Scoped OAuth requires: {@code services.read} 
     *
     * @param additionalFields     Provides access to additional fields such as highest priority per business service and total impacted count (optional)
     * @param ids                  The IDs of the resources. (optional)
     */
    @RequestLine("GET /business_services/impacts?additional_fields[]={additionalFields}&ids[]={ids}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "X-EARLY-ACCESS: business-impact-early-access"
    })
    CompletableFuture<GetBusinessServiceSupportingServiceImpacts200Response> getBusinessServiceImpacts(@Param("additionalFields") @Nullable String additionalFields, @Param("ids") @Nullable String ids);

    /**
     * Get the global priority threshold for a Business Service to be considered impacted by an Incident
     * <p>
     * Retrieves the priority threshold information for an account.
     * Currently, there is a {@code global_threshold} that can be set for the account.
     * Incidents that have a priority meeting or exceeding this threshold will be considered impacting on any Business Service that depends on the Service to which the Incident belongs. Scoped OAuth requires: {@code services.read} 
     *
     */
    @RequestLine("GET /business_services/priority_thresholds")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "X-EARLY-ACCESS: business-impact-early-access"
    })
    CompletableFuture<GetBusinessServicePriorityThresholds200Response> getBusinessServicePriorityThresholds();

    /**
     * Get Business Service dependencies
     * <p>
     * Get all immediate dependencies of any Business Service.
     * Business Services model capabilities that span multiple technical services and that may be owned by several different teams.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#business-services)
     * Scoped OAuth requires: {@code services.read} 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("GET /service_dependencies/business_services/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<GetBusinessServiceServiceDependencies200Response> getBusinessServiceServiceDependencies(@Param("id") @NotNull String id);

    /**
     * List Business Service Subscribers
     * <p>
     * Retrieve a list of Notification Subscribers on the Business Service.
     * &amp;lt;!-- theme: warning --&amp;gt; &amp;gt; Users must be added through {@code POST /business_services/{id}/subscribers} to be returned from this endpoint. Scoped OAuth requires: {@code subscribers.read} 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("GET /business_services/{id}/subscribers")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2"
    })
    CompletableFuture<GetBusinessServiceSubscribers200Response> getBusinessServiceSubscribers(@Param("id") @NotNull String id);

    /**
     * List the supporting Business Services for the given Business Service Id, sorted by impacted status.
     * <p>
     * Retrieve of Business Services that support the given Business Service sorted by highest Impact with {@code status} included. This endpoint does not return an exhaustive list of Business Services but rather provides access to the most impacted up to the limit of 200.
     * The returned Business Services are sorted first by Impact, secondarily by most recently impacted, and finally by name.
     * To get impact information about a specific set of Business Services, use the {@code ids[]} parameter on the {@code /business_services/impacts} endpoint. Scoped OAuth requires: {@code services.read} 
     *
     * @param id                   The ID of the resource. (required)
     * @param additionalFields     Provides access to additional fields such as highest priority per business service and total impacted count (optional)
     * @param ids                  The IDs of the resources. (optional)
     */
    @RequestLine("GET /business_services/{id}/supporting_services/impacts?additional_fields[]={additionalFields}&ids[]={ids}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "X-EARLY-ACCESS: business-impact-early-access"
    })
    CompletableFuture<GetBusinessServiceSupportingServiceImpacts200Response> getBusinessServiceSupportingServiceImpacts(@Param("id") @NotNull String id, @Param("additionalFields") @Nullable String additionalFields, @Param("ids") @Nullable String ids);

    /**
     * List Impactors affecting Business Services
     * <p>
     * Retrieve a list of Impactors for the top-level Business Services on the account. Impactors are currently limited to Incidents.
     * This endpoint does not return an exhaustive list of Impactors but rather provides access to the highest priority Impactors for the Business Services in question up to the limit of 200.
     * To get Impactors for a specific set of Business Services, use the {@code ids[]} parameter.
     * The returned Impactors are sorted first by priority and secondarily by their creation date. Scoped OAuth requires: {@code services.read} 
     *
     * @param ids                  The IDs of the resources. (optional)
     */
    @RequestLine("GET /business_services/impactors?ids[]={ids}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "X-EARLY-ACCESS: business-impact-early-access"
    })
    CompletableFuture<GetBusinessServiceTopLevelImpactors200Response> getBusinessServiceTopLevelImpactors(@Param("ids") @Nullable String ids);

    /**
     * Get a Change Event
     * <p>
     * Get details about an existing Change Event.
     * Scoped OAuth requires: {@code change_events.read} 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("GET /change_events/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<GetChangeEvent200Response> getChangeEvent(@Param("id") @NotNull String id);

    /**
     * Get the current user
     * <p>
     * Get details about the current user.
     * This endpoint can only be used with a [user-level API key](https://support.pagerduty.com/docs/using-the-api#section-generating-a-personal-rest-api-key) or a key generated through an OAuth flow. This will not work if the request is made with an account-level access token.
     * Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users) 
     *
     * @param include              Array of additional Models to include in response. (optional)
     */
    @RequestLine("GET /users/me?include[]={include}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateUserRequest> getCurrentUser(@Param("include") @Nullable String include);

    /**
     * Get a Field
     * <p>
     * Show detailed information about a field.
     * Scoped OAuth requires: {@code custom_fields.read} 
     *
     * @param fieldId              The ID of the field. (required)
     * @param include              Array of additional details to include. (optional)
     */
    @RequestLine("GET /incidents/custom_fields/{fieldId}?include[]={include}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<CreateCustomFieldsFieldRequest> getCustomFieldsField(@Param("fieldId") @NotNull String fieldId, @Param("include") @Nullable String include);

    /**
     * Get tags for entities
     * <p>
     * Get related tags for Users, Teams or Escalation Policies.
     * A Tag is applied to Escalation Policies, Teams or Users and can be used to filter them.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#tags)
     * Scoped OAuth requires: {@code tags.read} 
     *
     * @param entityType           Type of entity related with the tag (required)
     * @param id                   The ID of the resource. (required)
     * @param limit                The number of results per page. (optional)
     * @param offset               Offset to start pagination search results. (optional)
     * @param total                By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information.  (optional, defaults to false)
     */
    @RequestLine("GET /{entityType}/{id}/tags?limit={limit}&offset={offset}&total={total}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<GetEntityTypeByIdTags200Response> getEntityTypeByIdTags(@Param("entityType") @NotNull String entityType, @Param("id") @NotNull String id, @Param("limit") @Nullable Integer limit, @Param("offset") @Nullable Integer offset, @Param("total") @Nullable Boolean total);

    /**
     * Get an escalation policy
     * <p>
     * Get information about an existing escalation policy and its rules.
     * Escalation policies define which user should be alerted at which time.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#escalation-policies)
     * Scoped OAuth requires: {@code escalation_policies.read} 
     *
     * @param id                   The ID of the resource. (required)
     * @param include              Array of additional Models to include in response. (optional)
     */
    @RequestLine("GET /escalation_policies/{id}?include[]={include}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateEscalationPolicyRequest> getEscalationPolicy(@Param("id") @NotNull String id, @Param("include") @Nullable String include);

    /**
     * Get an extension
     * <p>
     * Get details about an existing extension.
     * Extensions are representations of Extension Schema objects that are attached to Services.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#extensions)
     * Scoped OAuth requires: {@code extensions.read} 
     *
     * @param id                   The ID of the resource. (required)
     * @param include              Array of additional details to include. (optional)
     */
    @RequestLine("GET /extensions/{id}?include[]={include}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<GetExtension200Response> getExtension(@Param("id") @NotNull String id, @Param("include") @Nullable String include);

    /**
     * Get an extension vendor
     * <p>
     * Get details about one specific extension vendor.
     * A PagerDuty extension vendor represents a specific type of outbound extension such as Generic Webhook, Slack, ServiceNow.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#extension-schemas)
     * Scoped OAuth requires: {@code extension_schemas.read} 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("GET /extension_schemas/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<GetExtensionSchema200Response> getExtensionSchema(@Param("id") @NotNull String id);

    /**
     * Get an incident
     * <p>
     * Show detailed information about an incident. Accepts either an incident id, or an incident number.
     * An incident represents a problem or an issue that needs to be addressed and resolved.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#incidents)
     * Scoped OAuth requires: {@code incidents.read} 
     *
     * @param id                   The ID of the resource. (required)
     * @param include              Array of additional details to include. (optional)
     */
    @RequestLine("GET /incidents/{id}?include[]={include}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateIncident201Response> getIncident(@Param("id") @NotNull String id, @Param("include") @Nullable String include);

    /**
     * Get an alert
     * <p>
     * Show detailed information about an alert. Accepts an alert id.
     * An incident represents a problem or an issue that needs to be addressed and resolved.
     * When a service sends an event to PagerDuty, an alert and corresponding incident is triggered in PagerDuty.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#incidents)
     * Scoped OAuth requires: {@code incidents.read} 
     *
     * @param id                   The ID of the resource. (required)
     * @param alertId              The id of the alert to retrieve. (required)
     */
    @RequestLine("GET /incidents/{id}/alerts/{alertId}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<GetIncidentAlert200Response> getIncidentAlert(@Param("id") @NotNull String id, @Param("alertId") @NotNull String alertId);

    /**
     * Get Custom Field Values
     * <p>
     * Get custom field values for an incident.
     * &amp;lt;!-- theme: warning --&amp;gt;
     * Scoped OAuth requires: {@code incidents.read} 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("GET /incidents/{id}/custom_fields/values")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<GetIncidentFieldValues200Response> getIncidentFieldValues(@Param("id") @NotNull String id);

    /**
     * List Business Services impacted by the given Incident
     * <p>
     * Retrieve a list of Business Services that are being impacted by the given Incident. Scoped OAuth requires: {@code incidents.read} 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("GET /incidents/{id}/business_services/impacts")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "X-EARLY-ACCESS: business-impact-early-access"
    })
    CompletableFuture<GetIncidentImpactedBusinessServices200Response> getIncidentImpactedBusinessServices(@Param("id") @NotNull String id);

    /**
     * List Notification Subscribers
     * <p>
     * Retrieve a list of Notification Subscribers on the Incident.
     * &amp;lt;!-- theme: warning --&amp;gt; &amp;gt; Users must be added through {@code POST /incident/{id}/status_updates/subscribers} to be returned from this endpoint. Scoped OAuth requires: {@code subscribers.read} 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("GET /incidents/{id}/status_updates/subscribers")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2"
    })
    CompletableFuture<GetIncidentNotificationSubscribers200Response> getIncidentNotificationSubscribers(@Param("id") @NotNull String id);

    /**
     * Get an Incident Workflow
     * <p>
     * Get an existing Incident Workflow An Incident Workflow is a sequence of configurable Steps and associated Triggers that can execute automated Actions for a given Incident.
     * Scoped OAuth requires: {@code incident_workflows.read} 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("GET /incident_workflows/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<PostIncidentWorkflowRequest> getIncidentWorkflow(@Param("id") @NotNull String id);

    /**
     * Get an Action
     * <p>
     * Get an Incident Workflow Action
     * Scoped OAuth requires: {@code incident_workflows.read} 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("GET /incident_workflows/actions/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<GetIncidentWorkflowAction200Response> getIncidentWorkflowAction(@Param("id") @NotNull String id);

    /**
     * Get a Trigger
     * <p>
     * Retrieve an existing Incident Workflows Trigger
     * Scoped OAuth requires: {@code incident_workflows.read} 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("GET /incident_workflows/triggers/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<GetIncidentWorkflowTrigger200Response> getIncidentWorkflowTrigger(@Param("id") @NotNull String id);

    /**
     * Get a log entry
     * <p>
     * Get details for a specific incident log entry. This method provides additional information you can use to get at raw event data.
     * A log of all the events that happen to an Incident, and these are exposed as Log Entries.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#log-entries)
     * Scoped OAuth requires: {@code incidents.read} 
     *
     * @param id                   The ID of the resource. (required)
     * @param timeZone             Time zone in which results will be rendered. This will default to the account time zone. (optional)
     * @param include              Array of additional Models to include in response. (optional)
     */
    @RequestLine("GET /log_entries/{id}?time_zone={timeZone}&include[]={include}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<GetLogEntry200Response> getLogEntry(@Param("id") @NotNull String id, @Param("timeZone") @Nullable String timeZone, @Param("include") @Nullable String include);

    /**
     * Get a maintenance window
     * <p>
     * Get an existing maintenance window.
     * A Maintenance Window is used to temporarily disable one or more Services for a set period of time.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#maintenance-windows)
     * Scoped OAuth requires: {@code services.read} 
     *
     * @param id                   The ID of the resource. (required)
     * @param include              Array of additional Models to include in response. (optional)
     */
    @RequestLine("GET /maintenance_windows/{id}?include[]={include}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateMaintenanceWindowRequest> getMaintenanceWindow(@Param("id") @NotNull String id, @Param("include") @Nullable String include);

    /**
     * Get the Service Orchestration active status for a Service
     * <p>
     * Get a Service Orchestration's active status.
     * A Service Orchestration allows you to set an active status based on whether an event will be evaluated against a service orchestration path (true) or service ruleset (false).
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#event-orchestrations)
     * Scoped OAuth requires: {@code services.read} 
     *
     * @param serviceId            The service ID (required)
     */
    @RequestLine("GET /event_orchestrations/services/{serviceId}/active")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<GetOrchActiveStatus200Response> getOrchActiveStatus(@Param("serviceId") @NotNull String serviceId);

    /**
     * Get the Global Orchestration for an Event Orchestration
     * <p>
     * Get the Global Orchestration for an Event Orchestration.
     * Global Orchestration Rules allows you to create a set of Event Rules. These rules evaluate against all Events sent to an Event Orchestration. When a matching rule is found, it can modify and enhance the event and can route the event to another set of Global Rules within this Orchestration for further processing.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#event-orchestrations)
     * Scoped OAuth requires: {@code event_orchestrations.read} 
     *
     * @param id                   The ID of an Event Orchestration. (required)
     */
    @RequestLine("GET /event_orchestrations/{id}/global")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<OrchestrationGlobal> getOrchPathGlobal(@Param("id") @NotNull String id);

    /**
     * Get the Router for an Event Orchestration
     * <p>
     * Get a Global Orchestration's Routing Rules.
     * An Orchestration Router allows you to create a set of Event Rules. The Router evaluates Events you send to this Global Orchestration against each of its rules, one at a time, and routes the event to a specific Service based on the first rule that matches. If an event doesn't match any rules, it'll be sent to service specified in as the {@code catch_all} or the "Unrouted" Orchestration if no service is specified.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#event-orchestrations)
     * Scoped OAuth requires: {@code event_orchestrations.read} 
     *
     * @param id                   The ID of an Event Orchestration. (required)
     */
    @RequestLine("GET /event_orchestrations/{id}/router")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<OrchestrationRouter> getOrchPathRouter(@Param("id") @NotNull String id);

    /**
     * Get the Service Orchestration for a Service
     * <p>
     * Get a Service Orchestration.
     * A Service Orchestration allows you to create a set of Event Rules. The Service Orchestration evaluates Events sent to this Service against each of its rules, beginning with the rules in the "start" set. When a matching rule is found, it can modify and enhance the event and can route the event to another set of rules within this Service Orchestration for further processing.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#event-orchestrations)
     * Scoped OAuth requires: {@code services.read} 
     *
     * @param serviceId            The service ID (required)
     * @param include              Array of additional Models to include in response. (optional)
     */
    @RequestLine("GET /event_orchestrations/services/{serviceId}?include[]={include}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<ServiceOrchestration> getOrchPathService(@Param("serviceId") @NotNull String serviceId, @Param("include") @Nullable String include);

    /**
     * Get the Unrouted Orchestration for an Event Orchestration
     * <p>
     * Get a Global Event Orchestration's Rules for Unrouted events.
     * An Unrouted Orchestration allows you to create a set of Event Rules that will be evaluated against all events that don't match any rules in the Global Orchestration's Router. Events that reach the Unrouted Orchestration will never be routed to a specific Service.
     * The Unrouted Orchestration evaluates Events sent to it against each of its rules, beginning with the rules in the "start" set. When a matching rule is found, it can modify and enhance the event and can route the event to another set of rules within this Unrouted Orchestration for further processing.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#event-orchestrations)
     * Scoped OAuth requires: {@code event_orchestrations.read} 
     *
     * @param id                   The ID of an Event Orchestration. (required)
     */
    @RequestLine("GET /event_orchestrations/{id}/unrouted")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<OrchestrationUnrouted> getOrchPathUnrouted(@Param("id") @NotNull String id);

    /**
     * Get an Orchestration
     * <p>
     * Get a Global Event Orchestration.
     * Global Event Orchestrations allow you define a set of Global Rules and Router Rules, so that when you ingest events using the Orchestration's Routing Key your events will have actions applied via the Global Rules &amp; then routed to the correct Service by the Router Rules, based on the event's content.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#event-orchestrations)
     * Scoped OAuth requires: {@code event_orchestrations.read} 
     *
     * @param id                   The ID of an Event Orchestration. (required)
     */
    @RequestLine("GET /event_orchestrations/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<PostOrchestration201Response> getOrchestration(@Param("id") @NotNull String id);

    /**
     * Get an Integration for an Event Orchestration
     * <p>
     * Get an Integration associated with this Event Orchestrations.
     * You can use the Routing Key from this Integration to send events to PagerDuty!
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#event-orchestrations)
     * Scoped OAuth requires: {@code event_orchestrations.read} 
     *
     * @param id                   The ID of an Event Orchestration. (required)
     * @param integrationId        The ID of an Integration. (required)
     */
    @RequestLine("GET /event_orchestrations/{id}/integrations/{integrationId}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<GetOrchestrationIntegration200Response> getOrchestrationIntegration(@Param("id") @NotNull String id, @Param("integrationId") @NotNull String integrationId);

    /**
     * Get Outlier Incident
     * <p>
     * Gets Outlier Incident information for a given Incident on its Service.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#outlier-incident)
     * Scoped OAuth requires: {@code incidents.read} 
     *
     * @param id                   The ID of the resource. (required)
     * @param since                The start of the date range over which you want to search. (optional)
     * @param additionalDetails    Array of additional attributes to any of the returned incidents for related incidents. (optional)
     */
    @RequestLine("GET /incidents/{id}/outlier_incident?since={since}&additional_details[]={additionalDetails}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<GetOutlierIncident200Response> getOutlierIncident(@Param("id") @NotNull String id, @Param("since") @Nullable OffsetDateTime since, @Param("additionalDetails") @Nullable String additionalDetails);

    /**
     * Get Past Incidents
     * <p>
     * Past Incidents returns Incidents within the past 6 months that have similar metadata and were generated on the same Service as the parent Incident. By default, 5 Past Incidents are returned. Note: This feature is currently available as part of the Event Intelligence package or Digital Operations plan only.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#past_incidents)
     * Scoped OAuth requires: {@code incidents.read} 
     *
     * @param id                   The ID of the resource. (required)
     * @param limit                The number of results to be returned in the response. (optional, defaults to 5)
     * @param total                By default the {@code total} field in the response body is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated with the total number of Past Incidents.  (optional, defaults to false)
     */
    @RequestLine("GET /incidents/{id}/past_incidents?limit={limit}&total={total}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<GetPastIncidents200Response> getPastIncidents(@Param("id") @NotNull String id, @Param("limit") @Nullable Integer limit, @Param("total") @Nullable Boolean total);

    /**
     * Get Paused Incident Reporting on Alerts
     * <p>
     * Returns the 5 most recent alerts that were triggered after being paused and the 5 most recent alerts that were resolved after being paused for a given reporting period (maximum 6 months lookback period).
     * Note: This feature is currently available as part of the Event Intelligence package or Digital Operations plan only.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#paused-incident-reports)
     * Scoped OAuth requires: {@code incidents.read} 
     *
     * @param since                The start of the date range over which you want to search. (optional)
     * @param until                The end of the date range over which you want to search. (optional)
     * @param serviceId            Specifies a filter to limit the scope of reporting to a particular service (optional)
     * @param suspendedBy          Specifies a filter to scope the response to either alerts suspended by Auto Pause or Event Rules. (optional)
     */
    @RequestLine("GET /paused_incident_reports/alerts?since={since}&until={until}&service_id={serviceId}&suspended_by={suspendedBy}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<GetPausedIncidentReportAlerts200Response> getPausedIncidentReportAlerts(@Param("since") @Nullable OffsetDateTime since, @Param("until") @Nullable OffsetDateTime until, @Param("serviceId") @Nullable String serviceId, @Param("suspendedBy") @Nullable String suspendedBy);

    /**
     * Get Paused Incident Reporting counts
     * <p>
     * Returns reporting counts for paused Incident usage for a given reporting period (maximum 6 months lookback period).
     * Note: This feature is currently available as part of the Event Intelligence package or Digital Operations plan only.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#paused-incident-reports)
     * Scoped OAuth requires: {@code incidents.read} 
     *
     * @param since                The start of the date range over which you want to search. (optional)
     * @param until                The end of the date range over which you want to search. (optional)
     * @param serviceId            Specifies a filter to limit the scope of reporting to a particular service (optional)
     * @param suspendedBy          Specifies a filter to scope the response to either alerts suspended by Auto Pause or Event Rules. (optional)
     */
    @RequestLine("GET /paused_incident_reports/counts?since={since}&until={until}&service_id={serviceId}&suspended_by={suspendedBy}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<GetPausedIncidentReportCounts200Response> getPausedIncidentReportCounts(@Param("since") @Nullable OffsetDateTime since, @Param("until") @Nullable OffsetDateTime until, @Param("serviceId") @Nullable String serviceId, @Param("suspendedBy") @Nullable String suspendedBy);

    /**
     * Get Related Incidents
     * <p>
     * Returns the 20 most recent Related Incidents that are impacting other Responders and Services. Note: This feature is currently available as part of the Event Intelligence package or Digital Operations plan only.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#related_incidents)
     * Scoped OAuth requires: {@code incidents.read} 
     *
     * @param id                   The ID of the resource. (required)
     * @param additionalDetails    Array of additional attributes to any of the returned incidents for related incidents. (optional)
     */
    @RequestLine("GET /incidents/{id}/related_incidents?additional_details[]={additionalDetails}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<GetRelatedIncidents200Response> getRelatedIncidents(@Param("id") @NotNull String id, @Param("additionalDetails") @Nullable String additionalDetails);

    /**
     * Get a Response Play
     * <p>
     * Get details about an existing Response Play.
     * Response Plays allow you to create packages of Incident Actions that can be applied during an Incident's life cycle.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#response-plays)
     * When using a Global API token, the {@code From} header is required. Scoped OAuth requires: {@code response_plays.read} 
     *
     * @param id                   The ID of the resource. (required)
     * @param from                 The email address of a valid user associated with the account making the request. This is optional, and is only used for change tracking. (optional)
     * @deprecated
     */
    @Deprecated
    @RequestLine("GET /response_plays/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json", 
        "From: {from}"
    })
    CompletableFuture<CreateResponsePlay201Response> getResponsePlay(@Param("id") @NotNull String id, @Param("from") @Nullable String from);

    /**
     * Get a Ruleset
     * <p>
     * Get a Ruleset. &amp;lt;!-- theme: warning --&amp;gt; &amp;gt; ### End-of-life &amp;gt; Rulesets and Event Rules will end-of-life soon. We highly recommend that you [migrate to Event Orchestration](https://support.pagerduty.com/docs/migrate-to-event-orchestration) as soon as possible so you can take advantage of the new functionality, such as improved UI, rule creation, APIs and Terraform support, advanced conditions, and rule nesting.
     * Rulesets allow you to route events to an endpoint and create collections of Event Rules, which define sets of actions to take based on event content.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#rulesets)
     * Scoped OAuth requires: {@code event_rules.read} 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("GET /rulesets/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateRuleset201Response> getRuleset(@Param("id") @NotNull String id);

    /**
     * Get an Event Rule
     * <p>
     * Get an Event Rule. &amp;lt;!-- theme: warning --&amp;gt; &amp;gt; ### End-of-life &amp;gt; Rulesets and Event Rules will end-of-life soon. We highly recommend that you [migrate to Event Orchestration](https://support.pagerduty.com/docs/migrate-to-event-orchestration) as soon as possible so you can take advantage of the new functionality, such as improved UI, rule creation, APIs and Terraform support, advanced conditions, and rule nesting.
     * Rulesets allow you to route events to an endpoint and create collections of Event Rules, which define sets of actions to take based on event content.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#rulesets)
     * Note: Create and Update on rules will accept 'description' or 'summary' interchangeably as an extraction action target. Get and List on rules will always return 'summary' as the target. If you are expecting 'description' please change your automation code to expect 'summary' instead.
     * Scoped OAuth requires: {@code event_rules.read} 
     *
     * @param id                   The ID of the resource. (required)
     * @param ruleId               The id of the Event Rule to retrieve. (required)
     */
    @RequestLine("GET /rulesets/{id}/rules/{ruleId}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateRulesetEventRule201Response> getRulesetEventRule(@Param("id") @NotNull String id, @Param("ruleId") @NotNull String ruleId);

    /**
     * Get a schedule
     * <p>
     * Show detailed information about a schedule, including entries for each layer. Scoped OAuth requires: {@code schedules.read} 
     *
     * @param id                   The ID of the resource. (required)
     * @param timeZone             Time zone in which results will be rendered. This will default to the schedule's time zone. (optional)
     * @param since                The start of the date range over which you want to show schedule entries. Defaults to 2 weeks before until if an until is given. (optional)
     * @param until                The end of the date range over which you want to show schedule entries. Defaults to 2 weeks after since if a since is given. (optional)
     * @param overflow             Any on-call schedule entries that pass the date range bounds will be truncated at the bounds, unless the parameter {@code overflow=true} is passed. This parameter defaults to false. For instance, if your schedule is a rotation that changes daily at midnight UTC, and your date range is from {@code 2011-06-01T10:00:00Z} to {@code 2011-06-01T14:00:00Z}:   - If you don't pass the {@code overflow=true} parameter, you will get one schedule entry returned with a start of {@code 2011-06-01T10:00:00Z} and end of {@code 2011-06-01T14:00:00Z}. - If you do pass the {@code overflow=true} parameter, you will get one schedule entry returned with a start of {@code 2011-06-01T00:00:00Z} and end of {@code 2011-06-02T00:00:00Z}.  (optional, defaults to false)
     */
    @RequestLine("GET /schedules/{id}?time_zone={timeZone}&since={since}&until={until}&overflow={overflow}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateScheduleRequest> getSchedule(@Param("id") @NotNull String id, @Param("timeZone") @Nullable String timeZone, @Param("since") @Nullable OffsetDateTime since, @Param("until") @Nullable OffsetDateTime until, @Param("overflow") @Nullable Boolean overflow);

    /**
     * Get a service
     * <p>
     * Get details about an existing service.
     * A service may represent an application, component, or team you wish to open incidents against.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#services)
     * Scoped OAuth requires: {@code services.read} 
     *
     * @param id                   The ID of the resource. (required)
     * @param include              Array of additional details to include. (optional)
     */
    @RequestLine("GET /services/{id}?include[]={include}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateServiceRequest> getService(@Param("id") @NotNull String id, @Param("include") @Nullable String include);

    /**
     * Get an Event Rule from a Service
     * <p>
     * Get an Event Rule from a Service. &amp;lt;!-- theme: warning --&amp;gt; &amp;gt; ### End-of-life &amp;gt; Rulesets and Event Rules will end-of-life soon. We highly recommend that you [migrate to Event Orchestration](https://support.pagerduty.com/docs/migrate-to-event-orchestration) as soon as possible so you can take advantage of the new functionality, such as improved UI, rule creation, APIs and Terraform support, advanced conditions, and rule nesting.
     * Scoped OAuth requires: {@code services.read} 
     *
     * @param id                   The ID of the resource. (required)
     * @param ruleId               The id of the Event Rule to retrieve. (required)
     */
    @RequestLine("GET /services/{id}/rules/{ruleId}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateServiceEventRule201Response> getServiceEventRule(@Param("id") @NotNull String id, @Param("ruleId") @NotNull String ruleId);

    /**
     * View an integration
     * <p>
     * Get details about an integration belonging to a service.
     * A service may represent an application, component, or team you wish to open incidents against.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#services)
     * Scoped OAuth requires: {@code services.read} 
     *
     * @param id                   The ID of the resource. (required)
     * @param integrationId        The integration ID on the service. (required)
     * @param include              Array of additional details to include. (optional)
     */
    @RequestLine("GET /services/{id}/integrations/{integrationId}?include[]={include}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateServiceIntegrationRequest> getServiceIntegration(@Param("id") @NotNull String id, @Param("integrationId") @NotNull String integrationId, @Param("include") @Nullable String include);

    /**
     * Get a single Status Dashboard by {@code id}
     * <p>
     * Get a Status Dashboard by its PagerDuty {@code id}.
     * Scoped OAuth requires: {@code status_dashboards.read} 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("GET /status_dashboards/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2"
    })
    CompletableFuture<GetStatusDashboardById200Response> getStatusDashboardById(@Param("id") @NotNull String id);

    /**
     * Get a single Status Dashboard by {@code url_slug}
     * <p>
     * Get a Status Dashboard by its PagerDuty {@code url_slug}.
     * A {@code url_slug} is a human-readable reference for a custom Status Dashboard that may be created or changed in the UI. It will generally be a {@code dash-separated-string-like-this}.
     * Scoped OAuth requires: {@code status_dashboards.read} 
     *
     * @param urlSlug              The {@code url_slug} for a status dashboard (required)
     */
    @RequestLine("GET /status_dashboards/url_slugs/{urlSlug}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2"
    })
    CompletableFuture<GetStatusDashboardById200Response> getStatusDashboardByUrlSlug(@Param("urlSlug") @NotNull String urlSlug);

    /**
     * Get impacted Business Services for a Status Dashboard by {@code id}.
     * <p>
     * Get impacted Business Services for a Status Dashboard by {@code id}
     * This endpoint does not return an exhaustive list of Business Services but rather provides access to the most impacted on the specified Status Dashboard up to the limit of 200.
     * The returned Business Services are sorted first by Impact, secondarily by most recently impacted, and finally by name.
     * To get Impact information about a specific Business Service on the Status Dashboard that does not appear in the Impact-sorted response, use the {@code ids[]} parameter on the {@code /business_services/impacts} endpoint.
     * Scoped OAuth requires: {@code status_dashboards.read} 
     *
     * @param id                   The ID of the resource. (required)
     * @param additionalFields     Provides access to additional fields such as highest priority per business service and total impacted count (optional)
     */
    @RequestLine("GET /status_dashboards/{id}/service_impacts?additional_fields[]={additionalFields}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2"
    })
    CompletableFuture<GetBusinessServiceSupportingServiceImpacts200Response> getStatusDashboardServiceImpactsById(@Param("id") @NotNull String id, @Param("additionalFields") @Nullable String additionalFields);

    /**
     * Get impacted Business Services for a
     * Status Dashboard by {@code url_slug}
     * <p>
     * Get Business Service Impacts for the Business Services on a Status Dashboard by its {@code url_slug}. A {@code url_slug} is a human-readable reference for a custom Status Dashboard that may be created or changed in the UI. It will generally be a {@code dash-separated-string-like-this}.
     * This endpoint does not return an exhaustive list of Business Services but rather provides access to the most impacted on the Status Dashboard up to the limit of 200.
     * The returned Business Services are sorted first by Impact, secondarily by most recently impacted, and finally by name.
     * To get impact information about a specific Business Service on the Status Dashboard that does not appear in the Impact-sored response, use the {@code ids[]} parameter on the {@code /business_services/impacts} endpoint.
     * Scoped OAuth requires: {@code status_dashboards.read} 
     *
     * @param urlSlug              The {@code url_slug} for a status dashboard (required)
     * @param additionalFields     Provides access to additional fields such as highest priority per business service and total impacted count (optional)
     */
    @RequestLine("GET /status_dashboards/url_slugs/{urlSlug}/service_impacts?additional_fields[]={additionalFields}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2"
    })
    CompletableFuture<GetBusinessServiceSupportingServiceImpacts200Response> getStatusDashboardServiceImpactsByUrlSlug(@Param("urlSlug") @NotNull String urlSlug, @Param("additionalFields") @Nullable String additionalFields);

    /**
     * Get a tag
     * <p>
     * Get details about an existing Tag.
     * A Tag is applied to Escalation Policies, Teams or Users and can be used to filter them.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#tags)
     * Scoped OAuth requires: {@code tags.read} 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("GET /tags/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateTagsRequest> getTag(@Param("id") @NotNull String id);

    /**
     * Get connected entities
     * <p>
     * Get related Users, Teams or Escalation Policies for the Tag.
     * A Tag is applied to Escalation Policies, Teams or Users and can be used to filter them.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#tags)
     * Scoped OAuth requires: {@code tags.read} 
     *
     * @param id                   The ID of the resource. (required)
     * @param entityType           Type of entity related with the tag (required)
     * @param limit                The number of results per page. (optional)
     * @param offset               Offset to start pagination search results. (optional)
     * @param total                By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information.  (optional, defaults to false)
     */
    @RequestLine("GET /tags/{id}/{entityType}?limit={limit}&offset={offset}&total={total}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<GetTagsByEntityType200Response> getTagsByEntityType(@Param("id") @NotNull String id, @Param("entityType") @NotNull String entityType, @Param("limit") @Nullable Integer limit, @Param("offset") @Nullable Integer offset, @Param("total") @Nullable Boolean total);

    /**
     * Get a team
     * <p>
     * Get details about an existing team.
     * A team is a collection of Users and Escalation Policies that represent a group of people within an organization.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#teams)
     * Scoped OAuth requires: {@code teams.read} 
     *
     * @param id                   The ID of the resource. (required)
     * @param include              Array of additional Models to include in response. (optional)
     */
    @RequestLine("GET /teams/{id}?include[]={include}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateTeamRequest> getTeam(@Param("id") @NotNull String id, @Param("include") @Nullable String include);

    /**
     * List Team Notification Subscriptions
     * <p>
     * Retrieve a list of Notification Subscriptions the given Team has.
     * &amp;lt;!-- theme: warning --&amp;gt; &amp;gt; Teams must be added through {@code POST /teams/{id}/notification_subscriptions} to be returned from this endpoint.
     * Scoped OAuth requires: {@code subscribers.read} 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("GET /teams/{id}/notification_subscriptions")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2"
    })
    CompletableFuture<GetTeamNotificationSubscriptions200Response> getTeamNotificationSubscriptions(@Param("id") @NotNull String id);

    /**
     * Get technical service dependencies
     * <p>
     * Get all immediate dependencies of any technical service. Technical services are also known as {@code services}.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#services)
     * Scoped OAuth requires: {@code services.read} 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("GET /service_dependencies/technical_services/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateServiceDependency200Response> getTechnicalServiceServiceDependencies(@Param("id") @NotNull String id);

    /**
     * Get a template
     * <p>
     * Get a single template on the account
     * Scoped OAuth requires: {@code templates.read} 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("GET /templates/{id}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<CreateTemplate201Response> getTemplate(@Param("id") @NotNull String id);

    /**
     * List templates
     * <p>
     * Get a list of all the template on an account
     * Scoped OAuth requires: {@code templates.read} 
     *
     * @param limit                The number of results per page. (optional)
     * @param offset               Offset to start pagination search results. (optional)
     * @param total                By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information.  (optional, defaults to false)
     * @param query                Template name or description to search (optional)
     * @param templateType         Filters templates by type. (optional, defaults to status_update)
     * @param sortBy               Used to specify both the field you wish to sort the results on (name/created_at), as well as the direction (asc/desc) of the results. The sort_by field and direction should be separated by a colon. Sort direction defaults to ascending. (optional, defaults to created_at:asc)
     */
    @RequestLine("GET /templates?limit={limit}&offset={offset}&total={total}&query={query}&template_type={templateType}&sort_by={sortBy}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<GetTemplates200Response> getTemplates(@Param("limit") @Nullable Integer limit, @Param("offset") @Nullable Integer offset, @Param("total") @Nullable Boolean total, @Param("query") @Nullable String query, @Param("templateType") @Nullable String templateType, @Param("sortBy") @Nullable String sortBy);

    /**
     * Get a user
     * <p>
     * Get details about an existing user.
     * Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users.read} 
     *
     * @param id                   The ID of the resource. (required)
     * @param include              Array of additional Models to include in response. (optional)
     */
    @RequestLine("GET /users/{id}?include[]={include}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateUserRequest> getUser(@Param("id") @NotNull String id, @Param("include") @Nullable String include);

    /**
     * Get a user's contact method
     * <p>
     * Get details about a User's contact method.
     * Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users:contact_methods.read} 
     *
     * @param id                   The ID of the resource. (required)
     * @param contactMethodId      The contact method ID on the user. (required)
     */
    @RequestLine("GET /users/{id}/contact_methods/{contactMethodId}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateUserContactMethod201Response> getUserContactMethod(@Param("id") @NotNull String id, @Param("contactMethodId") @NotNull String contactMethodId);

    /**
     * List a user's contact methods
     * <p>
     * List contact methods of your PagerDuty user.
     * Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users:contact_methods.read} 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("GET /users/{id}/contact_methods")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<GetUserContactMethods200Response> getUserContactMethods(@Param("id") @NotNull String id);

    /**
     * Get a user's handoff notification rule
     * <p>
     * Get details about a User's Handoff Notification Rule. Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account. For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users.read} 
     *
     * @param id                   The ID of the resource. (required)
     * @param oncallHandoffNotificationRuleId The oncall handoff notification rule ID on the user. (required)
     */
    @RequestLine("GET /users/{id}/oncall_handoff_notification_rules/{oncallHandoffNotificationRuleId}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateUserHandoffNotificationRuleRequest> getUserHandoffNotifiactionRule(@Param("id") @NotNull String id, @Param("oncallHandoffNotificationRuleId") @NotNull String oncallHandoffNotificationRuleId);

    /**
     * List a User's Handoff Notification Rules
     * <p>
     * List Handoff Notification Rules of your PagerDuty User. Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account. For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users.read} 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("GET /users/{id}/oncall_handoff_notification_rules")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<GetUserHandoffNotificationRules200Response> getUserHandoffNotificationRules(@Param("id") @NotNull String id);

    /**
     * Get the License allocated to a User
     * <p>
     * Get the License allocated to a User
     * Scoped OAuth requires: {@code licenses.read} 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("GET /users/{id}/license")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<GetUserLicense200Response> getUserLicense(@Param("id") @NotNull String id);

    /**
     * Get a user's notification rule
     * <p>
     * Get details about a user's notification rule.
     * Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users:contact_methods.read} 
     *
     * @param id                   The ID of the resource. (required)
     * @param notificationRuleId   The notification rule ID on the user. (required)
     * @param include              Array of additional details to include. (optional)
     */
    @RequestLine("GET /users/{id}/notification_rules/{notificationRuleId}?include[]={include}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateUserNotificationRuleRequest> getUserNotificationRule(@Param("id") @NotNull String id, @Param("notificationRuleId") @NotNull String notificationRuleId, @Param("include") @Nullable String include);

    /**
     * List a user's notification rules
     * <p>
     * List notification rules of your PagerDuty user.
     * Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users:contact_methods.read} 
     *
     * @param id                   The ID of the resource. (required)
     * @param include              Array of additional details to include. (optional)
     * @param urgency              The incident urgency for which the notification rules are applied. If not specified, defaults to {@code high}. (optional)
     */
    @RequestLine("GET /users/{id}/notification_rules?include[]={include}&urgency={urgency}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<GetUserNotificationRules200Response> getUserNotificationRules(@Param("id") @NotNull String id, @Param("include") @Nullable String include, @Param("urgency") @Nullable String urgency);

    /**
     * List Notification Subscriptions
     * <p>
     * Retrieve a list of Notification Subscriptions the given User has.
     * &amp;lt;!-- theme: warning --&amp;gt; &amp;gt; Users must be added through {@code POST /users/{id}/notification_subscriptions} to be returned from this endpoint.
     * Scoped OAuth requires: {@code subscribers.read} 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("GET /users/{id}/notification_subscriptions")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2"
    })
    CompletableFuture<GetTeamNotificationSubscriptions200Response> getUserNotificationSubscriptions(@Param("id") @NotNull String id);

    /**
     * Get a user's session
     * <p>
     * Get details about a user's session.
     * Beginning November 2021, user sessions no longer includes newly issued OAuth tokens.
     * Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users:sessions.read} 
     *
     * @param id                   The ID of the resource. (required)
     * @param type                 The session type for the user session ID. (required)
     * @param sessionId            The session ID for the user. (required)
     */
    @RequestLine("GET /users/{id}/sessions/{type}/{sessionId}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<GetUserSession200Response> getUserSession(@Param("id") @NotNull String id, @Param("type") @NotNull String type, @Param("sessionId") @NotNull String sessionId);

    /**
     * List a user's active sessions
     * <p>
     * List active sessions of a PagerDuty user.
     * Beginning November 2021, active sessions no longer includes newly issued OAuth tokens.
     * Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users:sessions.read} 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("GET /users/{id}/sessions")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<GetUserSessions200Response> getUserSessions(@Param("id") @NotNull String id);

    /**
     * Get a user's status update notification rule
     * <p>
     * Get details about a user's status update notification rule.
     * Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account.
     * &amp;lt;!-- theme: warning --&amp;gt; &amp;gt; ### Early Access &amp;gt; This endpoint is in Early Access and may change at any time. You must pass in the X-EARLY-ACCESS header to access it.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users.read} 
     *
     * @param id                   The ID of the resource. (required)
     * @param statusUpdateNotificationRuleId The status update notification rule ID on the user. (required)
     * @param include              Array of additional details to include. (optional)
     */
    @RequestLine("GET /users/{id}/status_update_notification_rules/{statusUpdateNotificationRuleId}?include[]={include}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json", 
        "X-EARLY-ACCESS: status-update-notification-rules"
    })
    CompletableFuture<GetUserStatusUpdateNotificationRule200Response> getUserStatusUpdateNotificationRule(@Param("id") @NotNull String id, @Param("statusUpdateNotificationRuleId") @NotNull String statusUpdateNotificationRuleId, @Param("include") @Nullable String include);

    /**
     * List a user's status update notification rules
     * <p>
     * List status update notification rules of your PagerDuty user.
     * Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account.
     * &amp;lt;!-- theme: warning --&amp;gt; &amp;gt; ### Early Access &amp;gt; This endpoint is in Early Access and may change at any time. You must pass in the X-EARLY-ACCESS header to access it.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users.read} 
     *
     * @param id                   The ID of the resource. (required)
     * @param include              Array of additional details to include. (optional)
     */
    @RequestLine("GET /users/{id}/status_update_notification_rules?include[]={include}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json", 
        "X-EARLY-ACCESS: status-update-notification-rules"
    })
    CompletableFuture<GetUserStatusUpdateNotificationRules200Response> getUserStatusUpdateNotificationRules(@Param("id") @NotNull String id, @Param("include") @Nullable String include);

    /**
     * Get a vendor
     * <p>
     * Get details about one specific vendor.
     * A PagerDuty Vendor represents a specific type of integration. AWS Cloudwatch, Splunk, Datadog are all examples of vendors
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#vendors)
     * Scoped OAuth requires: {@code vendors.read} 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("GET /vendors/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<GetVendor200Response> getVendor(@Param("id") @NotNull String id);

    /**
     * Get a webhook subscription
     * <p>
     * Gets details about an existing webhook subscription. 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("GET /webhook_subscriptions/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2"
    })
    CompletableFuture<CreateWebhookSubscriptionRequest> getWebhookSubscription(@Param("id") @NotNull String id);

    /**
     * List abilities
     * <p>
     * List all of your account's abilities, by name.
     * "Abilities" describes your account's capabilities by feature name. For example {@code "teams"}.
     * An ability may be available to your account based on things like your pricing plan or account state.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#abilities)
     * Scoped OAuth requires: {@code abilities.read} 
     *
     */
    @RequestLine("GET /abilities")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<ListAbilities200Response> listAbilities();

    /**
     * List installed Add-ons
     * <p>
     * List all of the Add-ons installed on your account.
     * Addon's are pieces of functionality that developers can write to insert new functionality into PagerDuty's UI.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#add-ons)
     * Scoped OAuth requires: {@code addons.read} 
     *
     * @param limit                The number of results per page. (optional)
     * @param offset               Offset to start pagination search results. (optional)
     * @param total                By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information.  (optional, defaults to false)
     * @param include              Array of additional Models to include in response. (optional)
     * @param serviceIds           Filters the results, showing only Add-ons for the given services (optional)
     * @param filter               Filters the results, showing only Add-ons of the given type (optional)
     */
    @RequestLine("GET /addons?limit={limit}&offset={offset}&total={total}&include[]={include}&service_ids[]={serviceIds}&filter={filter}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<ListAddon200Response> listAddon(@Param("limit") @Nullable Integer limit, @Param("offset") @Nullable Integer offset, @Param("total") @Nullable Boolean total, @Param("include") @Nullable String include, @Param("serviceIds") @Nullable Set<String> serviceIds, @Param("filter") @Nullable String filter);

    /**
     * List audit records
     * <p>
     * List audit trail records matching provided query params or default criteria.
     * The returned records are sorted by the {@code execution_time} from newest to oldest.
     * See [{@code Cursor-based pagination}](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for instructions on how to paginate through the result set.
     * Only admins, account owners, or global API tokens on PagerDuty account [pricing plans](https://www.pagerduty.com/pricing) with the "Audit Trail" feature can access this endpoint.
     * For other role based access to audit records by resource ID, see the resource's API documentation.
     * For more information see the [Audit API Document](https://developer.pagerduty.com/docs/rest-api-v2/audit-records-api/).
     * Scoped OAuth requires: {@code audit_records.read} 
     *
     * @param limit                The minimum of the {@code limit} parameter used in the request or the maximum request size of the API. (optional)
     * @param cursor               Optional parameter used to request the "next" set of results from an API.  The value provided here is most commonly obtained from the {@code next_cursor} field of the previous request.  When no value is provided, the request starts at the beginning of the result set.  (optional)
     * @param since                The start of the date range over which you want to search. If not specified, defaults to {@code now() - 24 hours} (past 24 hours) (optional)
     * @param until                The end of the date range over which you want to search. If not specified, defaults to {@code now()}. May not be more than 31 days after {@code since}. (optional)
     * @param rootResourceTypes    Resource type filter for the root_resource. (optional)
     * @param actorType            Actor type filter. (optional)
     * @param actorId              Actor Id filter. Must be qualified by providing the {@code actor_type} param. (optional)
     * @param methodType           Method type filter. (optional)
     * @param methodTruncatedToken Method truncated_token filter. Must be qualified by providing the {@code method_type} param. (optional)
     * @param actions              Action filter (optional)
     */
    @RequestLine("GET /audit/records?limit={limit}&cursor={cursor}&since={since}&until={until}&root_resource_types[]={rootResourceTypes}&actor_type={actorType}&actor_id={actorId}&method_type={methodType}&method_truncated_token={methodTruncatedToken}&actions[]={actions}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<AuditRecordResponseSchema> listAuditRecords(@Param("limit") @Nullable Integer limit, @Param("cursor") @Nullable String cursor, @Param("since") @Nullable OffsetDateTime since, @Param("until") @Nullable OffsetDateTime until, @Param("rootResourceTypes") @Nullable String rootResourceTypes, @Param("actorType") @Nullable String actorType, @Param("actorId") @Nullable String actorId, @Param("methodType") @Nullable String methodType, @Param("methodTruncatedToken") @Nullable String methodTruncatedToken, @Param("actions") @Nullable String actions);

    /**
     * List Invocations
     * <p>
     * List Invocations 
     *
     * @param incidentId           Incident ID (required)
     * @param invocationState      Invocation state (optional)
     */
    @RequestLine("GET /automation_actions/invocations?invocation_state={invocationState}&incident_id={incidentId}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<ListAutomationActionInvocations200Response> listAutomationActionInvocations(@Param("incidentId") @NotNull String incidentId, @Param("invocationState") @Nullable String invocationState);

    /**
     * List Business Services
     * <p>
     * List existing Business Services.
     * Business services model capabilities that span multiple technical services and that may be owned by several different teams.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#business-services)
     * Scoped OAuth requires: {@code services.read} 
     *
     * @param limit                The number of results per page. (optional)
     * @param offset               Offset to start pagination search results. (optional)
     * @param total                By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information.  (optional, defaults to false)
     */
    @RequestLine("GET /business_services?limit={limit}&offset={offset}&total={total}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<ListBusinessServices200Response> listBusinessServices(@Param("limit") @Nullable Integer limit, @Param("offset") @Nullable Integer offset, @Param("total") @Nullable Boolean total);

    /**
     * List Change Events
     * <p>
     * List all of the existing Change Events.
     * Scoped OAuth requires: {@code change_events.read} 
     *
     * @param limit                The number of results per page. (optional)
     * @param offset               Offset to start pagination search results. (optional)
     * @param total                By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information.  (optional, defaults to false)
     * @param teamIds              An array of team IDs. Only results related to these teams will be returned. Account must have the {@code teams} ability to use this parameter. (optional)
     * @param integrationIds       An array of integration IDs. Only results related to these integrations will be returned. (optional)
     * @param since                The start of the date range over which you want to search, as a UTC ISO 8601 datetime string. Will return an HTTP 400 for non-UTC datetimes. (optional)
     * @param until                The end of the date range over which you want to search, as a UTC ISO 8601 datetime string. Will return an HTTP 400 for non-UTC datetimes. (optional)
     */
    @RequestLine("GET /change_events?limit={limit}&offset={offset}&total={total}&team_ids[]={teamIds}&integration_ids[]={integrationIds}&since={since}&until={until}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<ListChangeEvents200Response> listChangeEvents(@Param("limit") @Nullable Integer limit, @Param("offset") @Nullable Integer offset, @Param("total") @Nullable Boolean total, @Param("teamIds") @Nullable Set<String> teamIds, @Param("integrationIds") @Nullable Set<String> integrationIds, @Param("since") @Nullable OffsetDateTime since, @Param("until") @Nullable OffsetDateTime until);

    /**
     * List Field Options
     * <p>
     * List all enabled Field Options for a Field.
     * Scoped OAuth requires: {@code custom_fields.read} 
     *
     * @param fieldId              The ID of the field. (required)
     */
    @RequestLine("GET /incidents/custom_fields/{fieldId}/field_options")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<ListCustomFieldsFieldOptions200Response> listCustomFieldsFieldOptions(@Param("fieldId") @NotNull String fieldId);

    /**
     * List Fields
     * <p>
     * List fields.
     * Scoped OAuth requires: {@code custom_fields.read} 
     *
     * @param include              Array of additional details to include. (optional)
     */
    @RequestLine("GET /incidents/custom_fields?include[]={include}")
    @Headers({
        "Accept: application/json"
    })
    CompletableFuture<ListCustomFieldsFields200Response> listCustomFieldsFields(@Param("include") @Nullable String include);

    /**
     * List escalation policies
     * <p>
     * List all of the existing escalation policies.
     * Escalation policies define which user should be alerted at which time.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#escalation-policies)
     * Scoped OAuth requires: {@code escalation_policies.read} 
     *
     * @param limit                The number of results per page. (optional)
     * @param offset               Offset to start pagination search results. (optional)
     * @param total                By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information.  (optional, defaults to false)
     * @param query                Filters the result, showing only the records whose name matches the query. (optional)
     * @param userIds              Filters the results, showing only escalation policies on which any of the users is a target. (optional)
     * @param teamIds              An array of team IDs. Only results related to these teams will be returned. Account must have the {@code teams} ability to use this parameter. (optional)
     * @param include              Array of additional Models to include in response. (optional)
     * @param sortBy               Used to specify the field you wish to sort the results on. (optional, defaults to name)
     */
    @RequestLine("GET /escalation_policies?limit={limit}&offset={offset}&total={total}&query={query}&user_ids[]={userIds}&team_ids[]={teamIds}&include[]={include}&sort_by={sortBy}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<ListEscalationPolicies200Response> listEscalationPolicies(@Param("limit") @Nullable Integer limit, @Param("offset") @Nullable Integer offset, @Param("total") @Nullable Boolean total, @Param("query") @Nullable String query, @Param("userIds") @Nullable Set<String> userIds, @Param("teamIds") @Nullable Set<String> teamIds, @Param("include") @Nullable String include, @Param("sortBy") @Nullable String sortBy);

    /**
     * List audit records for an escalation policy
     * <p>
     * The returned records are sorted by the {@code execution_time} from newest to oldest.
     * See [{@code Cursor-based pagination}](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for instructions on how to paginate through the result set.
     * For more information see the [Audit API Document](https://developer.pagerduty.com/docs/rest-api-v2/audit-records-api/).
     * Scoped OAuth requires: {@code audit_records.read} 
     *
     * @param id                   The ID of the resource. (required)
     * @param limit                The minimum of the {@code limit} parameter used in the request or the maximum request size of the API. (optional)
     * @param cursor               Optional parameter used to request the "next" set of results from an API.  The value provided here is most commonly obtained from the {@code next_cursor} field of the previous request.  When no value is provided, the request starts at the beginning of the result set.  (optional)
     * @param since                The start of the date range over which you want to search. If not specified, defaults to {@code now() - 24 hours} (past 24 hours) (optional)
     * @param until                The end of the date range over which you want to search. If not specified, defaults to {@code now()}. May not be more than 31 days after {@code since}. (optional)
     */
    @RequestLine("GET /escalation_policies/{id}/audit/records?limit={limit}&cursor={cursor}&since={since}&until={until}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<AuditRecordResponseSchema> listEscalationPolicyAuditRecords(@Param("id") @NotNull String id, @Param("limit") @Nullable Integer limit, @Param("cursor") @Nullable String cursor, @Param("since") @Nullable OffsetDateTime since, @Param("until") @Nullable OffsetDateTime until);

    /**
     * List Event Orchestrations
     * <p>
     * List all Global Event Orchestrations on an Account.
     * Global Event Orchestrations allow you define a set of Global Rules and Router Rules, so that when you ingest events using the Orchestration's Routing Key your events will have actions applied via the Global Rules &amp; then routed to the correct Service by the Router Rules, based on the event's content.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#event-orchestrations)
     * Scoped OAuth requires: {@code event_orchestrations.read} 
     *
     * @param limit                The number of results per page. (optional)
     * @param offset               Offset to start pagination search results. (optional)
     * @param sortBy               Used to specify the field you wish to sort the results on. (optional, defaults to name:asc)
     */
    @RequestLine("GET /event_orchestrations?limit={limit}&offset={offset}&sort_by={sortBy}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<ListEventOrchestrations200Response> listEventOrchestrations(@Param("limit") @Nullable Integer limit, @Param("offset") @Nullable Integer offset, @Param("sortBy") @Nullable String sortBy);

    /**
     * List extension schemas
     * <p>
     * List all extension schemas.
     * A PagerDuty extension vendor represents a specific type of outbound extension such as Generic Webhook, Slack, ServiceNow.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#extension-schemas)
     * Scoped OAuth requires: {@code extension_schemas.read} 
     *
     * @param limit                The number of results per page. (optional)
     * @param offset               Offset to start pagination search results. (optional)
     * @param total                By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information.  (optional, defaults to false)
     */
    @RequestLine("GET /extension_schemas?limit={limit}&offset={offset}&total={total}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<ListExtensionSchemas200Response> listExtensionSchemas(@Param("limit") @Nullable Integer limit, @Param("offset") @Nullable Integer offset, @Param("total") @Nullable Boolean total);

    /**
     * List alerts for an incident
     * <p>
     * List alerts for the specified incident.
     * An incident represents a problem or an issue that needs to be addressed and resolved.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#incidents)
     * Scoped OAuth requires: {@code incidents.read} 
     *
     * @param id                   The ID of the resource. (required)
     * @param limit                The number of results per page. (optional)
     * @param offset               Offset to start pagination search results. (optional)
     * @param total                By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information.  (optional, defaults to false)
     * @param alertKey             Alert de-duplication key. (optional)
     * @param statuses             Return only alerts with the given statuses. (More status codes may be introduced in the future.) (optional)
     * @param sortBy               Used to specify both the field you wish to sort the results on (created_at/resolved_at), as well as the direction (asc/desc) of the results. The sort_by field and direction should be separated by a colon. A maximum of two fields can be included, separated by a comma. Sort direction defaults to ascending. (optional)
     * @param include              Array of additional details to include. (optional)
     */
    @RequestLine("GET /incidents/{id}/alerts?limit={limit}&offset={offset}&total={total}&alert_key={alertKey}&statuses[]={statuses}&sort_by={sortBy}&include[]={include}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<ListIncidentAlerts200Response> listIncidentAlerts(@Param("id") @NotNull String id, @Param("limit") @Nullable Integer limit, @Param("offset") @Nullable Integer offset, @Param("total") @Nullable Boolean total, @Param("alertKey") @Nullable String alertKey, @Param("statuses") @Nullable String statuses, @Param("sortBy") @Nullable String sortBy, @Param("include") @Nullable String include);

    /**
     * List log entries for an incident
     * <p>
     * List log entries for the specified incident.
     * An incident represents a problem or an issue that needs to be addressed and resolved.
     * A Log Entry are a record of all events on your account.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#incidents)
     * Scoped OAuth requires: {@code incidents.read} 
     *
     * @param id                   The ID of the resource. (required)
     * @param limit                The number of results per page. (optional)
     * @param offset               Offset to start pagination search results. (optional)
     * @param total                By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information.  (optional, defaults to false)
     * @param timeZone             Time zone in which results will be rendered. This will default to the account time zone. (optional)
     * @param since                The start of the date range over which you want to search. (optional)
     * @param until                The end of the date range over which you want to search. (optional)
     * @param isOverview           If {@code true}, will return a subset of log entries that show only the most important changes to the incident. (optional, defaults to false)
     * @param include              Array of additional Models to include in response. (optional)
     */
    @RequestLine("GET /incidents/{id}/log_entries?limit={limit}&offset={offset}&total={total}&time_zone={timeZone}&since={since}&until={until}&is_overview={isOverview}&include[]={include}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<ListIncidentLogEntries200Response> listIncidentLogEntries(@Param("id") @NotNull String id, @Param("limit") @Nullable Integer limit, @Param("offset") @Nullable Integer offset, @Param("total") @Nullable Boolean total, @Param("timeZone") @Nullable String timeZone, @Param("since") @Nullable OffsetDateTime since, @Param("until") @Nullable OffsetDateTime until, @Param("isOverview") @Nullable Boolean isOverview, @Param("include") @Nullable String include);

    /**
     * List notes for an incident
     * <p>
     * List existing notes for the specified incident.
     * An incident represents a problem or an issue that needs to be addressed and resolved.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#incidents)
     * Scoped OAuth requires: {@code incidents.read} 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("GET /incidents/{id}/notes")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<ListIncidentNotes200Response> listIncidentNotes(@Param("id") @NotNull String id);

    /**
     * List related Change Events for an Incident
     * <p>
     * List related Change Events for an Incident, as well as the reason these changes are correlated with the incident.
     * Change events represent service changes such as deploys, build completion, and configuration changes, providing information that is critical during incident triage or hypercare. For more information on change events, see [Change Events](https://support.pagerduty.com/docs/change-events).
     * The Change Correlation feature provides incident responders with recent change events that are most relevant to that incident. Change Correlation informs the responder why a particular change event was surfaced and correlated to an incident based on three key factors which include time, related service, or intelligence (machine learning).
     * Scoped OAuth requires: {@code incidents.read} 
     *
     * @param id                   The ID of the resource. (required)
     * @param limit                The number of results per page. (optional)
     */
    @RequestLine("GET /incidents/{id}/related_change_events?limit={limit}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<ListIncidentRelatedChangeEvents200Response> listIncidentRelatedChangeEvents(@Param("id") @NotNull String id, @Param("limit") @Nullable Integer limit);

    /**
     * List Actions
     * <p>
     * List Incident Workflow Actions
     * Scoped OAuth requires: {@code incident_workflows.read} 
     *
     * @param limit                The minimum of the {@code limit} parameter used in the request or the maximum request size of the API. (optional)
     * @param cursor               Optional parameter used to request the "next" set of results from an API.  The value provided here is most commonly obtained from the {@code next_cursor} field of the previous request.  When no value is provided, the request starts at the beginning of the result set.  (optional)
     * @param keyword              If provided, only show actions tagged with the specified keyword (optional)
     */
    @RequestLine("GET /incident_workflows/actions?limit={limit}&cursor={cursor}&keyword={keyword}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<ListIncidentWorkflowActions200Response> listIncidentWorkflowActions(@Param("limit") @Nullable Integer limit, @Param("cursor") @Nullable String cursor, @Param("keyword") @Nullable String keyword);

    /**
     * List Triggers
     * <p>
     * List existing Incident Workflow Triggers
     * Scoped OAuth requires: {@code incident_workflows.read} 
     *
     * @param workflowId           If provided, only show triggers configured to start the given workflow. Useful for listing all services associated with the given workflow (optional)
     * @param incidentId           If provided, only show triggers configured on the service of the given incident. Useful for finding manual triggers that are configured on the service for a specific incident. Cannot be specified if {@code service_id} is provided. (optional)
     * @param serviceId            If provided, only show triggers configured for incidents in the given service. Useful for listing all workflows associated with the given service. Cannot be specified if {@code incident_id} is provided. (optional)
     * @param triggerType          If provided, only show triggers of the given type. For example “manual” to search for manual triggers (optional)
     * @param workflowNameContains If provided, only show triggers configured to start workflows whose name contain the provided value. (optional)
     * @param sortBy               If provided, returns triggers sorted by the specified property. (optional)
     * @param limit                The minimum of the {@code limit} parameter used in the request or the maximum request size of the API. (optional)
     * @param cursor               Optional parameter used to request the "next" set of results from an API.  The value provided here is most commonly obtained from the {@code next_cursor} field of the previous request.  When no value is provided, the request starts at the beginning of the result set.  (optional)
     */
    @RequestLine("GET /incident_workflows/triggers?workflow_id={workflowId}&incident_id={incidentId}&service_id={serviceId}&trigger_type={triggerType}&workflow_name_contains={workflowNameContains}&sort_by={sortBy}&limit={limit}&cursor={cursor}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<ListIncidentWorkflowTriggers200Response> listIncidentWorkflowTriggers(@Param("workflowId") @Nullable String workflowId, @Param("incidentId") @Nullable String incidentId, @Param("serviceId") @Nullable String serviceId, @Param("triggerType") @Nullable String triggerType, @Param("workflowNameContains") @Nullable String workflowNameContains, @Param("sortBy") @Nullable String sortBy, @Param("limit") @Nullable Integer limit, @Param("cursor") @Nullable String cursor);

    /**
     * List Incident Workflows
     * <p>
     * List existing Incident Workflows.
     * This is the best method to use to list all Incident Workflows in your account. If your use case requires listing Incident Workflows associated with a particular Service, you can use the "List Triggers" method to find Incident Workflows configured to start for Incidents in a given Service.
     * An Incident Workflow is a sequence of configurable Steps and associated Triggers that can execute automated Actions for a given Incident.
     * Scoped OAuth requires: {@code incident_workflows.read} 
     *
     * @param limit                The number of results per page. (optional)
     * @param offset               Offset to start pagination search results. (optional)
     * @param total                By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information.  (optional, defaults to false)
     * @param query                Filters the result, showing only the records whose name matches the query. (optional)
     * @param include              Array of additional details to include. (optional)
     */
    @RequestLine("GET /incident_workflows?limit={limit}&offset={offset}&total={total}&query={query}&include[]={include}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<ListIncidentWorkflows200Response> listIncidentWorkflows(@Param("limit") @Nullable Integer limit, @Param("offset") @Nullable Integer offset, @Param("total") @Nullable Boolean total, @Param("query") @Nullable String query, @Param("include") @Nullable String include);

    /**
     * List incidents
     * <p>
     * List existing incidents.
     * An incident represents a problem or an issue that needs to be addressed and resolved.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#incidents)
     * Scoped OAuth requires: {@code incidents.read} 
     *
     * @param limit                The number of results per page. (optional)
     * @param offset               Offset to start pagination search results. (optional)
     * @param total                By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information.  (optional, defaults to false)
     * @param dateRange            When set to all, the since and until parameters and defaults are ignored. (optional)
     * @param incidentKey          Incident de-duplication key. Incidents with child alerts do not have an incident key; querying by incident key will return incidents whose alerts have alert_key matching the given incident key. (optional)
     * @param serviceIds           Returns only the incidents associated with the passed service(s). This expects one or more service IDs. (optional)
     * @param teamIds              An array of team IDs. Only results related to these teams will be returned. Account must have the {@code teams} ability to use this parameter. (optional)
     * @param userIds              Returns only the incidents currently assigned to the passed user(s). This expects one or more user IDs. Note: When using the assigned_to_user filter, you will only receive incidents with statuses of triggered or acknowledged. This is because resolved incidents are not assigned to any user. (optional)
     * @param urgencies            Array of the urgencies of the incidents to be returned. Defaults to all urgencies. Account must have the {@code urgencies} ability to do this. (optional)
     * @param timeZone             Time zone in which results will be rendered. This will default to the account time zone. (optional)
     * @param statuses             Return only incidents with the given statuses. To query multiple statuses, pass {@code statuses[]} more than once, for example: {@code https://api.pagerduty.com/incidents?statuses[]=triggered&amp;statuses[]=acknowledged}. (More status codes may be introduced in the future.) (optional)
     * @param sortBy               Used to specify both the field you wish to sort the results on (incident_number/created_at/resolved_at/urgency), as well as the direction (asc/desc) of the results. The sort_by field and direction should be separated by a colon. A maximum of two fields can be included, separated by a comma. Sort direction defaults to ascending. The account must have the {@code urgencies} ability to sort by the urgency. (optional)
     * @param include              Array of additional details to include. (optional)
     * @param since                The start of the date range over which you want to search. Maximum range is 6 months and default is 1 month. (optional)
     * @param until                The end of the date range over which you want to search. Maximum range is 6 months and default is 1 month. (optional)
     */
    @RequestLine("GET /incidents?limit={limit}&offset={offset}&total={total}&date_range={dateRange}&incident_key={incidentKey}&service_ids[]={serviceIds}&team_ids[]={teamIds}&user_ids[]={userIds}&urgencies[]={urgencies}&time_zone={timeZone}&statuses[]={statuses}&sort_by={sortBy}&include[]={include}&since={since}&until={until}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<ListIncidents200Response> listIncidents(@Param("limit") @Nullable Integer limit, @Param("offset") @Nullable Integer offset, @Param("total") @Nullable Boolean total, @Param("dateRange") @Nullable String dateRange, @Param("incidentKey") @Nullable String incidentKey, @Param("serviceIds") @Nullable Set<String> serviceIds, @Param("teamIds") @Nullable Set<String> teamIds, @Param("userIds") @Nullable Set<String> userIds, @Param("urgencies") @Nullable String urgencies, @Param("timeZone") @Nullable String timeZone, @Param("statuses") @Nullable String statuses, @Param("sortBy") @Nullable Set<String> sortBy, @Param("include") @Nullable String include, @Param("since") @Nullable String since, @Param("until") @Nullable String until);

    /**
     * List License Allocations
     * <p>
     * List the Licenses allocated to Users within your Account
     * Scoped OAuth requires: {@code licenses.read} 
     *
     * @param limit                The number of results per page. (optional)
     * @param offset               Offset to start pagination search results. (optional)
     */
    @RequestLine("GET /license_allocations?limit={limit}&offset={offset}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<ListLicenseAllocations200Response> listLicenseAllocations(@Param("limit") @Nullable Integer limit, @Param("offset") @Nullable Integer offset);

    /**
     * List Licenses
     * <p>
     * List the Licenses associated with your Account
     * Scoped OAuth requires: {@code licenses.read} 
     *
     */
    @RequestLine("GET /licenses")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<ListLicenses200Response> listLicenses();

    /**
     * List log entries
     * <p>
     * List all of the incident log entries across the entire account.
     * A log of all the events that happen to an Incident, and these are exposed as Log Entries.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#log-entries)
     * Scoped OAuth requires: {@code incidents.read} 
     *
     * @param limit                The number of results per page. (optional)
     * @param offset               Offset to start pagination search results. (optional)
     * @param total                By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information.  (optional, defaults to false)
     * @param timeZone             Time zone in which results will be rendered. This will default to the account time zone. (optional)
     * @param since                The start of the date range over which you want to search. (optional)
     * @param until                The end of the date range over which you want to search. (optional)
     * @param isOverview           If {@code true}, will return a subset of log entries that show only the most important changes to the incident. (optional, defaults to false)
     * @param include              Array of additional Models to include in response. (optional)
     * @param teamIds              An array of team IDs. Only results related to these teams will be returned. Account must have the {@code teams} ability to use this parameter. (optional)
     */
    @RequestLine("GET /log_entries?limit={limit}&offset={offset}&total={total}&time_zone={timeZone}&since={since}&until={until}&is_overview={isOverview}&include[]={include}&team_ids[]={teamIds}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<ListIncidentLogEntries200Response> listLogEntries(@Param("limit") @Nullable Integer limit, @Param("offset") @Nullable Integer offset, @Param("total") @Nullable Boolean total, @Param("timeZone") @Nullable String timeZone, @Param("since") @Nullable OffsetDateTime since, @Param("until") @Nullable OffsetDateTime until, @Param("isOverview") @Nullable Boolean isOverview, @Param("include") @Nullable String include, @Param("teamIds") @Nullable Set<String> teamIds);

    /**
     * List maintenance windows
     * <p>
     * List existing maintenance windows, optionally filtered by service and/or team, or whether they are from the past, present or future.
     * A Maintenance Window is used to temporarily disable one or more Services for a set period of time.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#maintenance-windows)
     * Scoped OAuth requires: {@code services.read} 
     *
     * @param query                Filters the result, showing only the records whose name matches the query. (optional)
     * @param limit                The number of results per page. (optional)
     * @param offset               Offset to start pagination search results. (optional)
     * @param total                By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information.  (optional, defaults to false)
     * @param teamIds              An array of team IDs. Only results related to these teams will be returned. Account must have the {@code teams} ability to use this parameter. (optional)
     * @param serviceIds           An array of service IDs. Only results related to these services will be returned. (optional)
     * @param include              Array of additional Models to include in response. (optional)
     * @param filter               Only return maintenance windows in a given state. (optional)
     */
    @RequestLine("GET /maintenance_windows?query={query}&limit={limit}&offset={offset}&total={total}&team_ids[]={teamIds}&service_ids[]={serviceIds}&include[]={include}&filter={filter}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<ListMaintenanceWindows200Response> listMaintenanceWindows(@Param("query") @Nullable String query, @Param("limit") @Nullable Integer limit, @Param("offset") @Nullable Integer offset, @Param("total") @Nullable Boolean total, @Param("teamIds") @Nullable Set<String> teamIds, @Param("serviceIds") @Nullable List<String> serviceIds, @Param("include") @Nullable String include, @Param("filter") @Nullable String filter);

    /**
     * List notifications
     * <p>
     * List notifications for a given time range, optionally filtered by type (sms_notification, email_notification, phone_notification, or push_notification).
     * A Notification is created when an Incident is triggered or escalated.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#notifications)
     * Scoped OAuth requires: {@code users:notifications.read} 
     *
     * @param since                The start of the date range over which you want to search. The time element is optional. (required)
     * @param until                The end of the date range over which you want to search. This should be in the same format as since. The size of the date range must be less than 3 months. (required)
     * @param limit                The number of results per page. (optional)
     * @param offset               Offset to start pagination search results. (optional)
     * @param total                By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information.  (optional, defaults to false)
     * @param timeZone             Time zone in which results will be rendered. This will default to the account time zone. (optional)
     * @param filter               Return notification of this type only. (optional)
     * @param include              Array of additional details to include. (optional)
     */
    @RequestLine("GET /notifications?limit={limit}&offset={offset}&total={total}&time_zone={timeZone}&since={since}&until={until}&filter={filter}&include[]={include}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<ListNotifications200Response> listNotifications(@Param("since") @NotNull OffsetDateTime since, @Param("until") @NotNull OffsetDateTime until, @Param("limit") @Nullable Integer limit, @Param("offset") @Nullable Integer offset, @Param("total") @Nullable Boolean total, @Param("timeZone") @Nullable String timeZone, @Param("filter") @Nullable String filter, @Param("include") @Nullable String include);

    /**
     * List all of the on-calls
     * <p>
     * List the on-call entries during a given time range.
     * An on-call represents a contiguous unit of time for which a User will be on call for a given Escalation Policy and Escalation Rules.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#on-calls)
     * Scoped OAuth requires: {@code oncalls.read} 
     *
     * @param timeZone             Time zone in which results will be rendered. This will default to the account time zone. (optional)
     * @param limit                The number of results per page. (optional)
     * @param offset               Offset to start pagination search results. (optional)
     * @param total                By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information.  (optional, defaults to false)
     * @param include              Array of additional details to include. (optional)
     * @param userIds              Filters the results, showing only on-calls for the specified user IDs. (optional)
     * @param escalationPolicyIds  Filters the results, showing only on-calls for the specified escalation policy IDs. (optional)
     * @param scheduleIds          Filters the results, showing only on-calls for the specified schedule IDs. If {@code null} is provided in the array, it includes permanent on-calls due to direct user escalation targets. (optional)
     * @param since                The start of the time range over which you want to search. If an on-call period overlaps with the range, it will be included in the result. Defaults to current time. On-call shifts are limited to 90 days in the future. (optional)
     * @param until                The end of the time range over which you want to search. If an on-call period overlaps with the range, it will be included in the result. Defaults to current time. On-call shifts are limited to 90 days in the future, and the {@code until} time cannot be before the {@code since} time. (optional)
     * @param earliest             This will filter on-calls such that only the earliest on-call for each combination of escalation policy, escalation level, and user is returned. This is useful for determining when the "next" on-calls are for a given set of filters. (optional)
     */
    @RequestLine("GET /oncalls?time_zone={timeZone}&limit={limit}&offset={offset}&total={total}&include[]={include}&user_ids[]={userIds}&escalation_policy_ids[]={escalationPolicyIds}&schedule_ids[]={scheduleIds}&since={since}&until={until}&earliest={earliest}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<ListOnCalls200Response> listOnCalls(@Param("timeZone") @Nullable String timeZone, @Param("limit") @Nullable Integer limit, @Param("offset") @Nullable Integer offset, @Param("total") @Nullable Boolean total, @Param("include") @Nullable String include, @Param("userIds") @Nullable Set<String> userIds, @Param("escalationPolicyIds") @Nullable Set<String> escalationPolicyIds, @Param("scheduleIds") @Nullable Set<String> scheduleIds, @Param("since") @Nullable OffsetDateTime since, @Param("until") @Nullable OffsetDateTime until, @Param("earliest") @Nullable Boolean earliest);

    /**
     * List Integrations for an Event Orchestration
     * <p>
     * List the Integrations associated with this Event Orchestrations.
     * You can use a Routing Key from these Integrations to send events to PagerDuty!
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#event-orchestrations)
     * Scoped OAuth requires: {@code event_orchestrations.read} 
     *
     * @param id                   The ID of an Event Orchestration. (required)
     */
    @RequestLine("GET /event_orchestrations/{id}/integrations")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<ListOrchestrationIntegrations200Response> listOrchestrationIntegrations(@Param("id") @NotNull String id);

    /**
     * List priorities
     * <p>
     * List existing priorities, in order (most to least severe).
     * A priority is a label representing the importance and impact of an incident. This feature is only available on Standard and Enterprise plans.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#priorities)
     * Scoped OAuth requires: {@code priorities.read} 
     *
     * @param limit                The number of results per page. (optional)
     * @param offset               Offset to start pagination search results. (optional)
     * @param total                By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information.  (optional, defaults to false)
     */
    @RequestLine("GET /priorities?limit={limit}&offset={offset}&total={total}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<ListPriorities200Response> listPriorities(@Param("limit") @Nullable Integer limit, @Param("offset") @Nullable Integer offset, @Param("total") @Nullable Boolean total);

    /**
     * List a resource's standards scores
     * <p>
     * List standards applied to a specific resource
     * Scoped OAuth requires: {@code standards.read} 
     *
     * @param id                   Id of the resource to apply the standards. (required)
     * @param resourceType          (required)
     */
    @RequestLine("GET /standards/scores/{resourceType}/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2"
    })
    CompletableFuture<StandardApplied> listResourceStandards(@Param("id") @NotNull String id, @Param("resourceType") @NotNull String resourceType);

    /**
     * List resources' standards scores
     * <p>
     * List standards applied to a set of resources
     * Scoped OAuth requires: {@code standards.read} 
     *
     * @param ids                  Ids of resources to apply the standards. Maximum of 100 items (required)
     * @param resourceType          (required)
     */
    @RequestLine("GET /standards/scores/{resourceType}?ids={ids}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2"
    })
    CompletableFuture<ListResourceStandardsManyServices200Response> listResourceStandardsManyServices(@Param("ids") @NotNull List<String> ids, @Param("resourceType") @NotNull String resourceType);

    /**
     * List Response Plays
     * <p>
     * List all of the existing Response Plays.
     * Response Plays allow you to create packages of Incident Actions that can be applied during an Incident's life cycle.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#response-plays)
     * When using a Global API token, the {@code From} header is required.
     * Scoped OAuth requires: {@code response_plays.read} 
     *
     * @param query                Filters the result, showing only the records whose name matches the query. (optional)
     * @param filterForManualRun   When this parameter is present, only those Response Plays that can be run manually will be returned. (optional)
     * @param from                 The email address of a valid user associated with the account making the request. This is optional, and is only used for change tracking. (optional)
     * @deprecated
     */
    @Deprecated
    @RequestLine("GET /response_plays?query={query}&filter_for_manual_run={filterForManualRun}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json", 
        "From: {from}"
    })
    CompletableFuture<ListResponsePlays200Response> listResponsePlays(@Param("query") @Nullable String query, @Param("filterForManualRun") @Nullable Boolean filterForManualRun, @Param("from") @Nullable String from);

    /**
     * List Event Rules
     * <p>
     * List all Event Rules on a Ruleset. &amp;lt;!-- theme: warning --&amp;gt; &amp;gt; ### End-of-life &amp;gt; Rulesets and Event Rules will end-of-life soon. We highly recommend that you [migrate to Event Orchestration](https://support.pagerduty.com/docs/migrate-to-event-orchestration) as soon as possible so you can take advantage of the new functionality, such as improved UI, rule creation, APIs and Terraform support, advanced conditions, and rule nesting.
     * Rulesets allow you to route events to an endpoint and create collections of Event Rules, which define sets of actions to take based on event content.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#rulesets)
     * Note: Create and Update on rules will accept 'description' or 'summary' interchangeably as an extraction action target. Get and List on rules will always return 'summary' as the target. If you are expecting 'description' please change your automation code to expect 'summary' instead.
     * Scoped OAuth requires: {@code event_rules.read} 
     *
     * @param id                   The ID of the resource. (required)
     * @param limit                The number of results per page. (optional)
     * @param offset               Offset to start pagination search results. (optional)
     * @param total                By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information.  (optional, defaults to false)
     */
    @RequestLine("GET /rulesets/{id}/rules?limit={limit}&offset={offset}&total={total}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<ListRulesetEventRules200Response> listRulesetEventRules(@Param("id") @NotNull String id, @Param("limit") @Nullable Integer limit, @Param("offset") @Nullable Integer offset, @Param("total") @Nullable Boolean total);

    /**
     * List Rulesets
     * <p>
     * List all Rulesets &amp;lt;!-- theme: warning --&amp;gt; &amp;gt; ### End-of-life &amp;gt; Rulesets and Event Rules will end-of-life soon. We highly recommend that you [migrate to Event Orchestration](https://support.pagerduty.com/docs/migrate-to-event-orchestration) as soon as possible so you can take advantage of the new functionality, such as improved UI, rule creation, APIs and Terraform support, advanced conditions, and rule nesting.
     * Rulesets allow you to route events to an endpoint and create collections of Event Rules, which define sets of actions to take based on event content.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#rulesets)
     * Scoped OAuth requires: {@code event_rules.read} 
     *
     * @param limit                The number of results per page. (optional)
     * @param offset               Offset to start pagination search results. (optional)
     * @param total                By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information.  (optional, defaults to false)
     */
    @RequestLine("GET /rulesets?limit={limit}&offset={offset}&total={total}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<ListRulesets200Response> listRulesets(@Param("limit") @Nullable Integer limit, @Param("offset") @Nullable Integer offset, @Param("total") @Nullable Boolean total);

    /**
     * List overrides
     * <p>
     * List overrides for a given time range.
     * A Schedule determines the time periods that users are On-Call.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#schedules)
     * Scoped OAuth requires: {@code schedules.read} 
     *
     * @param id                   The ID of the resource. (required)
     * @param since                The start of the date range over which you want to search. (required)
     * @param until                The end of the date range over which you want to search. (required)
     * @param editable             When this parameter is present, only editable overrides will be returned. The result will only include the id of the override if this parameter is present. Only future overrides are editable. (optional)
     * @param overflow             Any on-call schedule entries that pass the date range bounds will be truncated at the bounds, unless the parameter overflow=true is passed. This parameter defaults to false. (optional)
     */
    @RequestLine("GET /schedules/{id}/overrides?since={since}&until={until}&editable={editable}&overflow={overflow}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<ListScheduleOverrides201Response> listScheduleOverrides(@Param("id") @NotNull String id, @Param("since") @NotNull OffsetDateTime since, @Param("until") @NotNull OffsetDateTime until, @Param("editable") @Nullable Boolean editable, @Param("overflow") @Nullable Boolean overflow);

    /**
     * List users on call.
     * <p>
     * List all of the users on call in a given schedule for a given time range.
     * A Schedule determines the time periods that users are On-Call.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#schedules)
     * Scoped OAuth requires: {@code users.read} 
     *
     * @param id                   The ID of the resource. (required)
     * @param since                The start of the date range over which you want to search. (optional)
     * @param until                The end of the date range over which you want to search. (optional)
     */
    @RequestLine("GET /schedules/{id}/users?since={since}&until={until}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<ListScheduleUsers200Response> listScheduleUsers(@Param("id") @NotNull String id, @Param("since") @Nullable OffsetDateTime since, @Param("until") @Nullable OffsetDateTime until);

    /**
     * List schedules
     * <p>
     * List the on-call schedules.
     * A Schedule determines the time periods that users are On-Call.
     *  For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#schedules)
     * Scoped OAuth requires: {@code schedules.read} 
     *
     * @param limit                The number of results per page. (optional)
     * @param offset               Offset to start pagination search results. (optional)
     * @param total                By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information.  (optional, defaults to false)
     * @param query                Filters the result, showing only the records whose name matches the query. (optional)
     * @param include              Array of additional details to include. (optional)
     * @param timeZone             Time zone in which results will be rendered. This will default to the current user's time zone and then the account's time zone. (optional)
     */
    @RequestLine("GET /schedules?limit={limit}&offset={offset}&total={total}&query={query}&include[]={include}&time_zone={timeZone}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<ListSchedules200Response> listSchedules(@Param("limit") @Nullable Integer limit, @Param("offset") @Nullable Integer offset, @Param("total") @Nullable Boolean total, @Param("query") @Nullable String query, @Param("include") @Nullable String include, @Param("timeZone") @Nullable String timeZone);

    /**
     * List audit records for a schedule
     * <p>
     * The returned records are sorted by the {@code execution_time} from newest to oldest.
     * See [{@code Cursor-based pagination}](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for instructions on how to paginate through the result set.
     * For more information see the [Audit API Document](https://developer.pagerduty.com/docs/rest-api-v2/audit-records-api/).
     * Scoped OAuth requires: {@code audit_records.read} 
     *
     * @param id                   The ID of the resource. (required)
     * @param limit                The minimum of the {@code limit} parameter used in the request or the maximum request size of the API. (optional)
     * @param cursor               Optional parameter used to request the "next" set of results from an API.  The value provided here is most commonly obtained from the {@code next_cursor} field of the previous request.  When no value is provided, the request starts at the beginning of the result set.  (optional)
     * @param since                The start of the date range over which you want to search. If not specified, defaults to {@code now() - 24 hours} (past 24 hours) (optional)
     * @param until                The end of the date range over which you want to search. If not specified, defaults to {@code now()}. May not be more than 31 days after {@code since}. (optional)
     */
    @RequestLine("GET /schedules/{id}/audit/records?limit={limit}&cursor={cursor}&since={since}&until={until}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<AuditRecordResponseSchema> listSchedulesAuditRecords(@Param("id") @NotNull String id, @Param("limit") @Nullable Integer limit, @Param("cursor") @Nullable String cursor, @Param("since") @Nullable OffsetDateTime since, @Param("until") @Nullable OffsetDateTime until);

    /**
     * List audit records for a service
     * <p>
     * The returned records are sorted by the {@code execution_time} from newest to oldest.
     * See [{@code Cursor-based pagination}](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for instructions on how to paginate through the result set.
     * For more information see the [Audit API Document](https://developer.pagerduty.com/docs/rest-api-v2/audit-records-api/).
     * Scoped OAuth requires: {@code audit_records.read} 
     *
     * @param id                   The ID of the resource. (required)
     * @param limit                The minimum of the {@code limit} parameter used in the request or the maximum request size of the API. (optional)
     * @param cursor               Optional parameter used to request the "next" set of results from an API.  The value provided here is most commonly obtained from the {@code next_cursor} field of the previous request.  When no value is provided, the request starts at the beginning of the result set.  (optional)
     * @param since                The start of the date range over which you want to search. If not specified, defaults to {@code now() - 24 hours} (past 24 hours) (optional)
     * @param until                The end of the date range over which you want to search. If not specified, defaults to {@code now()}. May not be more than 31 days after {@code since}. (optional)
     */
    @RequestLine("GET /services/{id}/audit/records?limit={limit}&cursor={cursor}&since={since}&until={until}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<AuditRecordResponseSchema> listServiceAuditRecords(@Param("id") @NotNull String id, @Param("limit") @Nullable Integer limit, @Param("cursor") @Nullable String cursor, @Param("since") @Nullable OffsetDateTime since, @Param("until") @Nullable OffsetDateTime until);

    /**
     * List Change Events for a service
     * <p>
     * List all of the existing Change Events for a service.
     * Scoped OAuth requires: {@code services.read} 
     *
     * @param id                   The ID of the resource. (required)
     * @param since                The start of the date range over which you want to search, as a UTC ISO 8601 datetime string. Will return an HTTP 400 for non-UTC datetimes. (optional)
     * @param until                The end of the date range over which you want to search, as a UTC ISO 8601 datetime string. Will return an HTTP 400 for non-UTC datetimes. (optional)
     * @param limit                The number of results per page. (optional)
     * @param offset               Offset to start pagination search results. (optional)
     * @param total                By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information.  (optional, defaults to false)
     * @param teamIds              An array of team IDs. Only results related to these teams will be returned. Account must have the {@code teams} ability to use this parameter. (optional)
     * @param integrationIds       An array of integration IDs. Only results related to these integrations will be returned. (optional)
     */
    @RequestLine("GET /services/{id}/change_events?since={since}&until={until}&limit={limit}&offset={offset}&total={total}&team_ids[]={teamIds}&integration_ids[]={integrationIds}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<ListChangeEvents200Response> listServiceChangeEvents(@Param("id") @NotNull String id, @Param("since") @Nullable OffsetDateTime since, @Param("until") @Nullable OffsetDateTime until, @Param("limit") @Nullable Integer limit, @Param("offset") @Nullable Integer offset, @Param("total") @Nullable Boolean total, @Param("teamIds") @Nullable Set<String> teamIds, @Param("integrationIds") @Nullable Set<String> integrationIds);

    /**
     * List Service's Event Rules
     * <p>
     * List Event Rules on a Service. &amp;lt;!-- theme: warning --&amp;gt; &amp;gt; ### End-of-life &amp;gt; Rulesets and Event Rules will end-of-life soon. We highly recommend that you [migrate to Event Orchestration](https://support.pagerduty.com/docs/migrate-to-event-orchestration) as soon as possible so you can take advantage of the new functionality, such as improved UI, rule creation, APIs and Terraform support, advanced conditions, and rule nesting.
     * Scoped OAuth requires: {@code services.read} 
     *
     * @param id                   The ID of the resource. (required)
     * @param limit                The number of results per page. (optional)
     * @param offset               Offset to start pagination search results. (optional)
     * @param total                By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information.  (optional, defaults to false)
     * @param include              Array of additional Models to include in response. (optional)
     */
    @RequestLine("GET /services/{id}/rules?limit={limit}&offset={offset}&total={total}&include[]={include}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<ListServiceEventRules200Response> listServiceEventRules(@Param("id") @NotNull String id, @Param("limit") @Nullable Integer limit, @Param("offset") @Nullable Integer offset, @Param("total") @Nullable Boolean total, @Param("include") @Nullable String include);

    /**
     * List services
     * <p>
     * List existing Services.
     * A service may represent an application, component, or team you wish to open incidents against.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#services)
     * Scoped OAuth requires: {@code services.read} 
     *
     * @param query                Filters the result, showing only the records whose name matches the query. (optional)
     * @param limit                The number of results per page. (optional)
     * @param offset               Offset to start pagination search results. (optional)
     * @param total                By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information.  (optional, defaults to false)
     * @param teamIds              An array of team IDs. Only results related to these teams will be returned. Account must have the {@code teams} ability to use this parameter. (optional)
     * @param timeZone             Time zone in which results will be rendered. This will default to the account time zone. (optional)
     * @param sortBy               Used to specify the field you wish to sort the results on. (optional, defaults to name)
     * @param include              Array of additional details to include. (optional)
     */
    @RequestLine("GET /services?query={query}&limit={limit}&offset={offset}&total={total}&team_ids[]={teamIds}&time_zone={timeZone}&sort_by={sortBy}&include[]={include}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<ListServices200Response> listServices(@Param("query") @Nullable String query, @Param("limit") @Nullable Integer limit, @Param("offset") @Nullable Integer offset, @Param("total") @Nullable Boolean total, @Param("teamIds") @Nullable Set<String> teamIds, @Param("timeZone") @Nullable String timeZone, @Param("sortBy") @Nullable String sortBy, @Param("include") @Nullable String include);

    /**
     * List Standards
     * <p>
     * Get all standards of an account.
     * Scoped OAuth requires: {@code standards.read} 
     *
     * @param active                (optional)
     * @param resourceType          (optional)
     */
    @RequestLine("GET /standards?active={active}&resource_type={resourceType}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2"
    })
    CompletableFuture<ListStandards200Response> listStandards(@Param("active") @Nullable Boolean active, @Param("resourceType") @Nullable String resourceType);

    /**
     * List Status Dashboards
     * <p>
     * Get all your account's custom Status Dashboard views.
     * Scoped OAuth requires: {@code status_dashboards.read} 
     *
     */
    @RequestLine("GET /status_dashboards")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2"
    })
    CompletableFuture<ListStatusDashboards200Response> listStatusDashboards();

    /**
     * List tags
     * <p>
     * List all of your account's tags.
     * A Tag is applied to Escalation Policies, Teams or Users and can be used to filter them.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#tags)
     * Scoped OAuth requires: {@code tags.read} 
     *
     * @param limit                The number of results per page. (optional)
     * @param offset               Offset to start pagination search results. (optional)
     * @param total                By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information.  (optional, defaults to false)
     * @param query                Filters the result, showing only the tags whose label matches the query. (optional)
     */
    @RequestLine("GET /tags?limit={limit}&offset={offset}&total={total}&query={query}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<GetEntityTypeByIdTags200Response> listTags(@Param("limit") @Nullable Integer limit, @Param("offset") @Nullable Integer offset, @Param("total") @Nullable Boolean total, @Param("query") @Nullable String query);

    /**
     * List members of a team
     * <p>
     * Get information about members on a team.
     * A team is a collection of Users and Escalation Policies that represent a group of people within an organization.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#teams)
     * Scoped OAuth requires: {@code teams.read} 
     *
     * @param id                   The ID of the resource. (required)
     * @param limit                The number of results per page. (optional)
     * @param offset               Offset to start pagination search results. (optional)
     * @param total                By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information.  (optional, defaults to false)
     * @param include              Array of additional Models to include in response. (optional)
     */
    @RequestLine("GET /teams/{id}/members?limit={limit}&offset={offset}&total={total}&include[]={include}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<ListTeamUsers200Response> listTeamUsers(@Param("id") @NotNull String id, @Param("limit") @Nullable Integer limit, @Param("offset") @Nullable Integer offset, @Param("total") @Nullable Boolean total, @Param("include") @Nullable String include);

    /**
     * List teams
     * <p>
     * List teams of your PagerDuty account, optionally filtered by a search query.
     * A team is a collection of Users and Escalation Policies that represent a group of people within an organization.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#teams)
     * Scoped OAuth requires: {@code teams.read} 
     *
     * @param limit                The number of results per page. (optional)
     * @param offset               Offset to start pagination search results. (optional)
     * @param total                By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information.  (optional, defaults to false)
     * @param query                Filters the result, showing only the records whose name matches the query. (optional)
     */
    @RequestLine("GET /teams?limit={limit}&offset={offset}&total={total}&query={query}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<ListTeams200Response> listTeams(@Param("limit") @Nullable Integer limit, @Param("offset") @Nullable Integer offset, @Param("total") @Nullable Boolean total, @Param("query") @Nullable String query);

    /**
     * List audit records for a team
     * <p>
     * The returned records are sorted by the {@code execution_time} from newest to oldest.
     * See [{@code Cursor-based pagination}](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for instructions on how to paginate through the result set.
     * For more information see the [Audit API Document](https://developer.pagerduty.com/docs/rest-api-v2/audit-records-api/).
     * Scoped OAuth requires: {@code audit_records.read} 
     *
     * @param id                   The ID of the resource. (required)
     * @param limit                The minimum of the {@code limit} parameter used in the request or the maximum request size of the API. (optional)
     * @param cursor               Optional parameter used to request the "next" set of results from an API.  The value provided here is most commonly obtained from the {@code next_cursor} field of the previous request.  When no value is provided, the request starts at the beginning of the result set.  (optional)
     * @param since                The start of the date range over which you want to search. If not specified, defaults to {@code now() - 24 hours} (past 24 hours) (optional)
     * @param until                The end of the date range over which you want to search. If not specified, defaults to {@code now()}. May not be more than 31 days after {@code since}. (optional)
     */
    @RequestLine("GET /teams/{id}/audit/records?limit={limit}&cursor={cursor}&since={since}&until={until}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<AuditRecordResponseSchema> listTeamsAuditRecords(@Param("id") @NotNull String id, @Param("limit") @Nullable Integer limit, @Param("cursor") @Nullable String cursor, @Param("since") @Nullable OffsetDateTime since, @Param("until") @Nullable OffsetDateTime until);

    /**
     * List users
     * <p>
     * List users of your PagerDuty account, optionally filtered by a search query.
     * Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users.read} 
     *
     * @param query                Filters the result, showing only the records whose name matches the query. (optional)
     * @param teamIds              An array of team IDs. Only results related to these teams will be returned. Account must have the {@code teams} ability to use this parameter. (optional)
     * @param limit                The number of results per page. (optional)
     * @param offset               Offset to start pagination search results. (optional)
     * @param total                By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information.  (optional, defaults to false)
     * @param include              Array of additional Models to include in response. (optional)
     */
    @RequestLine("GET /users?query={query}&team_ids[]={teamIds}&limit={limit}&offset={offset}&total={total}&include[]={include}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<ListUsers200Response> listUsers(@Param("query") @Nullable String query, @Param("teamIds") @Nullable Set<String> teamIds, @Param("limit") @Nullable Integer limit, @Param("offset") @Nullable Integer offset, @Param("total") @Nullable Boolean total, @Param("include") @Nullable String include);

    /**
     * List audit records for a user
     * <p>
     * The response will include audit records with changes that are made to the identified user not changes made by the identified user.
     *  The returned records are sorted by the {@code execution_time} from newest to oldest.
     * See [{@code Cursor-based pagination}](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for instructions on how to paginate through the result set.
     * For more information see the [Audit API Document](https://developer.pagerduty.com/docs/rest-api-v2/audit-records-api/).
     * Scoped OAuth requires: {@code audit_records.read} 
     *
     * @param id                   The ID of the resource. (required)
     * @param limit                The minimum of the {@code limit} parameter used in the request or the maximum request size of the API. (optional)
     * @param cursor               Optional parameter used to request the "next" set of results from an API.  The value provided here is most commonly obtained from the {@code next_cursor} field of the previous request.  When no value is provided, the request starts at the beginning of the result set.  (optional)
     * @param since                The start of the date range over which you want to search. If not specified, defaults to {@code now() - 24 hours} (past 24 hours) (optional)
     * @param until                The end of the date range over which you want to search. If not specified, defaults to {@code now()}. May not be more than 31 days after {@code since}. (optional)
     */
    @RequestLine("GET /users/{id}/audit/records?limit={limit}&cursor={cursor}&since={since}&until={until}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<AuditRecordResponseSchema> listUsersAuditRecords(@Param("id") @NotNull String id, @Param("limit") @Nullable Integer limit, @Param("cursor") @Nullable String cursor, @Param("since") @Nullable OffsetDateTime since, @Param("until") @Nullable OffsetDateTime until);

    /**
     * List vendors
     * <p>
     * List all vendors.
     * A PagerDuty Vendor represents a specific type of integration. AWS Cloudwatch, Splunk, Datadog are all examples of vendors
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#vendors)
     * Scoped OAuth requires: {@code vendors.read} 
     *
     * @param limit                The number of results per page. (optional)
     * @param offset               Offset to start pagination search results. (optional)
     * @param total                By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information.  (optional, defaults to false)
     */
    @RequestLine("GET /vendors?limit={limit}&offset={offset}&total={total}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<ListVendors200Response> listVendors(@Param("limit") @Nullable Integer limit, @Param("offset") @Nullable Integer offset, @Param("total") @Nullable Boolean total);

    /**
     * List webhook subscriptions
     * <p>
     * List existing webhook subscriptions.
     * The {@code filter_type} and {@code filter_id} query parameters may be used to only show subscriptions for a particular _service_ or _team_.
     * For more information on webhook subscriptions and how they are used to configure v3 webhooks see the [Webhooks v3 Developer Documentation](https://developer.pagerduty.com/docs/webhooks/v3-overview/). 
     *
     * @param limit                The number of results per page. (optional)
     * @param offset               Offset to start pagination search results. (optional)
     * @param total                By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information.  (optional, defaults to false)
     * @param filterType           The type of resource to filter upon. (optional)
     * @param filterId             The id of the resource to filter upon. (optional)
     */
    @RequestLine("GET /webhook_subscriptions?limit={limit}&offset={offset}&total={total}&filter_type={filterType}&filter_id={filterId}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2"
    })
    CompletableFuture<ListWebhookSubscriptions200Response> listWebhookSubscriptions(@Param("limit") @Nullable Integer limit, @Param("offset") @Nullable Integer offset, @Param("total") @Nullable Boolean total, @Param("filterType") @Nullable String filterType, @Param("filterId") @Nullable String filterId);

    /**
     * Merge incidents
     * <p>
     * Merge a list of source incidents into this incident.
     * An incident represents a problem or an issue that needs to be addressed and resolved.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#incidents)
     * Scoped OAuth requires: {@code incidents.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param from                 The email address of a valid user associated with the account making the request. (required)
     * @param mergeIncidentsRequest  (optional)
     */
    @RequestLine("PUT /incidents/{id}/merge")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json", 
        "From: {from}"
    })
    CompletableFuture<MergeIncidents200Response> mergeIncidents(@Param("id") @NotNull String id, @Param("from") @NotNull String from, @Nullable MergeIncidentsRequest mergeIncidentsRequest);

    /**
     * Migrate an Integration from one Event Orchestration to another
     * <p>
     * Move an Integration and its Routing Key from the Event Orchestration specified in the request payload, to the Event Orchestration specified in the request URL.
     * Any future events sent to this Integration's Routing Key will be processed by this Event Orchestration's Rules.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#event-orchestrations)
     * Scoped OAuth requires: {@code event_orchestrations.write} 
     *
     * @param id                   The ID of an Event Orchestration. (required)
     * @param migrateOrchestrationIntegrationRequest  (optional)
     */
    @RequestLine("POST /event_orchestrations/{id}/integrations/migration")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<ListOrchestrationIntegrations200Response> migrateOrchestrationIntegration(@Param("id") @NotNull String id, @Nullable MigrateOrchestrationIntegrationRequest migrateOrchestrationIntegrationRequest);

    /**
     * Create an Incident Workflow
     * <p>
     * Create a new Incident Workflow
     * An Incident Workflow is a sequence of configurable Steps and associated Triggers that can execute automated Actions for a given Incident.
     * Scoped OAuth requires: {@code incident_workflows.write} 
     *
     * @param postIncidentWorkflowRequest  (optional)
     */
    @RequestLine("POST /incident_workflows")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<PostIncidentWorkflowRequest> postIncidentWorkflow(@Nullable PostIncidentWorkflowRequest postIncidentWorkflowRequest);

    /**
     * Create an Orchestration
     * <p>
     * Create a Global Event Orchestration.
     * Global Event Orchestrations allow you define a set of Global Rules and Router Rules, so that when you ingest events using the Orchestration's Routing Key your events will have actions applied via the Global Rules &amp; then routed to the correct Service by the Router Rules, based on the event's content.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#event-orchestrations)
     * Scoped OAuth requires: {@code event_orchestrations.write} 
     *
     * @param postOrchestrationRequest  (optional)
     */
    @RequestLine("POST /event_orchestrations")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<PostOrchestration201Response> postOrchestration(@Nullable PostOrchestrationRequest postOrchestrationRequest);

    /**
     * Create an Integration for an Event Orchestration
     * <p>
     * Create an Integration associated with this Event Orchestration.
     * You can then use the Routing Key from this new Integration to send events to PagerDuty!
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#event-orchestrations)
     * Scoped OAuth requires: {@code event_orchestrations.write} 
     *
     * @param id                   The ID of an Event Orchestration. (required)
     * @param postOrchestrationIntegrationRequest  (optional)
     */
    @RequestLine("POST /event_orchestrations/{id}/integrations")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<PostOrchestrationIntegration201Response> postOrchestrationIntegration(@Param("id") @NotNull String id, @Nullable PostOrchestrationIntegrationRequest postOrchestrationIntegrationRequest);

    /**
     * Set the Account-level priority threshold for Business Service impact.
     * <p>
     * Set the Account-level priority threshold for Business Service. Scoped OAuth requires: {@code services.write} 
     *
     * @param putBusinessServicePriorityThresholdsRequest Set the {@code id} and {@code order} of the global Priority Threshold. These values can be obtained by calling the {@code /priorities} endpoint.  Once set, Incidents must be at or above the specified level in order to impact Business Services.  An exception to this rule is if the Incident has been added to the incident directly using the {@code PUT /incidents/{id}/business_services/{business_service_id}/impacts} endpoint. (optional)
     */
    @RequestLine("PUT /business_services/priority_thresholds")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "X-EARLY-ACCESS: business-impact-early-access", 
        "Content-Type: application/json"
    })
    CompletableFuture<PutBusinessServicePriorityThresholds200Response> putBusinessServicePriorityThresholds(@Nullable PutBusinessServicePriorityThresholdsRequest putBusinessServicePriorityThresholdsRequest);

    /**
     * Manually change an Incident's Impact on a Business Service.
     * <p>
     * Change Impact of an Incident on a Business Service. Scoped OAuth requires: {@code incidents.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param businessServiceId    The business service ID. (required)
     * @param putIncidentManualBusinessServiceAssociationRequest The {@code impacted} relation will cause the Business Service and any Services that it supports to become impacted by this incident.  The {@code not_impacted} relation will remove the Incident's Impact from the specified Business Service.  The effect of adding or removing Impact to a Business Service in this way will also change the propagation of Impact to other Services supported by that Business Service. (optional)
     */
    @RequestLine("PUT /incidents/{id}/business_services/{businessServiceId}/impacts")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "X-EARLY-ACCESS: business-impact-early-access", 
        "Content-Type: application/json"
    })
    CompletableFuture<PutIncidentManualBusinessServiceAssociation200Response> putIncidentManualBusinessServiceAssociation(@Param("id") @NotNull String id, @Param("businessServiceId") @NotNull String businessServiceId, @Nullable PutIncidentManualBusinessServiceAssociationRequest putIncidentManualBusinessServiceAssociationRequest);

    /**
     * Update an Incident Workflow
     * <p>
     * Update an Incident Workflow
     * An Incident Workflow is a sequence of configurable Steps and associated Triggers that can execute automated Actions for a given Incident.
     * Scoped OAuth requires: {@code incident_workflows.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param postIncidentWorkflowRequest  (optional)
     */
    @RequestLine("PUT /incident_workflows/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<PostIncidentWorkflowRequest> putIncidentWorkflow(@Param("id") @NotNull String id, @Nullable PostIncidentWorkflowRequest postIncidentWorkflowRequest);

    /**
     * Delete Business Service Account Subscription
     * <p>
     * Unsubscribe your Account from a Business Service.
     * Scoped OAuth requires: {@code subscribers.write} 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("DELETE /business_services/{id}/account_subscription")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2"
    })
    CompletableFuture<Void> removeBusinessServiceAccountSubscription(@Param("id") @NotNull String id);

    /**
     * Remove Business Service Subscribers
     * <p>
     * Unsubscribes the matching Subscribers from a Business Service.
     * Scoped OAuth requires: {@code subscribers.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param createBusinessServiceNotificationSubscribersRequest The entities to unsubscribe. (optional)
     */
    @RequestLine("POST /business_services/{id}/unsubscribe")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<RemoveBusinessServiceNotificationSubscriber200Response> removeBusinessServiceNotificationSubscriber(@Param("id") @NotNull String id, @Nullable CreateBusinessServiceNotificationSubscribersRequest createBusinessServiceNotificationSubscribersRequest);

    /**
     * Remove Notification Subscriber
     * <p>
     * Unsubscribes the matching Subscribers from Incident Status Update Notifications.
     * Scoped OAuth requires: {@code subscribers.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param createBusinessServiceNotificationSubscribersRequest The entities to unsubscribe. (optional)
     */
    @RequestLine("POST /incidents/{id}/status_updates/unsubscribe")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<RemoveBusinessServiceNotificationSubscriber200Response> removeIncidentNotificationSubscribers(@Param("id") @NotNull String id, @Nullable CreateBusinessServiceNotificationSubscribersRequest createBusinessServiceNotificationSubscribersRequest);

    /**
     * <p>
     * Unsubscribe the given Team from Notifications on the matching Subscribable entities.
     * Scoped OAuth requires: {@code subscribers.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param createTeamNotificationSubscriptionsRequest The entities to unsubscribe from. (optional)
     */
    @RequestLine("POST /teams/{id}/notification_subscriptions/unsubscribe")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<RemoveBusinessServiceNotificationSubscriber200Response> removeTeamNotificationSubscriptions(@Param("id") @NotNull String id, @Nullable CreateTeamNotificationSubscriptionsRequest createTeamNotificationSubscriptionsRequest);

    /**
     * Render a template
     * <p>
     * Render a template. This endpoint has a variable request body depending on the template type. For the {@code status_update} template type, the caller will provide the incident id, and a status update message.
     * Scoped OAuth requires: {@code templates.read} 
     *
     * @param id                   The ID of the resource. (required)
     * @param renderTemplateRequest  (required)
     */
    @RequestLine("POST /templates/{id}/render")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<RenderedTemplate> renderTemplate(@Param("id") @NotNull String id, @NotNull RenderTemplateRequest renderTemplateRequest);

    /**
     * Run a response play
     * <p>
     * Run a specified response play on a given incident.
     * Response Plays are a package of Incident Actions that can be applied during an Incident's life cycle.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#response-plays)
     * Scoped OAuth requires: {@code response_plays.write} 
     *
     * @param responsePlayId       The response play ID of the response play associated with the request. (required)
     * @param from                 The email address of a valid user associated with the account making the request. (required)
     * @param mergeIncidents200Response  (optional)
     * @deprecated
     */
    @Deprecated
    @RequestLine("POST /response_plays/{responsePlayId}/run")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json", 
        "From: {from}"
    })
    CompletableFuture<RunResponsePlay200Response> runResponsePlay(@Param("responsePlayId") @NotNull String responsePlayId, @Param("from") @NotNull String from, @Nullable MergeIncidents200Response mergeIncidents200Response);

    /**
     * Update Custom Field Values
     * <p>
     * Set custom field values for an incident.
     * Scoped OAuth requires: {@code incidents.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param setIncidentFieldValuesRequest  (optional)
     */
    @RequestLine("PUT /incidents/{id}/custom_fields/values")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<GetIncidentFieldValues200Response> setIncidentFieldValues(@Param("id") @NotNull String id, @Nullable SetIncidentFieldValuesRequest setIncidentFieldValuesRequest);

    /**
     * Test a webhook subscription
     * <p>
     * Test a webhook subscription.
     * Fires a test event against the webhook subscription.
     * If properly configured, this will deliver the {@code pagey.ping} webhook event to the destination. 
     *
     * @param id                   The ID of the resource. (required)
     */
    @RequestLine("POST /webhook_subscriptions/{id}/ping")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2"
    })
    CompletableFuture<Void> testWebhookSubscription(@Param("id") @NotNull String id);

    /**
     * Remove Notification Subscriptions
     * <p>
     * Unsubscribe the given User from Notifications on the matching Subscribable entities.
     * Scoped OAuth requires: {@code subscribers.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param createTeamNotificationSubscriptionsRequest The entities to unsubscribe from. (optional)
     */
    @RequestLine("POST /users/{id}/notification_subscriptions/unsubscribe")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<RemoveBusinessServiceNotificationSubscriber200Response> unsubscribeUserNotificationSubscriptions(@Param("id") @NotNull String id, @Nullable CreateTeamNotificationSubscriptionsRequest createTeamNotificationSubscriptionsRequest);

    /**
     * Update an Add-on
     * <p>
     * Update an existing Add-on.
     * Addon's are pieces of functionality that developers can write to insert new functionality into PagerDuty's UI.
     * Given a configuration containing a {@code src} parameter, that URL will be embedded in an {@code iframe} on a page that's available to users from a drop-down menu.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#add-ons)
     * Scoped OAuth requires: {@code addons.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param createAddonRequest   The Add-on to be updated. (optional)
     */
    @RequestLine("PUT /addons/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateAddonRequest> updateAddon(@Param("id") @NotNull String id, @Nullable CreateAddonRequest createAddonRequest);

    /**
     * Update an Automation Action
     * <p>
     * Updates an Automation Action 
     *
     * @param id                   The ID of the resource. (required)
     * @param updateAutomationActionRequest  (required)
     */
    @RequestLine("PUT /automation_actions/actions/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateAutomationAction201Response> updateAutomationAction(@Param("id") @NotNull String id, @NotNull UpdateAutomationActionRequest updateAutomationActionRequest);

    /**
     * Update an Automation Action runner
     * <p>
     * Update an Automation Action runner 
     *
     * @param id                   The ID of the resource. (required)
     * @param updateAutomationActionsRunnerRequest  (required)
     */
    @RequestLine("PUT /automation_actions/runners/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<GetAutomationActionsRunner200Response> updateAutomationActionsRunner(@Param("id") @NotNull String id, @NotNull UpdateAutomationActionsRunnerRequest updateAutomationActionsRunnerRequest);

    /**
     * Update a Business Service
     * <p>
     * Update an existing Business Service. NOTE that this endpoint also accepts the PATCH verb.
     * Business services model capabilities that span multiple technical services and that may be owned by several different teams.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#business-services)
     * Scoped OAuth requires: {@code services.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param updateBusinessServiceRequest  (optional)
     */
    @RequestLine("PUT /business_services/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateBusinessService200Response> updateBusinessService(@Param("id") @NotNull String id, @Nullable UpdateBusinessServiceRequest updateBusinessServiceRequest);

    /**
     * Update a Change Event
     * <p>
     * Update an existing Change Event
     * Scoped OAuth requires: {@code change_events.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param updateChangeEventRequest The Change Event to be updated. (optional)
     */
    @RequestLine("PUT /change_events/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<GetChangeEvent200Response> updateChangeEvent(@Param("id") @NotNull String id, @Nullable UpdateChangeEventRequest updateChangeEventRequest);

    /**
     * Update a Field
     * <p>
     * Update a field.
     * Scoped OAuth requires: {@code custom_fields.write} 
     *
     * @param fieldId              The ID of the field. (required)
     * @param updateCustomFieldsFieldRequest  (optional)
     */
    @RequestLine("PUT /incidents/custom_fields/{fieldId}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<UpdateCustomFieldsField200Response> updateCustomFieldsField(@Param("fieldId") @NotNull String fieldId, @Nullable UpdateCustomFieldsFieldRequest updateCustomFieldsFieldRequest);

    /**
     * Update a Field Option
     * <p>
     * Update Field Option for a Field.
     * Scoped OAuth requires: {@code custom_fields.write} 
     *
     * @param fieldId              The ID of the field. (required)
     * @param fieldOptionId        The ID of the field option. (required)
     * @param updateCustomFieldsFieldOptionRequest  (optional)
     */
    @RequestLine("PUT /incidents/custom_fields/{fieldId}/field_options/{fieldOptionId}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<CreateCustomFieldsFieldOptionRequest> updateCustomFieldsFieldOption(@Param("fieldId") @NotNull String fieldId, @Param("fieldOptionId") @NotNull String fieldOptionId, @Nullable UpdateCustomFieldsFieldOptionRequest updateCustomFieldsFieldOptionRequest);

    /**
     * Update an escalation policy
     * <p>
     * Updates an existing escalation policy and rules.
     * Escalation policies define which user should be alerted at which time.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#escalation-policies)
     * Scoped OAuth requires: {@code escalation_policies.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param createEscalationPolicyRequest The escalation policy to be updated. (optional)
     */
    @RequestLine("PUT /escalation_policies/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateEscalationPolicyRequest> updateEscalationPolicy(@Param("id") @NotNull String id, @Nullable CreateEscalationPolicyRequest createEscalationPolicyRequest);

    /**
     * Update an extension
     * <p>
     * Update an existing extension.
     * Extensions are representations of Extension Schema objects that are attached to Services.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#extensions)
     * Scoped OAuth requires: {@code extensions.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param getExtension200Response The extension to be updated. (optional)
     */
    @RequestLine("PUT /extensions/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<GetExtension200Response> updateExtension(@Param("id") @NotNull String id, @Nullable GetExtension200Response getExtension200Response);

    /**
     * Update an incident
     * <p>
     * Acknowledge, resolve, escalate or reassign an incident.
     * An incident represents a problem or an issue that needs to be addressed and resolved.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#incidents)
     * Scoped OAuth requires: {@code incidents.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param from                 The email address of a valid user associated with the account making the request. (required)
     * @param updateIncidentRequest  (optional)
     */
    @RequestLine("PUT /incidents/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json", 
        "From: {from}"
    })
    CompletableFuture<UpdateIncident200Response> updateIncident(@Param("id") @NotNull String id, @Param("from") @NotNull String from, @Nullable UpdateIncidentRequest updateIncidentRequest);

    /**
     * Update an alert
     * <p>
     * Resolve an alert or associate an alert with a new parent incident.
     * An incident represents a problem or an issue that needs to be addressed and resolved.
     * When a service sends an event to PagerDuty, an alert and corresponding incident is triggered in PagerDuty.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#incidents)
     * Scoped OAuth requires: {@code incidents.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param alertId              The id of the alert to retrieve. (required)
     * @param from                 The email address of a valid user associated with the account making the request. (required)
     * @param getIncidentAlert200Response The parameters of the alert to update. (optional)
     */
    @RequestLine("PUT /incidents/{id}/alerts/{alertId}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json", 
        "From: {from}"
    })
    CompletableFuture<GetIncidentAlert200Response> updateIncidentAlert(@Param("id") @NotNull String id, @Param("alertId") @NotNull String alertId, @Param("from") @NotNull String from, @Nullable GetIncidentAlert200Response getIncidentAlert200Response);

    /**
     * Manage alerts
     * <p>
     * Resolve multiple alerts or associate them with different incidents.
     * An incident represents a problem or an issue that needs to be addressed and resolved. An alert represents a digital signal that was emitted to PagerDuty by the monitoring systems that detected or identified the issue.
     * A maximum of 500 alerts may be updated at a time. If more than this number of alerts are given, the API will respond with status 413 (Request Entity Too Large).
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#incidents)
     * Scoped OAuth requires: {@code incidents.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param from                 The email address of a valid user associated with the account making the request. (required)
     * @param limit                The number of results per page. (optional)
     * @param offset               Offset to start pagination search results. (optional)
     * @param total                By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information.  (optional, defaults to false)
     * @param updateIncidentAlertsRequest  (optional)
     */
    @RequestLine("PUT /incidents/{id}/alerts?limit={limit}&offset={offset}&total={total}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json", 
        "From: {from}"
    })
    CompletableFuture<ListIncidentAlerts200Response> updateIncidentAlerts(@Param("id") @NotNull String id, @Param("from") @NotNull String from, @Param("limit") @Nullable Integer limit, @Param("offset") @Nullable Integer offset, @Param("total") @Nullable Boolean total, @Nullable UpdateIncidentAlertsRequest updateIncidentAlertsRequest);

    /**
     * Update a Trigger
     * <p>
     * Update an existing Incident Workflow Trigger
     * Scoped OAuth requires: {@code incident_workflows.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param createIncidentWorkflowTriggerRequest  (optional)
     */
    @RequestLine("PUT /incident_workflows/triggers/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateIncidentWorkflowTriggerRequest> updateIncidentWorkflowTrigger(@Param("id") @NotNull String id, @Nullable CreateIncidentWorkflowTriggerRequest createIncidentWorkflowTriggerRequest);

    /**
     * Manage incidents
     * <p>
     * Acknowledge, resolve, escalate or reassign one or more incidents.
     * An incident represents a problem or an issue that needs to be addressed and resolved.
     * A maximum of 250 incidents may be updated at a time. If more than this number of incidents are given, the API will respond with status 413 (Request Entity Too Large).
     * Note: the manage incidents API endpoint is rate limited to 500 requests per minute.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#incidents)
     * Scoped OAuth requires: {@code incidents.write} 
     *
     * @param from                 The email address of a valid user associated with the account making the request. (required)
     * @param limit                The number of results per page. (optional)
     * @param offset               Offset to start pagination search results. (optional)
     * @param total                By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information.  (optional, defaults to false)
     * @param updateIncidentsRequest  (optional)
     */
    @RequestLine("PUT /incidents?limit={limit}&offset={offset}&total={total}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json", 
        "From: {from}"
    })
    CompletableFuture<ListIncidents200Response> updateIncidents(@Param("from") @NotNull String from, @Param("limit") @Nullable Integer limit, @Param("offset") @Nullable Integer offset, @Param("total") @Nullable Boolean total, @Nullable UpdateIncidentsRequest updateIncidentsRequest);

    /**
     * Update log entry channel information.
     * <p>
     * Update an existing incident log entry channel.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#log-entries)
     * Scoped OAuth requires: {@code incidents.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param from                 The email address of a valid user associated with the account making the request. (required)
     * @param updateLogEntryChannelRequest The log entry channel to be updated. (optional)
     */
    @RequestLine("PUT /log_entries/{id}/channel")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json", 
        "From: {from}"
    })
    CompletableFuture<Void> updateLogEntryChannel(@Param("id") @NotNull String id, @Param("from") @NotNull String from, @Nullable UpdateLogEntryChannelRequest updateLogEntryChannelRequest);

    /**
     * Update a maintenance window
     * <p>
     * Update an existing maintenance window.
     * A Maintenance Window is used to temporarily disable one or more Services for a set period of time.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#maintenance-windows)
     * Scoped OAuth requires: {@code services.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param createMaintenanceWindowRequest The maintenance window to be updated. (optional)
     */
    @RequestLine("PUT /maintenance_windows/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateMaintenanceWindowRequest> updateMaintenanceWindow(@Param("id") @NotNull String id, @Nullable CreateMaintenanceWindowRequest createMaintenanceWindowRequest);

    /**
     * Update the Service Orchestration active status for a Service
     * <p>
     * Update a Service Orchestration's active status.
     * A Service Orchestration allows you to set an active status based on whether an event will be evaluated against a service orchestration path (true) or service ruleset (false).
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#event-orchestrations)
     * Scoped OAuth requires: {@code services.write} 
     *
     * @param serviceId            The service ID (required)
     * @param getOrchActiveStatus200Response Update Service Orchestration's active status. (optional)
     */
    @RequestLine("PUT /event_orchestrations/services/{serviceId}/active")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<GetOrchActiveStatus200Response> updateOrchActiveStatus(@Param("serviceId") @NotNull String serviceId, @Nullable GetOrchActiveStatus200Response getOrchActiveStatus200Response);

    /**
     * Update the Global Orchestration for an Event Orchestration
     * <p>
     * Update the Global Orchestration for an Event Orchestration.
     * Global Orchestration Rules allows you to create a set of Event Rules. These rules evaluate against all Events sent to an Event Orchestration. When a matching rule is found, it can modify and enhance the event and can route the event to another set of Global Rules within this Orchestration for further processing.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#event-orchestrations)
     * Scoped OAuth requires: {@code event_orchestrations.write} 
     *
     * @param id                   The ID of an Event Orchestration. (required)
     * @param orchestrationGlobal  Update Global Orchestration rules. Omitted rules and rule details are deleted. (optional)
     */
    @RequestLine("PUT /event_orchestrations/{id}/global")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<UpdateOrchPathGlobal200Response> updateOrchPathGlobal(@Param("id") @NotNull String id, @Nullable OrchestrationGlobal orchestrationGlobal);

    /**
     * Update the Router for an Event Orchestration
     * <p>
     * Update a Global Orchestration's Routing Rules.
     * An Orchestration Router allows you to create a set of Event Rules. The Router evaluates Events you send to this Global Orchestration against each of its rules, one at a time, and routes the event to a specific Service based on the first rule that matches. If an event doesn't match any rules, it'll be sent to service specified in as the {@code catch_all} or the "Unrouted" Orchestration if no service is specified.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#event-orchestrations)
     * Scoped OAuth requires: {@code event_orchestrations.write} 
     *
     * @param id                   The ID of an Event Orchestration. (required)
     * @param orchestrationRouter  Updates to Orchestration Router details. Omitted rules and rule details are deleted. (optional)
     */
    @RequestLine("PUT /event_orchestrations/{id}/router")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<UpdateOrchPathRouter200Response> updateOrchPathRouter(@Param("id") @NotNull String id, @Nullable OrchestrationRouter orchestrationRouter);

    /**
     * Update the Service Orchestration for a Service
     * <p>
     * Update a Service Orchestration.
     * A Service Orchestration allows you to create a set of Event Rules. The Service Orchestration evaluates Events sent to this Service against each of its rules, beginning with the rules in the "start" set. When a matching rule is found, it can modify and enhance the event and can route the event to another set of rules within this Service Orchestration for further processing.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#event-orchestrations)
     * Scoped OAuth requires: {@code services.write} 
     *
     * @param serviceId            The service ID (required)
     * @param serviceOrchestration Update Service Orchestration rules. Omitted rules and rule details are deleted. (optional)
     */
    @RequestLine("PUT /event_orchestrations/services/{serviceId}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<UpdateOrchPathService200Response> updateOrchPathService(@Param("serviceId") @NotNull String serviceId, @Nullable ServiceOrchestration serviceOrchestration);

    /**
     * Update the Unrouted Orchestration for an Event Orchestration
     * <p>
     * Update a Global Event Orchestration's Rules for Unrouted events.
     * An Unrouted Orchestration allows you to create a set of Event Rules that will be evaluated against all events that don't match any rules in the Global Orchestration's Router. Events that reach the Unrouted Orchestration will never be routed to a specific Service.
     * The Unrouted Orchestration evaluates Events sent to it against each of its rules, beginning with the rules in the "start" set. When a matching rule is found, it can modify and enhance the event and can route the event to another set of rules within this Unrouted Orchestration for further processing.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#event-orchestrations)
     * Scoped OAuth requires: {@code event_orchestrations.write} 
     *
     * @param id                   The ID of an Event Orchestration. (required)
     * @param orchestrationUnrouted Updates to Unrouted Orchestration rules. Omitted rules and rule details are deleted. (optional)
     */
    @RequestLine("PUT /event_orchestrations/{id}/unrouted")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<UpdateOrchPathUnrouted200Response> updateOrchPathUnrouted(@Param("id") @NotNull String id, @Nullable OrchestrationUnrouted orchestrationUnrouted);

    /**
     * Update an Orchestration
     * <p>
     * Update a Global Event Orchestration.
     * Global Event Orchestrations allow you define a set of Global Rules and Router Rules, so that when you ingest events using the Orchestration's Routing Key your events will have actions applied via the Global Rules &amp; then routed to the correct Service by the Router Rules, based on the event's content.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#event-orchestrations)
     * Scoped OAuth requires: {@code event_orchestrations.write} 
     *
     * @param id                   The ID of an Event Orchestration. (required)
     * @param postOrchestrationRequest  (optional)
     */
    @RequestLine("PUT /event_orchestrations/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<PostOrchestration201Response> updateOrchestration(@Param("id") @NotNull String id, @Nullable PostOrchestrationRequest postOrchestrationRequest);

    /**
     * Update an Integration for an Event Orchestration
     * <p>
     * Update an Integration associated with this Event Orchestrations.
     * You can use the Routing Key from this Integration to send events to PagerDuty!
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#event-orchestrations)
     * Scoped OAuth requires: {@code event_orchestrations.write} 
     *
     * @param id                   The ID of an Event Orchestration. (required)
     * @param integrationId        The ID of an Integration. (required)
     * @param postOrchestrationIntegrationRequest  (optional)
     */
    @RequestLine("PUT /event_orchestrations/{id}/integrations/{integrationId}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<PostOrchestrationIntegration201Response> updateOrchestrationIntegration(@Param("id") @NotNull String id, @Param("integrationId") @NotNull String integrationId, @Nullable PostOrchestrationIntegrationRequest postOrchestrationIntegrationRequest);

    /**
     * Update a Response Play
     * <p>
     * Updates an existing Response Play.
     * Response Plays allow you to create packages of Incident Actions that can be applied during an Incident's life cycle.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#response-plays)
     * Scoped OAuth requires: {@code response_plays.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param from                 The email address of a valid user associated with the account making the request. (required)
     * @param createResponsePlayRequest The Response Play to be updated. (optional)
     * @deprecated
     */
    @Deprecated
    @RequestLine("PUT /response_plays/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json", 
        "From: {from}"
    })
    CompletableFuture<CreateResponsePlay201Response> updateResponsePlay(@Param("id") @NotNull String id, @Param("from") @NotNull String from, @Nullable CreateResponsePlayRequest createResponsePlayRequest);

    /**
     * Update a Ruleset
     * <p>
     * Update a Ruleset. &amp;lt;!-- theme: warning --&amp;gt; &amp;gt; ### End-of-life &amp;gt; Rulesets and Event Rules will end-of-life soon. We highly recommend that you [migrate to Event Orchestration](https://support.pagerduty.com/docs/migrate-to-event-orchestration) as soon as possible so you can take advantage of the new functionality, such as improved UI, rule creation, APIs and Terraform support, advanced conditions, and rule nesting.
     * Rulesets allow you to route events to an endpoint and create collections of Event Rules, which define sets of actions to take based on event content.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#rulesets)
     * Scoped OAuth requires: {@code event_rules.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param updateRulesetRequest  (optional)
     */
    @RequestLine("PUT /rulesets/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateRuleset201Response> updateRuleset(@Param("id") @NotNull String id, @Nullable UpdateRulesetRequest updateRulesetRequest);

    /**
     * Update an Event Rule
     * <p>
     * Update an Event Rule. Note that the endpoint supports partial updates, so any number of the writable fields can be provided. &amp;lt;!-- theme: warning --&amp;gt; &amp;gt; ### End-of-life &amp;gt; Rulesets and Event Rules will end-of-life soon. We highly recommend that you [migrate to Event Orchestration](https://support.pagerduty.com/docs/migrate-to-event-orchestration) as soon as possible so you can take advantage of the new functionality, such as improved UI, rule creation, APIs and Terraform support, advanced conditions, and rule nesting.
     * Rulesets allow you to route events to an endpoint and create collections of Event Rules, which define sets of actions to take based on event content.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#rulesets)
     * Note: Create and Update on rules will accept 'description' or 'summary' interchangeably as an extraction action target. Get and List on rules will always return 'summary' as the target. If you are expecting 'description' please change your automation code to expect 'summary' instead.
     * Scoped OAuth requires: {@code event_rules.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param ruleId               The id of the Event Rule to retrieve. (required)
     * @param updateRulesetEventRuleRequest  (optional)
     */
    @RequestLine("PUT /rulesets/{id}/rules/{ruleId}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateRulesetEventRule201Response> updateRulesetEventRule(@Param("id") @NotNull String id, @Param("ruleId") @NotNull String ruleId, @Nullable UpdateRulesetEventRuleRequest updateRulesetEventRuleRequest);

    /**
     * Update a schedule
     * <p>
     * Update an existing on-call schedule.
     * A Schedule determines the time periods that users are On-Call.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#schedules)
     * Scoped OAuth requires: {@code schedules.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param overflow             Any on-call schedule entries that pass the date range bounds will be truncated at the bounds, unless the parameter {@code overflow=true} is passed. This parameter defaults to false. For instance, if your schedule is a rotation that changes daily at midnight UTC, and your date range is from {@code 2011-06-01T10:00:00Z} to {@code 2011-06-01T14:00:00Z}:   - If you don't pass the {@code overflow=true} parameter, you will get one schedule entry returned with a start of {@code 2011-06-01T10:00:00Z} and end of {@code 2011-06-01T14:00:00Z}. - If you do pass the {@code overflow=true} parameter, you will get one schedule entry returned with a start of {@code 2011-06-01T00:00:00Z} and end of {@code 2011-06-02T00:00:00Z}.  (optional, defaults to false)
     * @param createScheduleRequest The schedule to be updated. (optional)
     */
    @RequestLine("PUT /schedules/{id}?overflow={overflow}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateScheduleRequest> updateSchedule(@Param("id") @NotNull String id, @Param("overflow") @Nullable Boolean overflow, @Nullable CreateScheduleRequest createScheduleRequest);

    /**
     * Update a service
     * <p>
     * Update an existing service.
     * A service may represent an application, component, or team you wish to open incidents against.
     * There is a limit of 100,000 open Incidents per Service. If the limit is reached and you disable {@code auto_resolve_timeout} (set to 0 or null), the API will respond with an error.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#services)
     * Scoped OAuth requires: {@code services.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param createServiceRequest The service to be updated. (optional)
     */
    @RequestLine("PUT /services/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateServiceRequest> updateService(@Param("id") @NotNull String id, @Nullable CreateServiceRequest createServiceRequest);

    /**
     * Update an Event Rule on a Service
     * <p>
     * Update an Event Rule on a Service. Note that the endpoint supports partial updates, so any number of the writable fields can be provided. &amp;lt;!-- theme: warning --&amp;gt; &amp;gt; ### End-of-life &amp;gt; Rulesets and Event Rules will end-of-life soon. We highly recommend that you [migrate to Event Orchestration](https://support.pagerduty.com/docs/migrate-to-event-orchestration) as soon as possible so you can take advantage of the new functionality, such as improved UI, rule creation, APIs and Terraform support, advanced conditions, and rule nesting.
     * Scoped OAuth requires: {@code services.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param ruleId               The id of the Event Rule to retrieve. (required)
     * @param updateServiceEventRuleRequest  (optional)
     */
    @RequestLine("PUT /services/{id}/rules/{ruleId}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateServiceEventRule201Response> updateServiceEventRule(@Param("id") @NotNull String id, @Param("ruleId") @NotNull String ruleId, @Nullable UpdateServiceEventRuleRequest updateServiceEventRuleRequest);

    /**
     * Update an existing integration
     * <p>
     * Update an integration belonging to a Service.
     * A service may represent an application, component, or team you wish to open incidents against.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#services)
     * Scoped OAuth requires: {@code services.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param integrationId        The integration ID on the service. (required)
     * @param createServiceIntegrationRequest The integration to be updated (optional)
     */
    @RequestLine("PUT /services/{id}/integrations/{integrationId}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateServiceIntegrationRequest> updateServiceIntegration(@Param("id") @NotNull String id, @Param("integrationId") @NotNull String integrationId, @Nullable CreateServiceIntegrationRequest createServiceIntegrationRequest);

    /**
     * Update a standard
     * <p>
     * Updates a standard
     * Scoped OAuth requires: {@code standards.write} 
     *
     * @param id                   Id of the standard (required)
     * @param updateStandardRequest  (optional)
     */
    @RequestLine("PUT /standards/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<Standard> updateStandard(@Param("id") @NotNull String id, @Nullable UpdateStandardRequest updateStandardRequest);

    /**
     * Update a team
     * <p>
     * Update an existing team.
     * A team is a collection of Users and Escalation Policies that represent a group of people within an organization.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#teams)
     * Scoped OAuth requires: {@code teams.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param createTeamRequest    The team to be updated. (optional)
     */
    @RequestLine("PUT /teams/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateTeamRequest> updateTeam(@Param("id") @NotNull String id, @Nullable CreateTeamRequest createTeamRequest);

    /**
     * Add an escalation policy to a team
     * <p>
     * Add an escalation policy to a team.
     * A team is a collection of Users and Escalation Policies that represent a group of people within an organization.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#teams)
     * Scoped OAuth requires: {@code teams.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param escalationPolicyId   The escalation policy ID on the team. (required)
     */
    @RequestLine("PUT /teams/{id}/escalation_policies/{escalationPolicyId}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<Void> updateTeamEscalationPolicy(@Param("id") @NotNull String id, @Param("escalationPolicyId") @NotNull String escalationPolicyId);

    /**
     * Add a user to a team
     * <p>
     * Add a user to a team. Attempting to add a user with the {@code read_only_user} role will return a 400 error.
     * A team is a collection of Users and Escalation Policies that represent a group of people within an organization.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#teams)
     * Scoped OAuth requires: {@code teams.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param userId               The user ID on the team. (required)
     * @param updateTeamUserRequest The role of the user on the team. (optional)
     */
    @RequestLine("PUT /teams/{id}/users/{userId}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<Void> updateTeamUser(@Param("id") @NotNull String id, @Param("userId") @NotNull String userId, @Nullable UpdateTeamUserRequest updateTeamUserRequest);

    /**
     * Update a template
     * <p>
     * Update an existing template
     * Scoped OAuth requires: {@code templates.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param createTemplateRequest  (required)
     */
    @RequestLine("PUT /templates/{id}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CompletableFuture<CreateTemplate201Response> updateTemplate(@Param("id") @NotNull String id, @NotNull CreateTemplateRequest createTemplateRequest);

    /**
     * Update a user
     * <p>
     * Update an existing user.
     * Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param createUserRequest    The user to be updated. (optional)
     */
    @RequestLine("PUT /users/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateUserRequest> updateUser(@Param("id") @NotNull String id, @Nullable CreateUserRequest createUserRequest);

    /**
     * Update a user's contact method
     * <p>
     * Update a User's contact method.
     * Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users:contact_methods.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param contactMethodId      The contact method ID on the user. (required)
     * @param createUserContactMethodRequest The user's contact method to be updated. (optional)
     */
    @RequestLine("PUT /users/{id}/contact_methods/{contactMethodId}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateUserContactMethod201Response> updateUserContactMethod(@Param("id") @NotNull String id, @Param("contactMethodId") @NotNull String contactMethodId, @Nullable CreateUserContactMethodRequest createUserContactMethodRequest);

    /**
     * Update a User's Handoff Notification Rule
     * <p>
     * Update a User's Handoff Notification Rule. Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account. For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param oncallHandoffNotificationRuleId The oncall handoff notification rule ID on the user. (required)
     * @param createUserHandoffNotificationRuleRequest The User's Handoff Notification Rule to be updated. (optional)
     */
    @RequestLine("PUT /users/{id}/oncall_handoff_notification_rules/{oncallHandoffNotificationRuleId}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<UpdateUserHandoffNotification200Response> updateUserHandoffNotification(@Param("id") @NotNull String id, @Param("oncallHandoffNotificationRuleId") @NotNull String oncallHandoffNotificationRuleId, @Nullable CreateUserHandoffNotificationRuleRequest createUserHandoffNotificationRuleRequest);

    /**
     * Update a user's notification rule
     * <p>
     * Update a user's notification rule.
     * Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users:contact_methods.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param notificationRuleId   The notification rule ID on the user. (required)
     * @param createUserNotificationRuleRequest The user's notification rule to be updated. (optional)
     */
    @RequestLine("PUT /users/{id}/notification_rules/{notificationRuleId}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<UpdateUserNotificationRule200Response> updateUserNotificationRule(@Param("id") @NotNull String id, @Param("notificationRuleId") @NotNull String notificationRuleId, @Nullable CreateUserNotificationRuleRequest createUserNotificationRuleRequest);

    /**
     * Update a user's status update notification rule
     * <p>
     * Update a user's status update notification rule.
     * Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account.
     * &amp;lt;!-- theme: warning --&amp;gt; &amp;gt; ### Early Access &amp;gt; This endpoint is in Early Access and may change at any time. You must pass in the X-EARLY-ACCESS header to access it.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users.write} 
     *
     * @param id                   The ID of the resource. (required)
     * @param statusUpdateNotificationRuleId The status update notification rule ID on the user. (required)
     * @param createUserStatusUpdateNotificationRule201Response The user's status update notification rule to be updated. (optional)
     */
    @RequestLine("PUT /users/{id}/status_update_notification_rules/{statusUpdateNotificationRuleId}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json", 
        "X-EARLY-ACCESS: status-update-notification-rules"
    })
    CompletableFuture<UpdateUserStatusUpdateNotificationRule200Response> updateUserStatusUpdateNotificationRule(@Param("id") @NotNull String id, @Param("statusUpdateNotificationRuleId") @NotNull String statusUpdateNotificationRuleId, @Nullable CreateUserStatusUpdateNotificationRule201Response createUserStatusUpdateNotificationRule201Response);

    /**
     * Update a webhook subscription
     * <p>
     * Updates an existing webhook subscription.
     * Only the fields being updated need to be included on the request.
     * This operation does not support updating the {@code delivery_method} of the webhook subscription. 
     *
     * @param id                   The ID of the resource. (required)
     * @param webhookSubscriptionUpdate  (optional)
     */
    @RequestLine("PUT /webhook_subscriptions/{id}")
    @Headers({
        "Accept: application/vnd.pagerduty+json;version=2", 
        "Content-Type: application/json"
    })
    CompletableFuture<CreateWebhookSubscriptionRequest> updateWebhookSubscription(@Param("id") @NotNull String id, @Nullable WebhookSubscriptionUpdate webhookSubscriptionUpdate);

}
