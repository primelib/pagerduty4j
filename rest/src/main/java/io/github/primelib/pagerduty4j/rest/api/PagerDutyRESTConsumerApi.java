package io.github.primelib.pagerduty4j.rest.api;

import java.util.List;
import javax.annotation.processing.Generated;

import io.github.primelib.pagerduty4j.rest.model.AnalyticsRawIncident;
import io.github.primelib.pagerduty4j.rest.model.AuditRecordResponseSchema;
import io.github.primelib.pagerduty4j.rest.model.ConvertServiceEventRulesToEventOrchestration200Response;
import io.github.primelib.pagerduty4j.rest.model.CreateAddon201Response;
import io.github.primelib.pagerduty4j.rest.model.CreateAddonRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateAutomationAction201Response;
import io.github.primelib.pagerduty4j.rest.model.CreateAutomationActionInvocation201Response;
import io.github.primelib.pagerduty4j.rest.model.CreateAutomationActionServiceAssocationRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateAutomationActionTeamAssociationRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateAutomationActionsRunner201Response;
import io.github.primelib.pagerduty4j.rest.model.CreateBusinessService200Response;
import io.github.primelib.pagerduty4j.rest.model.CreateBusinessServiceAccountSubscription200Response;
import io.github.primelib.pagerduty4j.rest.model.CreateBusinessServiceNotificationSubscribers200Response;
import io.github.primelib.pagerduty4j.rest.model.CreateCustomFieldsFieldOptionRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateCustomFieldsFieldRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateEscalationPolicyRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateIncident201Response;
import io.github.primelib.pagerduty4j.rest.model.CreateIncidentNote200Response;
import io.github.primelib.pagerduty4j.rest.model.CreateIncidentResponderRequest200Response;
import io.github.primelib.pagerduty4j.rest.model.CreateIncidentStatusUpdate200Response;
import io.github.primelib.pagerduty4j.rest.model.CreateIncidentWorkflowInstance201Response;
import io.github.primelib.pagerduty4j.rest.model.CreateIncidentWorkflowTriggerRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateMaintenanceWindowRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateResponsePlay201Response;
import io.github.primelib.pagerduty4j.rest.model.CreateRuleset201Response;
import io.github.primelib.pagerduty4j.rest.model.CreateRulesetEventRule201Response;
import io.github.primelib.pagerduty4j.rest.model.CreateScheduleOverride201ResponseInner;
import io.github.primelib.pagerduty4j.rest.model.CreateScheduleRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateServiceDependency200Response;
import io.github.primelib.pagerduty4j.rest.model.CreateServiceEventRule201Response;
import io.github.primelib.pagerduty4j.rest.model.CreateServiceIntegrationRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateServiceRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateTagsRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateTeamRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateTemplate201Response;
import io.github.primelib.pagerduty4j.rest.model.CreateUserContactMethod201Response;
import io.github.primelib.pagerduty4j.rest.model.CreateUserHandoffNotificationRuleRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateUserNotificationRuleRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateUserRequest;
import io.github.primelib.pagerduty4j.rest.model.CreateUserStatusUpdateNotificationRule201Response;
import io.github.primelib.pagerduty4j.rest.model.CreateWebhookSubscriptionRequest;
import io.github.primelib.pagerduty4j.rest.model.GetAllAutomationActions200Response;
import io.github.primelib.pagerduty4j.rest.model.GetAnalyticsIncidentResponsesById200Response;
import io.github.primelib.pagerduty4j.rest.model.GetAnalyticsIncidents200Response;
import io.github.primelib.pagerduty4j.rest.model.GetAnalyticsMetricsIncidentsAll200Response;
import io.github.primelib.pagerduty4j.rest.model.GetAnalyticsMetricsIncidentsEscalationPolicy200Response;
import io.github.primelib.pagerduty4j.rest.model.GetAnalyticsMetricsRespondersAll200Response;
import io.github.primelib.pagerduty4j.rest.model.GetAnalyticsResponderIncidents200Response;
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
import io.github.primelib.pagerduty4j.rest.model.OrchestrationGlobal;
import io.github.primelib.pagerduty4j.rest.model.OrchestrationRouter;
import io.github.primelib.pagerduty4j.rest.model.OrchestrationUnrouted;
import io.github.primelib.pagerduty4j.rest.model.PostIncidentWorkflowRequest;
import io.github.primelib.pagerduty4j.rest.model.PostOrchestration201Response;
import io.github.primelib.pagerduty4j.rest.model.PostOrchestrationIntegration201Response;
import io.github.primelib.pagerduty4j.rest.model.PutBusinessServicePriorityThresholds200Response;
import io.github.primelib.pagerduty4j.rest.model.PutIncidentManualBusinessServiceAssociation200Response;
import io.github.primelib.pagerduty4j.rest.model.RemoveBusinessServiceNotificationSubscriber200Response;
import io.github.primelib.pagerduty4j.rest.model.RenderedTemplate;
import io.github.primelib.pagerduty4j.rest.model.RunResponsePlay200Response;
import io.github.primelib.pagerduty4j.rest.model.ServiceOrchestration;
import java.util.Set;
import io.github.primelib.pagerduty4j.rest.model.Standard;
import io.github.primelib.pagerduty4j.rest.model.StandardApplied;
import io.github.primelib.pagerduty4j.rest.model.UpdateCustomFieldsField200Response;
import io.github.primelib.pagerduty4j.rest.model.UpdateIncident200Response;
import io.github.primelib.pagerduty4j.rest.model.UpdateOrchPathGlobal200Response;
import io.github.primelib.pagerduty4j.rest.model.UpdateOrchPathRouter200Response;
import io.github.primelib.pagerduty4j.rest.model.UpdateOrchPathService200Response;
import io.github.primelib.pagerduty4j.rest.model.UpdateOrchPathUnrouted200Response;
import io.github.primelib.pagerduty4j.rest.model.UpdateUserHandoffNotification200Response;
import io.github.primelib.pagerduty4j.rest.model.UpdateUserNotificationRule200Response;
import io.github.primelib.pagerduty4j.rest.model.UpdateUserStatusUpdateNotificationRule200Response;

import java.util.function.Consumer;

import io.github.primelib.pagerduty4j.rest.spec.AssociateServiceToIncidentWorkflowTriggerOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.ConvertServiceEventRulesToEventOrchestrationOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.CreateAddonOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.CreateAutomationActionOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.CreateAutomationActionInvocationOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.CreateAutomationActionServiceAssocationOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.CreateAutomationActionTeamAssociationOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.CreateAutomationActionsRunnerOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.CreateAutomationActionsRunnerTeamAssociationOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.CreateBusinessServiceOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.CreateBusinessServiceAccountSubscriptionOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.CreateBusinessServiceNotificationSubscribersOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.CreateCustomFieldsFieldOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.CreateCustomFieldsFieldOptionOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.CreateEntityTypeByIdChangeTagsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.CreateEscalationPolicyOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.CreateIncidentOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.CreateIncidentNoteOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.CreateIncidentNotificationSubscribersOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.CreateIncidentResponderRequestOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.CreateIncidentSnoozeOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.CreateIncidentStatusUpdateOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.CreateIncidentWorkflowInstanceOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.CreateIncidentWorkflowTriggerOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.CreateMaintenanceWindowOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.CreateResponsePlayOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.CreateRulesetOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.CreateRulesetEventRuleOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.CreateScheduleOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.CreateScheduleOverrideOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.CreateSchedulePreviewOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.CreateServiceOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.CreateServiceDependencyOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.CreateServiceEventRuleOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.CreateServiceIntegrationOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.CreateTagsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.CreateTeamOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.CreateTeamNotificationSubscriptionsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.CreateTemplateOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.CreateUserOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.CreateUserContactMethodOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.CreateUserHandoffNotificationRuleOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.CreateUserNotificationRuleOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.CreateUserNotificationSubscriptionsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.CreateUserStatusUpdateNotificationRuleOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.CreateWebhookSubscriptionOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.DeleteAddonOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.DeleteAutomationActionOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.DeleteAutomationActionServiceAssociationOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.DeleteAutomationActionTeamAssociationOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.DeleteAutomationActionsRunnerOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.DeleteAutomationActionsRunnerTeamAssociationOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.DeleteBusinessServiceOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.DeleteCustomFieldsFieldOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.DeleteCustomFieldsFieldOptionOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.DeleteEscalationPolicyOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.DeleteExtensionOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.DeleteIncidentWorkflowOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.DeleteIncidentWorkflowTriggerOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.DeleteMaintenanceWindowOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.DeleteOrchestrationOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.DeleteOrchestrationIntegrationOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.DeleteResponsePlayOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.DeleteRulesetOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.DeleteRulesetEventRuleOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.DeleteScheduleOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.DeleteScheduleOverrideOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.DeleteServiceOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.DeleteServiceDependencyOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.DeleteServiceEventRuleOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.DeleteServiceFromIncidentWorkflowTriggerOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.DeleteTagOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.DeleteTeamOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.DeleteTeamEscalationPolicyOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.DeleteTeamUserOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.DeleteTemplateOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.DeleteUserOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.DeleteUserContactMethodOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.DeleteUserHandoffNotificationRuleOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.DeleteUserNotificationRuleOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.DeleteUserSessionOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.DeleteUserSessionsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.DeleteUserStatusUpdateNotificationRuleOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.DeleteWebhookSubscriptionOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.EnableExtensionOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.EnableWebhookSubscriptionOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetAbilityOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetAddonOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetAllAutomationActionsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetAnalyticsIncidentResponsesByIdOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetAnalyticsIncidentsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetAnalyticsIncidentsByIdOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetAnalyticsMetricsIncidentsAllOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetAnalyticsMetricsIncidentsEscalationPolicyOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetAnalyticsMetricsIncidentsEscalationPolicyAllOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetAnalyticsMetricsIncidentsServiceOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetAnalyticsMetricsIncidentsServiceAllOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetAnalyticsMetricsIncidentsTeamOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetAnalyticsMetricsIncidentsTeamAllOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetAnalyticsMetricsRespondersAllOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetAnalyticsMetricsRespondersTeamOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetAnalyticsResponderIncidentsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetAutomationActionOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetAutomationActionsActionServiceAssociationOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetAutomationActionsActionServiceAssociationsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetAutomationActionsActionTeamAssociationOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetAutomationActionsActionTeamAssociationsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetAutomationActionsInvocationOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetAutomationActionsRunnerOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetAutomationActionsRunnerTeamAssociationOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetAutomationActionsRunnerTeamAssociationsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetAutomationActionsRunnersOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetBusinessServiceOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetBusinessServiceImpactsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetBusinessServiceServiceDependenciesOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetBusinessServiceSubscribersOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetBusinessServiceSupportingServiceImpactsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetBusinessServiceTopLevelImpactorsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetChangeEventOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetCurrentUserOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetCustomFieldsFieldOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetEntityTypeByIdTagsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetEscalationPolicyOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetExtensionOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetExtensionSchemaOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetIncidentOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetIncidentAlertOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetIncidentFieldValuesOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetIncidentImpactedBusinessServicesOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetIncidentNotificationSubscribersOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetIncidentWorkflowOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetIncidentWorkflowActionOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetIncidentWorkflowTriggerOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetLogEntryOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetMaintenanceWindowOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetOrchActiveStatusOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetOrchPathGlobalOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetOrchPathRouterOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetOrchPathServiceOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetOrchPathUnroutedOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetOrchestrationOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetOrchestrationIntegrationOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetOutlierIncidentOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetPastIncidentsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetPausedIncidentReportAlertsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetPausedIncidentReportCountsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetRelatedIncidentsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetResponsePlayOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetRulesetOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetRulesetEventRuleOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetScheduleOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetServiceOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetServiceEventRuleOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetServiceIntegrationOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetStatusDashboardByIdOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetStatusDashboardByUrlSlugOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetStatusDashboardServiceImpactsByIdOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetStatusDashboardServiceImpactsByUrlSlugOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetTagOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetTagsByEntityTypeOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetTeamOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetTeamNotificationSubscriptionsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetTechnicalServiceServiceDependenciesOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetTemplateOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetTemplatesOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetUserOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetUserContactMethodOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetUserContactMethodsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetUserHandoffNotifiactionRuleOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetUserHandoffNotificationRulesOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetUserLicenseOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetUserNotificationRuleOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetUserNotificationRulesOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetUserNotificationSubscriptionsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetUserSessionOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetUserSessionsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetUserStatusUpdateNotificationRuleOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetUserStatusUpdateNotificationRulesOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetVendorOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.GetWebhookSubscriptionOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.ListAddonOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.ListAuditRecordsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.ListAutomationActionInvocationsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.ListBusinessServicesOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.ListChangeEventsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.ListCustomFieldsFieldOptionsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.ListCustomFieldsFieldsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.ListEscalationPoliciesOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.ListEscalationPolicyAuditRecordsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.ListEventOrchestrationsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.ListExtensionSchemasOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.ListIncidentAlertsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.ListIncidentLogEntriesOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.ListIncidentNotesOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.ListIncidentRelatedChangeEventsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.ListIncidentWorkflowActionsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.ListIncidentWorkflowTriggersOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.ListIncidentWorkflowsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.ListIncidentsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.ListLicenseAllocationsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.ListLogEntriesOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.ListMaintenanceWindowsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.ListNotificationsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.ListOnCallsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.ListOrchestrationIntegrationsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.ListPrioritiesOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.ListResourceStandardsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.ListResourceStandardsManyServicesOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.ListResponsePlaysOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.ListRulesetEventRulesOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.ListRulesetsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.ListScheduleOverridesOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.ListScheduleUsersOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.ListSchedulesOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.ListSchedulesAuditRecordsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.ListServiceAuditRecordsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.ListServiceChangeEventsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.ListServiceEventRulesOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.ListServicesOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.ListStandardsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.ListTagsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.ListTeamUsersOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.ListTeamsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.ListTeamsAuditRecordsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.ListUsersOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.ListUsersAuditRecordsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.ListVendorsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.ListWebhookSubscriptionsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.MergeIncidentsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.MigrateOrchestrationIntegrationOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.PostIncidentWorkflowOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.PostOrchestrationOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.PostOrchestrationIntegrationOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.PutBusinessServicePriorityThresholdsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.PutIncidentManualBusinessServiceAssociationOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.PutIncidentWorkflowOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.RemoveBusinessServiceAccountSubscriptionOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.RemoveBusinessServiceNotificationSubscriberOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.RemoveIncidentNotificationSubscribersOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.RemoveTeamNotificationSubscriptionsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.RenderTemplateOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.RunResponsePlayOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.SetIncidentFieldValuesOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.TestWebhookSubscriptionOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.UnsubscribeUserNotificationSubscriptionsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.UpdateAddonOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.UpdateAutomationActionOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.UpdateAutomationActionsRunnerOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.UpdateBusinessServiceOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.UpdateChangeEventOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.UpdateCustomFieldsFieldOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.UpdateCustomFieldsFieldOptionOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.UpdateEscalationPolicyOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.UpdateExtensionOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.UpdateIncidentOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.UpdateIncidentAlertOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.UpdateIncidentAlertsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.UpdateIncidentWorkflowTriggerOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.UpdateIncidentsOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.UpdateLogEntryChannelOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.UpdateMaintenanceWindowOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.UpdateOrchActiveStatusOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.UpdateOrchPathGlobalOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.UpdateOrchPathRouterOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.UpdateOrchPathServiceOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.UpdateOrchPathUnroutedOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.UpdateOrchestrationOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.UpdateOrchestrationIntegrationOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.UpdateResponsePlayOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.UpdateRulesetOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.UpdateRulesetEventRuleOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.UpdateScheduleOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.UpdateServiceOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.UpdateServiceEventRuleOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.UpdateServiceIntegrationOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.UpdateStandardOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.UpdateTeamOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.UpdateTeamEscalationPolicyOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.UpdateTeamUserOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.UpdateTemplateOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.UpdateUserOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.UpdateUserContactMethodOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.UpdateUserHandoffNotificationOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.UpdateUserNotificationRuleOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.UpdateUserStatusUpdateNotificationRuleOperationSpec;
import io.github.primelib.pagerduty4j.rest.spec.UpdateWebhookSubscriptionOperationSpec;

@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PagerDutyRESTConsumerApi {
    private final PagerDutyRESTApi api;

    public PagerDutyRESTConsumerApi(PagerDutyRESTApi api) {
        this.api = api;
    }

    /**
     * Associate a Trigger and Service
     * <p>
     * Associate a Service with an existing Incident Workflow Trigger
     * Scoped OAuth requires: {@code incident_workflows.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>associateServiceToIncidentWorkflowTriggerRequest: </li>
     * </ul>
     */
    public CreateIncidentWorkflowTriggerRequest associateServiceToIncidentWorkflowTrigger(Consumer<AssociateServiceToIncidentWorkflowTriggerOperationSpec> spec) {
        AssociateServiceToIncidentWorkflowTriggerOperationSpec r = new AssociateServiceToIncidentWorkflowTriggerOperationSpec(spec);
        return api.associateServiceToIncidentWorkflowTrigger(r.id(), r.associateServiceToIncidentWorkflowTriggerRequest());
    }

    /**
     * Convert a Service's Event Rules into Event Orchestration Rules
     * <p>
     * Convert this Service's Event Rules into functionally equivalent Event Orchestration Rules.
     * Sending a request to this API endpoint has several effects:
     * 1. Automatically creates Event Orchestration Rules for this Service that will behave identically as this Service's currently configured Event Rules. 2. Makes all existing Event Rules for this Service read-only. All future updates need to be made via the newly created Event Orchestration rules.
     * Sending a request to this API endpoint will **not** change how future events will be processed. If past events for this Service have been evaluated via Event Rules then new events sent to this Service will also continue to be evaluated via the (now read-only) Event Rules. To change this Service so that new events start being evaluated via the newly created Event Orchestration Rules use the [Update the Service Orchestration active status for a Service API](https://developer.pagerduty.com/api-reference/855659be83d9e-update-the-service-orchestration-active-status-for-a-service).
     * &amp;gt; ### End-of-life &amp;gt; Event Rules will end-of-life soon. We highly recommend that you use this API to [migrate to Event Orchestration](https://support.pagerduty.com/docs/migrate-to-event-orchestration) as soon as possible so you can take advantage of the new functionality, such as improved UI, rule creation, APIs and Terraform support, advanced conditions, and rule nesting.
     * Scoped OAuth requires: {@code services.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public ConvertServiceEventRulesToEventOrchestration200Response convertServiceEventRulesToEventOrchestration(Consumer<ConvertServiceEventRulesToEventOrchestrationOperationSpec> spec) {
        ConvertServiceEventRulesToEventOrchestrationOperationSpec r = new ConvertServiceEventRulesToEventOrchestrationOperationSpec(spec);
        return api.convertServiceEventRulesToEventOrchestration(r.id());
    }

    /**
     * Install an Add-on
     * <p>
     * Install an Add-on for your account.
     * Addon's are pieces of functionality that developers can write to insert new functionality into PagerDuty's UI.
     * Given a configuration containing a {@code src} parameter, that URL will be embedded in an {@code iframe} on a page that's available to users from a drop-down menu.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#add-ons)
     * Scoped OAuth requires: {@code addons.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>createAddonRequest: The Add-on to be installed.</li>
     * </ul>
     */
    public CreateAddon201Response createAddon(Consumer<CreateAddonOperationSpec> spec) {
        CreateAddonOperationSpec r = new CreateAddonOperationSpec(spec);
        return api.createAddon(r.createAddonRequest());
    }

    /**
     * Create an Automation Action
     * <p>
     * Create a Script, Process Automation, or Runbook Automation action 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>createAutomationActionRequest: </li>
     * </ul>
     */
    public CreateAutomationAction201Response createAutomationAction(Consumer<CreateAutomationActionOperationSpec> spec) {
        CreateAutomationActionOperationSpec r = new CreateAutomationActionOperationSpec(spec);
        return api.createAutomationAction(r.createAutomationActionRequest());
    }

    /**
     * Create an Invocation
     * <p>
     * Invokes an Action 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>createAutomationActionInvocationRequest: </li>
     * </ul>
     */
    public CreateAutomationActionInvocation201Response createAutomationActionInvocation(Consumer<CreateAutomationActionInvocationOperationSpec> spec) {
        CreateAutomationActionInvocationOperationSpec r = new CreateAutomationActionInvocationOperationSpec(spec);
        return api.createAutomationActionInvocation(r.id(), r.createAutomationActionInvocationRequest());
    }

    /**
     * Associate an Automation Action with a service
     * <p>
     * Associate an Automation Action with a service 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>createAutomationActionServiceAssocationRequest: </li>
     * </ul>
     */
    public CreateAutomationActionServiceAssocationRequest createAutomationActionServiceAssocation(Consumer<CreateAutomationActionServiceAssocationOperationSpec> spec) {
        CreateAutomationActionServiceAssocationOperationSpec r = new CreateAutomationActionServiceAssocationOperationSpec(spec);
        return api.createAutomationActionServiceAssocation(r.id(), r.createAutomationActionServiceAssocationRequest());
    }

    /**
     * Associate an Automation Action with a team
     * <p>
     * Associate an Automation Action with a team 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>createAutomationActionTeamAssociationRequest: </li>
     * </ul>
     */
    public CreateAutomationActionTeamAssociationRequest createAutomationActionTeamAssociation(Consumer<CreateAutomationActionTeamAssociationOperationSpec> spec) {
        CreateAutomationActionTeamAssociationOperationSpec r = new CreateAutomationActionTeamAssociationOperationSpec(spec);
        return api.createAutomationActionTeamAssociation(r.id(), r.createAutomationActionTeamAssociationRequest());
    }

    /**
     * Create an Automation Action runner.
     * <p>
     * Create a Process Automation or a Runbook Automation runner. 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>createAutomationActionsRunnerRequest: </li>
     * </ul>
     */
    public CreateAutomationActionsRunner201Response createAutomationActionsRunner(Consumer<CreateAutomationActionsRunnerOperationSpec> spec) {
        CreateAutomationActionsRunnerOperationSpec r = new CreateAutomationActionsRunnerOperationSpec(spec);
        return api.createAutomationActionsRunner(r.createAutomationActionsRunnerRequest());
    }

    /**
     * Associate a runner with a team
     * <p>
     * Associate a runner with a team 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>createAutomationActionTeamAssociationRequest: </li>
     * </ul>
     */
    public CreateAutomationActionTeamAssociationRequest createAutomationActionsRunnerTeamAssociation(Consumer<CreateAutomationActionsRunnerTeamAssociationOperationSpec> spec) {
        CreateAutomationActionsRunnerTeamAssociationOperationSpec r = new CreateAutomationActionsRunnerTeamAssociationOperationSpec(spec);
        return api.createAutomationActionsRunnerTeamAssociation(r.id(), r.createAutomationActionTeamAssociationRequest());
    }

    /**
     * Create a Business Service
     * <p>
     * Create a new Business Service.
     * Business services model capabilities that span multiple technical services and that may be owned by several different teams.
     * There is a limit of 5,000 business services per account. If the limit is reached, the API will respond with an error.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#business-services)
     * Scoped OAuth requires: {@code services.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>createBusinessServiceRequest: </li>
     * </ul>
     */
    public CreateBusinessService200Response createBusinessService(Consumer<CreateBusinessServiceOperationSpec> spec) {
        CreateBusinessServiceOperationSpec r = new CreateBusinessServiceOperationSpec(spec);
        return api.createBusinessService(r.createBusinessServiceRequest());
    }

    /**
     * Create Business Service Account Subscription
     * <p>
     * Subscribe your Account to a Business Service.
     * Scoped OAuth requires: {@code subscribers.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public CreateBusinessServiceAccountSubscription200Response createBusinessServiceAccountSubscription(Consumer<CreateBusinessServiceAccountSubscriptionOperationSpec> spec) {
        CreateBusinessServiceAccountSubscriptionOperationSpec r = new CreateBusinessServiceAccountSubscriptionOperationSpec(spec);
        return api.createBusinessServiceAccountSubscription(r.id());
    }

    /**
     * Create Business Service Subscribers
     * <p>
     * Subscribe the given entities to the given Business Service.
     * Scoped OAuth requires: {@code subscribers.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>createBusinessServiceNotificationSubscribersRequest: The entities to subscribe.</li>
     * </ul>
     */
    public CreateBusinessServiceNotificationSubscribers200Response createBusinessServiceNotificationSubscribers(Consumer<CreateBusinessServiceNotificationSubscribersOperationSpec> spec) {
        CreateBusinessServiceNotificationSubscribersOperationSpec r = new CreateBusinessServiceNotificationSubscribersOperationSpec(spec);
        return api.createBusinessServiceNotificationSubscribers(r.id(), r.createBusinessServiceNotificationSubscribersRequest());
    }

    /**
     * Create a Change Event
     * <p>
     * Sending Change Events is documented as part of the V2 Events API. See [{@code Send Change Event}](https://developer.pagerduty.com/api-reference/b3A6Mjc0ODI2Ng-send-change-events-to-the-pager-duty-events-api). 
     */
    public void createChangeEvent() {
        api.createChangeEvent();
    }

    /**
     * Create a Field
     * <p>
     * Create a new Field, along with the Field Options if provided. An account may have up to 10 Fields.
     * Scoped OAuth requires: {@code custom_fields.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>createCustomFieldsFieldRequest: </li>
     * </ul>
     */
    public CreateCustomFieldsFieldRequest createCustomFieldsField(Consumer<CreateCustomFieldsFieldOperationSpec> spec) {
        CreateCustomFieldsFieldOperationSpec r = new CreateCustomFieldsFieldOperationSpec(spec);
        return api.createCustomFieldsField(r.createCustomFieldsFieldRequest());
    }

    /**
     * Create a Field Option
     * <p>
     * Create a new Field Option. Field Options may only be created for Fields that have {@code field_options}. A Field may have no more than 10 enabled options.
     * Scoped OAuth requires: {@code custom_fields.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>fieldId: The ID of the field.</li>
     *   <li>createCustomFieldsFieldOptionRequest: </li>
     * </ul>
     */
    public CreateCustomFieldsFieldOptionRequest createCustomFieldsFieldOption(Consumer<CreateCustomFieldsFieldOptionOperationSpec> spec) {
        CreateCustomFieldsFieldOptionOperationSpec r = new CreateCustomFieldsFieldOptionOperationSpec(spec);
        return api.createCustomFieldsFieldOption(r.fieldId(), r.createCustomFieldsFieldOptionRequest());
    }

    /**
     * Assign tags
     * <p>
     * Assign existing or new tags.
     * A Tag is applied to Escalation Policies, Teams or Users and can be used to filter them.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#tags)
     * Scoped OAuth requires: {@code tags.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>entityType: Type of entity related with the tag</li>
     *   <li>id: The ID of the resource.</li>
     *   <li>createEntityTypeByIdChangeTagsRequest: </li>
     * </ul>
     */
    public Object createEntityTypeByIdChangeTags(Consumer<CreateEntityTypeByIdChangeTagsOperationSpec> spec) {
        CreateEntityTypeByIdChangeTagsOperationSpec r = new CreateEntityTypeByIdChangeTagsOperationSpec(spec);
        return api.createEntityTypeByIdChangeTags(r.entityType(), r.id(), r.createEntityTypeByIdChangeTagsRequest());
    }

    /**
     * Create an escalation policy
     * <p>
     * Creates a new escalation policy. At least one escalation rule must be provided.
     * Escalation policies define which user should be alerted at which time.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#escalation-policies)
     * Scoped OAuth requires: {@code escalation_policies.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>from: The email address of a valid user associated with the account making the request. This is optional, and is only used for change tracking.</li>
     *   <li>createEscalationPolicyRequest: The escalation policy to be created.</li>
     * </ul>
     */
    public CreateEscalationPolicyRequest createEscalationPolicy(Consumer<CreateEscalationPolicyOperationSpec> spec) {
        CreateEscalationPolicyOperationSpec r = new CreateEscalationPolicyOperationSpec(spec);
        return api.createEscalationPolicy(r.from(), r.createEscalationPolicyRequest());
    }

    /**
     * Create an Incident
     * <p>
     * Create an incident synchronously without a corresponding event from a monitoring service.
     * An incident represents a problem or an issue that needs to be addressed and resolved.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#incidents)
     * Scoped OAuth requires: {@code incidents.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>from: The email address of a valid user associated with the account making the request.</li>
     *   <li>createIncidentRequest: </li>
     * </ul>
     */
    public CreateIncident201Response createIncident(Consumer<CreateIncidentOperationSpec> spec) {
        CreateIncidentOperationSpec r = new CreateIncidentOperationSpec(spec);
        return api.createIncident(r.from(), r.createIncidentRequest());
    }

    /**
     * Create a note on an incident
     * <p>
     * Create a new note for the specified incident.
     * An incident represents a problem or an issue that needs to be addressed and resolved.
     * A maximum of 2000 notes can be added to an incident.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#incidents)
     * Scoped OAuth requires: {@code incidents.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>from: The email address of a valid user associated with the account making the request.</li>
     *   <li>createIncidentNoteRequest: </li>
     * </ul>
     */
    public CreateIncidentNote200Response createIncidentNote(Consumer<CreateIncidentNoteOperationSpec> spec) {
        CreateIncidentNoteOperationSpec r = new CreateIncidentNoteOperationSpec(spec);
        return api.createIncidentNote(r.id(), r.from(), r.createIncidentNoteRequest());
    }

    /**
     * Add Notification Subscribers
     * <p>
     * Subscribe the given entities to Incident Status Update Notifications.
     * Scoped OAuth requires: {@code subscribers.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>createBusinessServiceNotificationSubscribersRequest: The entities to subscribe.</li>
     * </ul>
     */
    public CreateBusinessServiceNotificationSubscribers200Response createIncidentNotificationSubscribers(Consumer<CreateIncidentNotificationSubscribersOperationSpec> spec) {
        CreateIncidentNotificationSubscribersOperationSpec r = new CreateIncidentNotificationSubscribersOperationSpec(spec);
        return api.createIncidentNotificationSubscribers(r.id(), r.createBusinessServiceNotificationSubscribersRequest());
    }

    /**
     * Create a responder request for an incident
     * <p>
     * Send a new responder request for the specified incident.
     * An incident represents a problem or an issue that needs to be addressed and resolved.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#incidents)
     * Scoped OAuth requires: {@code incidents.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>from: The email address of a valid user associated with the account making the request.</li>
     *   <li>createIncidentResponderRequestRequest: </li>
     * </ul>
     */
    public CreateIncidentResponderRequest200Response createIncidentResponderRequest(Consumer<CreateIncidentResponderRequestOperationSpec> spec) {
        CreateIncidentResponderRequestOperationSpec r = new CreateIncidentResponderRequestOperationSpec(spec);
        return api.createIncidentResponderRequest(r.id(), r.from(), r.createIncidentResponderRequestRequest());
    }

    /**
     * Snooze an incident
     * <p>
     * Snooze an incident.
     * An incident represents a problem or an issue that needs to be addressed and resolved.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#incidents)
     * Scoped OAuth requires: {@code incidents.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>from: The email address of a valid user associated with the account making the request.</li>
     *   <li>createIncidentSnoozeRequest: </li>
     * </ul>
     */
    public CreateIncident201Response createIncidentSnooze(Consumer<CreateIncidentSnoozeOperationSpec> spec) {
        CreateIncidentSnoozeOperationSpec r = new CreateIncidentSnoozeOperationSpec(spec);
        return api.createIncidentSnooze(r.id(), r.from(), r.createIncidentSnoozeRequest());
    }

    /**
     * Create a status update on an incident
     * <p>
     * Create a new status update for the specified incident. Optionally pass {@code subject} and {@code html_message} properties in the request body to override the email notification that gets sent.
     * An incident represents a problem or an issue that needs to be addressed and resolved.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#incidents)
     * Scoped OAuth requires: {@code incidents.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>from: The email address of a valid user associated with the account making the request.</li>
     *   <li>createIncidentStatusUpdateRequest: </li>
     * </ul>
     */
    public CreateIncidentStatusUpdate200Response createIncidentStatusUpdate(Consumer<CreateIncidentStatusUpdateOperationSpec> spec) {
        CreateIncidentStatusUpdateOperationSpec r = new CreateIncidentStatusUpdateOperationSpec(spec);
        return api.createIncidentStatusUpdate(r.id(), r.from(), r.createIncidentStatusUpdateRequest());
    }

    /**
     * Start an Incident Workflow Instance
     * <p>
     * Start an Instance of an Incident Workflow. Sometimes referred to as "triggering a workflow on an incident."
     * An Incident Workflow is a sequence of configurable Steps and associated Triggers that can execute automated Actions for a given Incident.
     * Scoped OAuth requires: {@code incident_workflows:instances.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>createIncidentWorkflowInstanceRequest: </li>
     * </ul>
     */
    public CreateIncidentWorkflowInstance201Response createIncidentWorkflowInstance(Consumer<CreateIncidentWorkflowInstanceOperationSpec> spec) {
        CreateIncidentWorkflowInstanceOperationSpec r = new CreateIncidentWorkflowInstanceOperationSpec(spec);
        return api.createIncidentWorkflowInstance(r.id(), r.createIncidentWorkflowInstanceRequest());
    }

    /**
     * Create a Trigger
     * <p>
     * Create new Incident Workflow Trigger
     * Scoped OAuth requires: {@code incident_workflows.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>createIncidentWorkflowTriggerRequest: </li>
     * </ul>
     */
    public CreateIncidentWorkflowTriggerRequest createIncidentWorkflowTrigger(Consumer<CreateIncidentWorkflowTriggerOperationSpec> spec) {
        CreateIncidentWorkflowTriggerOperationSpec r = new CreateIncidentWorkflowTriggerOperationSpec(spec);
        return api.createIncidentWorkflowTrigger(r.createIncidentWorkflowTriggerRequest());
    }

    /**
     * Create a maintenance window
     * <p>
     * Create a new maintenance window for the specified services. No new incidents will be created for a service that is in maintenance.
     * A Maintenance Window is used to temporarily disable one or more Services for a set period of time.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#maintenance-windows)
     * Scoped OAuth requires: {@code services.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>from: The email address of a valid user associated with the account making the request.</li>
     *   <li>createMaintenanceWindowRequest: The maintenance window object.</li>
     * </ul>
     */
    public CreateMaintenanceWindowRequest createMaintenanceWindow(Consumer<CreateMaintenanceWindowOperationSpec> spec) {
        CreateMaintenanceWindowOperationSpec r = new CreateMaintenanceWindowOperationSpec(spec);
        return api.createMaintenanceWindow(r.from(), r.createMaintenanceWindowRequest());
    }

    /**
     * Create a Response Play
     * <p>
     * Creates a new Response Plays.
     * Response Plays allow you to create packages of Incident Actions that can be applied during an Incident's life cycle.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#response-plays)
     * Scoped OAuth requires: {@code response_plays.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>from: The email address of a valid user associated with the account making the request.</li>
     *   <li>createResponsePlayRequest: The Response Play to be created.</li>
     * </ul>
     * @deprecated
     */
    @Deprecated
    public CreateResponsePlay201Response createResponsePlay(Consumer<CreateResponsePlayOperationSpec> spec) {
        CreateResponsePlayOperationSpec r = new CreateResponsePlayOperationSpec(spec);
        return api.createResponsePlay(r.from(), r.createResponsePlayRequest());
    }

    /**
     * Create a Ruleset
     * <p>
     * Create a new Ruleset. &amp;lt;!-- theme: warning --&amp;gt; &amp;gt; ### End-of-life &amp;gt; Rulesets and Event Rules will end-of-life soon. We highly recommend that you [migrate to Event Orchestration](https://support.pagerduty.com/docs/migrate-to-event-orchestration) as soon as possible so you can take advantage of the new functionality, such as improved UI, rule creation, APIs and Terraform support, advanced conditions, and rule nesting.
     * Rulesets allow you to route events to an endpoint and create collections of Event Rules, which define sets of actions to take based on event content.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#rulesets)
     * Scoped OAuth requires: {@code event_rules.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>createRulesetRequest: </li>
     * </ul>
     */
    public CreateRuleset201Response createRuleset(Consumer<CreateRulesetOperationSpec> spec) {
        CreateRulesetOperationSpec r = new CreateRulesetOperationSpec(spec);
        return api.createRuleset(r.createRulesetRequest());
    }

    /**
     * Create an Event Rule
     * <p>
     * Create a new Event Rule. &amp;lt;!-- theme: warning --&amp;gt; &amp;gt; ### End-of-life &amp;gt; Rulesets and Event Rules will end-of-life soon. We highly recommend that you [migrate to Event Orchestration](https://support.pagerduty.com/docs/migrate-to-event-orchestration) as soon as possible so you can take advantage of the new functionality, such as improved UI, rule creation, APIs and Terraform support, advanced conditions, and rule nesting.
     * Rulesets allow you to route events to an endpoint and create collections of Event Rules, which define sets of actions to take based on event content.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#rulesets)
     * Note: Create and Update on rules will accept 'description' or 'summary' interchangeably as an extraction action target. Get and List on rules will always return 'summary' as the target. If you are expecting 'description' please change your automation code to expect 'summary' instead.
     * Scoped OAuth requires: {@code event_rules.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>createRulesetEventRuleRequest: </li>
     * </ul>
     */
    public CreateRulesetEventRule201Response createRulesetEventRule(Consumer<CreateRulesetEventRuleOperationSpec> spec) {
        CreateRulesetEventRuleOperationSpec r = new CreateRulesetEventRuleOperationSpec(spec);
        return api.createRulesetEventRule(r.id(), r.createRulesetEventRuleRequest());
    }

    /**
     * Create a schedule
     * <p>
     * Create a new on-call schedule.
     * A Schedule determines the time periods that users are On-Call.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#schedules)
     * Scoped OAuth requires: {@code schedules.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>overflow: Any on-call schedule entries that pass the date range bounds will be truncated at the bounds, unless the parameter {@code overflow=true} is passed. This parameter defaults to false. For instance, if your schedule is a rotation that changes daily at midnight UTC, and your date range is from {@code 2011-06-01T10:00:00Z} to {@code 2011-06-01T14:00:00Z}:   - If you don't pass the {@code overflow=true} parameter, you will get one schedule entry returned with a start of {@code 2011-06-01T10:00:00Z} and end of {@code 2011-06-01T14:00:00Z}. - If you do pass the {@code overflow=true} parameter, you will get one schedule entry returned with a start of {@code 2011-06-01T00:00:00Z} and end of {@code 2011-06-02T00:00:00Z}. </li>
     *   <li>createScheduleRequest: The schedule to be created.</li>
     * </ul>
     */
    public CreateScheduleRequest createSchedule(Consumer<CreateScheduleOperationSpec> spec) {
        CreateScheduleOperationSpec r = new CreateScheduleOperationSpec(spec);
        return api.createSchedule(r.overflow(), r.createScheduleRequest());
    }

    /**
     * Create one or more overrides
     * <p>
     * Create one or more overrides, each for a specific user covering a specified time range. If you create an override on top of an existing override, the last created override will have priority.
     * A Schedule determines the time periods that users are On-Call.
     * Note: An older implementation of this endpoint only supported creating a single ocverride per request. That functionality is still supported, but deprecated and may be removed in the future.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#schedules)
     * Scoped OAuth requires: {@code schedules.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>createScheduleOverrideRequest: The overrides to be created</li>
     * </ul>
     */
    public Set<CreateScheduleOverride201ResponseInner> createScheduleOverride(Consumer<CreateScheduleOverrideOperationSpec> spec) {
        CreateScheduleOverrideOperationSpec r = new CreateScheduleOverrideOperationSpec(spec);
        return api.createScheduleOverride(r.id(), r.createScheduleOverrideRequest());
    }

    /**
     * Preview a schedule
     * <p>
     * Preview what an on-call schedule would look like without saving it.
     * A Schedule determines the time periods that users are On-Call.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#schedules)
     * Scoped OAuth requires: {@code schedules.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>since: The start of the date range over which you want to search.</li>
     *   <li>until: The end of the date range over which you want to search.</li>
     *   <li>overflow: Any on-call schedule entries that pass the date range bounds will be truncated at the bounds, unless the parameter {@code overflow=true} is passed. This parameter defaults to false. For instance, if your schedule is a rotation that changes daily at midnight UTC, and your date range is from {@code 2011-06-01T10:00:00Z} to {@code 2011-06-01T14:00:00Z}:   - If you don't pass the {@code overflow=true} parameter, you will get one schedule entry returned with a start of {@code 2011-06-01T10:00:00Z} and end of {@code 2011-06-01T14:00:00Z}. - If you do pass the {@code overflow=true} parameter, you will get one schedule entry returned with a start of {@code 2011-06-01T00:00:00Z} and end of {@code 2011-06-02T00:00:00Z}. </li>
     *   <li>createScheduleRequest: The schedule to be previewed.</li>
     * </ul>
     */
    public CreateScheduleRequest createSchedulePreview(Consumer<CreateSchedulePreviewOperationSpec> spec) {
        CreateSchedulePreviewOperationSpec r = new CreateSchedulePreviewOperationSpec(spec);
        return api.createSchedulePreview(r.since(), r.until(), r.overflow(), r.createScheduleRequest());
    }

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
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>createServiceRequest: The service to be created</li>
     * </ul>
     */
    public CreateServiceRequest createService(Consumer<CreateServiceOperationSpec> spec) {
        CreateServiceOperationSpec r = new CreateServiceOperationSpec(spec);
        return api.createService(r.createServiceRequest());
    }

    /**
     * Associate service dependencies
     * <p>
     * Create new dependencies between two services.
     * Business services model capabilities that span multiple technical services and that may be owned by several different teams.
     * A service can have a maximum of 2,000 dependencies with a depth limit of 100. If the limit is reached, the API will respond with an error.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#business-services)
     * Scoped OAuth requires: {@code services.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>createServiceDependencyRequest: </li>
     * </ul>
     */
    public CreateServiceDependency200Response createServiceDependency(Consumer<CreateServiceDependencyOperationSpec> spec) {
        CreateServiceDependencyOperationSpec r = new CreateServiceDependencyOperationSpec(spec);
        return api.createServiceDependency(r.createServiceDependencyRequest());
    }

    /**
     * Create an Event Rule on a Service
     * <p>
     * Create a new Event Rule on a Service. &amp;lt;!-- theme: warning --&amp;gt; &amp;gt; ### End-of-life &amp;gt; Rulesets and Event Rules will end-of-life soon. We highly recommend that you [migrate to Event Orchestration](https://support.pagerduty.com/docs/migrate-to-event-orchestration) as soon as possible so you can take advantage of the new functionality, such as improved UI, rule creation, APIs and Terraform support, advanced conditions, and rule nesting.
     * Scoped OAuth requires: {@code services.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>createServiceEventRuleRequest: </li>
     * </ul>
     */
    public CreateServiceEventRule201Response createServiceEventRule(Consumer<CreateServiceEventRuleOperationSpec> spec) {
        CreateServiceEventRuleOperationSpec r = new CreateServiceEventRuleOperationSpec(spec);
        return api.createServiceEventRule(r.id(), r.createServiceEventRuleRequest());
    }

    /**
     * Create a new integration
     * <p>
     * Create a new integration belonging to a Service.
     * A service may represent an application, component, or team you wish to open incidents against.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#services)
     * Scoped OAuth requires: {@code services.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>createServiceIntegrationRequest: The integration to be created</li>
     * </ul>
     */
    public CreateServiceIntegrationRequest createServiceIntegration(Consumer<CreateServiceIntegrationOperationSpec> spec) {
        CreateServiceIntegrationOperationSpec r = new CreateServiceIntegrationOperationSpec(spec);
        return api.createServiceIntegration(r.id(), r.createServiceIntegrationRequest());
    }

    /**
     * Create a tag
     * <p>
     * Create a Tag.
     * A Tag is applied to Escalation Policies, Teams or Users and can be used to filter them.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#tags)
     * Scoped OAuth requires: {@code tags.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>createTagsRequest: </li>
     * </ul>
     */
    public CreateTagsRequest createTags(Consumer<CreateTagsOperationSpec> spec) {
        CreateTagsOperationSpec r = new CreateTagsOperationSpec(spec);
        return api.createTags(r.createTagsRequest());
    }

    /**
     * Create a team
     * <p>
     * Create a new Team.
     * A team is a collection of Users and Escalation Policies that represent a group of people within an organization.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#teams)
     * Scoped OAuth requires: {@code teams.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>createTeamRequest: The team to be created.</li>
     * </ul>
     */
    public CreateTeamRequest createTeam(Consumer<CreateTeamOperationSpec> spec) {
        CreateTeamOperationSpec r = new CreateTeamOperationSpec(spec);
        return api.createTeam(r.createTeamRequest());
    }

    /**
     * Create Team Notification Subscriptions
     * <p>
     * Create new Notification Subscriptions for the given Team.
     * Scoped OAuth requires: {@code subscribers.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>createTeamNotificationSubscriptionsRequest: The entities to subscribe to.</li>
     * </ul>
     */
    public CreateBusinessServiceNotificationSubscribers200Response createTeamNotificationSubscriptions(Consumer<CreateTeamNotificationSubscriptionsOperationSpec> spec) {
        CreateTeamNotificationSubscriptionsOperationSpec r = new CreateTeamNotificationSubscriptionsOperationSpec(spec);
        return api.createTeamNotificationSubscriptions(r.id(), r.createTeamNotificationSubscriptionsRequest());
    }

    /**
     * Create a template
     * <p>
     * Create a new template
     * Scoped OAuth requires: {@code templates.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>createTemplateRequest: </li>
     * </ul>
     */
    public CreateTemplate201Response createTemplate(Consumer<CreateTemplateOperationSpec> spec) {
        CreateTemplateOperationSpec r = new CreateTemplateOperationSpec(spec);
        return api.createTemplate(r.createTemplateRequest());
    }

    /**
     * Create a user
     * <p>
     * Create a new user.
     * Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>from: The email address of a valid user associated with the account making the request.</li>
     *   <li>createUserRequest: The user to be created.</li>
     * </ul>
     */
    public CreateUserRequest createUser(Consumer<CreateUserOperationSpec> spec) {
        CreateUserOperationSpec r = new CreateUserOperationSpec(spec);
        return api.createUser(r.from(), r.createUserRequest());
    }

    /**
     * Create a user contact method
     * <p>
     * Create a new contact method for the User.
     * Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users:contact_methods.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>createUserContactMethodRequest: The contact method to be created.</li>
     * </ul>
     */
    public CreateUserContactMethod201Response createUserContactMethod(Consumer<CreateUserContactMethodOperationSpec> spec) {
        CreateUserContactMethodOperationSpec r = new CreateUserContactMethodOperationSpec(spec);
        return api.createUserContactMethod(r.id(), r.createUserContactMethodRequest());
    }

    /**
     * Create a User Handoff Notification Rule
     * <p>
     * Create a new Handoff Notification Rule. Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account. For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>createUserHandoffNotificationRuleRequest: The Handoff Notification Rule to be created.</li>
     * </ul>
     */
    public CreateUserHandoffNotificationRuleRequest createUserHandoffNotificationRule(Consumer<CreateUserHandoffNotificationRuleOperationSpec> spec) {
        CreateUserHandoffNotificationRuleOperationSpec r = new CreateUserHandoffNotificationRuleOperationSpec(spec);
        return api.createUserHandoffNotificationRule(r.id(), r.createUserHandoffNotificationRuleRequest());
    }

    /**
     * Create a user notification rule
     * <p>
     * Create a new notification rule.
     * Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users:contact_methods.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>createUserNotificationRuleRequest: The notification rule to be created.</li>
     * </ul>
     */
    public CreateUserNotificationRuleRequest createUserNotificationRule(Consumer<CreateUserNotificationRuleOperationSpec> spec) {
        CreateUserNotificationRuleOperationSpec r = new CreateUserNotificationRuleOperationSpec(spec);
        return api.createUserNotificationRule(r.id(), r.createUserNotificationRuleRequest());
    }

    /**
     * Create Notification Subcriptions
     * <p>
     * Create new Notification Subscriptions for the given User.
     * Scoped OAuth requires: {@code subscribers.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>createTeamNotificationSubscriptionsRequest: The entities to subscribe to.</li>
     * </ul>
     */
    public CreateBusinessServiceNotificationSubscribers200Response createUserNotificationSubscriptions(Consumer<CreateUserNotificationSubscriptionsOperationSpec> spec) {
        CreateUserNotificationSubscriptionsOperationSpec r = new CreateUserNotificationSubscriptionsOperationSpec(spec);
        return api.createUserNotificationSubscriptions(r.id(), r.createTeamNotificationSubscriptionsRequest());
    }

    /**
     * Create a user status update notification rule
     * <p>
     * Create a new status update notification rule.
     * Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account.
     * &amp;lt;!-- theme: warning --&amp;gt; &amp;gt; ### Early Access &amp;gt; This endpoint is in Early Access and may change at any time. You must pass in the X-EARLY-ACCESS header to access it.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>createUserStatusUpdateNotificationRuleRequest: The status update notification rule to be created.</li>
     * </ul>
     */
    public CreateUserStatusUpdateNotificationRule201Response createUserStatusUpdateNotificationRule(Consumer<CreateUserStatusUpdateNotificationRuleOperationSpec> spec) {
        CreateUserStatusUpdateNotificationRuleOperationSpec r = new CreateUserStatusUpdateNotificationRuleOperationSpec(spec);
        return api.createUserStatusUpdateNotificationRule(r.id(), r.createUserStatusUpdateNotificationRuleRequest());
    }

    /**
     * Create a webhook subscription
     * <p>
     * Creates a new webhook subscription.
     * For more information on webhook subscriptions and how they are used to configure v3 webhooks see the [Webhooks v3 Developer Documentation](https://developer.pagerduty.com/docs/webhooks/v3-overview/). 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>createWebhookSubscriptionRequest: </li>
     * </ul>
     */
    public CreateWebhookSubscriptionRequest createWebhookSubscription(Consumer<CreateWebhookSubscriptionOperationSpec> spec) {
        CreateWebhookSubscriptionOperationSpec r = new CreateWebhookSubscriptionOperationSpec(spec);
        return api.createWebhookSubscription(r.createWebhookSubscriptionRequest());
    }

    /**
     * Delete an Add-on
     * <p>
     * Remove an existing Add-on.
     * Addon's are pieces of functionality that developers can write to insert new functionality into PagerDuty's UI.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#add-ons)
     * Scoped OAuth requires: {@code addons.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public void deleteAddon(Consumer<DeleteAddonOperationSpec> spec) {
        DeleteAddonOperationSpec r = new DeleteAddonOperationSpec(spec);
        api.deleteAddon(r.id());
    }

    /**
     * Delete an Automation Action
     * <p>
     * Delete an Automation Action 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public void deleteAutomationAction(Consumer<DeleteAutomationActionOperationSpec> spec) {
        DeleteAutomationActionOperationSpec r = new DeleteAutomationActionOperationSpec(spec);
        api.deleteAutomationAction(r.id());
    }

    /**
     * Disassociate an Automation Action from a service
     * <p>
     * Disassociate an Automation Action from a service 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>serviceId: The service ID</li>
     * </ul>
     */
    public void deleteAutomationActionServiceAssociation(Consumer<DeleteAutomationActionServiceAssociationOperationSpec> spec) {
        DeleteAutomationActionServiceAssociationOperationSpec r = new DeleteAutomationActionServiceAssociationOperationSpec(spec);
        api.deleteAutomationActionServiceAssociation(r.id(), r.serviceId());
    }

    /**
     * Disassociate an Automation Action from a team
     * <p>
     * Disassociate an Automation Action from a team 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>teamId: The team ID</li>
     * </ul>
     */
    public void deleteAutomationActionTeamAssociation(Consumer<DeleteAutomationActionTeamAssociationOperationSpec> spec) {
        DeleteAutomationActionTeamAssociationOperationSpec r = new DeleteAutomationActionTeamAssociationOperationSpec(spec);
        api.deleteAutomationActionTeamAssociation(r.id(), r.teamId());
    }

    /**
     * Delete an Automation Action runner
     * <p>
     * Delete an Automation Action runner 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public void deleteAutomationActionsRunner(Consumer<DeleteAutomationActionsRunnerOperationSpec> spec) {
        DeleteAutomationActionsRunnerOperationSpec r = new DeleteAutomationActionsRunnerOperationSpec(spec);
        api.deleteAutomationActionsRunner(r.id());
    }

    /**
     * Disassociate a runner from a team
     * <p>
     * Disassociates a runner from a team 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>teamId: The team ID</li>
     * </ul>
     */
    public void deleteAutomationActionsRunnerTeamAssociation(Consumer<DeleteAutomationActionsRunnerTeamAssociationOperationSpec> spec) {
        DeleteAutomationActionsRunnerTeamAssociationOperationSpec r = new DeleteAutomationActionsRunnerTeamAssociationOperationSpec(spec);
        api.deleteAutomationActionsRunnerTeamAssociation(r.id(), r.teamId());
    }

    /**
     * Delete a Business Service
     * <p>
     * Delete an existing Business Service.
     * Once the service is deleted, it will not be accessible from the web UI and new incidents won't be able to be created for this service.
     * Business services model capabilities that span multiple technical services and that may be owned by several different teams.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#business-services)
     * Scoped OAuth requires: {@code services.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public void deleteBusinessService(Consumer<DeleteBusinessServiceOperationSpec> spec) {
        DeleteBusinessServiceOperationSpec r = new DeleteBusinessServiceOperationSpec(spec);
        api.deleteBusinessService(r.id());
    }

    /**
     * Deletes the account-level priority threshold for Business Service impact
     * <p>
     * Clears the Priority Threshold for the account.
     * If the priority threshold is cleared, any Incident with a Priority set will be able to impact Business Services. Scoped OAuth requires: {@code services.write} 
     */
    public void deleteBusinessServicePriorityThresholds() {
        api.deleteBusinessServicePriorityThresholds();
    }

    /**
     * Delete a Field
     * <p>
     * Delete a Field. Fields may not be deleted if they are used by a Field Schema.
     * Scoped OAuth requires: {@code custom_fields.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>fieldId: The ID of the field.</li>
     * </ul>
     */
    public void deleteCustomFieldsField(Consumer<DeleteCustomFieldsFieldOperationSpec> spec) {
        DeleteCustomFieldsFieldOperationSpec r = new DeleteCustomFieldsFieldOperationSpec(spec);
        api.deleteCustomFieldsField(r.fieldId());
    }

    /**
     * Delete a Field Option
     * <p>
     * Delete a Field Option.
     * Scoped OAuth requires: {@code custom_fields.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>fieldId: The ID of the field.</li>
     *   <li>fieldOptionId: The ID of the field option.</li>
     * </ul>
     */
    public void deleteCustomFieldsFieldOption(Consumer<DeleteCustomFieldsFieldOptionOperationSpec> spec) {
        DeleteCustomFieldsFieldOptionOperationSpec r = new DeleteCustomFieldsFieldOptionOperationSpec(spec);
        api.deleteCustomFieldsFieldOption(r.fieldId(), r.fieldOptionId());
    }

    /**
     * Delete an escalation policy
     * <p>
     * Deletes an existing escalation policy and rules. The escalation policy must not be in use by any services.
     * Escalation policies define which user should be alerted at which time.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#escalation-policies)
     * Scoped OAuth requires: {@code escalation_policies.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public void deleteEscalationPolicy(Consumer<DeleteEscalationPolicyOperationSpec> spec) {
        DeleteEscalationPolicyOperationSpec r = new DeleteEscalationPolicyOperationSpec(spec);
        api.deleteEscalationPolicy(r.id());
    }

    /**
     * Delete an extension
     * <p>
     * Delete an existing extension.
     * Once the extension is deleted, it will not be accessible from the web UI and new incidents won't be able to be created for this extension.
     * Extensions are representations of Extension Schema objects that are attached to Services.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#extensions)
     * Scoped OAuth requires: {@code extensions.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public void deleteExtension(Consumer<DeleteExtensionOperationSpec> spec) {
        DeleteExtensionOperationSpec r = new DeleteExtensionOperationSpec(spec);
        api.deleteExtension(r.id());
    }

    /**
     * Delete an Incident Workflow
     * <p>
     * Delete an existing Incident Workflow
     * An Incident Workflow is a sequence of configurable Steps and associated Triggers that can execute automated Actions for a given Incident.
     * Scoped OAuth requires: {@code incident_workflows.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public void deleteIncidentWorkflow(Consumer<DeleteIncidentWorkflowOperationSpec> spec) {
        DeleteIncidentWorkflowOperationSpec r = new DeleteIncidentWorkflowOperationSpec(spec);
        api.deleteIncidentWorkflow(r.id());
    }

    /**
     * Delete a Trigger
     * <p>
     * Delete an existing Incident Workflow Trigger
     * Scoped OAuth requires: {@code incident_workflows.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public void deleteIncidentWorkflowTrigger(Consumer<DeleteIncidentWorkflowTriggerOperationSpec> spec) {
        DeleteIncidentWorkflowTriggerOperationSpec r = new DeleteIncidentWorkflowTriggerOperationSpec(spec);
        api.deleteIncidentWorkflowTrigger(r.id());
    }

    /**
     * Delete or end a maintenance window
     * <p>
     * Delete an existing maintenance window if it's in the future, or end it if it's currently on-going. If the maintenance window has already ended it cannot be deleted.
     * A Maintenance Window is used to temporarily disable one or more Services for a set period of time.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#maintenance-windows)
     * Scoped OAuth requires: {@code services.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public void deleteMaintenanceWindow(Consumer<DeleteMaintenanceWindowOperationSpec> spec) {
        DeleteMaintenanceWindowOperationSpec r = new DeleteMaintenanceWindowOperationSpec(spec);
        api.deleteMaintenanceWindow(r.id());
    }

    /**
     * Delete an Orchestration
     * <p>
     * Delete a Global Event Orchestration.
     * Once deleted, you will no longer be able to ingest events into PagerDuty using this Orchestration's Routing Key.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#event-orchestrations)
     * Scoped OAuth requires: {@code event_orchestrations.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of an Event Orchestration.</li>
     * </ul>
     */
    public void deleteOrchestration(Consumer<DeleteOrchestrationOperationSpec> spec) {
        DeleteOrchestrationOperationSpec r = new DeleteOrchestrationOperationSpec(spec);
        api.deleteOrchestration(r.id());
    }

    /**
     * Delete an Integration for an Event Orchestration
     * <p>
     * Delete an Integration and its associated Routing Key.
     * Once deleted, PagerDuty will drop all future events sent to PagerDuty using the Routing Key.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#event-orchestrations)
     * Scoped OAuth requires: {@code event_orchestrations.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of an Event Orchestration.</li>
     *   <li>integrationId: The ID of an Integration.</li>
     * </ul>
     */
    public void deleteOrchestrationIntegration(Consumer<DeleteOrchestrationIntegrationOperationSpec> spec) {
        DeleteOrchestrationIntegrationOperationSpec r = new DeleteOrchestrationIntegrationOperationSpec(spec);
        api.deleteOrchestrationIntegration(r.id(), r.integrationId());
    }

    /**
     * Delete a Response Play
     * <p>
     * Delete an existing Response Play. Once the Response Play is deleted, the action cannot be undone.
     * WARNING: When the Response Play is deleted, it is also removed from any Services that were using it.
     * Response Plays allow you to create packages of Incident Actions that can be applied to an Incident.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#response-plays)
     * Scoped OAuth requires: {@code response_plays.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>from: The email address of a valid user associated with the account making the request.</li>
     * </ul>
     * @deprecated
     */
    @Deprecated
    public void deleteResponsePlay(Consumer<DeleteResponsePlayOperationSpec> spec) {
        DeleteResponsePlayOperationSpec r = new DeleteResponsePlayOperationSpec(spec);
        api.deleteResponsePlay(r.id(), r.from());
    }

    /**
     * Delete a Ruleset
     * <p>
     * Delete a Ruleset. &amp;lt;!-- theme: warning --&amp;gt; &amp;gt; ### End-of-life &amp;gt; Rulesets and Event Rules will end-of-life soon. We highly recommend that you [migrate to Event Orchestration](https://support.pagerduty.com/docs/migrate-to-event-orchestration) as soon as possible so you can take advantage of the new functionality, such as improved UI, rule creation, APIs and Terraform support, advanced conditions, and rule nesting.
     * Rulesets allow you to route events to an endpoint and create collections of Event Rules, which define sets of actions to take based on event content.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#rulesets)
     * Scoped OAuth requires: {@code event_rules.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public void deleteRuleset(Consumer<DeleteRulesetOperationSpec> spec) {
        DeleteRulesetOperationSpec r = new DeleteRulesetOperationSpec(spec);
        api.deleteRuleset(r.id());
    }

    /**
     * Delete an Event Rule
     * <p>
     * Delete an Event Rule. &amp;lt;!-- theme: warning --&amp;gt; &amp;gt; ### End-of-life &amp;gt; Rulesets and Event Rules will end-of-life soon. We highly recommend that you [migrate to Event Orchestration](https://support.pagerduty.com/docs/migrate-to-event-orchestration) as soon as possible so you can take advantage of the new functionality, such as improved UI, rule creation, APIs and Terraform support, advanced conditions, and rule nesting.
     * Rulesets allow you to route events to an endpoint and create collections of Event Rules, which define sets of actions to take based on event content.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#rulesets)
     * Scoped OAuth requires: {@code event_rules.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>ruleId: The id of the Event Rule to retrieve.</li>
     * </ul>
     */
    public void deleteRulesetEventRule(Consumer<DeleteRulesetEventRuleOperationSpec> spec) {
        DeleteRulesetEventRuleOperationSpec r = new DeleteRulesetEventRuleOperationSpec(spec);
        api.deleteRulesetEventRule(r.id(), r.ruleId());
    }

    /**
     * Delete a schedule
     * <p>
     * Delete an on-call schedule.
     * A Schedule determines the time periods that users are On-Call.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#schedules)
     * Scoped OAuth requires: {@code schedules.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public void deleteSchedule(Consumer<DeleteScheduleOperationSpec> spec) {
        DeleteScheduleOperationSpec r = new DeleteScheduleOperationSpec(spec);
        api.deleteSchedule(r.id());
    }

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
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>overrideId: The override ID on the schedule.</li>
     * </ul>
     */
    public void deleteScheduleOverride(Consumer<DeleteScheduleOverrideOperationSpec> spec) {
        DeleteScheduleOverrideOperationSpec r = new DeleteScheduleOverrideOperationSpec(spec);
        api.deleteScheduleOverride(r.id(), r.overrideId());
    }

    /**
     * Delete a service
     * <p>
     * Delete an existing service.
     * Once the service is deleted, it will not be accessible from the web UI and new incidents won't be able to be created for this service.
     * A service may represent an application, component, or team you wish to open incidents against.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#services)
     * Scoped OAuth requires: {@code services.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public void deleteService(Consumer<DeleteServiceOperationSpec> spec) {
        DeleteServiceOperationSpec r = new DeleteServiceOperationSpec(spec);
        api.deleteService(r.id());
    }

    /**
     * Disassociate service dependencies
     * <p>
     * Disassociate dependencies between two services.
     * Business services model capabilities that span multiple technical services and that may be owned by several different teams.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#business-services)
     * Scoped OAuth requires: {@code services.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>deleteServiceDependencyRequest: </li>
     * </ul>
     */
    public CreateServiceDependency200Response deleteServiceDependency(Consumer<DeleteServiceDependencyOperationSpec> spec) {
        DeleteServiceDependencyOperationSpec r = new DeleteServiceDependencyOperationSpec(spec);
        return api.deleteServiceDependency(r.deleteServiceDependencyRequest());
    }

    /**
     * Delete an Event Rule from a Service
     * <p>
     * Delete an Event Rule from a Service. &amp;lt;!-- theme: warning --&amp;gt; &amp;gt; ### End-of-life &amp;gt; Rulesets and Event Rules will end-of-life soon. We highly recommend that you [migrate to Event Orchestration](https://support.pagerduty.com/docs/migrate-to-event-orchestration) as soon as possible so you can take advantage of the new functionality, such as improved UI, rule creation, APIs and Terraform support, advanced conditions, and rule nesting.
     * Scoped OAuth requires: {@code services.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>ruleId: The id of the Event Rule to retrieve.</li>
     * </ul>
     */
    public void deleteServiceEventRule(Consumer<DeleteServiceEventRuleOperationSpec> spec) {
        DeleteServiceEventRuleOperationSpec r = new DeleteServiceEventRuleOperationSpec(spec);
        api.deleteServiceEventRule(r.id(), r.ruleId());
    }

    /**
     * Dissociate a Trigger and Service
     * <p>
     * Remove a an existing Service from an Incident Workflow Trigger
     * Scoped OAuth requires: {@code incident_workflows.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>triggerId: Identifier for the Trigger</li>
     *   <li>serviceId: Identifier for the Service</li>
     * </ul>
     */
    public CreateIncidentWorkflowTriggerRequest deleteServiceFromIncidentWorkflowTrigger(Consumer<DeleteServiceFromIncidentWorkflowTriggerOperationSpec> spec) {
        DeleteServiceFromIncidentWorkflowTriggerOperationSpec r = new DeleteServiceFromIncidentWorkflowTriggerOperationSpec(spec);
        return api.deleteServiceFromIncidentWorkflowTrigger(r.triggerId(), r.serviceId());
    }

    /**
     * Delete a tag
     * <p>
     * Remove an existing Tag.
     * A Tag is applied to Escalation Policies, Teams or Users and can be used to filter them.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#tags)
     * Scoped OAuth requires: {@code tags.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public void deleteTag(Consumer<DeleteTagOperationSpec> spec) {
        DeleteTagOperationSpec r = new DeleteTagOperationSpec(spec);
        api.deleteTag(r.id());
    }

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
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>reassignmentTeam: Team to reassign unresolved incident to. If an unresolved incident exists on both the reassignment team and the team being deleted, a duplicate will not be made. If not supplied, unresolved incidents will be made account-level. </li>
     * </ul>
     */
    public void deleteTeam(Consumer<DeleteTeamOperationSpec> spec) {
        DeleteTeamOperationSpec r = new DeleteTeamOperationSpec(spec);
        api.deleteTeam(r.id(), r.reassignmentTeam());
    }

    /**
     * Remove an escalation policy from a team
     * <p>
     * Remove an escalation policy from a team.
     * A team is a collection of Users and Escalation Policies that represent a group of people within an organization.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#teams)
     * Scoped OAuth requires: {@code teams.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>escalationPolicyId: The escalation policy ID on the team.</li>
     * </ul>
     */
    public void deleteTeamEscalationPolicy(Consumer<DeleteTeamEscalationPolicyOperationSpec> spec) {
        DeleteTeamEscalationPolicyOperationSpec r = new DeleteTeamEscalationPolicyOperationSpec(spec);
        api.deleteTeamEscalationPolicy(r.id(), r.escalationPolicyId());
    }

    /**
     * Remove a user from a team
     * <p>
     * Remove a user from a team.
     * A team is a collection of Users and Escalation Policies that represent a group of people within an organization.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#teams)
     * Scoped OAuth requires: {@code teams.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>userId: The user ID on the team.</li>
     * </ul>
     */
    public void deleteTeamUser(Consumer<DeleteTeamUserOperationSpec> spec) {
        DeleteTeamUserOperationSpec r = new DeleteTeamUserOperationSpec(spec);
        api.deleteTeamUser(r.id(), r.userId());
    }

    /**
     * Delete a template
     * <p>
     * Delete a specific of templates on the account
     * Scoped OAuth requires: {@code templates.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public void deleteTemplate(Consumer<DeleteTemplateOperationSpec> spec) {
        DeleteTemplateOperationSpec r = new DeleteTemplateOperationSpec(spec);
        api.deleteTemplate(r.id());
    }

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
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public void deleteUser(Consumer<DeleteUserOperationSpec> spec) {
        DeleteUserOperationSpec r = new DeleteUserOperationSpec(spec);
        api.deleteUser(r.id());
    }

    /**
     * Delete a user's contact method
     * <p>
     * Remove a user's contact method.
     * Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users:contact_methods.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>contactMethodId: The contact method ID on the user.</li>
     * </ul>
     */
    public void deleteUserContactMethod(Consumer<DeleteUserContactMethodOperationSpec> spec) {
        DeleteUserContactMethodOperationSpec r = new DeleteUserContactMethodOperationSpec(spec);
        api.deleteUserContactMethod(r.id(), r.contactMethodId());
    }

    /**
     * Delete a User's Handoff Notification rule
     * <p>
     * Remove a User's Handoff Notification Rule. Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account. For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>oncallHandoffNotificationRuleId: The oncall handoff notification rule ID on the user.</li>
     * </ul>
     */
    public void deleteUserHandoffNotificationRule(Consumer<DeleteUserHandoffNotificationRuleOperationSpec> spec) {
        DeleteUserHandoffNotificationRuleOperationSpec r = new DeleteUserHandoffNotificationRuleOperationSpec(spec);
        api.deleteUserHandoffNotificationRule(r.id(), r.oncallHandoffNotificationRuleId());
    }

    /**
     * Delete a user's notification rule
     * <p>
     * Remove a user's notification rule.
     * Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users:contact_methods.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>notificationRuleId: The notification rule ID on the user.</li>
     * </ul>
     */
    public void deleteUserNotificationRule(Consumer<DeleteUserNotificationRuleOperationSpec> spec) {
        DeleteUserNotificationRuleOperationSpec r = new DeleteUserNotificationRuleOperationSpec(spec);
        api.deleteUserNotificationRule(r.id(), r.notificationRuleId());
    }

    /**
     * Delete a user's session
     * <p>
     * Delete a user's session.
     * Beginning November 2021, user sessions no longer includes newly issued OAuth tokens.
     * Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users:sessions.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>type: The session type for the user session ID.</li>
     *   <li>sessionId: The session ID for the user.</li>
     * </ul>
     */
    public void deleteUserSession(Consumer<DeleteUserSessionOperationSpec> spec) {
        DeleteUserSessionOperationSpec r = new DeleteUserSessionOperationSpec(spec);
        api.deleteUserSession(r.id(), r.type(), r.sessionId());
    }

    /**
     * Delete all user sessions
     * <p>
     * Delete all user sessions.
     * Beginning November 2021, user sessions no longer includes newly issued OAuth tokens.
     * Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users:sessions.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public void deleteUserSessions(Consumer<DeleteUserSessionsOperationSpec> spec) {
        DeleteUserSessionsOperationSpec r = new DeleteUserSessionsOperationSpec(spec);
        api.deleteUserSessions(r.id());
    }

    /**
     * Delete a user's status update notification rule
     * <p>
     * Remove a user's status update notification rule.
     * Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account.
     * &amp;lt;!-- theme: warning --&amp;gt; &amp;gt; ### Early Access &amp;gt; This endpoint is in Early Access and may change at any time. You must pass in the X-EARLY-ACCESS header to access it.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>statusUpdateNotificationRuleId: The status update notification rule ID on the user.</li>
     * </ul>
     */
    public void deleteUserStatusUpdateNotificationRule(Consumer<DeleteUserStatusUpdateNotificationRuleOperationSpec> spec) {
        DeleteUserStatusUpdateNotificationRuleOperationSpec r = new DeleteUserStatusUpdateNotificationRuleOperationSpec(spec);
        api.deleteUserStatusUpdateNotificationRule(r.id(), r.statusUpdateNotificationRuleId());
    }

    /**
     * Delete a webhook subscription
     * <p>
     * Deletes a webhook subscription. 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public void deleteWebhookSubscription(Consumer<DeleteWebhookSubscriptionOperationSpec> spec) {
        DeleteWebhookSubscriptionOperationSpec r = new DeleteWebhookSubscriptionOperationSpec(spec);
        api.deleteWebhookSubscription(r.id());
    }

    /**
     * Enable an extension
     * <p>
     * Enable an extension that is temporarily disabled. (This API does not require a request body.)
     * Extensions are representations of Extension Schema objects that are attached to Services.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#extensions)
     * Scoped OAuth requires: {@code extensions.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public GetExtension200Response enableExtension(Consumer<EnableExtensionOperationSpec> spec) {
        EnableExtensionOperationSpec r = new EnableExtensionOperationSpec(spec);
        return api.enableExtension(r.id());
    }

    /**
     * Enable a webhook subscription
     * <p>
     * Enable a webhook subscription that is temporarily disabled. (This API does not require a request body.)
     * Webhook subscriptions can become temporarily disabled when the subscription's delivery method is repeatedly rejected by the server. 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public CreateWebhookSubscriptionRequest enableWebhookSubscription(Consumer<EnableWebhookSubscriptionOperationSpec> spec) {
        EnableWebhookSubscriptionOperationSpec r = new EnableWebhookSubscriptionOperationSpec(spec);
        return api.enableWebhookSubscription(r.id());
    }

    /**
     * Test an ability
     * <p>
     * Test whether your account has a given ability.
     * "Abilities" describes your account's capabilities by feature name. For example {@code "teams"}.
     * An ability may be available to your account based on things like your pricing plan or account state.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#abilities)
     * Scoped OAuth requires: {@code abilities.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public void getAbility(Consumer<GetAbilityOperationSpec> spec) {
        GetAbilityOperationSpec r = new GetAbilityOperationSpec(spec);
        api.getAbility(r.id());
    }

    /**
     * Get an Add-on
     * <p>
     * Get details about an existing Add-on.
     * Addon's are pieces of functionality that developers can write to insert new functionality into PagerDuty's UI.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#add-ons)
     * Scoped OAuth requires: {@code addons.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public CreateAddonRequest getAddon(Consumer<GetAddonOperationSpec> spec) {
        GetAddonOperationSpec r = new GetAddonOperationSpec(spec);
        return api.getAddon(r.id());
    }

    /**
     * List Automation Actions
     * <p>
     * Lists Automation Actions matching provided query params.
     * The returned records are sorted by action name in alphabetical order.
     * See [{@code Cursor-based pagination}](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for instructions on how to paginate through the result set. 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>limit: The minimum of the {@code limit} parameter used in the request or the maximum request size of the API.</li>
     *   <li>cursor: Optional parameter used to request the "next" set of results from an API.  The value provided here is most commonly obtained from the {@code next_cursor} field of the previous request.  When no value is provided, the request starts at the beginning of the result set. </li>
     *   <li>name: Filters results to include the ones matching the name (case insensitive substring matching)</li>
     *   <li>runnerId: Filters results to include the ones linked to the specified runner. Specifying the value {@code any} filters results to include the ones linked to runners only, thus omitting the results not linked to runners. </li>
     *   <li>classification: Filters results to include the ones matching the specified classification (aka category)</li>
     *   <li>teamId: Filters results to include the ones associated with the specified team.</li>
     *   <li>serviceId: Filters results to include the ones associated with the specified service</li>
     *   <li>actionType: Filters results to include the ones matching the specified action type</li>
     * </ul>
     */
    public GetAllAutomationActions200Response getAllAutomationActions(Consumer<GetAllAutomationActionsOperationSpec> spec) {
        GetAllAutomationActionsOperationSpec r = new GetAllAutomationActionsOperationSpec(spec);
        return api.getAllAutomationActions(r.limit(), r.cursor(), r.name(), r.runnerId(), r.classification(), r.teamId(), r.serviceId(), r.actionType());
    }

    /**
     * Get raw responses from a single incident
     * <p>
     * Provides enriched responder data for a single incident.
     * Example metrics include Time to Respond, Responder Type, and Response Status. See metric definitions below.
     * &amp;lt;!-- theme: info --&amp;gt; &amp;gt; **Note:** Analytics data is updated once per day. It takes up to 24 hours before new incident responses appear in the Analytics API. Scoped OAuth requires: {@code analytics.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>getAnalyticsIncidentResponsesByIdRequest: Parameters to apply to the dataset.</li>
     * </ul>
     */
    public GetAnalyticsIncidentResponsesById200Response getAnalyticsIncidentResponsesById(Consumer<GetAnalyticsIncidentResponsesByIdOperationSpec> spec) {
        GetAnalyticsIncidentResponsesByIdOperationSpec r = new GetAnalyticsIncidentResponsesByIdOperationSpec(spec);
        return api.getAnalyticsIncidentResponsesById(r.id(), r.getAnalyticsIncidentResponsesByIdRequest());
    }

    /**
     * Get raw data - multiple incidents
     * <p>
     * Provides enriched incident data and metrics for multiple incidents.
     * Example metrics include Seconds to Resolve, Seconds to Engage, Snoozed Seconds, and Sleep Hour Interruptions. Metric definitions can be found in our [Knowledge Base](https://support.pagerduty.com/docs/insights#incidents-list).
     * &amp;lt;!-- theme: info --&amp;gt; &amp;gt; A {@code team_ids} or {@code service_ids} filter is required for [user-level API keys](https://support.pagerduty.com/docs/using-the-api#section-generating-a-personal-rest-api-key) or keys generated through an OAuth flow. Account-level API keys do not have this requirement. &amp;lt;!-- theme: info --&amp;gt; &amp;gt; **Note:** Analytics data is updated once per day. It takes up to 24 hours before new incidents appear in the Analytics API.
     * Scoped OAuth requires: {@code analytics.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>getAnalyticsIncidentsRequest: Parameters and filters to apply to the dataset.</li>
     * </ul>
     */
    public GetAnalyticsIncidents200Response getAnalyticsIncidents(Consumer<GetAnalyticsIncidentsOperationSpec> spec) {
        GetAnalyticsIncidentsOperationSpec r = new GetAnalyticsIncidentsOperationSpec(spec);
        return api.getAnalyticsIncidents(r.getAnalyticsIncidentsRequest());
    }

    /**
     * Get raw data - single incident
     * <p>
     * Provides enriched incident data and metrics for a single incident.
     * Example metrics include Seconds to Resolve, Seconds to Engage, Snoozed Seconds, and Sleep Hour Interruptions. Metric definitions can be found in our [Knowledge Base](https://support.pagerduty.com/docs/insights#incidents-list).
     * &amp;lt;!-- theme: info --&amp;gt; &amp;gt; **Note:** Analytics data is updated once per day. It takes up to 24 hours before new incidents appear in the Analytics API.
     * Scoped OAuth requires: {@code analytics.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public AnalyticsRawIncident getAnalyticsIncidentsById(Consumer<GetAnalyticsIncidentsByIdOperationSpec> spec) {
        GetAnalyticsIncidentsByIdOperationSpec r = new GetAnalyticsIncidentsByIdOperationSpec(spec);
        return api.getAnalyticsIncidentsById(r.id());
    }

    /**
     * Get aggregated incident data
     * <p>
     * Provides aggregated enriched metrics for incidents.
     * The provided metrics are aggregated by day, week, month using the aggregate_unit parameter, or for the entire period if no aggregate_unit is provided.
     * &amp;lt;!-- theme: info --&amp;gt; &amp;gt; A {@code team_ids} or {@code service_ids} filter is required for [user-level API keys](https://support.pagerduty.com/docs/using-the-api#section-generating-a-personal-rest-api-key) or keys generated through an OAuth flow. Account-level API keys do not have this requirement. &amp;lt;!-- theme: info --&amp;gt; &amp;gt; **Note:** Analytics data is updated once per day. It takes up to 24 hours before new incidents appear in the Analytics API.
     * Scoped OAuth requires: {@code analytics.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>analyticsModel: Parameters and filters to apply to the dataset.</li>
     * </ul>
     */
    public GetAnalyticsMetricsIncidentsAll200Response getAnalyticsMetricsIncidentsAll(Consumer<GetAnalyticsMetricsIncidentsAllOperationSpec> spec) {
        GetAnalyticsMetricsIncidentsAllOperationSpec r = new GetAnalyticsMetricsIncidentsAllOperationSpec(spec);
        return api.getAnalyticsMetricsIncidentsAll(r.analyticsModel());
    }

    /**
     * Get aggregated escalation policy data
     * <p>
     * Provides aggregated metrics for incidents aggregated into units of time by escalation policy.
     * Example metrics include Seconds to Resolve, Seconds to Engage, Snoozed Seconds, and Sleep Hour Interruptions. Metric definitions can be found in our [Knowledge Base](https://support.pagerduty.com/docs/insights#escalation-policy-list).
     * &amp;lt;!-- theme: info --&amp;gt; &amp;gt; **Note:** Analytics data is updated once per day. It takes up to 24 hours before new incidents appear in the Analytics API.
     * Scoped OAuth requires: {@code analytics.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>analyticsModel: Parameters and filters to apply to the dataset.</li>
     * </ul>
     */
    public GetAnalyticsMetricsIncidentsEscalationPolicy200Response getAnalyticsMetricsIncidentsEscalationPolicy(Consumer<GetAnalyticsMetricsIncidentsEscalationPolicyOperationSpec> spec) {
        GetAnalyticsMetricsIncidentsEscalationPolicyOperationSpec r = new GetAnalyticsMetricsIncidentsEscalationPolicyOperationSpec(spec);
        return api.getAnalyticsMetricsIncidentsEscalationPolicy(r.analyticsModel());
    }

    /**
     * Get aggregated metrics for all escalation policies
     * <p>
     * Provides aggregated metrics across all escalation policies.
     * Example metrics include Seconds to Resolve, Seconds to Engage, Snoozed Seconds, and Sleep Hour Interruptions. Metric definitions can be found in our [Knowledge Base](https://support.pagerduty.com/docs/insights#escalation-policy-list).
     * &amp;lt;!-- theme: info --&amp;gt; &amp;gt; **Note:** Analytics data is updated once per day. It takes up to 24 hours before new incidents appear in the Analytics API.
     * Scoped OAuth requires: {@code analytics.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>analyticsModel: Parameters and filters to apply to the dataset.</li>
     * </ul>
     */
    public GetAnalyticsMetricsIncidentsEscalationPolicy200Response getAnalyticsMetricsIncidentsEscalationPolicyAll(Consumer<GetAnalyticsMetricsIncidentsEscalationPolicyAllOperationSpec> spec) {
        GetAnalyticsMetricsIncidentsEscalationPolicyAllOperationSpec r = new GetAnalyticsMetricsIncidentsEscalationPolicyAllOperationSpec(spec);
        return api.getAnalyticsMetricsIncidentsEscalationPolicyAll(r.analyticsModel());
    }

    /**
     * Get aggregated service data
     * <p>
     * Provides aggregated metrics for incidents aggregated into units of time by service.
     * Example metrics include Seconds to Resolve, Seconds to Engage, Snoozed Seconds, and Sleep Hour Interruptions. Metric definitions can be found in our [Knowledge Base](https://support.pagerduty.com/docs/insights#services-list). Data can be aggregated by day, week or month in addition to by service, or provided just as a collection of aggregates for each service in the dataset for the entire period.
     * If a unit is provided, each row in the returned dataset will include a 'range_start' timestamp.
     * &amp;lt;!-- theme: info --&amp;gt; &amp;gt; **Note:** Analytics data is updated once per day. It takes up to 24 hours before new incidents appear in the Analytics API.
     * Scoped OAuth requires: {@code analytics.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>analyticsModel: Parameters and filters to apply to the dataset.</li>
     * </ul>
     */
    public GetAnalyticsMetricsIncidentsAll200Response getAnalyticsMetricsIncidentsService(Consumer<GetAnalyticsMetricsIncidentsServiceOperationSpec> spec) {
        GetAnalyticsMetricsIncidentsServiceOperationSpec r = new GetAnalyticsMetricsIncidentsServiceOperationSpec(spec);
        return api.getAnalyticsMetricsIncidentsService(r.analyticsModel());
    }

    /**
     * Get aggregated metrics for all services
     * <p>
     * Provides aggregated metrics across all services.
     * Example metrics include Seconds to Resolve, Seconds to Engage, Snoozed Seconds, and Sleep Hour Interruptions. Metric definitions can be found in our [Knowledge Base](https://support.pagerduty.com/docs/insights#services-list).
     * &amp;lt;!-- theme: info --&amp;gt; &amp;gt; A {@code team_ids} or {@code service_ids} filter is required for [user-level API keys](https://support.pagerduty.com/docs/using-the-api#section-generating-a-personal-rest-api-key) or keys generated through an OAuth flow. Account-level API keys do not have this requirement. &amp;lt;!-- theme: info --&amp;gt; &amp;gt; **Note:** Analytics data is updated once per day. It takes up to 24 hours before new incidents appear in the Analytics API.
     * Scoped OAuth requires: {@code analytics.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>analyticsModel: Parameters and filters to apply to the dataset.</li>
     * </ul>
     */
    public GetAnalyticsMetricsIncidentsAll200Response getAnalyticsMetricsIncidentsServiceAll(Consumer<GetAnalyticsMetricsIncidentsServiceAllOperationSpec> spec) {
        GetAnalyticsMetricsIncidentsServiceAllOperationSpec r = new GetAnalyticsMetricsIncidentsServiceAllOperationSpec(spec);
        return api.getAnalyticsMetricsIncidentsServiceAll(r.analyticsModel());
    }

    /**
     * Get aggregated team data
     * <p>
     * Provides aggregated metrics for incidents aggregated into units of time by team.
     * Example metrics include Seconds to Resolve, Seconds to Engage, Snoozed Seconds, and Sleep Hour Interruptions. Metric definitions can be found in our [Knowledge Base](https://support.pagerduty.com/docs/insights#teams-list). Data can be aggregated by day, week or month in addition to by team, or provided just as a collection of aggregates for each team in the dataset for the entire period.
     * If a unit is provided, each row in the returned dataset will include a 'range_start' timestamp.
     * &amp;lt;!-- theme: info --&amp;gt; &amp;gt; A {@code team_ids} or {@code service_ids} filter is required for [user-level API keys](https://support.pagerduty.com/docs/using-the-api#section-generating-a-personal-rest-api-key) or keys generated through an OAuth flow. Account-level API keys do not have this requirement. &amp;lt;!-- theme: info --&amp;gt; &amp;gt; **Note:** Analytics data is updated once per day. It takes up to 24 hours before new incidents appear in the Analytics API.
     * Scoped OAuth requires: {@code analytics.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>analyticsModel: Parameters and filters to apply to the dataset.</li>
     * </ul>
     */
    public GetAnalyticsMetricsIncidentsAll200Response getAnalyticsMetricsIncidentsTeam(Consumer<GetAnalyticsMetricsIncidentsTeamOperationSpec> spec) {
        GetAnalyticsMetricsIncidentsTeamOperationSpec r = new GetAnalyticsMetricsIncidentsTeamOperationSpec(spec);
        return api.getAnalyticsMetricsIncidentsTeam(r.analyticsModel());
    }

    /**
     * Get aggregated metrics for all teams
     * <p>
     * Provides aggregated metrics across all teams.
     * Example metrics include Seconds to Resolve, Seconds to Engage, Snoozed Seconds, and Sleep Hour Interruptions. Metric definitions can be found in our [Knowledge Base](https://support.pagerduty.com/docs/insights#teams-list).
     * &amp;lt;!-- theme: info --&amp;gt; &amp;gt; A {@code team_ids} or {@code service_ids} filter is required for [user-level API keys](https://support.pagerduty.com/docs/using-the-api#section-generating-a-personal-rest-api-key) or keys generated through an OAuth flow. Account-level API keys do not have this requirement. &amp;lt;!-- theme: info --&amp;gt; &amp;gt; **Note:** Analytics data is updated once per day. It takes up to 24 hours before new incidents appear in the Analytics API.
     * Scoped OAuth requires: {@code analytics.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>analyticsModel: Parameters and filters to apply to the dataset.</li>
     * </ul>
     */
    public GetAnalyticsMetricsIncidentsAll200Response getAnalyticsMetricsIncidentsTeamAll(Consumer<GetAnalyticsMetricsIncidentsTeamAllOperationSpec> spec) {
        GetAnalyticsMetricsIncidentsTeamAllOperationSpec r = new GetAnalyticsMetricsIncidentsTeamAllOperationSpec(spec);
        return api.getAnalyticsMetricsIncidentsTeamAll(r.analyticsModel());
    }

    /**
     * Get aggregated metrics for all responders
     * <p>
     * Provides aggregated incident metrics for all selected responders.
     * Example metrics include Seconds to Resolve, Seconds to Engage, Snoozed Seconds, and Sleep Hour Interruptions. Metric definitions can be found in our [Knowledge Base](https://support.pagerduty.com/docs/insights#responders-list).
     * &amp;lt;!-- theme: info --&amp;gt; &amp;gt; **Note:** Analytics data is updated once per day. It takes up to 24 hours before new incidents appear in the Analytics API.
     * Scoped OAuth requires: {@code analytics.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>analyticsResponderFilter: Parameters and filters to apply to the dataset.</li>
     * </ul>
     */
    public GetAnalyticsMetricsRespondersAll200Response getAnalyticsMetricsRespondersAll(Consumer<GetAnalyticsMetricsRespondersAllOperationSpec> spec) {
        GetAnalyticsMetricsRespondersAllOperationSpec r = new GetAnalyticsMetricsRespondersAllOperationSpec(spec);
        return api.getAnalyticsMetricsRespondersAll(r.analyticsResponderFilter());
    }

    /**
     * Get responder data aggregated by team
     * <p>
     * Provides incident metrics aggregated by responder.
     * Example metrics include Seconds to Resolve, Seconds to Engage, Snoozed Seconds, and Sleep Hour Interruptions. Metric definitions can be found in our [Knowledge Base](https://support.pagerduty.com/docs/insights#responders-list).
     * &amp;lt;!-- theme: info --&amp;gt; &amp;gt; **Note:** Analytics data is updated once per day. It takes up to 24 hours before new incidents appear in the Analytics API.
     * Scoped OAuth requires: {@code analytics.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>analyticsResponderFilter: Parameters and filters to apply to the dataset.</li>
     * </ul>
     */
    public GetAnalyticsMetricsRespondersAll200Response getAnalyticsMetricsRespondersTeam(Consumer<GetAnalyticsMetricsRespondersTeamOperationSpec> spec) {
        GetAnalyticsMetricsRespondersTeamOperationSpec r = new GetAnalyticsMetricsRespondersTeamOperationSpec(spec);
        return api.getAnalyticsMetricsRespondersTeam(r.analyticsResponderFilter());
    }

    /**
     * Get raw incidents for a single responder_id
     * <p>
     * Provides enriched incident data and metrics for a specific responder.
     * Example metrics include Mean Seconds to Resolve, Mean Seconds to Engage, Snoozed Seconds, and Sleep Hour Interruptions. Metric definitions can be found in our [Knowledge Base](https://support.pagerduty.com/docs/insights#incidents-list).
     * &amp;lt;!-- theme: info --&amp;gt; &amp;gt; **Note:** Analytics data is updated once per day. It takes up to 24 hours before new incidents appear in the Analytics API.
     * Scoped OAuth requires: {@code analytics.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>responderId: The ID of the responder.</li>
     *   <li>getAnalyticsResponderIncidentsRequest: Parameters and filters to apply to the dataset.</li>
     * </ul>
     */
    public GetAnalyticsResponderIncidents200Response getAnalyticsResponderIncidents(Consumer<GetAnalyticsResponderIncidentsOperationSpec> spec) {
        GetAnalyticsResponderIncidentsOperationSpec r = new GetAnalyticsResponderIncidentsOperationSpec(spec);
        return api.getAnalyticsResponderIncidents(r.responderId(), r.getAnalyticsResponderIncidentsRequest());
    }

    /**
     * Get an Automation Action
     * <p>
     * Get an Automation Action 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public CreateAutomationAction201Response getAutomationAction(Consumer<GetAutomationActionOperationSpec> spec) {
        GetAutomationActionOperationSpec r = new GetAutomationActionOperationSpec(spec);
        return api.getAutomationAction(r.id());
    }

    /**
     * Get the details of an Automation Action / service relation
     * <p>
     * Gets the details of a Automation Action / service relation
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>serviceId: The service ID</li>
     * </ul>
     */
    public GetAutomationActionsActionServiceAssociation200Response getAutomationActionsActionServiceAssociation(Consumer<GetAutomationActionsActionServiceAssociationOperationSpec> spec) {
        GetAutomationActionsActionServiceAssociationOperationSpec r = new GetAutomationActionsActionServiceAssociationOperationSpec(spec);
        return api.getAutomationActionsActionServiceAssociation(r.id(), r.serviceId());
    }

    /**
     * Get all service references associated with an Automation Action
     * <p>
     * Gets all service references associated with an Automation Action
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public GetAutomationActionsActionServiceAssociations200Response getAutomationActionsActionServiceAssociations(Consumer<GetAutomationActionsActionServiceAssociationsOperationSpec> spec) {
        GetAutomationActionsActionServiceAssociationsOperationSpec r = new GetAutomationActionsActionServiceAssociationsOperationSpec(spec);
        return api.getAutomationActionsActionServiceAssociations(r.id());
    }

    /**
     * Get the details of an Automation Action / team relation
     * <p>
     * Gets the details of an Automation Action / team relation
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>teamId: The team ID</li>
     * </ul>
     */
    public GetAutomationActionsActionTeamAssociation200Response getAutomationActionsActionTeamAssociation(Consumer<GetAutomationActionsActionTeamAssociationOperationSpec> spec) {
        GetAutomationActionsActionTeamAssociationOperationSpec r = new GetAutomationActionsActionTeamAssociationOperationSpec(spec);
        return api.getAutomationActionsActionTeamAssociation(r.id(), r.teamId());
    }

    /**
     * Get all team references associated with an Automation Action
     * <p>
     * Gets all team references associated with an Automation Action
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public GetAutomationActionsActionTeamAssociations200Response getAutomationActionsActionTeamAssociations(Consumer<GetAutomationActionsActionTeamAssociationsOperationSpec> spec) {
        GetAutomationActionsActionTeamAssociationsOperationSpec r = new GetAutomationActionsActionTeamAssociationsOperationSpec(spec);
        return api.getAutomationActionsActionTeamAssociations(r.id());
    }

    /**
     * Get an Invocation
     * <p>
     * Get an Automation Action Invocation 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public GetAutomationActionsInvocation200Response getAutomationActionsInvocation(Consumer<GetAutomationActionsInvocationOperationSpec> spec) {
        GetAutomationActionsInvocationOperationSpec r = new GetAutomationActionsInvocationOperationSpec(spec);
        return api.getAutomationActionsInvocation(r.id());
    }

    /**
     * Get an Automation Action runner
     * <p>
     * Get an Automation Action runner 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public GetAutomationActionsRunner200Response getAutomationActionsRunner(Consumer<GetAutomationActionsRunnerOperationSpec> spec) {
        GetAutomationActionsRunnerOperationSpec r = new GetAutomationActionsRunnerOperationSpec(spec);
        return api.getAutomationActionsRunner(r.id());
    }

    /**
     * Get the details of a runner / team relation
     * <p>
     * Gets the details of a runner / team relation
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>teamId: The team ID</li>
     * </ul>
     */
    public GetAutomationActionsActionTeamAssociation200Response getAutomationActionsRunnerTeamAssociation(Consumer<GetAutomationActionsRunnerTeamAssociationOperationSpec> spec) {
        GetAutomationActionsRunnerTeamAssociationOperationSpec r = new GetAutomationActionsRunnerTeamAssociationOperationSpec(spec);
        return api.getAutomationActionsRunnerTeamAssociation(r.id(), r.teamId());
    }

    /**
     * Get all team references associated with a runner
     * <p>
     * Gets all team references associated with a runner
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public GetAutomationActionsActionTeamAssociations200Response getAutomationActionsRunnerTeamAssociations(Consumer<GetAutomationActionsRunnerTeamAssociationsOperationSpec> spec) {
        GetAutomationActionsRunnerTeamAssociationsOperationSpec r = new GetAutomationActionsRunnerTeamAssociationsOperationSpec(spec);
        return api.getAutomationActionsRunnerTeamAssociations(r.id());
    }

    /**
     * List Automation Action runners
     * <p>
     * Lists Automation Action runners matching provided query params. The returned records are sorted by runner name in alphabetical order.
     * See [{@code Cursor-based pagination}](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for instructions on how to paginate through the result set. 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>limit: The minimum of the {@code limit} parameter used in the request or the maximum request size of the API.</li>
     *   <li>cursor: Optional parameter used to request the "next" set of results from an API.  The value provided here is most commonly obtained from the {@code next_cursor} field of the previous request.  When no value is provided, the request starts at the beginning of the result set. </li>
     *   <li>name: Filters results to include the ones matching the name (case insensitive substring matching)</li>
     *   <li>include: Includes additional data elements into the response</li>
     * </ul>
     */
    public GetAutomationActionsRunners200Response getAutomationActionsRunners(Consumer<GetAutomationActionsRunnersOperationSpec> spec) {
        GetAutomationActionsRunnersOperationSpec r = new GetAutomationActionsRunnersOperationSpec(spec);
        return api.getAutomationActionsRunners(r.limit(), r.cursor(), r.name(), r.include());
    }

    /**
     * Get a Business Service
     * <p>
     * Get details about an existing Business Service.
     * Business services model capabilities that span multiple technical services and that may be owned by several different teams.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#business-services)
     * Scoped OAuth requires: {@code services.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public CreateBusinessService200Response getBusinessService(Consumer<GetBusinessServiceOperationSpec> spec) {
        GetBusinessServiceOperationSpec r = new GetBusinessServiceOperationSpec(spec);
        return api.getBusinessService(r.id());
    }

    /**
     * List Business Services sorted by impacted status
     * <p>
     * Retrieve a list top-level Business Services sorted by highest Impact with {@code status} included. When called without the {@code ids[]} parameter, this endpoint does not return an exhaustive list of Business Services but rather provides access to the most impacted up to the limit of 200.
     * The returned Business Services are sorted first by Impact, secondarily by most recently impacted, and finally by name.
     * To get impact information about a specific set of Business Services, use the {@code ids[]} parameter. Scoped OAuth requires: {@code services.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>additionalFields: Provides access to additional fields such as highest priority per business service and total impacted count</li>
     *   <li>ids: The IDs of the resources.</li>
     * </ul>
     */
    public GetBusinessServiceSupportingServiceImpacts200Response getBusinessServiceImpacts(Consumer<GetBusinessServiceImpactsOperationSpec> spec) {
        GetBusinessServiceImpactsOperationSpec r = new GetBusinessServiceImpactsOperationSpec(spec);
        return api.getBusinessServiceImpacts(r.additionalFields(), r.ids());
    }

    /**
     * Get the global priority threshold for a Business Service to be considered impacted by an Incident
     * <p>
     * Retrieves the priority threshold information for an account.
     * Currently, there is a {@code global_threshold} that can be set for the account.
     * Incidents that have a priority meeting or exceeding this threshold will be considered impacting on any Business Service that depends on the Service to which the Incident belongs. Scoped OAuth requires: {@code services.read} 
     */
    public GetBusinessServicePriorityThresholds200Response getBusinessServicePriorityThresholds() {
        return api.getBusinessServicePriorityThresholds();
    }

    /**
     * Get Business Service dependencies
     * <p>
     * Get all immediate dependencies of any Business Service.
     * Business Services model capabilities that span multiple technical services and that may be owned by several different teams.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#business-services)
     * Scoped OAuth requires: {@code services.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public GetBusinessServiceServiceDependencies200Response getBusinessServiceServiceDependencies(Consumer<GetBusinessServiceServiceDependenciesOperationSpec> spec) {
        GetBusinessServiceServiceDependenciesOperationSpec r = new GetBusinessServiceServiceDependenciesOperationSpec(spec);
        return api.getBusinessServiceServiceDependencies(r.id());
    }

    /**
     * List Business Service Subscribers
     * <p>
     * Retrieve a list of Notification Subscribers on the Business Service.
     * &amp;lt;!-- theme: warning --&amp;gt; &amp;gt; Users must be added through {@code POST /business_services/{id}/subscribers} to be returned from this endpoint. Scoped OAuth requires: {@code subscribers.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public GetBusinessServiceSubscribers200Response getBusinessServiceSubscribers(Consumer<GetBusinessServiceSubscribersOperationSpec> spec) {
        GetBusinessServiceSubscribersOperationSpec r = new GetBusinessServiceSubscribersOperationSpec(spec);
        return api.getBusinessServiceSubscribers(r.id());
    }

    /**
     * List the supporting Business Services for the given Business Service Id, sorted by impacted status.
     * <p>
     * Retrieve of Business Services that support the given Business Service sorted by highest Impact with {@code status} included. This endpoint does not return an exhaustive list of Business Services but rather provides access to the most impacted up to the limit of 200.
     * The returned Business Services are sorted first by Impact, secondarily by most recently impacted, and finally by name.
     * To get impact information about a specific set of Business Services, use the {@code ids[]} parameter on the {@code /business_services/impacts} endpoint. Scoped OAuth requires: {@code services.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>additionalFields: Provides access to additional fields such as highest priority per business service and total impacted count</li>
     *   <li>ids: The IDs of the resources.</li>
     * </ul>
     */
    public GetBusinessServiceSupportingServiceImpacts200Response getBusinessServiceSupportingServiceImpacts(Consumer<GetBusinessServiceSupportingServiceImpactsOperationSpec> spec) {
        GetBusinessServiceSupportingServiceImpactsOperationSpec r = new GetBusinessServiceSupportingServiceImpactsOperationSpec(spec);
        return api.getBusinessServiceSupportingServiceImpacts(r.id(), r.additionalFields(), r.ids());
    }

    /**
     * List Impactors affecting Business Services
     * <p>
     * Retrieve a list of Impactors for the top-level Business Services on the account. Impactors are currently limited to Incidents.
     * This endpoint does not return an exhaustive list of Impactors but rather provides access to the highest priority Impactors for the Business Services in question up to the limit of 200.
     * To get Impactors for a specific set of Business Services, use the {@code ids[]} parameter.
     * The returned Impactors are sorted first by priority and secondarily by their creation date. Scoped OAuth requires: {@code services.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>ids: The IDs of the resources.</li>
     * </ul>
     */
    public GetBusinessServiceTopLevelImpactors200Response getBusinessServiceTopLevelImpactors(Consumer<GetBusinessServiceTopLevelImpactorsOperationSpec> spec) {
        GetBusinessServiceTopLevelImpactorsOperationSpec r = new GetBusinessServiceTopLevelImpactorsOperationSpec(spec);
        return api.getBusinessServiceTopLevelImpactors(r.ids());
    }

    /**
     * Get a Change Event
     * <p>
     * Get details about an existing Change Event.
     * Scoped OAuth requires: {@code change_events.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public GetChangeEvent200Response getChangeEvent(Consumer<GetChangeEventOperationSpec> spec) {
        GetChangeEventOperationSpec r = new GetChangeEventOperationSpec(spec);
        return api.getChangeEvent(r.id());
    }

    /**
     * Get the current user
     * <p>
     * Get details about the current user.
     * This endpoint can only be used with a [user-level API key](https://support.pagerduty.com/docs/using-the-api#section-generating-a-personal-rest-api-key) or a key generated through an OAuth flow. This will not work if the request is made with an account-level access token.
     * Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users) 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>include: Array of additional Models to include in response.</li>
     * </ul>
     */
    public CreateUserRequest getCurrentUser(Consumer<GetCurrentUserOperationSpec> spec) {
        GetCurrentUserOperationSpec r = new GetCurrentUserOperationSpec(spec);
        return api.getCurrentUser(r.include());
    }

    /**
     * Get a Field
     * <p>
     * Show detailed information about a field.
     * Scoped OAuth requires: {@code custom_fields.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>fieldId: The ID of the field.</li>
     *   <li>include: Array of additional details to include.</li>
     * </ul>
     */
    public CreateCustomFieldsFieldRequest getCustomFieldsField(Consumer<GetCustomFieldsFieldOperationSpec> spec) {
        GetCustomFieldsFieldOperationSpec r = new GetCustomFieldsFieldOperationSpec(spec);
        return api.getCustomFieldsField(r.fieldId(), r.include());
    }

    /**
     * Get tags for entities
     * <p>
     * Get related tags for Users, Teams or Escalation Policies.
     * A Tag is applied to Escalation Policies, Teams or Users and can be used to filter them.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#tags)
     * Scoped OAuth requires: {@code tags.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>entityType: Type of entity related with the tag</li>
     *   <li>id: The ID of the resource.</li>
     *   <li>limit: The number of results per page.</li>
     *   <li>offset: Offset to start pagination search results.</li>
     *   <li>total: By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information. </li>
     * </ul>
     */
    public GetEntityTypeByIdTags200Response getEntityTypeByIdTags(Consumer<GetEntityTypeByIdTagsOperationSpec> spec) {
        GetEntityTypeByIdTagsOperationSpec r = new GetEntityTypeByIdTagsOperationSpec(spec);
        return api.getEntityTypeByIdTags(r.entityType(), r.id(), r.limit(), r.offset(), r.total());
    }

    /**
     * Get an escalation policy
     * <p>
     * Get information about an existing escalation policy and its rules.
     * Escalation policies define which user should be alerted at which time.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#escalation-policies)
     * Scoped OAuth requires: {@code escalation_policies.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>include: Array of additional Models to include in response.</li>
     * </ul>
     */
    public CreateEscalationPolicyRequest getEscalationPolicy(Consumer<GetEscalationPolicyOperationSpec> spec) {
        GetEscalationPolicyOperationSpec r = new GetEscalationPolicyOperationSpec(spec);
        return api.getEscalationPolicy(r.id(), r.include());
    }

    /**
     * Get an extension
     * <p>
     * Get details about an existing extension.
     * Extensions are representations of Extension Schema objects that are attached to Services.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#extensions)
     * Scoped OAuth requires: {@code extensions.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>include: Array of additional details to include.</li>
     * </ul>
     */
    public GetExtension200Response getExtension(Consumer<GetExtensionOperationSpec> spec) {
        GetExtensionOperationSpec r = new GetExtensionOperationSpec(spec);
        return api.getExtension(r.id(), r.include());
    }

    /**
     * Get an extension vendor
     * <p>
     * Get details about one specific extension vendor.
     * A PagerDuty extension vendor represents a specific type of outbound extension such as Generic Webhook, Slack, ServiceNow.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#extension-schemas)
     * Scoped OAuth requires: {@code extension_schemas.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public GetExtensionSchema200Response getExtensionSchema(Consumer<GetExtensionSchemaOperationSpec> spec) {
        GetExtensionSchemaOperationSpec r = new GetExtensionSchemaOperationSpec(spec);
        return api.getExtensionSchema(r.id());
    }

    /**
     * Get an incident
     * <p>
     * Show detailed information about an incident. Accepts either an incident id, or an incident number.
     * An incident represents a problem or an issue that needs to be addressed and resolved.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#incidents)
     * Scoped OAuth requires: {@code incidents.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>include: Array of additional details to include.</li>
     * </ul>
     */
    public CreateIncident201Response getIncident(Consumer<GetIncidentOperationSpec> spec) {
        GetIncidentOperationSpec r = new GetIncidentOperationSpec(spec);
        return api.getIncident(r.id(), r.include());
    }

    /**
     * Get an alert
     * <p>
     * Show detailed information about an alert. Accepts an alert id.
     * An incident represents a problem or an issue that needs to be addressed and resolved.
     * When a service sends an event to PagerDuty, an alert and corresponding incident is triggered in PagerDuty.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#incidents)
     * Scoped OAuth requires: {@code incidents.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>alertId: The id of the alert to retrieve.</li>
     * </ul>
     */
    public GetIncidentAlert200Response getIncidentAlert(Consumer<GetIncidentAlertOperationSpec> spec) {
        GetIncidentAlertOperationSpec r = new GetIncidentAlertOperationSpec(spec);
        return api.getIncidentAlert(r.id(), r.alertId());
    }

    /**
     * Get Custom Field Values
     * <p>
     * Get custom field values for an incident.
     * &amp;lt;!-- theme: warning --&amp;gt;
     * Scoped OAuth requires: {@code incidents.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public GetIncidentFieldValues200Response getIncidentFieldValues(Consumer<GetIncidentFieldValuesOperationSpec> spec) {
        GetIncidentFieldValuesOperationSpec r = new GetIncidentFieldValuesOperationSpec(spec);
        return api.getIncidentFieldValues(r.id());
    }

    /**
     * List Business Services impacted by the given Incident
     * <p>
     * Retrieve a list of Business Services that are being impacted by the given Incident. Scoped OAuth requires: {@code incidents.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public GetIncidentImpactedBusinessServices200Response getIncidentImpactedBusinessServices(Consumer<GetIncidentImpactedBusinessServicesOperationSpec> spec) {
        GetIncidentImpactedBusinessServicesOperationSpec r = new GetIncidentImpactedBusinessServicesOperationSpec(spec);
        return api.getIncidentImpactedBusinessServices(r.id());
    }

    /**
     * List Notification Subscribers
     * <p>
     * Retrieve a list of Notification Subscribers on the Incident.
     * &amp;lt;!-- theme: warning --&amp;gt; &amp;gt; Users must be added through {@code POST /incident/{id}/status_updates/subscribers} to be returned from this endpoint. Scoped OAuth requires: {@code subscribers.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public GetIncidentNotificationSubscribers200Response getIncidentNotificationSubscribers(Consumer<GetIncidentNotificationSubscribersOperationSpec> spec) {
        GetIncidentNotificationSubscribersOperationSpec r = new GetIncidentNotificationSubscribersOperationSpec(spec);
        return api.getIncidentNotificationSubscribers(r.id());
    }

    /**
     * Get an Incident Workflow
     * <p>
     * Get an existing Incident Workflow An Incident Workflow is a sequence of configurable Steps and associated Triggers that can execute automated Actions for a given Incident.
     * Scoped OAuth requires: {@code incident_workflows.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public PostIncidentWorkflowRequest getIncidentWorkflow(Consumer<GetIncidentWorkflowOperationSpec> spec) {
        GetIncidentWorkflowOperationSpec r = new GetIncidentWorkflowOperationSpec(spec);
        return api.getIncidentWorkflow(r.id());
    }

    /**
     * Get an Action
     * <p>
     * Get an Incident Workflow Action
     * Scoped OAuth requires: {@code incident_workflows.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public GetIncidentWorkflowAction200Response getIncidentWorkflowAction(Consumer<GetIncidentWorkflowActionOperationSpec> spec) {
        GetIncidentWorkflowActionOperationSpec r = new GetIncidentWorkflowActionOperationSpec(spec);
        return api.getIncidentWorkflowAction(r.id());
    }

    /**
     * Get a Trigger
     * <p>
     * Retrieve an existing Incident Workflows Trigger
     * Scoped OAuth requires: {@code incident_workflows.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public GetIncidentWorkflowTrigger200Response getIncidentWorkflowTrigger(Consumer<GetIncidentWorkflowTriggerOperationSpec> spec) {
        GetIncidentWorkflowTriggerOperationSpec r = new GetIncidentWorkflowTriggerOperationSpec(spec);
        return api.getIncidentWorkflowTrigger(r.id());
    }

    /**
     * Get a log entry
     * <p>
     * Get details for a specific incident log entry. This method provides additional information you can use to get at raw event data.
     * A log of all the events that happen to an Incident, and these are exposed as Log Entries.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#log-entries)
     * Scoped OAuth requires: {@code incidents.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>timeZone: Time zone in which results will be rendered. This will default to the account time zone.</li>
     *   <li>include: Array of additional Models to include in response.</li>
     * </ul>
     */
    public GetLogEntry200Response getLogEntry(Consumer<GetLogEntryOperationSpec> spec) {
        GetLogEntryOperationSpec r = new GetLogEntryOperationSpec(spec);
        return api.getLogEntry(r.id(), r.timeZone(), r.include());
    }

    /**
     * Get a maintenance window
     * <p>
     * Get an existing maintenance window.
     * A Maintenance Window is used to temporarily disable one or more Services for a set period of time.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#maintenance-windows)
     * Scoped OAuth requires: {@code services.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>include: Array of additional Models to include in response.</li>
     * </ul>
     */
    public CreateMaintenanceWindowRequest getMaintenanceWindow(Consumer<GetMaintenanceWindowOperationSpec> spec) {
        GetMaintenanceWindowOperationSpec r = new GetMaintenanceWindowOperationSpec(spec);
        return api.getMaintenanceWindow(r.id(), r.include());
    }

    /**
     * Get the Service Orchestration active status for a Service
     * <p>
     * Get a Service Orchestration's active status.
     * A Service Orchestration allows you to set an active status based on whether an event will be evaluated against a service orchestration path (true) or service ruleset (false).
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#event-orchestrations)
     * Scoped OAuth requires: {@code services.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>serviceId: The service ID</li>
     * </ul>
     */
    public GetOrchActiveStatus200Response getOrchActiveStatus(Consumer<GetOrchActiveStatusOperationSpec> spec) {
        GetOrchActiveStatusOperationSpec r = new GetOrchActiveStatusOperationSpec(spec);
        return api.getOrchActiveStatus(r.serviceId());
    }

    /**
     * Get the Global Orchestration for an Event Orchestration
     * <p>
     * Get the Global Orchestration for an Event Orchestration.
     * Global Orchestration Rules allows you to create a set of Event Rules. These rules evaluate against all Events sent to an Event Orchestration. When a matching rule is found, it can modify and enhance the event and can route the event to another set of Global Rules within this Orchestration for further processing.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#event-orchestrations)
     * Scoped OAuth requires: {@code event_orchestrations.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of an Event Orchestration.</li>
     * </ul>
     */
    public OrchestrationGlobal getOrchPathGlobal(Consumer<GetOrchPathGlobalOperationSpec> spec) {
        GetOrchPathGlobalOperationSpec r = new GetOrchPathGlobalOperationSpec(spec);
        return api.getOrchPathGlobal(r.id());
    }

    /**
     * Get the Router for an Event Orchestration
     * <p>
     * Get a Global Orchestration's Routing Rules.
     * An Orchestration Router allows you to create a set of Event Rules. The Router evaluates Events you send to this Global Orchestration against each of its rules, one at a time, and routes the event to a specific Service based on the first rule that matches. If an event doesn't match any rules, it'll be sent to service specified in as the {@code catch_all} or the "Unrouted" Orchestration if no service is specified.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#event-orchestrations)
     * Scoped OAuth requires: {@code event_orchestrations.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of an Event Orchestration.</li>
     * </ul>
     */
    public OrchestrationRouter getOrchPathRouter(Consumer<GetOrchPathRouterOperationSpec> spec) {
        GetOrchPathRouterOperationSpec r = new GetOrchPathRouterOperationSpec(spec);
        return api.getOrchPathRouter(r.id());
    }

    /**
     * Get the Service Orchestration for a Service
     * <p>
     * Get a Service Orchestration.
     * A Service Orchestration allows you to create a set of Event Rules. The Service Orchestration evaluates Events sent to this Service against each of its rules, beginning with the rules in the "start" set. When a matching rule is found, it can modify and enhance the event and can route the event to another set of rules within this Service Orchestration for further processing.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#event-orchestrations)
     * Scoped OAuth requires: {@code services.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>serviceId: The service ID</li>
     *   <li>include: Array of additional Models to include in response.</li>
     * </ul>
     */
    public ServiceOrchestration getOrchPathService(Consumer<GetOrchPathServiceOperationSpec> spec) {
        GetOrchPathServiceOperationSpec r = new GetOrchPathServiceOperationSpec(spec);
        return api.getOrchPathService(r.serviceId(), r.include());
    }

    /**
     * Get the Unrouted Orchestration for an Event Orchestration
     * <p>
     * Get a Global Event Orchestration's Rules for Unrouted events.
     * An Unrouted Orchestration allows you to create a set of Event Rules that will be evaluated against all events that don't match any rules in the Global Orchestration's Router. Events that reach the Unrouted Orchestration will never be routed to a specific Service.
     * The Unrouted Orchestration evaluates Events sent to it against each of its rules, beginning with the rules in the "start" set. When a matching rule is found, it can modify and enhance the event and can route the event to another set of rules within this Unrouted Orchestration for further processing.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#event-orchestrations)
     * Scoped OAuth requires: {@code event_orchestrations.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of an Event Orchestration.</li>
     * </ul>
     */
    public OrchestrationUnrouted getOrchPathUnrouted(Consumer<GetOrchPathUnroutedOperationSpec> spec) {
        GetOrchPathUnroutedOperationSpec r = new GetOrchPathUnroutedOperationSpec(spec);
        return api.getOrchPathUnrouted(r.id());
    }

    /**
     * Get an Orchestration
     * <p>
     * Get a Global Event Orchestration.
     * Global Event Orchestrations allow you define a set of Global Rules and Router Rules, so that when you ingest events using the Orchestration's Routing Key your events will have actions applied via the Global Rules &amp; then routed to the correct Service by the Router Rules, based on the event's content.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#event-orchestrations)
     * Scoped OAuth requires: {@code event_orchestrations.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of an Event Orchestration.</li>
     * </ul>
     */
    public PostOrchestration201Response getOrchestration(Consumer<GetOrchestrationOperationSpec> spec) {
        GetOrchestrationOperationSpec r = new GetOrchestrationOperationSpec(spec);
        return api.getOrchestration(r.id());
    }

    /**
     * Get an Integration for an Event Orchestration
     * <p>
     * Get an Integration associated with this Event Orchestrations.
     * You can use the Routing Key from this Integration to send events to PagerDuty!
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#event-orchestrations)
     * Scoped OAuth requires: {@code event_orchestrations.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of an Event Orchestration.</li>
     *   <li>integrationId: The ID of an Integration.</li>
     * </ul>
     */
    public GetOrchestrationIntegration200Response getOrchestrationIntegration(Consumer<GetOrchestrationIntegrationOperationSpec> spec) {
        GetOrchestrationIntegrationOperationSpec r = new GetOrchestrationIntegrationOperationSpec(spec);
        return api.getOrchestrationIntegration(r.id(), r.integrationId());
    }

    /**
     * Get Outlier Incident
     * <p>
     * Gets Outlier Incident information for a given Incident on its Service.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#outlier-incident)
     * Scoped OAuth requires: {@code incidents.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>since: The start of the date range over which you want to search.</li>
     *   <li>additionalDetails: Array of additional attributes to any of the returned incidents for related incidents.</li>
     * </ul>
     */
    public GetOutlierIncident200Response getOutlierIncident(Consumer<GetOutlierIncidentOperationSpec> spec) {
        GetOutlierIncidentOperationSpec r = new GetOutlierIncidentOperationSpec(spec);
        return api.getOutlierIncident(r.id(), r.since(), r.additionalDetails());
    }

    /**
     * Get Past Incidents
     * <p>
     * Past Incidents returns Incidents within the past 6 months that have similar metadata and were generated on the same Service as the parent Incident. By default, 5 Past Incidents are returned. Note: This feature is currently available as part of the Event Intelligence package or Digital Operations plan only.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#past_incidents)
     * Scoped OAuth requires: {@code incidents.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>limit: The number of results to be returned in the response.</li>
     *   <li>total: By default the {@code total} field in the response body is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated with the total number of Past Incidents. </li>
     * </ul>
     */
    public GetPastIncidents200Response getPastIncidents(Consumer<GetPastIncidentsOperationSpec> spec) {
        GetPastIncidentsOperationSpec r = new GetPastIncidentsOperationSpec(spec);
        return api.getPastIncidents(r.id(), r.limit(), r.total());
    }

    /**
     * Get Paused Incident Reporting on Alerts
     * <p>
     * Returns the 5 most recent alerts that were triggered after being paused and the 5 most recent alerts that were resolved after being paused for a given reporting period (maximum 6 months lookback period).
     * Note: This feature is currently available as part of the Event Intelligence package or Digital Operations plan only.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#paused-incident-reports)
     * Scoped OAuth requires: {@code incidents.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>since: The start of the date range over which you want to search.</li>
     *   <li>until: The end of the date range over which you want to search.</li>
     *   <li>serviceId: Specifies a filter to limit the scope of reporting to a particular service</li>
     *   <li>suspendedBy: Specifies a filter to scope the response to either alerts suspended by Auto Pause or Event Rules.</li>
     * </ul>
     */
    public GetPausedIncidentReportAlerts200Response getPausedIncidentReportAlerts(Consumer<GetPausedIncidentReportAlertsOperationSpec> spec) {
        GetPausedIncidentReportAlertsOperationSpec r = new GetPausedIncidentReportAlertsOperationSpec(spec);
        return api.getPausedIncidentReportAlerts(r.since(), r.until(), r.serviceId(), r.suspendedBy());
    }

    /**
     * Get Paused Incident Reporting counts
     * <p>
     * Returns reporting counts for paused Incident usage for a given reporting period (maximum 6 months lookback period).
     * Note: This feature is currently available as part of the Event Intelligence package or Digital Operations plan only.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#paused-incident-reports)
     * Scoped OAuth requires: {@code incidents.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>since: The start of the date range over which you want to search.</li>
     *   <li>until: The end of the date range over which you want to search.</li>
     *   <li>serviceId: Specifies a filter to limit the scope of reporting to a particular service</li>
     *   <li>suspendedBy: Specifies a filter to scope the response to either alerts suspended by Auto Pause or Event Rules.</li>
     * </ul>
     */
    public GetPausedIncidentReportCounts200Response getPausedIncidentReportCounts(Consumer<GetPausedIncidentReportCountsOperationSpec> spec) {
        GetPausedIncidentReportCountsOperationSpec r = new GetPausedIncidentReportCountsOperationSpec(spec);
        return api.getPausedIncidentReportCounts(r.since(), r.until(), r.serviceId(), r.suspendedBy());
    }

    /**
     * Get Related Incidents
     * <p>
     * Returns the 20 most recent Related Incidents that are impacting other Responders and Services. Note: This feature is currently available as part of the Event Intelligence package or Digital Operations plan only.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#related_incidents)
     * Scoped OAuth requires: {@code incidents.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>additionalDetails: Array of additional attributes to any of the returned incidents for related incidents.</li>
     * </ul>
     */
    public GetRelatedIncidents200Response getRelatedIncidents(Consumer<GetRelatedIncidentsOperationSpec> spec) {
        GetRelatedIncidentsOperationSpec r = new GetRelatedIncidentsOperationSpec(spec);
        return api.getRelatedIncidents(r.id(), r.additionalDetails());
    }

    /**
     * Get a Response Play
     * <p>
     * Get details about an existing Response Play.
     * Response Plays allow you to create packages of Incident Actions that can be applied during an Incident's life cycle.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#response-plays)
     * When using a Global API token, the {@code From} header is required. Scoped OAuth requires: {@code response_plays.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>from: The email address of a valid user associated with the account making the request. This is optional, and is only used for change tracking.</li>
     * </ul>
     * @deprecated
     */
    @Deprecated
    public CreateResponsePlay201Response getResponsePlay(Consumer<GetResponsePlayOperationSpec> spec) {
        GetResponsePlayOperationSpec r = new GetResponsePlayOperationSpec(spec);
        return api.getResponsePlay(r.id(), r.from());
    }

    /**
     * Get a Ruleset
     * <p>
     * Get a Ruleset. &amp;lt;!-- theme: warning --&amp;gt; &amp;gt; ### End-of-life &amp;gt; Rulesets and Event Rules will end-of-life soon. We highly recommend that you [migrate to Event Orchestration](https://support.pagerduty.com/docs/migrate-to-event-orchestration) as soon as possible so you can take advantage of the new functionality, such as improved UI, rule creation, APIs and Terraform support, advanced conditions, and rule nesting.
     * Rulesets allow you to route events to an endpoint and create collections of Event Rules, which define sets of actions to take based on event content.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#rulesets)
     * Scoped OAuth requires: {@code event_rules.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public CreateRuleset201Response getRuleset(Consumer<GetRulesetOperationSpec> spec) {
        GetRulesetOperationSpec r = new GetRulesetOperationSpec(spec);
        return api.getRuleset(r.id());
    }

    /**
     * Get an Event Rule
     * <p>
     * Get an Event Rule. &amp;lt;!-- theme: warning --&amp;gt; &amp;gt; ### End-of-life &amp;gt; Rulesets and Event Rules will end-of-life soon. We highly recommend that you [migrate to Event Orchestration](https://support.pagerduty.com/docs/migrate-to-event-orchestration) as soon as possible so you can take advantage of the new functionality, such as improved UI, rule creation, APIs and Terraform support, advanced conditions, and rule nesting.
     * Rulesets allow you to route events to an endpoint and create collections of Event Rules, which define sets of actions to take based on event content.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#rulesets)
     * Note: Create and Update on rules will accept 'description' or 'summary' interchangeably as an extraction action target. Get and List on rules will always return 'summary' as the target. If you are expecting 'description' please change your automation code to expect 'summary' instead.
     * Scoped OAuth requires: {@code event_rules.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>ruleId: The id of the Event Rule to retrieve.</li>
     * </ul>
     */
    public CreateRulesetEventRule201Response getRulesetEventRule(Consumer<GetRulesetEventRuleOperationSpec> spec) {
        GetRulesetEventRuleOperationSpec r = new GetRulesetEventRuleOperationSpec(spec);
        return api.getRulesetEventRule(r.id(), r.ruleId());
    }

    /**
     * Get a schedule
     * <p>
     * Show detailed information about a schedule, including entries for each layer. Scoped OAuth requires: {@code schedules.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>timeZone: Time zone in which results will be rendered. This will default to the schedule's time zone.</li>
     *   <li>since: The start of the date range over which you want to show schedule entries. Defaults to 2 weeks before until if an until is given.</li>
     *   <li>until: The end of the date range over which you want to show schedule entries. Defaults to 2 weeks after since if a since is given.</li>
     *   <li>overflow: Any on-call schedule entries that pass the date range bounds will be truncated at the bounds, unless the parameter {@code overflow=true} is passed. This parameter defaults to false. For instance, if your schedule is a rotation that changes daily at midnight UTC, and your date range is from {@code 2011-06-01T10:00:00Z} to {@code 2011-06-01T14:00:00Z}:   - If you don't pass the {@code overflow=true} parameter, you will get one schedule entry returned with a start of {@code 2011-06-01T10:00:00Z} and end of {@code 2011-06-01T14:00:00Z}. - If you do pass the {@code overflow=true} parameter, you will get one schedule entry returned with a start of {@code 2011-06-01T00:00:00Z} and end of {@code 2011-06-02T00:00:00Z}. </li>
     * </ul>
     */
    public CreateScheduleRequest getSchedule(Consumer<GetScheduleOperationSpec> spec) {
        GetScheduleOperationSpec r = new GetScheduleOperationSpec(spec);
        return api.getSchedule(r.id(), r.timeZone(), r.since(), r.until(), r.overflow());
    }

    /**
     * Get a service
     * <p>
     * Get details about an existing service.
     * A service may represent an application, component, or team you wish to open incidents against.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#services)
     * Scoped OAuth requires: {@code services.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>include: Array of additional details to include.</li>
     * </ul>
     */
    public CreateServiceRequest getService(Consumer<GetServiceOperationSpec> spec) {
        GetServiceOperationSpec r = new GetServiceOperationSpec(spec);
        return api.getService(r.id(), r.include());
    }

    /**
     * Get an Event Rule from a Service
     * <p>
     * Get an Event Rule from a Service. &amp;lt;!-- theme: warning --&amp;gt; &amp;gt; ### End-of-life &amp;gt; Rulesets and Event Rules will end-of-life soon. We highly recommend that you [migrate to Event Orchestration](https://support.pagerduty.com/docs/migrate-to-event-orchestration) as soon as possible so you can take advantage of the new functionality, such as improved UI, rule creation, APIs and Terraform support, advanced conditions, and rule nesting.
     * Scoped OAuth requires: {@code services.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>ruleId: The id of the Event Rule to retrieve.</li>
     * </ul>
     */
    public CreateServiceEventRule201Response getServiceEventRule(Consumer<GetServiceEventRuleOperationSpec> spec) {
        GetServiceEventRuleOperationSpec r = new GetServiceEventRuleOperationSpec(spec);
        return api.getServiceEventRule(r.id(), r.ruleId());
    }

    /**
     * View an integration
     * <p>
     * Get details about an integration belonging to a service.
     * A service may represent an application, component, or team you wish to open incidents against.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#services)
     * Scoped OAuth requires: {@code services.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>integrationId: The integration ID on the service.</li>
     *   <li>include: Array of additional details to include.</li>
     * </ul>
     */
    public CreateServiceIntegrationRequest getServiceIntegration(Consumer<GetServiceIntegrationOperationSpec> spec) {
        GetServiceIntegrationOperationSpec r = new GetServiceIntegrationOperationSpec(spec);
        return api.getServiceIntegration(r.id(), r.integrationId(), r.include());
    }

    /**
     * Get a single Status Dashboard by {@code id}
     * <p>
     * Get a Status Dashboard by its PagerDuty {@code id}.
     * Scoped OAuth requires: {@code status_dashboards.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public GetStatusDashboardById200Response getStatusDashboardById(Consumer<GetStatusDashboardByIdOperationSpec> spec) {
        GetStatusDashboardByIdOperationSpec r = new GetStatusDashboardByIdOperationSpec(spec);
        return api.getStatusDashboardById(r.id());
    }

    /**
     * Get a single Status Dashboard by {@code url_slug}
     * <p>
     * Get a Status Dashboard by its PagerDuty {@code url_slug}.
     * A {@code url_slug} is a human-readable reference for a custom Status Dashboard that may be created or changed in the UI. It will generally be a {@code dash-separated-string-like-this}.
     * Scoped OAuth requires: {@code status_dashboards.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>urlSlug: The {@code url_slug} for a status dashboard</li>
     * </ul>
     */
    public GetStatusDashboardById200Response getStatusDashboardByUrlSlug(Consumer<GetStatusDashboardByUrlSlugOperationSpec> spec) {
        GetStatusDashboardByUrlSlugOperationSpec r = new GetStatusDashboardByUrlSlugOperationSpec(spec);
        return api.getStatusDashboardByUrlSlug(r.urlSlug());
    }

    /**
     * Get impacted Business Services for a Status Dashboard by {@code id}.
     * <p>
     * Get impacted Business Services for a Status Dashboard by {@code id}
     * This endpoint does not return an exhaustive list of Business Services but rather provides access to the most impacted on the specified Status Dashboard up to the limit of 200.
     * The returned Business Services are sorted first by Impact, secondarily by most recently impacted, and finally by name.
     * To get Impact information about a specific Business Service on the Status Dashboard that does not appear in the Impact-sorted response, use the {@code ids[]} parameter on the {@code /business_services/impacts} endpoint.
     * Scoped OAuth requires: {@code status_dashboards.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>additionalFields: Provides access to additional fields such as highest priority per business service and total impacted count</li>
     * </ul>
     */
    public GetBusinessServiceSupportingServiceImpacts200Response getStatusDashboardServiceImpactsById(Consumer<GetStatusDashboardServiceImpactsByIdOperationSpec> spec) {
        GetStatusDashboardServiceImpactsByIdOperationSpec r = new GetStatusDashboardServiceImpactsByIdOperationSpec(spec);
        return api.getStatusDashboardServiceImpactsById(r.id(), r.additionalFields());
    }

    /**
     * Get impacted Business Services for a
     * Status Dashboard by {@code url_slug}
     * <p>
     * Get Business Service Impacts for the Business Services on a Status Dashboard by its {@code url_slug}. A {@code url_slug} is a human-readable reference for a custom Status Dashboard that may be created or changed in the UI. It will generally be a {@code dash-separated-string-like-this}.
     * This endpoint does not return an exhaustive list of Business Services but rather provides access to the most impacted on the Status Dashboard up to the limit of 200.
     * The returned Business Services are sorted first by Impact, secondarily by most recently impacted, and finally by name.
     * To get impact information about a specific Business Service on the Status Dashboard that does not appear in the Impact-sored response, use the {@code ids[]} parameter on the {@code /business_services/impacts} endpoint.
     * Scoped OAuth requires: {@code status_dashboards.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>urlSlug: The {@code url_slug} for a status dashboard</li>
     *   <li>additionalFields: Provides access to additional fields such as highest priority per business service and total impacted count</li>
     * </ul>
     */
    public GetBusinessServiceSupportingServiceImpacts200Response getStatusDashboardServiceImpactsByUrlSlug(Consumer<GetStatusDashboardServiceImpactsByUrlSlugOperationSpec> spec) {
        GetStatusDashboardServiceImpactsByUrlSlugOperationSpec r = new GetStatusDashboardServiceImpactsByUrlSlugOperationSpec(spec);
        return api.getStatusDashboardServiceImpactsByUrlSlug(r.urlSlug(), r.additionalFields());
    }

    /**
     * Get a tag
     * <p>
     * Get details about an existing Tag.
     * A Tag is applied to Escalation Policies, Teams or Users and can be used to filter them.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#tags)
     * Scoped OAuth requires: {@code tags.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public CreateTagsRequest getTag(Consumer<GetTagOperationSpec> spec) {
        GetTagOperationSpec r = new GetTagOperationSpec(spec);
        return api.getTag(r.id());
    }

    /**
     * Get connected entities
     * <p>
     * Get related Users, Teams or Escalation Policies for the Tag.
     * A Tag is applied to Escalation Policies, Teams or Users and can be used to filter them.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#tags)
     * Scoped OAuth requires: {@code tags.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>entityType: Type of entity related with the tag</li>
     *   <li>limit: The number of results per page.</li>
     *   <li>offset: Offset to start pagination search results.</li>
     *   <li>total: By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information. </li>
     * </ul>
     */
    public GetTagsByEntityType200Response getTagsByEntityType(Consumer<GetTagsByEntityTypeOperationSpec> spec) {
        GetTagsByEntityTypeOperationSpec r = new GetTagsByEntityTypeOperationSpec(spec);
        return api.getTagsByEntityType(r.id(), r.entityType(), r.limit(), r.offset(), r.total());
    }

    /**
     * Get a team
     * <p>
     * Get details about an existing team.
     * A team is a collection of Users and Escalation Policies that represent a group of people within an organization.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#teams)
     * Scoped OAuth requires: {@code teams.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>include: Array of additional Models to include in response.</li>
     * </ul>
     */
    public CreateTeamRequest getTeam(Consumer<GetTeamOperationSpec> spec) {
        GetTeamOperationSpec r = new GetTeamOperationSpec(spec);
        return api.getTeam(r.id(), r.include());
    }

    /**
     * List Team Notification Subscriptions
     * <p>
     * Retrieve a list of Notification Subscriptions the given Team has.
     * &amp;lt;!-- theme: warning --&amp;gt; &amp;gt; Teams must be added through {@code POST /teams/{id}/notification_subscriptions} to be returned from this endpoint.
     * Scoped OAuth requires: {@code subscribers.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public GetTeamNotificationSubscriptions200Response getTeamNotificationSubscriptions(Consumer<GetTeamNotificationSubscriptionsOperationSpec> spec) {
        GetTeamNotificationSubscriptionsOperationSpec r = new GetTeamNotificationSubscriptionsOperationSpec(spec);
        return api.getTeamNotificationSubscriptions(r.id());
    }

    /**
     * Get technical service dependencies
     * <p>
     * Get all immediate dependencies of any technical service. Technical services are also known as {@code services}.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#services)
     * Scoped OAuth requires: {@code services.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public CreateServiceDependency200Response getTechnicalServiceServiceDependencies(Consumer<GetTechnicalServiceServiceDependenciesOperationSpec> spec) {
        GetTechnicalServiceServiceDependenciesOperationSpec r = new GetTechnicalServiceServiceDependenciesOperationSpec(spec);
        return api.getTechnicalServiceServiceDependencies(r.id());
    }

    /**
     * Get a template
     * <p>
     * Get a single template on the account
     * Scoped OAuth requires: {@code templates.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public CreateTemplate201Response getTemplate(Consumer<GetTemplateOperationSpec> spec) {
        GetTemplateOperationSpec r = new GetTemplateOperationSpec(spec);
        return api.getTemplate(r.id());
    }

    /**
     * List templates
     * <p>
     * Get a list of all the template on an account
     * Scoped OAuth requires: {@code templates.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>limit: The number of results per page.</li>
     *   <li>offset: Offset to start pagination search results.</li>
     *   <li>total: By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information. </li>
     *   <li>query: Template name or description to search</li>
     *   <li>templateType: Filters templates by type.</li>
     *   <li>sortBy: Used to specify both the field you wish to sort the results on (name/created_at), as well as the direction (asc/desc) of the results. The sort_by field and direction should be separated by a colon. Sort direction defaults to ascending.</li>
     * </ul>
     */
    public GetTemplates200Response getTemplates(Consumer<GetTemplatesOperationSpec> spec) {
        GetTemplatesOperationSpec r = new GetTemplatesOperationSpec(spec);
        return api.getTemplates(r.limit(), r.offset(), r.total(), r.query(), r.templateType(), r.sortBy());
    }

    /**
     * Get a user
     * <p>
     * Get details about an existing user.
     * Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>include: Array of additional Models to include in response.</li>
     * </ul>
     */
    public CreateUserRequest getUser(Consumer<GetUserOperationSpec> spec) {
        GetUserOperationSpec r = new GetUserOperationSpec(spec);
        return api.getUser(r.id(), r.include());
    }

    /**
     * Get a user's contact method
     * <p>
     * Get details about a User's contact method.
     * Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users:contact_methods.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>contactMethodId: The contact method ID on the user.</li>
     * </ul>
     */
    public CreateUserContactMethod201Response getUserContactMethod(Consumer<GetUserContactMethodOperationSpec> spec) {
        GetUserContactMethodOperationSpec r = new GetUserContactMethodOperationSpec(spec);
        return api.getUserContactMethod(r.id(), r.contactMethodId());
    }

    /**
     * List a user's contact methods
     * <p>
     * List contact methods of your PagerDuty user.
     * Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users:contact_methods.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public GetUserContactMethods200Response getUserContactMethods(Consumer<GetUserContactMethodsOperationSpec> spec) {
        GetUserContactMethodsOperationSpec r = new GetUserContactMethodsOperationSpec(spec);
        return api.getUserContactMethods(r.id());
    }

    /**
     * Get a user's handoff notification rule
     * <p>
     * Get details about a User's Handoff Notification Rule. Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account. For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>oncallHandoffNotificationRuleId: The oncall handoff notification rule ID on the user.</li>
     * </ul>
     */
    public CreateUserHandoffNotificationRuleRequest getUserHandoffNotifiactionRule(Consumer<GetUserHandoffNotifiactionRuleOperationSpec> spec) {
        GetUserHandoffNotifiactionRuleOperationSpec r = new GetUserHandoffNotifiactionRuleOperationSpec(spec);
        return api.getUserHandoffNotifiactionRule(r.id(), r.oncallHandoffNotificationRuleId());
    }

    /**
     * List a User's Handoff Notification Rules
     * <p>
     * List Handoff Notification Rules of your PagerDuty User. Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account. For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public GetUserHandoffNotificationRules200Response getUserHandoffNotificationRules(Consumer<GetUserHandoffNotificationRulesOperationSpec> spec) {
        GetUserHandoffNotificationRulesOperationSpec r = new GetUserHandoffNotificationRulesOperationSpec(spec);
        return api.getUserHandoffNotificationRules(r.id());
    }

    /**
     * Get the License allocated to a User
     * <p>
     * Get the License allocated to a User
     * Scoped OAuth requires: {@code licenses.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public GetUserLicense200Response getUserLicense(Consumer<GetUserLicenseOperationSpec> spec) {
        GetUserLicenseOperationSpec r = new GetUserLicenseOperationSpec(spec);
        return api.getUserLicense(r.id());
    }

    /**
     * Get a user's notification rule
     * <p>
     * Get details about a user's notification rule.
     * Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users:contact_methods.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>notificationRuleId: The notification rule ID on the user.</li>
     *   <li>include: Array of additional details to include.</li>
     * </ul>
     */
    public CreateUserNotificationRuleRequest getUserNotificationRule(Consumer<GetUserNotificationRuleOperationSpec> spec) {
        GetUserNotificationRuleOperationSpec r = new GetUserNotificationRuleOperationSpec(spec);
        return api.getUserNotificationRule(r.id(), r.notificationRuleId(), r.include());
    }

    /**
     * List a user's notification rules
     * <p>
     * List notification rules of your PagerDuty user.
     * Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users:contact_methods.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>include: Array of additional details to include.</li>
     *   <li>urgency: The incident urgency for which the notification rules are applied. If not specified, defaults to {@code high}.</li>
     * </ul>
     */
    public GetUserNotificationRules200Response getUserNotificationRules(Consumer<GetUserNotificationRulesOperationSpec> spec) {
        GetUserNotificationRulesOperationSpec r = new GetUserNotificationRulesOperationSpec(spec);
        return api.getUserNotificationRules(r.id(), r.include(), r.urgency());
    }

    /**
     * List Notification Subscriptions
     * <p>
     * Retrieve a list of Notification Subscriptions the given User has.
     * &amp;lt;!-- theme: warning --&amp;gt; &amp;gt; Users must be added through {@code POST /users/{id}/notification_subscriptions} to be returned from this endpoint.
     * Scoped OAuth requires: {@code subscribers.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public GetTeamNotificationSubscriptions200Response getUserNotificationSubscriptions(Consumer<GetUserNotificationSubscriptionsOperationSpec> spec) {
        GetUserNotificationSubscriptionsOperationSpec r = new GetUserNotificationSubscriptionsOperationSpec(spec);
        return api.getUserNotificationSubscriptions(r.id());
    }

    /**
     * Get a user's session
     * <p>
     * Get details about a user's session.
     * Beginning November 2021, user sessions no longer includes newly issued OAuth tokens.
     * Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users:sessions.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>type: The session type for the user session ID.</li>
     *   <li>sessionId: The session ID for the user.</li>
     * </ul>
     */
    public GetUserSession200Response getUserSession(Consumer<GetUserSessionOperationSpec> spec) {
        GetUserSessionOperationSpec r = new GetUserSessionOperationSpec(spec);
        return api.getUserSession(r.id(), r.type(), r.sessionId());
    }

    /**
     * List a user's active sessions
     * <p>
     * List active sessions of a PagerDuty user.
     * Beginning November 2021, active sessions no longer includes newly issued OAuth tokens.
     * Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users:sessions.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public GetUserSessions200Response getUserSessions(Consumer<GetUserSessionsOperationSpec> spec) {
        GetUserSessionsOperationSpec r = new GetUserSessionsOperationSpec(spec);
        return api.getUserSessions(r.id());
    }

    /**
     * Get a user's status update notification rule
     * <p>
     * Get details about a user's status update notification rule.
     * Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account.
     * &amp;lt;!-- theme: warning --&amp;gt; &amp;gt; ### Early Access &amp;gt; This endpoint is in Early Access and may change at any time. You must pass in the X-EARLY-ACCESS header to access it.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>statusUpdateNotificationRuleId: The status update notification rule ID on the user.</li>
     *   <li>include: Array of additional details to include.</li>
     * </ul>
     */
    public GetUserStatusUpdateNotificationRule200Response getUserStatusUpdateNotificationRule(Consumer<GetUserStatusUpdateNotificationRuleOperationSpec> spec) {
        GetUserStatusUpdateNotificationRuleOperationSpec r = new GetUserStatusUpdateNotificationRuleOperationSpec(spec);
        return api.getUserStatusUpdateNotificationRule(r.id(), r.statusUpdateNotificationRuleId(), r.include());
    }

    /**
     * List a user's status update notification rules
     * <p>
     * List status update notification rules of your PagerDuty user.
     * Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account.
     * &amp;lt;!-- theme: warning --&amp;gt; &amp;gt; ### Early Access &amp;gt; This endpoint is in Early Access and may change at any time. You must pass in the X-EARLY-ACCESS header to access it.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>include: Array of additional details to include.</li>
     * </ul>
     */
    public GetUserStatusUpdateNotificationRules200Response getUserStatusUpdateNotificationRules(Consumer<GetUserStatusUpdateNotificationRulesOperationSpec> spec) {
        GetUserStatusUpdateNotificationRulesOperationSpec r = new GetUserStatusUpdateNotificationRulesOperationSpec(spec);
        return api.getUserStatusUpdateNotificationRules(r.id(), r.include());
    }

    /**
     * Get a vendor
     * <p>
     * Get details about one specific vendor.
     * A PagerDuty Vendor represents a specific type of integration. AWS Cloudwatch, Splunk, Datadog are all examples of vendors
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#vendors)
     * Scoped OAuth requires: {@code vendors.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public GetVendor200Response getVendor(Consumer<GetVendorOperationSpec> spec) {
        GetVendorOperationSpec r = new GetVendorOperationSpec(spec);
        return api.getVendor(r.id());
    }

    /**
     * Get a webhook subscription
     * <p>
     * Gets details about an existing webhook subscription. 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public CreateWebhookSubscriptionRequest getWebhookSubscription(Consumer<GetWebhookSubscriptionOperationSpec> spec) {
        GetWebhookSubscriptionOperationSpec r = new GetWebhookSubscriptionOperationSpec(spec);
        return api.getWebhookSubscription(r.id());
    }

    /**
     * List abilities
     * <p>
     * List all of your account's abilities, by name.
     * "Abilities" describes your account's capabilities by feature name. For example {@code "teams"}.
     * An ability may be available to your account based on things like your pricing plan or account state.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#abilities)
     * Scoped OAuth requires: {@code abilities.read} 
     */
    public ListAbilities200Response listAbilities() {
        return api.listAbilities();
    }

    /**
     * List installed Add-ons
     * <p>
     * List all of the Add-ons installed on your account.
     * Addon's are pieces of functionality that developers can write to insert new functionality into PagerDuty's UI.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#add-ons)
     * Scoped OAuth requires: {@code addons.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>limit: The number of results per page.</li>
     *   <li>offset: Offset to start pagination search results.</li>
     *   <li>total: By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information. </li>
     *   <li>include: Array of additional Models to include in response.</li>
     *   <li>serviceIds: Filters the results, showing only Add-ons for the given services</li>
     *   <li>filter: Filters the results, showing only Add-ons of the given type</li>
     * </ul>
     */
    public ListAddon200Response listAddon(Consumer<ListAddonOperationSpec> spec) {
        ListAddonOperationSpec r = new ListAddonOperationSpec(spec);
        return api.listAddon(r.limit(), r.offset(), r.total(), r.include(), r.serviceIds(), r.filter());
    }

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
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>limit: The minimum of the {@code limit} parameter used in the request or the maximum request size of the API.</li>
     *   <li>cursor: Optional parameter used to request the "next" set of results from an API.  The value provided here is most commonly obtained from the {@code next_cursor} field of the previous request.  When no value is provided, the request starts at the beginning of the result set. </li>
     *   <li>since: The start of the date range over which you want to search. If not specified, defaults to {@code now() - 24 hours} (past 24 hours)</li>
     *   <li>until: The end of the date range over which you want to search. If not specified, defaults to {@code now()}. May not be more than 31 days after {@code since}.</li>
     *   <li>rootResourceTypes: Resource type filter for the root_resource.</li>
     *   <li>actorType: Actor type filter.</li>
     *   <li>actorId: Actor Id filter. Must be qualified by providing the {@code actor_type} param.</li>
     *   <li>methodType: Method type filter.</li>
     *   <li>methodTruncatedToken: Method truncated_token filter. Must be qualified by providing the {@code method_type} param.</li>
     *   <li>actions: Action filter</li>
     * </ul>
     */
    public AuditRecordResponseSchema listAuditRecords(Consumer<ListAuditRecordsOperationSpec> spec) {
        ListAuditRecordsOperationSpec r = new ListAuditRecordsOperationSpec(spec);
        return api.listAuditRecords(r.limit(), r.cursor(), r.since(), r.until(), r.rootResourceTypes(), r.actorType(), r.actorId(), r.methodType(), r.methodTruncatedToken(), r.actions());
    }

    /**
     * List Invocations
     * <p>
     * List Invocations 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>incidentId: Incident ID</li>
     *   <li>invocationState: Invocation state</li>
     * </ul>
     */
    public ListAutomationActionInvocations200Response listAutomationActionInvocations(Consumer<ListAutomationActionInvocationsOperationSpec> spec) {
        ListAutomationActionInvocationsOperationSpec r = new ListAutomationActionInvocationsOperationSpec(spec);
        return api.listAutomationActionInvocations(r.incidentId(), r.invocationState());
    }

    /**
     * List Business Services
     * <p>
     * List existing Business Services.
     * Business services model capabilities that span multiple technical services and that may be owned by several different teams.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#business-services)
     * Scoped OAuth requires: {@code services.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>limit: The number of results per page.</li>
     *   <li>offset: Offset to start pagination search results.</li>
     *   <li>total: By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information. </li>
     * </ul>
     */
    public ListBusinessServices200Response listBusinessServices(Consumer<ListBusinessServicesOperationSpec> spec) {
        ListBusinessServicesOperationSpec r = new ListBusinessServicesOperationSpec(spec);
        return api.listBusinessServices(r.limit(), r.offset(), r.total());
    }

    /**
     * List Change Events
     * <p>
     * List all of the existing Change Events.
     * Scoped OAuth requires: {@code change_events.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>limit: The number of results per page.</li>
     *   <li>offset: Offset to start pagination search results.</li>
     *   <li>total: By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information. </li>
     *   <li>teamIds: An array of team IDs. Only results related to these teams will be returned. Account must have the {@code teams} ability to use this parameter.</li>
     *   <li>integrationIds: An array of integration IDs. Only results related to these integrations will be returned.</li>
     *   <li>since: The start of the date range over which you want to search, as a UTC ISO 8601 datetime string. Will return an HTTP 400 for non-UTC datetimes.</li>
     *   <li>until: The end of the date range over which you want to search, as a UTC ISO 8601 datetime string. Will return an HTTP 400 for non-UTC datetimes.</li>
     * </ul>
     */
    public ListChangeEvents200Response listChangeEvents(Consumer<ListChangeEventsOperationSpec> spec) {
        ListChangeEventsOperationSpec r = new ListChangeEventsOperationSpec(spec);
        return api.listChangeEvents(r.limit(), r.offset(), r.total(), r.teamIds(), r.integrationIds(), r.since(), r.until());
    }

    /**
     * List Field Options
     * <p>
     * List all enabled Field Options for a Field.
     * Scoped OAuth requires: {@code custom_fields.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>fieldId: The ID of the field.</li>
     * </ul>
     */
    public ListCustomFieldsFieldOptions200Response listCustomFieldsFieldOptions(Consumer<ListCustomFieldsFieldOptionsOperationSpec> spec) {
        ListCustomFieldsFieldOptionsOperationSpec r = new ListCustomFieldsFieldOptionsOperationSpec(spec);
        return api.listCustomFieldsFieldOptions(r.fieldId());
    }

    /**
     * List Fields
     * <p>
     * List fields.
     * Scoped OAuth requires: {@code custom_fields.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>include: Array of additional details to include.</li>
     * </ul>
     */
    public ListCustomFieldsFields200Response listCustomFieldsFields(Consumer<ListCustomFieldsFieldsOperationSpec> spec) {
        ListCustomFieldsFieldsOperationSpec r = new ListCustomFieldsFieldsOperationSpec(spec);
        return api.listCustomFieldsFields(r.include());
    }

    /**
     * List escalation policies
     * <p>
     * List all of the existing escalation policies.
     * Escalation policies define which user should be alerted at which time.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#escalation-policies)
     * Scoped OAuth requires: {@code escalation_policies.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>limit: The number of results per page.</li>
     *   <li>offset: Offset to start pagination search results.</li>
     *   <li>total: By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information. </li>
     *   <li>query: Filters the result, showing only the records whose name matches the query.</li>
     *   <li>userIds: Filters the results, showing only escalation policies on which any of the users is a target.</li>
     *   <li>teamIds: An array of team IDs. Only results related to these teams will be returned. Account must have the {@code teams} ability to use this parameter.</li>
     *   <li>include: Array of additional Models to include in response.</li>
     *   <li>sortBy: Used to specify the field you wish to sort the results on.</li>
     * </ul>
     */
    public ListEscalationPolicies200Response listEscalationPolicies(Consumer<ListEscalationPoliciesOperationSpec> spec) {
        ListEscalationPoliciesOperationSpec r = new ListEscalationPoliciesOperationSpec(spec);
        return api.listEscalationPolicies(r.limit(), r.offset(), r.total(), r.query(), r.userIds(), r.teamIds(), r.include(), r.sortBy());
    }

    /**
     * List audit records for an escalation policy
     * <p>
     * The returned records are sorted by the {@code execution_time} from newest to oldest.
     * See [{@code Cursor-based pagination}](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for instructions on how to paginate through the result set.
     * For more information see the [Audit API Document](https://developer.pagerduty.com/docs/rest-api-v2/audit-records-api/).
     * Scoped OAuth requires: {@code audit_records.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>limit: The minimum of the {@code limit} parameter used in the request or the maximum request size of the API.</li>
     *   <li>cursor: Optional parameter used to request the "next" set of results from an API.  The value provided here is most commonly obtained from the {@code next_cursor} field of the previous request.  When no value is provided, the request starts at the beginning of the result set. </li>
     *   <li>since: The start of the date range over which you want to search. If not specified, defaults to {@code now() - 24 hours} (past 24 hours)</li>
     *   <li>until: The end of the date range over which you want to search. If not specified, defaults to {@code now()}. May not be more than 31 days after {@code since}.</li>
     * </ul>
     */
    public AuditRecordResponseSchema listEscalationPolicyAuditRecords(Consumer<ListEscalationPolicyAuditRecordsOperationSpec> spec) {
        ListEscalationPolicyAuditRecordsOperationSpec r = new ListEscalationPolicyAuditRecordsOperationSpec(spec);
        return api.listEscalationPolicyAuditRecords(r.id(), r.limit(), r.cursor(), r.since(), r.until());
    }

    /**
     * List Event Orchestrations
     * <p>
     * List all Global Event Orchestrations on an Account.
     * Global Event Orchestrations allow you define a set of Global Rules and Router Rules, so that when you ingest events using the Orchestration's Routing Key your events will have actions applied via the Global Rules &amp; then routed to the correct Service by the Router Rules, based on the event's content.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#event-orchestrations)
     * Scoped OAuth requires: {@code event_orchestrations.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>limit: The number of results per page.</li>
     *   <li>offset: Offset to start pagination search results.</li>
     *   <li>sortBy: Used to specify the field you wish to sort the results on.</li>
     * </ul>
     */
    public ListEventOrchestrations200Response listEventOrchestrations(Consumer<ListEventOrchestrationsOperationSpec> spec) {
        ListEventOrchestrationsOperationSpec r = new ListEventOrchestrationsOperationSpec(spec);
        return api.listEventOrchestrations(r.limit(), r.offset(), r.sortBy());
    }

    /**
     * List extension schemas
     * <p>
     * List all extension schemas.
     * A PagerDuty extension vendor represents a specific type of outbound extension such as Generic Webhook, Slack, ServiceNow.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#extension-schemas)
     * Scoped OAuth requires: {@code extension_schemas.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>limit: The number of results per page.</li>
     *   <li>offset: Offset to start pagination search results.</li>
     *   <li>total: By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information. </li>
     * </ul>
     */
    public ListExtensionSchemas200Response listExtensionSchemas(Consumer<ListExtensionSchemasOperationSpec> spec) {
        ListExtensionSchemasOperationSpec r = new ListExtensionSchemasOperationSpec(spec);
        return api.listExtensionSchemas(r.limit(), r.offset(), r.total());
    }

    /**
     * List alerts for an incident
     * <p>
     * List alerts for the specified incident.
     * An incident represents a problem or an issue that needs to be addressed and resolved.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#incidents)
     * Scoped OAuth requires: {@code incidents.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>limit: The number of results per page.</li>
     *   <li>offset: Offset to start pagination search results.</li>
     *   <li>total: By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information. </li>
     *   <li>alertKey: Alert de-duplication key.</li>
     *   <li>statuses: Return only alerts with the given statuses. (More status codes may be introduced in the future.)</li>
     *   <li>sortBy: Used to specify both the field you wish to sort the results on (created_at/resolved_at), as well as the direction (asc/desc) of the results. The sort_by field and direction should be separated by a colon. A maximum of two fields can be included, separated by a comma. Sort direction defaults to ascending.</li>
     *   <li>include: Array of additional details to include.</li>
     * </ul>
     */
    public ListIncidentAlerts200Response listIncidentAlerts(Consumer<ListIncidentAlertsOperationSpec> spec) {
        ListIncidentAlertsOperationSpec r = new ListIncidentAlertsOperationSpec(spec);
        return api.listIncidentAlerts(r.id(), r.limit(), r.offset(), r.total(), r.alertKey(), r.statuses(), r.sortBy(), r.include());
    }

    /**
     * List log entries for an incident
     * <p>
     * List log entries for the specified incident.
     * An incident represents a problem or an issue that needs to be addressed and resolved.
     * A Log Entry are a record of all events on your account.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#incidents)
     * Scoped OAuth requires: {@code incidents.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>limit: The number of results per page.</li>
     *   <li>offset: Offset to start pagination search results.</li>
     *   <li>total: By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information. </li>
     *   <li>timeZone: Time zone in which results will be rendered. This will default to the account time zone.</li>
     *   <li>since: The start of the date range over which you want to search.</li>
     *   <li>until: The end of the date range over which you want to search.</li>
     *   <li>isOverview: If {@code true}, will return a subset of log entries that show only the most important changes to the incident.</li>
     *   <li>include: Array of additional Models to include in response.</li>
     * </ul>
     */
    public ListIncidentLogEntries200Response listIncidentLogEntries(Consumer<ListIncidentLogEntriesOperationSpec> spec) {
        ListIncidentLogEntriesOperationSpec r = new ListIncidentLogEntriesOperationSpec(spec);
        return api.listIncidentLogEntries(r.id(), r.limit(), r.offset(), r.total(), r.timeZone(), r.since(), r.until(), r.isOverview(), r.include());
    }

    /**
     * List notes for an incident
     * <p>
     * List existing notes for the specified incident.
     * An incident represents a problem or an issue that needs to be addressed and resolved.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#incidents)
     * Scoped OAuth requires: {@code incidents.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public ListIncidentNotes200Response listIncidentNotes(Consumer<ListIncidentNotesOperationSpec> spec) {
        ListIncidentNotesOperationSpec r = new ListIncidentNotesOperationSpec(spec);
        return api.listIncidentNotes(r.id());
    }

    /**
     * List related Change Events for an Incident
     * <p>
     * List related Change Events for an Incident, as well as the reason these changes are correlated with the incident.
     * Change events represent service changes such as deploys, build completion, and configuration changes, providing information that is critical during incident triage or hypercare. For more information on change events, see [Change Events](https://support.pagerduty.com/docs/change-events).
     * The Change Correlation feature provides incident responders with recent change events that are most relevant to that incident. Change Correlation informs the responder why a particular change event was surfaced and correlated to an incident based on three key factors which include time, related service, or intelligence (machine learning).
     * Scoped OAuth requires: {@code incidents.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>limit: The number of results per page.</li>
     * </ul>
     */
    public ListIncidentRelatedChangeEvents200Response listIncidentRelatedChangeEvents(Consumer<ListIncidentRelatedChangeEventsOperationSpec> spec) {
        ListIncidentRelatedChangeEventsOperationSpec r = new ListIncidentRelatedChangeEventsOperationSpec(spec);
        return api.listIncidentRelatedChangeEvents(r.id(), r.limit());
    }

    /**
     * List Actions
     * <p>
     * List Incident Workflow Actions
     * Scoped OAuth requires: {@code incident_workflows.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>limit: The minimum of the {@code limit} parameter used in the request or the maximum request size of the API.</li>
     *   <li>cursor: Optional parameter used to request the "next" set of results from an API.  The value provided here is most commonly obtained from the {@code next_cursor} field of the previous request.  When no value is provided, the request starts at the beginning of the result set. </li>
     *   <li>keyword: If provided, only show actions tagged with the specified keyword</li>
     * </ul>
     */
    public ListIncidentWorkflowActions200Response listIncidentWorkflowActions(Consumer<ListIncidentWorkflowActionsOperationSpec> spec) {
        ListIncidentWorkflowActionsOperationSpec r = new ListIncidentWorkflowActionsOperationSpec(spec);
        return api.listIncidentWorkflowActions(r.limit(), r.cursor(), r.keyword());
    }

    /**
     * List Triggers
     * <p>
     * List existing Incident Workflow Triggers
     * Scoped OAuth requires: {@code incident_workflows.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>workflowId: If provided, only show triggers configured to start the given workflow. Useful for listing all services associated with the given workflow</li>
     *   <li>incidentId: If provided, only show triggers configured on the service of the given incident. Useful for finding manual triggers that are configured on the service for a specific incident. Cannot be specified if {@code service_id} is provided.</li>
     *   <li>serviceId: If provided, only show triggers configured for incidents in the given service. Useful for listing all workflows associated with the given service. Cannot be specified if {@code incident_id} is provided.</li>
     *   <li>triggerType: If provided, only show triggers of the given type. For example “manual” to search for manual triggers</li>
     *   <li>workflowNameContains: If provided, only show triggers configured to start workflows whose name contain the provided value.</li>
     *   <li>sortBy: If provided, returns triggers sorted by the specified property.</li>
     *   <li>limit: The minimum of the {@code limit} parameter used in the request or the maximum request size of the API.</li>
     *   <li>cursor: Optional parameter used to request the "next" set of results from an API.  The value provided here is most commonly obtained from the {@code next_cursor} field of the previous request.  When no value is provided, the request starts at the beginning of the result set. </li>
     * </ul>
     */
    public ListIncidentWorkflowTriggers200Response listIncidentWorkflowTriggers(Consumer<ListIncidentWorkflowTriggersOperationSpec> spec) {
        ListIncidentWorkflowTriggersOperationSpec r = new ListIncidentWorkflowTriggersOperationSpec(spec);
        return api.listIncidentWorkflowTriggers(r.workflowId(), r.incidentId(), r.serviceId(), r.triggerType(), r.workflowNameContains(), r.sortBy(), r.limit(), r.cursor());
    }

    /**
     * List Incident Workflows
     * <p>
     * List existing Incident Workflows.
     * This is the best method to use to list all Incident Workflows in your account. If your use case requires listing Incident Workflows associated with a particular Service, you can use the "List Triggers" method to find Incident Workflows configured to start for Incidents in a given Service.
     * An Incident Workflow is a sequence of configurable Steps and associated Triggers that can execute automated Actions for a given Incident.
     * Scoped OAuth requires: {@code incident_workflows.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>limit: The number of results per page.</li>
     *   <li>offset: Offset to start pagination search results.</li>
     *   <li>total: By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information. </li>
     *   <li>query: Filters the result, showing only the records whose name matches the query.</li>
     *   <li>include: Array of additional details to include.</li>
     * </ul>
     */
    public ListIncidentWorkflows200Response listIncidentWorkflows(Consumer<ListIncidentWorkflowsOperationSpec> spec) {
        ListIncidentWorkflowsOperationSpec r = new ListIncidentWorkflowsOperationSpec(spec);
        return api.listIncidentWorkflows(r.limit(), r.offset(), r.total(), r.query(), r.include());
    }

    /**
     * List incidents
     * <p>
     * List existing incidents.
     * An incident represents a problem or an issue that needs to be addressed and resolved.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#incidents)
     * Scoped OAuth requires: {@code incidents.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>limit: The number of results per page.</li>
     *   <li>offset: Offset to start pagination search results.</li>
     *   <li>total: By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information. </li>
     *   <li>dateRange: When set to all, the since and until parameters and defaults are ignored.</li>
     *   <li>incidentKey: Incident de-duplication key. Incidents with child alerts do not have an incident key; querying by incident key will return incidents whose alerts have alert_key matching the given incident key.</li>
     *   <li>serviceIds: Returns only the incidents associated with the passed service(s). This expects one or more service IDs.</li>
     *   <li>teamIds: An array of team IDs. Only results related to these teams will be returned. Account must have the {@code teams} ability to use this parameter.</li>
     *   <li>userIds: Returns only the incidents currently assigned to the passed user(s). This expects one or more user IDs. Note: When using the assigned_to_user filter, you will only receive incidents with statuses of triggered or acknowledged. This is because resolved incidents are not assigned to any user.</li>
     *   <li>urgencies: Array of the urgencies of the incidents to be returned. Defaults to all urgencies. Account must have the {@code urgencies} ability to do this.</li>
     *   <li>timeZone: Time zone in which results will be rendered. This will default to the account time zone.</li>
     *   <li>statuses: Return only incidents with the given statuses. To query multiple statuses, pass {@code statuses[]} more than once, for example: {@code https://api.pagerduty.com/incidents?statuses[]=triggered&amp;statuses[]=acknowledged}. (More status codes may be introduced in the future.)</li>
     *   <li>sortBy: Used to specify both the field you wish to sort the results on (incident_number/created_at/resolved_at/urgency), as well as the direction (asc/desc) of the results. The sort_by field and direction should be separated by a colon. A maximum of two fields can be included, separated by a comma. Sort direction defaults to ascending. The account must have the {@code urgencies} ability to sort by the urgency.</li>
     *   <li>include: Array of additional details to include.</li>
     *   <li>since: The start of the date range over which you want to search. Maximum range is 6 months and default is 1 month.</li>
     *   <li>until: The end of the date range over which you want to search. Maximum range is 6 months and default is 1 month.</li>
     * </ul>
     */
    public ListIncidents200Response listIncidents(Consumer<ListIncidentsOperationSpec> spec) {
        ListIncidentsOperationSpec r = new ListIncidentsOperationSpec(spec);
        return api.listIncidents(r.limit(), r.offset(), r.total(), r.dateRange(), r.incidentKey(), r.serviceIds(), r.teamIds(), r.userIds(), r.urgencies(), r.timeZone(), r.statuses(), r.sortBy(), r.include(), r.since(), r.until());
    }

    /**
     * List License Allocations
     * <p>
     * List the Licenses allocated to Users within your Account
     * Scoped OAuth requires: {@code licenses.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>limit: The number of results per page.</li>
     *   <li>offset: Offset to start pagination search results.</li>
     * </ul>
     */
    public ListLicenseAllocations200Response listLicenseAllocations(Consumer<ListLicenseAllocationsOperationSpec> spec) {
        ListLicenseAllocationsOperationSpec r = new ListLicenseAllocationsOperationSpec(spec);
        return api.listLicenseAllocations(r.limit(), r.offset());
    }

    /**
     * List Licenses
     * <p>
     * List the Licenses associated with your Account
     * Scoped OAuth requires: {@code licenses.read} 
     */
    public ListLicenses200Response listLicenses() {
        return api.listLicenses();
    }

    /**
     * List log entries
     * <p>
     * List all of the incident log entries across the entire account.
     * A log of all the events that happen to an Incident, and these are exposed as Log Entries.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#log-entries)
     * Scoped OAuth requires: {@code incidents.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>limit: The number of results per page.</li>
     *   <li>offset: Offset to start pagination search results.</li>
     *   <li>total: By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information. </li>
     *   <li>timeZone: Time zone in which results will be rendered. This will default to the account time zone.</li>
     *   <li>since: The start of the date range over which you want to search.</li>
     *   <li>until: The end of the date range over which you want to search.</li>
     *   <li>isOverview: If {@code true}, will return a subset of log entries that show only the most important changes to the incident.</li>
     *   <li>include: Array of additional Models to include in response.</li>
     *   <li>teamIds: An array of team IDs. Only results related to these teams will be returned. Account must have the {@code teams} ability to use this parameter.</li>
     * </ul>
     */
    public ListIncidentLogEntries200Response listLogEntries(Consumer<ListLogEntriesOperationSpec> spec) {
        ListLogEntriesOperationSpec r = new ListLogEntriesOperationSpec(spec);
        return api.listLogEntries(r.limit(), r.offset(), r.total(), r.timeZone(), r.since(), r.until(), r.isOverview(), r.include(), r.teamIds());
    }

    /**
     * List maintenance windows
     * <p>
     * List existing maintenance windows, optionally filtered by service and/or team, or whether they are from the past, present or future.
     * A Maintenance Window is used to temporarily disable one or more Services for a set period of time.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#maintenance-windows)
     * Scoped OAuth requires: {@code services.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>query: Filters the result, showing only the records whose name matches the query.</li>
     *   <li>limit: The number of results per page.</li>
     *   <li>offset: Offset to start pagination search results.</li>
     *   <li>total: By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information. </li>
     *   <li>teamIds: An array of team IDs. Only results related to these teams will be returned. Account must have the {@code teams} ability to use this parameter.</li>
     *   <li>serviceIds: An array of service IDs. Only results related to these services will be returned.</li>
     *   <li>include: Array of additional Models to include in response.</li>
     *   <li>filter: Only return maintenance windows in a given state.</li>
     * </ul>
     */
    public ListMaintenanceWindows200Response listMaintenanceWindows(Consumer<ListMaintenanceWindowsOperationSpec> spec) {
        ListMaintenanceWindowsOperationSpec r = new ListMaintenanceWindowsOperationSpec(spec);
        return api.listMaintenanceWindows(r.query(), r.limit(), r.offset(), r.total(), r.teamIds(), r.serviceIds(), r.include(), r.filter());
    }

    /**
     * List notifications
     * <p>
     * List notifications for a given time range, optionally filtered by type (sms_notification, email_notification, phone_notification, or push_notification).
     * A Notification is created when an Incident is triggered or escalated.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#notifications)
     * Scoped OAuth requires: {@code users:notifications.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>since: The start of the date range over which you want to search. The time element is optional.</li>
     *   <li>until: The end of the date range over which you want to search. This should be in the same format as since. The size of the date range must be less than 3 months.</li>
     *   <li>limit: The number of results per page.</li>
     *   <li>offset: Offset to start pagination search results.</li>
     *   <li>total: By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information. </li>
     *   <li>timeZone: Time zone in which results will be rendered. This will default to the account time zone.</li>
     *   <li>filter: Return notification of this type only.</li>
     *   <li>include: Array of additional details to include.</li>
     * </ul>
     */
    public ListNotifications200Response listNotifications(Consumer<ListNotificationsOperationSpec> spec) {
        ListNotificationsOperationSpec r = new ListNotificationsOperationSpec(spec);
        return api.listNotifications(r.since(), r.until(), r.limit(), r.offset(), r.total(), r.timeZone(), r.filter(), r.include());
    }

    /**
     * List all of the on-calls
     * <p>
     * List the on-call entries during a given time range.
     * An on-call represents a contiguous unit of time for which a User will be on call for a given Escalation Policy and Escalation Rules.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#on-calls)
     * Scoped OAuth requires: {@code oncalls.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>timeZone: Time zone in which results will be rendered. This will default to the account time zone.</li>
     *   <li>limit: The number of results per page.</li>
     *   <li>offset: Offset to start pagination search results.</li>
     *   <li>total: By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information. </li>
     *   <li>include: Array of additional details to include.</li>
     *   <li>userIds: Filters the results, showing only on-calls for the specified user IDs.</li>
     *   <li>escalationPolicyIds: Filters the results, showing only on-calls for the specified escalation policy IDs.</li>
     *   <li>scheduleIds: Filters the results, showing only on-calls for the specified schedule IDs. If {@code null} is provided in the array, it includes permanent on-calls due to direct user escalation targets.</li>
     *   <li>since: The start of the time range over which you want to search. If an on-call period overlaps with the range, it will be included in the result. Defaults to current time. On-call shifts are limited to 90 days in the future.</li>
     *   <li>until: The end of the time range over which you want to search. If an on-call period overlaps with the range, it will be included in the result. Defaults to current time. On-call shifts are limited to 90 days in the future, and the {@code until} time cannot be before the {@code since} time.</li>
     *   <li>earliest: This will filter on-calls such that only the earliest on-call for each combination of escalation policy, escalation level, and user is returned. This is useful for determining when the "next" on-calls are for a given set of filters.</li>
     * </ul>
     */
    public ListOnCalls200Response listOnCalls(Consumer<ListOnCallsOperationSpec> spec) {
        ListOnCallsOperationSpec r = new ListOnCallsOperationSpec(spec);
        return api.listOnCalls(r.timeZone(), r.limit(), r.offset(), r.total(), r.include(), r.userIds(), r.escalationPolicyIds(), r.scheduleIds(), r.since(), r.until(), r.earliest());
    }

    /**
     * List Integrations for an Event Orchestration
     * <p>
     * List the Integrations associated with this Event Orchestrations.
     * You can use a Routing Key from these Integrations to send events to PagerDuty!
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#event-orchestrations)
     * Scoped OAuth requires: {@code event_orchestrations.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of an Event Orchestration.</li>
     * </ul>
     */
    public ListOrchestrationIntegrations200Response listOrchestrationIntegrations(Consumer<ListOrchestrationIntegrationsOperationSpec> spec) {
        ListOrchestrationIntegrationsOperationSpec r = new ListOrchestrationIntegrationsOperationSpec(spec);
        return api.listOrchestrationIntegrations(r.id());
    }

    /**
     * List priorities
     * <p>
     * List existing priorities, in order (most to least severe).
     * A priority is a label representing the importance and impact of an incident. This feature is only available on Standard and Enterprise plans.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#priorities)
     * Scoped OAuth requires: {@code priorities.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>limit: The number of results per page.</li>
     *   <li>offset: Offset to start pagination search results.</li>
     *   <li>total: By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information. </li>
     * </ul>
     */
    public ListPriorities200Response listPriorities(Consumer<ListPrioritiesOperationSpec> spec) {
        ListPrioritiesOperationSpec r = new ListPrioritiesOperationSpec(spec);
        return api.listPriorities(r.limit(), r.offset(), r.total());
    }

    /**
     * List a resource's standards scores
     * <p>
     * List standards applied to a specific resource
     * Scoped OAuth requires: {@code standards.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: Id of the resource to apply the standards.</li>
     *   <li>resourceType: </li>
     * </ul>
     */
    public StandardApplied listResourceStandards(Consumer<ListResourceStandardsOperationSpec> spec) {
        ListResourceStandardsOperationSpec r = new ListResourceStandardsOperationSpec(spec);
        return api.listResourceStandards(r.id(), r.resourceType());
    }

    /**
     * List resources' standards scores
     * <p>
     * List standards applied to a set of resources
     * Scoped OAuth requires: {@code standards.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>ids: Ids of resources to apply the standards. Maximum of 100 items</li>
     *   <li>resourceType: </li>
     * </ul>
     */
    public ListResourceStandardsManyServices200Response listResourceStandardsManyServices(Consumer<ListResourceStandardsManyServicesOperationSpec> spec) {
        ListResourceStandardsManyServicesOperationSpec r = new ListResourceStandardsManyServicesOperationSpec(spec);
        return api.listResourceStandardsManyServices(r.ids(), r.resourceType());
    }

    /**
     * List Response Plays
     * <p>
     * List all of the existing Response Plays.
     * Response Plays allow you to create packages of Incident Actions that can be applied during an Incident's life cycle.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#response-plays)
     * When using a Global API token, the {@code From} header is required.
     * Scoped OAuth requires: {@code response_plays.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>query: Filters the result, showing only the records whose name matches the query.</li>
     *   <li>filterForManualRun: When this parameter is present, only those Response Plays that can be run manually will be returned.</li>
     *   <li>from: The email address of a valid user associated with the account making the request. This is optional, and is only used for change tracking.</li>
     * </ul>
     * @deprecated
     */
    @Deprecated
    public ListResponsePlays200Response listResponsePlays(Consumer<ListResponsePlaysOperationSpec> spec) {
        ListResponsePlaysOperationSpec r = new ListResponsePlaysOperationSpec(spec);
        return api.listResponsePlays(r.query(), r.filterForManualRun(), r.from());
    }

    /**
     * List Event Rules
     * <p>
     * List all Event Rules on a Ruleset. &amp;lt;!-- theme: warning --&amp;gt; &amp;gt; ### End-of-life &amp;gt; Rulesets and Event Rules will end-of-life soon. We highly recommend that you [migrate to Event Orchestration](https://support.pagerduty.com/docs/migrate-to-event-orchestration) as soon as possible so you can take advantage of the new functionality, such as improved UI, rule creation, APIs and Terraform support, advanced conditions, and rule nesting.
     * Rulesets allow you to route events to an endpoint and create collections of Event Rules, which define sets of actions to take based on event content.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#rulesets)
     * Note: Create and Update on rules will accept 'description' or 'summary' interchangeably as an extraction action target. Get and List on rules will always return 'summary' as the target. If you are expecting 'description' please change your automation code to expect 'summary' instead.
     * Scoped OAuth requires: {@code event_rules.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>limit: The number of results per page.</li>
     *   <li>offset: Offset to start pagination search results.</li>
     *   <li>total: By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information. </li>
     * </ul>
     */
    public ListRulesetEventRules200Response listRulesetEventRules(Consumer<ListRulesetEventRulesOperationSpec> spec) {
        ListRulesetEventRulesOperationSpec r = new ListRulesetEventRulesOperationSpec(spec);
        return api.listRulesetEventRules(r.id(), r.limit(), r.offset(), r.total());
    }

    /**
     * List Rulesets
     * <p>
     * List all Rulesets &amp;lt;!-- theme: warning --&amp;gt; &amp;gt; ### End-of-life &amp;gt; Rulesets and Event Rules will end-of-life soon. We highly recommend that you [migrate to Event Orchestration](https://support.pagerduty.com/docs/migrate-to-event-orchestration) as soon as possible so you can take advantage of the new functionality, such as improved UI, rule creation, APIs and Terraform support, advanced conditions, and rule nesting.
     * Rulesets allow you to route events to an endpoint and create collections of Event Rules, which define sets of actions to take based on event content.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#rulesets)
     * Scoped OAuth requires: {@code event_rules.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>limit: The number of results per page.</li>
     *   <li>offset: Offset to start pagination search results.</li>
     *   <li>total: By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information. </li>
     * </ul>
     */
    public ListRulesets200Response listRulesets(Consumer<ListRulesetsOperationSpec> spec) {
        ListRulesetsOperationSpec r = new ListRulesetsOperationSpec(spec);
        return api.listRulesets(r.limit(), r.offset(), r.total());
    }

    /**
     * List overrides
     * <p>
     * List overrides for a given time range.
     * A Schedule determines the time periods that users are On-Call.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#schedules)
     * Scoped OAuth requires: {@code schedules.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>since: The start of the date range over which you want to search.</li>
     *   <li>until: The end of the date range over which you want to search.</li>
     *   <li>editable: When this parameter is present, only editable overrides will be returned. The result will only include the id of the override if this parameter is present. Only future overrides are editable.</li>
     *   <li>overflow: Any on-call schedule entries that pass the date range bounds will be truncated at the bounds, unless the parameter overflow=true is passed. This parameter defaults to false.</li>
     * </ul>
     */
    public ListScheduleOverrides201Response listScheduleOverrides(Consumer<ListScheduleOverridesOperationSpec> spec) {
        ListScheduleOverridesOperationSpec r = new ListScheduleOverridesOperationSpec(spec);
        return api.listScheduleOverrides(r.id(), r.since(), r.until(), r.editable(), r.overflow());
    }

    /**
     * List users on call.
     * <p>
     * List all of the users on call in a given schedule for a given time range.
     * A Schedule determines the time periods that users are On-Call.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#schedules)
     * Scoped OAuth requires: {@code users.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>since: The start of the date range over which you want to search.</li>
     *   <li>until: The end of the date range over which you want to search.</li>
     * </ul>
     */
    public ListScheduleUsers200Response listScheduleUsers(Consumer<ListScheduleUsersOperationSpec> spec) {
        ListScheduleUsersOperationSpec r = new ListScheduleUsersOperationSpec(spec);
        return api.listScheduleUsers(r.id(), r.since(), r.until());
    }

    /**
     * List schedules
     * <p>
     * List the on-call schedules.
     * A Schedule determines the time periods that users are On-Call.
     *  For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#schedules)
     * Scoped OAuth requires: {@code schedules.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>limit: The number of results per page.</li>
     *   <li>offset: Offset to start pagination search results.</li>
     *   <li>total: By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information. </li>
     *   <li>query: Filters the result, showing only the records whose name matches the query.</li>
     *   <li>include: Array of additional details to include.</li>
     *   <li>timeZone: Time zone in which results will be rendered. This will default to the current user's time zone and then the account's time zone.</li>
     * </ul>
     */
    public ListSchedules200Response listSchedules(Consumer<ListSchedulesOperationSpec> spec) {
        ListSchedulesOperationSpec r = new ListSchedulesOperationSpec(spec);
        return api.listSchedules(r.limit(), r.offset(), r.total(), r.query(), r.include(), r.timeZone());
    }

    /**
     * List audit records for a schedule
     * <p>
     * The returned records are sorted by the {@code execution_time} from newest to oldest.
     * See [{@code Cursor-based pagination}](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for instructions on how to paginate through the result set.
     * For more information see the [Audit API Document](https://developer.pagerduty.com/docs/rest-api-v2/audit-records-api/).
     * Scoped OAuth requires: {@code audit_records.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>limit: The minimum of the {@code limit} parameter used in the request or the maximum request size of the API.</li>
     *   <li>cursor: Optional parameter used to request the "next" set of results from an API.  The value provided here is most commonly obtained from the {@code next_cursor} field of the previous request.  When no value is provided, the request starts at the beginning of the result set. </li>
     *   <li>since: The start of the date range over which you want to search. If not specified, defaults to {@code now() - 24 hours} (past 24 hours)</li>
     *   <li>until: The end of the date range over which you want to search. If not specified, defaults to {@code now()}. May not be more than 31 days after {@code since}.</li>
     * </ul>
     */
    public AuditRecordResponseSchema listSchedulesAuditRecords(Consumer<ListSchedulesAuditRecordsOperationSpec> spec) {
        ListSchedulesAuditRecordsOperationSpec r = new ListSchedulesAuditRecordsOperationSpec(spec);
        return api.listSchedulesAuditRecords(r.id(), r.limit(), r.cursor(), r.since(), r.until());
    }

    /**
     * List audit records for a service
     * <p>
     * The returned records are sorted by the {@code execution_time} from newest to oldest.
     * See [{@code Cursor-based pagination}](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for instructions on how to paginate through the result set.
     * For more information see the [Audit API Document](https://developer.pagerduty.com/docs/rest-api-v2/audit-records-api/).
     * Scoped OAuth requires: {@code audit_records.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>limit: The minimum of the {@code limit} parameter used in the request or the maximum request size of the API.</li>
     *   <li>cursor: Optional parameter used to request the "next" set of results from an API.  The value provided here is most commonly obtained from the {@code next_cursor} field of the previous request.  When no value is provided, the request starts at the beginning of the result set. </li>
     *   <li>since: The start of the date range over which you want to search. If not specified, defaults to {@code now() - 24 hours} (past 24 hours)</li>
     *   <li>until: The end of the date range over which you want to search. If not specified, defaults to {@code now()}. May not be more than 31 days after {@code since}.</li>
     * </ul>
     */
    public AuditRecordResponseSchema listServiceAuditRecords(Consumer<ListServiceAuditRecordsOperationSpec> spec) {
        ListServiceAuditRecordsOperationSpec r = new ListServiceAuditRecordsOperationSpec(spec);
        return api.listServiceAuditRecords(r.id(), r.limit(), r.cursor(), r.since(), r.until());
    }

    /**
     * List Change Events for a service
     * <p>
     * List all of the existing Change Events for a service.
     * Scoped OAuth requires: {@code services.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>since: The start of the date range over which you want to search, as a UTC ISO 8601 datetime string. Will return an HTTP 400 for non-UTC datetimes.</li>
     *   <li>until: The end of the date range over which you want to search, as a UTC ISO 8601 datetime string. Will return an HTTP 400 for non-UTC datetimes.</li>
     *   <li>limit: The number of results per page.</li>
     *   <li>offset: Offset to start pagination search results.</li>
     *   <li>total: By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information. </li>
     *   <li>teamIds: An array of team IDs. Only results related to these teams will be returned. Account must have the {@code teams} ability to use this parameter.</li>
     *   <li>integrationIds: An array of integration IDs. Only results related to these integrations will be returned.</li>
     * </ul>
     */
    public ListChangeEvents200Response listServiceChangeEvents(Consumer<ListServiceChangeEventsOperationSpec> spec) {
        ListServiceChangeEventsOperationSpec r = new ListServiceChangeEventsOperationSpec(spec);
        return api.listServiceChangeEvents(r.id(), r.since(), r.until(), r.limit(), r.offset(), r.total(), r.teamIds(), r.integrationIds());
    }

    /**
     * List Service's Event Rules
     * <p>
     * List Event Rules on a Service. &amp;lt;!-- theme: warning --&amp;gt; &amp;gt; ### End-of-life &amp;gt; Rulesets and Event Rules will end-of-life soon. We highly recommend that you [migrate to Event Orchestration](https://support.pagerduty.com/docs/migrate-to-event-orchestration) as soon as possible so you can take advantage of the new functionality, such as improved UI, rule creation, APIs and Terraform support, advanced conditions, and rule nesting.
     * Scoped OAuth requires: {@code services.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>limit: The number of results per page.</li>
     *   <li>offset: Offset to start pagination search results.</li>
     *   <li>total: By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information. </li>
     *   <li>include: Array of additional Models to include in response.</li>
     * </ul>
     */
    public ListServiceEventRules200Response listServiceEventRules(Consumer<ListServiceEventRulesOperationSpec> spec) {
        ListServiceEventRulesOperationSpec r = new ListServiceEventRulesOperationSpec(spec);
        return api.listServiceEventRules(r.id(), r.limit(), r.offset(), r.total(), r.include());
    }

    /**
     * List services
     * <p>
     * List existing Services.
     * A service may represent an application, component, or team you wish to open incidents against.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#services)
     * Scoped OAuth requires: {@code services.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>query: Filters the result, showing only the records whose name matches the query.</li>
     *   <li>limit: The number of results per page.</li>
     *   <li>offset: Offset to start pagination search results.</li>
     *   <li>total: By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information. </li>
     *   <li>teamIds: An array of team IDs. Only results related to these teams will be returned. Account must have the {@code teams} ability to use this parameter.</li>
     *   <li>timeZone: Time zone in which results will be rendered. This will default to the account time zone.</li>
     *   <li>sortBy: Used to specify the field you wish to sort the results on.</li>
     *   <li>include: Array of additional details to include.</li>
     * </ul>
     */
    public ListServices200Response listServices(Consumer<ListServicesOperationSpec> spec) {
        ListServicesOperationSpec r = new ListServicesOperationSpec(spec);
        return api.listServices(r.query(), r.limit(), r.offset(), r.total(), r.teamIds(), r.timeZone(), r.sortBy(), r.include());
    }

    /**
     * List Standards
     * <p>
     * Get all standards of an account.
     * Scoped OAuth requires: {@code standards.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>active: </li>
     *   <li>resourceType: </li>
     * </ul>
     */
    public ListStandards200Response listStandards(Consumer<ListStandardsOperationSpec> spec) {
        ListStandardsOperationSpec r = new ListStandardsOperationSpec(spec);
        return api.listStandards(r.active(), r.resourceType());
    }

    /**
     * List Status Dashboards
     * <p>
     * Get all your account's custom Status Dashboard views.
     * Scoped OAuth requires: {@code status_dashboards.read} 
     */
    public ListStatusDashboards200Response listStatusDashboards() {
        return api.listStatusDashboards();
    }

    /**
     * List tags
     * <p>
     * List all of your account's tags.
     * A Tag is applied to Escalation Policies, Teams or Users and can be used to filter them.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#tags)
     * Scoped OAuth requires: {@code tags.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>limit: The number of results per page.</li>
     *   <li>offset: Offset to start pagination search results.</li>
     *   <li>total: By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information. </li>
     *   <li>query: Filters the result, showing only the tags whose label matches the query.</li>
     * </ul>
     */
    public GetEntityTypeByIdTags200Response listTags(Consumer<ListTagsOperationSpec> spec) {
        ListTagsOperationSpec r = new ListTagsOperationSpec(spec);
        return api.listTags(r.limit(), r.offset(), r.total(), r.query());
    }

    /**
     * List members of a team
     * <p>
     * Get information about members on a team.
     * A team is a collection of Users and Escalation Policies that represent a group of people within an organization.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#teams)
     * Scoped OAuth requires: {@code teams.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>limit: The number of results per page.</li>
     *   <li>offset: Offset to start pagination search results.</li>
     *   <li>total: By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information. </li>
     *   <li>include: Array of additional Models to include in response.</li>
     * </ul>
     */
    public ListTeamUsers200Response listTeamUsers(Consumer<ListTeamUsersOperationSpec> spec) {
        ListTeamUsersOperationSpec r = new ListTeamUsersOperationSpec(spec);
        return api.listTeamUsers(r.id(), r.limit(), r.offset(), r.total(), r.include());
    }

    /**
     * List teams
     * <p>
     * List teams of your PagerDuty account, optionally filtered by a search query.
     * A team is a collection of Users and Escalation Policies that represent a group of people within an organization.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#teams)
     * Scoped OAuth requires: {@code teams.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>limit: The number of results per page.</li>
     *   <li>offset: Offset to start pagination search results.</li>
     *   <li>total: By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information. </li>
     *   <li>query: Filters the result, showing only the records whose name matches the query.</li>
     * </ul>
     */
    public ListTeams200Response listTeams(Consumer<ListTeamsOperationSpec> spec) {
        ListTeamsOperationSpec r = new ListTeamsOperationSpec(spec);
        return api.listTeams(r.limit(), r.offset(), r.total(), r.query());
    }

    /**
     * List audit records for a team
     * <p>
     * The returned records are sorted by the {@code execution_time} from newest to oldest.
     * See [{@code Cursor-based pagination}](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for instructions on how to paginate through the result set.
     * For more information see the [Audit API Document](https://developer.pagerduty.com/docs/rest-api-v2/audit-records-api/).
     * Scoped OAuth requires: {@code audit_records.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>limit: The minimum of the {@code limit} parameter used in the request or the maximum request size of the API.</li>
     *   <li>cursor: Optional parameter used to request the "next" set of results from an API.  The value provided here is most commonly obtained from the {@code next_cursor} field of the previous request.  When no value is provided, the request starts at the beginning of the result set. </li>
     *   <li>since: The start of the date range over which you want to search. If not specified, defaults to {@code now() - 24 hours} (past 24 hours)</li>
     *   <li>until: The end of the date range over which you want to search. If not specified, defaults to {@code now()}. May not be more than 31 days after {@code since}.</li>
     * </ul>
     */
    public AuditRecordResponseSchema listTeamsAuditRecords(Consumer<ListTeamsAuditRecordsOperationSpec> spec) {
        ListTeamsAuditRecordsOperationSpec r = new ListTeamsAuditRecordsOperationSpec(spec);
        return api.listTeamsAuditRecords(r.id(), r.limit(), r.cursor(), r.since(), r.until());
    }

    /**
     * List users
     * <p>
     * List users of your PagerDuty account, optionally filtered by a search query.
     * Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>query: Filters the result, showing only the records whose name matches the query.</li>
     *   <li>teamIds: An array of team IDs. Only results related to these teams will be returned. Account must have the {@code teams} ability to use this parameter.</li>
     *   <li>limit: The number of results per page.</li>
     *   <li>offset: Offset to start pagination search results.</li>
     *   <li>total: By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information. </li>
     *   <li>include: Array of additional Models to include in response.</li>
     * </ul>
     */
    public ListUsers200Response listUsers(Consumer<ListUsersOperationSpec> spec) {
        ListUsersOperationSpec r = new ListUsersOperationSpec(spec);
        return api.listUsers(r.query(), r.teamIds(), r.limit(), r.offset(), r.total(), r.include());
    }

    /**
     * List audit records for a user
     * <p>
     * The response will include audit records with changes that are made to the identified user not changes made by the identified user.
     *  The returned records are sorted by the {@code execution_time} from newest to oldest.
     * See [{@code Cursor-based pagination}](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for instructions on how to paginate through the result set.
     * For more information see the [Audit API Document](https://developer.pagerduty.com/docs/rest-api-v2/audit-records-api/).
     * Scoped OAuth requires: {@code audit_records.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>limit: The minimum of the {@code limit} parameter used in the request or the maximum request size of the API.</li>
     *   <li>cursor: Optional parameter used to request the "next" set of results from an API.  The value provided here is most commonly obtained from the {@code next_cursor} field of the previous request.  When no value is provided, the request starts at the beginning of the result set. </li>
     *   <li>since: The start of the date range over which you want to search. If not specified, defaults to {@code now() - 24 hours} (past 24 hours)</li>
     *   <li>until: The end of the date range over which you want to search. If not specified, defaults to {@code now()}. May not be more than 31 days after {@code since}.</li>
     * </ul>
     */
    public AuditRecordResponseSchema listUsersAuditRecords(Consumer<ListUsersAuditRecordsOperationSpec> spec) {
        ListUsersAuditRecordsOperationSpec r = new ListUsersAuditRecordsOperationSpec(spec);
        return api.listUsersAuditRecords(r.id(), r.limit(), r.cursor(), r.since(), r.until());
    }

    /**
     * List vendors
     * <p>
     * List all vendors.
     * A PagerDuty Vendor represents a specific type of integration. AWS Cloudwatch, Splunk, Datadog are all examples of vendors
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#vendors)
     * Scoped OAuth requires: {@code vendors.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>limit: The number of results per page.</li>
     *   <li>offset: Offset to start pagination search results.</li>
     *   <li>total: By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information. </li>
     * </ul>
     */
    public ListVendors200Response listVendors(Consumer<ListVendorsOperationSpec> spec) {
        ListVendorsOperationSpec r = new ListVendorsOperationSpec(spec);
        return api.listVendors(r.limit(), r.offset(), r.total());
    }

    /**
     * List webhook subscriptions
     * <p>
     * List existing webhook subscriptions.
     * The {@code filter_type} and {@code filter_id} query parameters may be used to only show subscriptions for a particular _service_ or _team_.
     * For more information on webhook subscriptions and how they are used to configure v3 webhooks see the [Webhooks v3 Developer Documentation](https://developer.pagerduty.com/docs/webhooks/v3-overview/). 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>limit: The number of results per page.</li>
     *   <li>offset: Offset to start pagination search results.</li>
     *   <li>total: By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information. </li>
     *   <li>filterType: The type of resource to filter upon.</li>
     *   <li>filterId: The id of the resource to filter upon.</li>
     * </ul>
     */
    public ListWebhookSubscriptions200Response listWebhookSubscriptions(Consumer<ListWebhookSubscriptionsOperationSpec> spec) {
        ListWebhookSubscriptionsOperationSpec r = new ListWebhookSubscriptionsOperationSpec(spec);
        return api.listWebhookSubscriptions(r.limit(), r.offset(), r.total(), r.filterType(), r.filterId());
    }

    /**
     * Merge incidents
     * <p>
     * Merge a list of source incidents into this incident.
     * An incident represents a problem or an issue that needs to be addressed and resolved.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#incidents)
     * Scoped OAuth requires: {@code incidents.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>from: The email address of a valid user associated with the account making the request.</li>
     *   <li>mergeIncidentsRequest: </li>
     * </ul>
     */
    public MergeIncidents200Response mergeIncidents(Consumer<MergeIncidentsOperationSpec> spec) {
        MergeIncidentsOperationSpec r = new MergeIncidentsOperationSpec(spec);
        return api.mergeIncidents(r.id(), r.from(), r.mergeIncidentsRequest());
    }

    /**
     * Migrate an Integration from one Event Orchestration to another
     * <p>
     * Move an Integration and its Routing Key from the Event Orchestration specified in the request payload, to the Event Orchestration specified in the request URL.
     * Any future events sent to this Integration's Routing Key will be processed by this Event Orchestration's Rules.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#event-orchestrations)
     * Scoped OAuth requires: {@code event_orchestrations.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of an Event Orchestration.</li>
     *   <li>migrateOrchestrationIntegrationRequest: </li>
     * </ul>
     */
    public ListOrchestrationIntegrations200Response migrateOrchestrationIntegration(Consumer<MigrateOrchestrationIntegrationOperationSpec> spec) {
        MigrateOrchestrationIntegrationOperationSpec r = new MigrateOrchestrationIntegrationOperationSpec(spec);
        return api.migrateOrchestrationIntegration(r.id(), r.migrateOrchestrationIntegrationRequest());
    }

    /**
     * Create an Incident Workflow
     * <p>
     * Create a new Incident Workflow
     * An Incident Workflow is a sequence of configurable Steps and associated Triggers that can execute automated Actions for a given Incident.
     * Scoped OAuth requires: {@code incident_workflows.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>postIncidentWorkflowRequest: </li>
     * </ul>
     */
    public PostIncidentWorkflowRequest postIncidentWorkflow(Consumer<PostIncidentWorkflowOperationSpec> spec) {
        PostIncidentWorkflowOperationSpec r = new PostIncidentWorkflowOperationSpec(spec);
        return api.postIncidentWorkflow(r.postIncidentWorkflowRequest());
    }

    /**
     * Create an Orchestration
     * <p>
     * Create a Global Event Orchestration.
     * Global Event Orchestrations allow you define a set of Global Rules and Router Rules, so that when you ingest events using the Orchestration's Routing Key your events will have actions applied via the Global Rules &amp; then routed to the correct Service by the Router Rules, based on the event's content.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#event-orchestrations)
     * Scoped OAuth requires: {@code event_orchestrations.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>postOrchestrationRequest: </li>
     * </ul>
     */
    public PostOrchestration201Response postOrchestration(Consumer<PostOrchestrationOperationSpec> spec) {
        PostOrchestrationOperationSpec r = new PostOrchestrationOperationSpec(spec);
        return api.postOrchestration(r.postOrchestrationRequest());
    }

    /**
     * Create an Integration for an Event Orchestration
     * <p>
     * Create an Integration associated with this Event Orchestration.
     * You can then use the Routing Key from this new Integration to send events to PagerDuty!
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#event-orchestrations)
     * Scoped OAuth requires: {@code event_orchestrations.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of an Event Orchestration.</li>
     *   <li>postOrchestrationIntegrationRequest: </li>
     * </ul>
     */
    public PostOrchestrationIntegration201Response postOrchestrationIntegration(Consumer<PostOrchestrationIntegrationOperationSpec> spec) {
        PostOrchestrationIntegrationOperationSpec r = new PostOrchestrationIntegrationOperationSpec(spec);
        return api.postOrchestrationIntegration(r.id(), r.postOrchestrationIntegrationRequest());
    }

    /**
     * Set the Account-level priority threshold for Business Service impact.
     * <p>
     * Set the Account-level priority threshold for Business Service. Scoped OAuth requires: {@code services.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>putBusinessServicePriorityThresholdsRequest: Set the {@code id} and {@code order} of the global Priority Threshold. These values can be obtained by calling the {@code /priorities} endpoint.  Once set, Incidents must be at or above the specified level in order to impact Business Services.  An exception to this rule is if the Incident has been added to the incident directly using the {@code PUT /incidents/{id}/business_services/{business_service_id}/impacts} endpoint.</li>
     * </ul>
     */
    public PutBusinessServicePriorityThresholds200Response putBusinessServicePriorityThresholds(Consumer<PutBusinessServicePriorityThresholdsOperationSpec> spec) {
        PutBusinessServicePriorityThresholdsOperationSpec r = new PutBusinessServicePriorityThresholdsOperationSpec(spec);
        return api.putBusinessServicePriorityThresholds(r.putBusinessServicePriorityThresholdsRequest());
    }

    /**
     * Manually change an Incident's Impact on a Business Service.
     * <p>
     * Change Impact of an Incident on a Business Service. Scoped OAuth requires: {@code incidents.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>businessServiceId: The business service ID.</li>
     *   <li>putIncidentManualBusinessServiceAssociationRequest: The {@code impacted} relation will cause the Business Service and any Services that it supports to become impacted by this incident.  The {@code not_impacted} relation will remove the Incident's Impact from the specified Business Service.  The effect of adding or removing Impact to a Business Service in this way will also change the propagation of Impact to other Services supported by that Business Service.</li>
     * </ul>
     */
    public PutIncidentManualBusinessServiceAssociation200Response putIncidentManualBusinessServiceAssociation(Consumer<PutIncidentManualBusinessServiceAssociationOperationSpec> spec) {
        PutIncidentManualBusinessServiceAssociationOperationSpec r = new PutIncidentManualBusinessServiceAssociationOperationSpec(spec);
        return api.putIncidentManualBusinessServiceAssociation(r.id(), r.businessServiceId(), r.putIncidentManualBusinessServiceAssociationRequest());
    }

    /**
     * Update an Incident Workflow
     * <p>
     * Update an Incident Workflow
     * An Incident Workflow is a sequence of configurable Steps and associated Triggers that can execute automated Actions for a given Incident.
     * Scoped OAuth requires: {@code incident_workflows.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>postIncidentWorkflowRequest: </li>
     * </ul>
     */
    public PostIncidentWorkflowRequest putIncidentWorkflow(Consumer<PutIncidentWorkflowOperationSpec> spec) {
        PutIncidentWorkflowOperationSpec r = new PutIncidentWorkflowOperationSpec(spec);
        return api.putIncidentWorkflow(r.id(), r.postIncidentWorkflowRequest());
    }

    /**
     * Delete Business Service Account Subscription
     * <p>
     * Unsubscribe your Account from a Business Service.
     * Scoped OAuth requires: {@code subscribers.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public void removeBusinessServiceAccountSubscription(Consumer<RemoveBusinessServiceAccountSubscriptionOperationSpec> spec) {
        RemoveBusinessServiceAccountSubscriptionOperationSpec r = new RemoveBusinessServiceAccountSubscriptionOperationSpec(spec);
        api.removeBusinessServiceAccountSubscription(r.id());
    }

    /**
     * Remove Business Service Subscribers
     * <p>
     * Unsubscribes the matching Subscribers from a Business Service.
     * Scoped OAuth requires: {@code subscribers.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>createBusinessServiceNotificationSubscribersRequest: The entities to unsubscribe.</li>
     * </ul>
     */
    public RemoveBusinessServiceNotificationSubscriber200Response removeBusinessServiceNotificationSubscriber(Consumer<RemoveBusinessServiceNotificationSubscriberOperationSpec> spec) {
        RemoveBusinessServiceNotificationSubscriberOperationSpec r = new RemoveBusinessServiceNotificationSubscriberOperationSpec(spec);
        return api.removeBusinessServiceNotificationSubscriber(r.id(), r.createBusinessServiceNotificationSubscribersRequest());
    }

    /**
     * Remove Notification Subscriber
     * <p>
     * Unsubscribes the matching Subscribers from Incident Status Update Notifications.
     * Scoped OAuth requires: {@code subscribers.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>createBusinessServiceNotificationSubscribersRequest: The entities to unsubscribe.</li>
     * </ul>
     */
    public RemoveBusinessServiceNotificationSubscriber200Response removeIncidentNotificationSubscribers(Consumer<RemoveIncidentNotificationSubscribersOperationSpec> spec) {
        RemoveIncidentNotificationSubscribersOperationSpec r = new RemoveIncidentNotificationSubscribersOperationSpec(spec);
        return api.removeIncidentNotificationSubscribers(r.id(), r.createBusinessServiceNotificationSubscribersRequest());
    }

    /**
     * <p>
     * Unsubscribe the given Team from Notifications on the matching Subscribable entities.
     * Scoped OAuth requires: {@code subscribers.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>createTeamNotificationSubscriptionsRequest: The entities to unsubscribe from.</li>
     * </ul>
     */
    public RemoveBusinessServiceNotificationSubscriber200Response removeTeamNotificationSubscriptions(Consumer<RemoveTeamNotificationSubscriptionsOperationSpec> spec) {
        RemoveTeamNotificationSubscriptionsOperationSpec r = new RemoveTeamNotificationSubscriptionsOperationSpec(spec);
        return api.removeTeamNotificationSubscriptions(r.id(), r.createTeamNotificationSubscriptionsRequest());
    }

    /**
     * Render a template
     * <p>
     * Render a template. This endpoint has a variable request body depending on the template type. For the {@code status_update} template type, the caller will provide the incident id, and a status update message.
     * Scoped OAuth requires: {@code templates.read} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>renderTemplateRequest: </li>
     * </ul>
     */
    public RenderedTemplate renderTemplate(Consumer<RenderTemplateOperationSpec> spec) {
        RenderTemplateOperationSpec r = new RenderTemplateOperationSpec(spec);
        return api.renderTemplate(r.id(), r.renderTemplateRequest());
    }

    /**
     * Run a response play
     * <p>
     * Run a specified response play on a given incident.
     * Response Plays are a package of Incident Actions that can be applied during an Incident's life cycle.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#response-plays)
     * Scoped OAuth requires: {@code response_plays.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>responsePlayId: The response play ID of the response play associated with the request.</li>
     *   <li>from: The email address of a valid user associated with the account making the request.</li>
     *   <li>mergeIncidents200Response: </li>
     * </ul>
     * @deprecated
     */
    @Deprecated
    public RunResponsePlay200Response runResponsePlay(Consumer<RunResponsePlayOperationSpec> spec) {
        RunResponsePlayOperationSpec r = new RunResponsePlayOperationSpec(spec);
        return api.runResponsePlay(r.responsePlayId(), r.from(), r.mergeIncidents200Response());
    }

    /**
     * Update Custom Field Values
     * <p>
     * Set custom field values for an incident.
     * Scoped OAuth requires: {@code incidents.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>setIncidentFieldValuesRequest: </li>
     * </ul>
     */
    public GetIncidentFieldValues200Response setIncidentFieldValues(Consumer<SetIncidentFieldValuesOperationSpec> spec) {
        SetIncidentFieldValuesOperationSpec r = new SetIncidentFieldValuesOperationSpec(spec);
        return api.setIncidentFieldValues(r.id(), r.setIncidentFieldValuesRequest());
    }

    /**
     * Test a webhook subscription
     * <p>
     * Test a webhook subscription.
     * Fires a test event against the webhook subscription.
     * If properly configured, this will deliver the {@code pagey.ping} webhook event to the destination. 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     * </ul>
     */
    public void testWebhookSubscription(Consumer<TestWebhookSubscriptionOperationSpec> spec) {
        TestWebhookSubscriptionOperationSpec r = new TestWebhookSubscriptionOperationSpec(spec);
        api.testWebhookSubscription(r.id());
    }

    /**
     * Remove Notification Subscriptions
     * <p>
     * Unsubscribe the given User from Notifications on the matching Subscribable entities.
     * Scoped OAuth requires: {@code subscribers.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>createTeamNotificationSubscriptionsRequest: The entities to unsubscribe from.</li>
     * </ul>
     */
    public RemoveBusinessServiceNotificationSubscriber200Response unsubscribeUserNotificationSubscriptions(Consumer<UnsubscribeUserNotificationSubscriptionsOperationSpec> spec) {
        UnsubscribeUserNotificationSubscriptionsOperationSpec r = new UnsubscribeUserNotificationSubscriptionsOperationSpec(spec);
        return api.unsubscribeUserNotificationSubscriptions(r.id(), r.createTeamNotificationSubscriptionsRequest());
    }

    /**
     * Update an Add-on
     * <p>
     * Update an existing Add-on.
     * Addon's are pieces of functionality that developers can write to insert new functionality into PagerDuty's UI.
     * Given a configuration containing a {@code src} parameter, that URL will be embedded in an {@code iframe} on a page that's available to users from a drop-down menu.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#add-ons)
     * Scoped OAuth requires: {@code addons.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>createAddonRequest: The Add-on to be updated.</li>
     * </ul>
     */
    public CreateAddonRequest updateAddon(Consumer<UpdateAddonOperationSpec> spec) {
        UpdateAddonOperationSpec r = new UpdateAddonOperationSpec(spec);
        return api.updateAddon(r.id(), r.createAddonRequest());
    }

    /**
     * Update an Automation Action
     * <p>
     * Updates an Automation Action 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>updateAutomationActionRequest: </li>
     * </ul>
     */
    public CreateAutomationAction201Response updateAutomationAction(Consumer<UpdateAutomationActionOperationSpec> spec) {
        UpdateAutomationActionOperationSpec r = new UpdateAutomationActionOperationSpec(spec);
        return api.updateAutomationAction(r.id(), r.updateAutomationActionRequest());
    }

    /**
     * Update an Automation Action runner
     * <p>
     * Update an Automation Action runner 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>updateAutomationActionsRunnerRequest: </li>
     * </ul>
     */
    public GetAutomationActionsRunner200Response updateAutomationActionsRunner(Consumer<UpdateAutomationActionsRunnerOperationSpec> spec) {
        UpdateAutomationActionsRunnerOperationSpec r = new UpdateAutomationActionsRunnerOperationSpec(spec);
        return api.updateAutomationActionsRunner(r.id(), r.updateAutomationActionsRunnerRequest());
    }

    /**
     * Update a Business Service
     * <p>
     * Update an existing Business Service. NOTE that this endpoint also accepts the PATCH verb.
     * Business services model capabilities that span multiple technical services and that may be owned by several different teams.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#business-services)
     * Scoped OAuth requires: {@code services.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>updateBusinessServiceRequest: </li>
     * </ul>
     */
    public CreateBusinessService200Response updateBusinessService(Consumer<UpdateBusinessServiceOperationSpec> spec) {
        UpdateBusinessServiceOperationSpec r = new UpdateBusinessServiceOperationSpec(spec);
        return api.updateBusinessService(r.id(), r.updateBusinessServiceRequest());
    }

    /**
     * Update a Change Event
     * <p>
     * Update an existing Change Event
     * Scoped OAuth requires: {@code change_events.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>updateChangeEventRequest: The Change Event to be updated.</li>
     * </ul>
     */
    public GetChangeEvent200Response updateChangeEvent(Consumer<UpdateChangeEventOperationSpec> spec) {
        UpdateChangeEventOperationSpec r = new UpdateChangeEventOperationSpec(spec);
        return api.updateChangeEvent(r.id(), r.updateChangeEventRequest());
    }

    /**
     * Update a Field
     * <p>
     * Update a field.
     * Scoped OAuth requires: {@code custom_fields.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>fieldId: The ID of the field.</li>
     *   <li>updateCustomFieldsFieldRequest: </li>
     * </ul>
     */
    public UpdateCustomFieldsField200Response updateCustomFieldsField(Consumer<UpdateCustomFieldsFieldOperationSpec> spec) {
        UpdateCustomFieldsFieldOperationSpec r = new UpdateCustomFieldsFieldOperationSpec(spec);
        return api.updateCustomFieldsField(r.fieldId(), r.updateCustomFieldsFieldRequest());
    }

    /**
     * Update a Field Option
     * <p>
     * Update Field Option for a Field.
     * Scoped OAuth requires: {@code custom_fields.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>fieldId: The ID of the field.</li>
     *   <li>fieldOptionId: The ID of the field option.</li>
     *   <li>updateCustomFieldsFieldOptionRequest: </li>
     * </ul>
     */
    public CreateCustomFieldsFieldOptionRequest updateCustomFieldsFieldOption(Consumer<UpdateCustomFieldsFieldOptionOperationSpec> spec) {
        UpdateCustomFieldsFieldOptionOperationSpec r = new UpdateCustomFieldsFieldOptionOperationSpec(spec);
        return api.updateCustomFieldsFieldOption(r.fieldId(), r.fieldOptionId(), r.updateCustomFieldsFieldOptionRequest());
    }

    /**
     * Update an escalation policy
     * <p>
     * Updates an existing escalation policy and rules.
     * Escalation policies define which user should be alerted at which time.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#escalation-policies)
     * Scoped OAuth requires: {@code escalation_policies.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>createEscalationPolicyRequest: The escalation policy to be updated.</li>
     * </ul>
     */
    public CreateEscalationPolicyRequest updateEscalationPolicy(Consumer<UpdateEscalationPolicyOperationSpec> spec) {
        UpdateEscalationPolicyOperationSpec r = new UpdateEscalationPolicyOperationSpec(spec);
        return api.updateEscalationPolicy(r.id(), r.createEscalationPolicyRequest());
    }

    /**
     * Update an extension
     * <p>
     * Update an existing extension.
     * Extensions are representations of Extension Schema objects that are attached to Services.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#extensions)
     * Scoped OAuth requires: {@code extensions.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>getExtension200Response: The extension to be updated.</li>
     * </ul>
     */
    public GetExtension200Response updateExtension(Consumer<UpdateExtensionOperationSpec> spec) {
        UpdateExtensionOperationSpec r = new UpdateExtensionOperationSpec(spec);
        return api.updateExtension(r.id(), r.getExtension200Response());
    }

    /**
     * Update an incident
     * <p>
     * Acknowledge, resolve, escalate or reassign an incident.
     * An incident represents a problem or an issue that needs to be addressed and resolved.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#incidents)
     * Scoped OAuth requires: {@code incidents.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>from: The email address of a valid user associated with the account making the request.</li>
     *   <li>updateIncidentRequest: </li>
     * </ul>
     */
    public UpdateIncident200Response updateIncident(Consumer<UpdateIncidentOperationSpec> spec) {
        UpdateIncidentOperationSpec r = new UpdateIncidentOperationSpec(spec);
        return api.updateIncident(r.id(), r.from(), r.updateIncidentRequest());
    }

    /**
     * Update an alert
     * <p>
     * Resolve an alert or associate an alert with a new parent incident.
     * An incident represents a problem or an issue that needs to be addressed and resolved.
     * When a service sends an event to PagerDuty, an alert and corresponding incident is triggered in PagerDuty.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#incidents)
     * Scoped OAuth requires: {@code incidents.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>alertId: The id of the alert to retrieve.</li>
     *   <li>from: The email address of a valid user associated with the account making the request.</li>
     *   <li>getIncidentAlert200Response: The parameters of the alert to update.</li>
     * </ul>
     */
    public GetIncidentAlert200Response updateIncidentAlert(Consumer<UpdateIncidentAlertOperationSpec> spec) {
        UpdateIncidentAlertOperationSpec r = new UpdateIncidentAlertOperationSpec(spec);
        return api.updateIncidentAlert(r.id(), r.alertId(), r.from(), r.getIncidentAlert200Response());
    }

    /**
     * Manage alerts
     * <p>
     * Resolve multiple alerts or associate them with different incidents.
     * An incident represents a problem or an issue that needs to be addressed and resolved. An alert represents a digital signal that was emitted to PagerDuty by the monitoring systems that detected or identified the issue.
     * A maximum of 500 alerts may be updated at a time. If more than this number of alerts are given, the API will respond with status 413 (Request Entity Too Large).
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#incidents)
     * Scoped OAuth requires: {@code incidents.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>from: The email address of a valid user associated with the account making the request.</li>
     *   <li>limit: The number of results per page.</li>
     *   <li>offset: Offset to start pagination search results.</li>
     *   <li>total: By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information. </li>
     *   <li>updateIncidentAlertsRequest: </li>
     * </ul>
     */
    public ListIncidentAlerts200Response updateIncidentAlerts(Consumer<UpdateIncidentAlertsOperationSpec> spec) {
        UpdateIncidentAlertsOperationSpec r = new UpdateIncidentAlertsOperationSpec(spec);
        return api.updateIncidentAlerts(r.id(), r.from(), r.limit(), r.offset(), r.total(), r.updateIncidentAlertsRequest());
    }

    /**
     * Update a Trigger
     * <p>
     * Update an existing Incident Workflow Trigger
     * Scoped OAuth requires: {@code incident_workflows.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>createIncidentWorkflowTriggerRequest: </li>
     * </ul>
     */
    public CreateIncidentWorkflowTriggerRequest updateIncidentWorkflowTrigger(Consumer<UpdateIncidentWorkflowTriggerOperationSpec> spec) {
        UpdateIncidentWorkflowTriggerOperationSpec r = new UpdateIncidentWorkflowTriggerOperationSpec(spec);
        return api.updateIncidentWorkflowTrigger(r.id(), r.createIncidentWorkflowTriggerRequest());
    }

    /**
     * Manage incidents
     * <p>
     * Acknowledge, resolve, escalate or reassign one or more incidents.
     * An incident represents a problem or an issue that needs to be addressed and resolved.
     * A maximum of 250 incidents may be updated at a time. If more than this number of incidents are given, the API will respond with status 413 (Request Entity Too Large).
     * Note: the manage incidents API endpoint is rate limited to 500 requests per minute.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#incidents)
     * Scoped OAuth requires: {@code incidents.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>from: The email address of a valid user associated with the account making the request.</li>
     *   <li>limit: The number of results per page.</li>
     *   <li>offset: Offset to start pagination search results.</li>
     *   <li>total: By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information. </li>
     *   <li>updateIncidentsRequest: </li>
     * </ul>
     */
    public ListIncidents200Response updateIncidents(Consumer<UpdateIncidentsOperationSpec> spec) {
        UpdateIncidentsOperationSpec r = new UpdateIncidentsOperationSpec(spec);
        return api.updateIncidents(r.from(), r.limit(), r.offset(), r.total(), r.updateIncidentsRequest());
    }

    /**
     * Update log entry channel information.
     * <p>
     * Update an existing incident log entry channel.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#log-entries)
     * Scoped OAuth requires: {@code incidents.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>from: The email address of a valid user associated with the account making the request.</li>
     *   <li>updateLogEntryChannelRequest: The log entry channel to be updated.</li>
     * </ul>
     */
    public void updateLogEntryChannel(Consumer<UpdateLogEntryChannelOperationSpec> spec) {
        UpdateLogEntryChannelOperationSpec r = new UpdateLogEntryChannelOperationSpec(spec);
        api.updateLogEntryChannel(r.id(), r.from(), r.updateLogEntryChannelRequest());
    }

    /**
     * Update a maintenance window
     * <p>
     * Update an existing maintenance window.
     * A Maintenance Window is used to temporarily disable one or more Services for a set period of time.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#maintenance-windows)
     * Scoped OAuth requires: {@code services.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>createMaintenanceWindowRequest: The maintenance window to be updated.</li>
     * </ul>
     */
    public CreateMaintenanceWindowRequest updateMaintenanceWindow(Consumer<UpdateMaintenanceWindowOperationSpec> spec) {
        UpdateMaintenanceWindowOperationSpec r = new UpdateMaintenanceWindowOperationSpec(spec);
        return api.updateMaintenanceWindow(r.id(), r.createMaintenanceWindowRequest());
    }

    /**
     * Update the Service Orchestration active status for a Service
     * <p>
     * Update a Service Orchestration's active status.
     * A Service Orchestration allows you to set an active status based on whether an event will be evaluated against a service orchestration path (true) or service ruleset (false).
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#event-orchestrations)
     * Scoped OAuth requires: {@code services.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>serviceId: The service ID</li>
     *   <li>getOrchActiveStatus200Response: Update Service Orchestration's active status.</li>
     * </ul>
     */
    public GetOrchActiveStatus200Response updateOrchActiveStatus(Consumer<UpdateOrchActiveStatusOperationSpec> spec) {
        UpdateOrchActiveStatusOperationSpec r = new UpdateOrchActiveStatusOperationSpec(spec);
        return api.updateOrchActiveStatus(r.serviceId(), r.getOrchActiveStatus200Response());
    }

    /**
     * Update the Global Orchestration for an Event Orchestration
     * <p>
     * Update the Global Orchestration for an Event Orchestration.
     * Global Orchestration Rules allows you to create a set of Event Rules. These rules evaluate against all Events sent to an Event Orchestration. When a matching rule is found, it can modify and enhance the event and can route the event to another set of Global Rules within this Orchestration for further processing.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#event-orchestrations)
     * Scoped OAuth requires: {@code event_orchestrations.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of an Event Orchestration.</li>
     *   <li>orchestrationGlobal: Update Global Orchestration rules. Omitted rules and rule details are deleted.</li>
     * </ul>
     */
    public UpdateOrchPathGlobal200Response updateOrchPathGlobal(Consumer<UpdateOrchPathGlobalOperationSpec> spec) {
        UpdateOrchPathGlobalOperationSpec r = new UpdateOrchPathGlobalOperationSpec(spec);
        return api.updateOrchPathGlobal(r.id(), r.orchestrationGlobal());
    }

    /**
     * Update the Router for an Event Orchestration
     * <p>
     * Update a Global Orchestration's Routing Rules.
     * An Orchestration Router allows you to create a set of Event Rules. The Router evaluates Events you send to this Global Orchestration against each of its rules, one at a time, and routes the event to a specific Service based on the first rule that matches. If an event doesn't match any rules, it'll be sent to service specified in as the {@code catch_all} or the "Unrouted" Orchestration if no service is specified.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#event-orchestrations)
     * Scoped OAuth requires: {@code event_orchestrations.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of an Event Orchestration.</li>
     *   <li>orchestrationRouter: Updates to Orchestration Router details. Omitted rules and rule details are deleted.</li>
     * </ul>
     */
    public UpdateOrchPathRouter200Response updateOrchPathRouter(Consumer<UpdateOrchPathRouterOperationSpec> spec) {
        UpdateOrchPathRouterOperationSpec r = new UpdateOrchPathRouterOperationSpec(spec);
        return api.updateOrchPathRouter(r.id(), r.orchestrationRouter());
    }

    /**
     * Update the Service Orchestration for a Service
     * <p>
     * Update a Service Orchestration.
     * A Service Orchestration allows you to create a set of Event Rules. The Service Orchestration evaluates Events sent to this Service against each of its rules, beginning with the rules in the "start" set. When a matching rule is found, it can modify and enhance the event and can route the event to another set of rules within this Service Orchestration for further processing.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#event-orchestrations)
     * Scoped OAuth requires: {@code services.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>serviceId: The service ID</li>
     *   <li>serviceOrchestration: Update Service Orchestration rules. Omitted rules and rule details are deleted.</li>
     * </ul>
     */
    public UpdateOrchPathService200Response updateOrchPathService(Consumer<UpdateOrchPathServiceOperationSpec> spec) {
        UpdateOrchPathServiceOperationSpec r = new UpdateOrchPathServiceOperationSpec(spec);
        return api.updateOrchPathService(r.serviceId(), r.serviceOrchestration());
    }

    /**
     * Update the Unrouted Orchestration for an Event Orchestration
     * <p>
     * Update a Global Event Orchestration's Rules for Unrouted events.
     * An Unrouted Orchestration allows you to create a set of Event Rules that will be evaluated against all events that don't match any rules in the Global Orchestration's Router. Events that reach the Unrouted Orchestration will never be routed to a specific Service.
     * The Unrouted Orchestration evaluates Events sent to it against each of its rules, beginning with the rules in the "start" set. When a matching rule is found, it can modify and enhance the event and can route the event to another set of rules within this Unrouted Orchestration for further processing.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#event-orchestrations)
     * Scoped OAuth requires: {@code event_orchestrations.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of an Event Orchestration.</li>
     *   <li>orchestrationUnrouted: Updates to Unrouted Orchestration rules. Omitted rules and rule details are deleted.</li>
     * </ul>
     */
    public UpdateOrchPathUnrouted200Response updateOrchPathUnrouted(Consumer<UpdateOrchPathUnroutedOperationSpec> spec) {
        UpdateOrchPathUnroutedOperationSpec r = new UpdateOrchPathUnroutedOperationSpec(spec);
        return api.updateOrchPathUnrouted(r.id(), r.orchestrationUnrouted());
    }

    /**
     * Update an Orchestration
     * <p>
     * Update a Global Event Orchestration.
     * Global Event Orchestrations allow you define a set of Global Rules and Router Rules, so that when you ingest events using the Orchestration's Routing Key your events will have actions applied via the Global Rules &amp; then routed to the correct Service by the Router Rules, based on the event's content.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#event-orchestrations)
     * Scoped OAuth requires: {@code event_orchestrations.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of an Event Orchestration.</li>
     *   <li>postOrchestrationRequest: </li>
     * </ul>
     */
    public PostOrchestration201Response updateOrchestration(Consumer<UpdateOrchestrationOperationSpec> spec) {
        UpdateOrchestrationOperationSpec r = new UpdateOrchestrationOperationSpec(spec);
        return api.updateOrchestration(r.id(), r.postOrchestrationRequest());
    }

    /**
     * Update an Integration for an Event Orchestration
     * <p>
     * Update an Integration associated with this Event Orchestrations.
     * You can use the Routing Key from this Integration to send events to PagerDuty!
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#event-orchestrations)
     * Scoped OAuth requires: {@code event_orchestrations.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of an Event Orchestration.</li>
     *   <li>integrationId: The ID of an Integration.</li>
     *   <li>postOrchestrationIntegrationRequest: </li>
     * </ul>
     */
    public PostOrchestrationIntegration201Response updateOrchestrationIntegration(Consumer<UpdateOrchestrationIntegrationOperationSpec> spec) {
        UpdateOrchestrationIntegrationOperationSpec r = new UpdateOrchestrationIntegrationOperationSpec(spec);
        return api.updateOrchestrationIntegration(r.id(), r.integrationId(), r.postOrchestrationIntegrationRequest());
    }

    /**
     * Update a Response Play
     * <p>
     * Updates an existing Response Play.
     * Response Plays allow you to create packages of Incident Actions that can be applied during an Incident's life cycle.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#response-plays)
     * Scoped OAuth requires: {@code response_plays.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>from: The email address of a valid user associated with the account making the request.</li>
     *   <li>createResponsePlayRequest: The Response Play to be updated.</li>
     * </ul>
     * @deprecated
     */
    @Deprecated
    public CreateResponsePlay201Response updateResponsePlay(Consumer<UpdateResponsePlayOperationSpec> spec) {
        UpdateResponsePlayOperationSpec r = new UpdateResponsePlayOperationSpec(spec);
        return api.updateResponsePlay(r.id(), r.from(), r.createResponsePlayRequest());
    }

    /**
     * Update a Ruleset
     * <p>
     * Update a Ruleset. &amp;lt;!-- theme: warning --&amp;gt; &amp;gt; ### End-of-life &amp;gt; Rulesets and Event Rules will end-of-life soon. We highly recommend that you [migrate to Event Orchestration](https://support.pagerduty.com/docs/migrate-to-event-orchestration) as soon as possible so you can take advantage of the new functionality, such as improved UI, rule creation, APIs and Terraform support, advanced conditions, and rule nesting.
     * Rulesets allow you to route events to an endpoint and create collections of Event Rules, which define sets of actions to take based on event content.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#rulesets)
     * Scoped OAuth requires: {@code event_rules.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>updateRulesetRequest: </li>
     * </ul>
     */
    public CreateRuleset201Response updateRuleset(Consumer<UpdateRulesetOperationSpec> spec) {
        UpdateRulesetOperationSpec r = new UpdateRulesetOperationSpec(spec);
        return api.updateRuleset(r.id(), r.updateRulesetRequest());
    }

    /**
     * Update an Event Rule
     * <p>
     * Update an Event Rule. Note that the endpoint supports partial updates, so any number of the writable fields can be provided. &amp;lt;!-- theme: warning --&amp;gt; &amp;gt; ### End-of-life &amp;gt; Rulesets and Event Rules will end-of-life soon. We highly recommend that you [migrate to Event Orchestration](https://support.pagerduty.com/docs/migrate-to-event-orchestration) as soon as possible so you can take advantage of the new functionality, such as improved UI, rule creation, APIs and Terraform support, advanced conditions, and rule nesting.
     * Rulesets allow you to route events to an endpoint and create collections of Event Rules, which define sets of actions to take based on event content.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#rulesets)
     * Note: Create and Update on rules will accept 'description' or 'summary' interchangeably as an extraction action target. Get and List on rules will always return 'summary' as the target. If you are expecting 'description' please change your automation code to expect 'summary' instead.
     * Scoped OAuth requires: {@code event_rules.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>ruleId: The id of the Event Rule to retrieve.</li>
     *   <li>updateRulesetEventRuleRequest: </li>
     * </ul>
     */
    public CreateRulesetEventRule201Response updateRulesetEventRule(Consumer<UpdateRulesetEventRuleOperationSpec> spec) {
        UpdateRulesetEventRuleOperationSpec r = new UpdateRulesetEventRuleOperationSpec(spec);
        return api.updateRulesetEventRule(r.id(), r.ruleId(), r.updateRulesetEventRuleRequest());
    }

    /**
     * Update a schedule
     * <p>
     * Update an existing on-call schedule.
     * A Schedule determines the time periods that users are On-Call.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#schedules)
     * Scoped OAuth requires: {@code schedules.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>overflow: Any on-call schedule entries that pass the date range bounds will be truncated at the bounds, unless the parameter {@code overflow=true} is passed. This parameter defaults to false. For instance, if your schedule is a rotation that changes daily at midnight UTC, and your date range is from {@code 2011-06-01T10:00:00Z} to {@code 2011-06-01T14:00:00Z}:   - If you don't pass the {@code overflow=true} parameter, you will get one schedule entry returned with a start of {@code 2011-06-01T10:00:00Z} and end of {@code 2011-06-01T14:00:00Z}. - If you do pass the {@code overflow=true} parameter, you will get one schedule entry returned with a start of {@code 2011-06-01T00:00:00Z} and end of {@code 2011-06-02T00:00:00Z}. </li>
     *   <li>createScheduleRequest: The schedule to be updated.</li>
     * </ul>
     */
    public CreateScheduleRequest updateSchedule(Consumer<UpdateScheduleOperationSpec> spec) {
        UpdateScheduleOperationSpec r = new UpdateScheduleOperationSpec(spec);
        return api.updateSchedule(r.id(), r.overflow(), r.createScheduleRequest());
    }

    /**
     * Update a service
     * <p>
     * Update an existing service.
     * A service may represent an application, component, or team you wish to open incidents against.
     * There is a limit of 100,000 open Incidents per Service. If the limit is reached and you disable {@code auto_resolve_timeout} (set to 0 or null), the API will respond with an error.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#services)
     * Scoped OAuth requires: {@code services.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>createServiceRequest: The service to be updated.</li>
     * </ul>
     */
    public CreateServiceRequest updateService(Consumer<UpdateServiceOperationSpec> spec) {
        UpdateServiceOperationSpec r = new UpdateServiceOperationSpec(spec);
        return api.updateService(r.id(), r.createServiceRequest());
    }

    /**
     * Update an Event Rule on a Service
     * <p>
     * Update an Event Rule on a Service. Note that the endpoint supports partial updates, so any number of the writable fields can be provided. &amp;lt;!-- theme: warning --&amp;gt; &amp;gt; ### End-of-life &amp;gt; Rulesets and Event Rules will end-of-life soon. We highly recommend that you [migrate to Event Orchestration](https://support.pagerduty.com/docs/migrate-to-event-orchestration) as soon as possible so you can take advantage of the new functionality, such as improved UI, rule creation, APIs and Terraform support, advanced conditions, and rule nesting.
     * Scoped OAuth requires: {@code services.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>ruleId: The id of the Event Rule to retrieve.</li>
     *   <li>updateServiceEventRuleRequest: </li>
     * </ul>
     */
    public CreateServiceEventRule201Response updateServiceEventRule(Consumer<UpdateServiceEventRuleOperationSpec> spec) {
        UpdateServiceEventRuleOperationSpec r = new UpdateServiceEventRuleOperationSpec(spec);
        return api.updateServiceEventRule(r.id(), r.ruleId(), r.updateServiceEventRuleRequest());
    }

    /**
     * Update an existing integration
     * <p>
     * Update an integration belonging to a Service.
     * A service may represent an application, component, or team you wish to open incidents against.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#services)
     * Scoped OAuth requires: {@code services.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>integrationId: The integration ID on the service.</li>
     *   <li>createServiceIntegrationRequest: The integration to be updated</li>
     * </ul>
     */
    public CreateServiceIntegrationRequest updateServiceIntegration(Consumer<UpdateServiceIntegrationOperationSpec> spec) {
        UpdateServiceIntegrationOperationSpec r = new UpdateServiceIntegrationOperationSpec(spec);
        return api.updateServiceIntegration(r.id(), r.integrationId(), r.createServiceIntegrationRequest());
    }

    /**
     * Update a standard
     * <p>
     * Updates a standard
     * Scoped OAuth requires: {@code standards.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: Id of the standard</li>
     *   <li>updateStandardRequest: </li>
     * </ul>
     */
    public Standard updateStandard(Consumer<UpdateStandardOperationSpec> spec) {
        UpdateStandardOperationSpec r = new UpdateStandardOperationSpec(spec);
        return api.updateStandard(r.id(), r.updateStandardRequest());
    }

    /**
     * Update a team
     * <p>
     * Update an existing team.
     * A team is a collection of Users and Escalation Policies that represent a group of people within an organization.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#teams)
     * Scoped OAuth requires: {@code teams.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>createTeamRequest: The team to be updated.</li>
     * </ul>
     */
    public CreateTeamRequest updateTeam(Consumer<UpdateTeamOperationSpec> spec) {
        UpdateTeamOperationSpec r = new UpdateTeamOperationSpec(spec);
        return api.updateTeam(r.id(), r.createTeamRequest());
    }

    /**
     * Add an escalation policy to a team
     * <p>
     * Add an escalation policy to a team.
     * A team is a collection of Users and Escalation Policies that represent a group of people within an organization.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#teams)
     * Scoped OAuth requires: {@code teams.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>escalationPolicyId: The escalation policy ID on the team.</li>
     * </ul>
     */
    public void updateTeamEscalationPolicy(Consumer<UpdateTeamEscalationPolicyOperationSpec> spec) {
        UpdateTeamEscalationPolicyOperationSpec r = new UpdateTeamEscalationPolicyOperationSpec(spec);
        api.updateTeamEscalationPolicy(r.id(), r.escalationPolicyId());
    }

    /**
     * Add a user to a team
     * <p>
     * Add a user to a team. Attempting to add a user with the {@code read_only_user} role will return a 400 error.
     * A team is a collection of Users and Escalation Policies that represent a group of people within an organization.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#teams)
     * Scoped OAuth requires: {@code teams.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>userId: The user ID on the team.</li>
     *   <li>updateTeamUserRequest: The role of the user on the team.</li>
     * </ul>
     */
    public void updateTeamUser(Consumer<UpdateTeamUserOperationSpec> spec) {
        UpdateTeamUserOperationSpec r = new UpdateTeamUserOperationSpec(spec);
        api.updateTeamUser(r.id(), r.userId(), r.updateTeamUserRequest());
    }

    /**
     * Update a template
     * <p>
     * Update an existing template
     * Scoped OAuth requires: {@code templates.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>createTemplateRequest: </li>
     * </ul>
     */
    public CreateTemplate201Response updateTemplate(Consumer<UpdateTemplateOperationSpec> spec) {
        UpdateTemplateOperationSpec r = new UpdateTemplateOperationSpec(spec);
        return api.updateTemplate(r.id(), r.createTemplateRequest());
    }

    /**
     * Update a user
     * <p>
     * Update an existing user.
     * Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>createUserRequest: The user to be updated.</li>
     * </ul>
     */
    public CreateUserRequest updateUser(Consumer<UpdateUserOperationSpec> spec) {
        UpdateUserOperationSpec r = new UpdateUserOperationSpec(spec);
        return api.updateUser(r.id(), r.createUserRequest());
    }

    /**
     * Update a user's contact method
     * <p>
     * Update a User's contact method.
     * Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users:contact_methods.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>contactMethodId: The contact method ID on the user.</li>
     *   <li>createUserContactMethodRequest: The user's contact method to be updated.</li>
     * </ul>
     */
    public CreateUserContactMethod201Response updateUserContactMethod(Consumer<UpdateUserContactMethodOperationSpec> spec) {
        UpdateUserContactMethodOperationSpec r = new UpdateUserContactMethodOperationSpec(spec);
        return api.updateUserContactMethod(r.id(), r.contactMethodId(), r.createUserContactMethodRequest());
    }

    /**
     * Update a User's Handoff Notification Rule
     * <p>
     * Update a User's Handoff Notification Rule. Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account. For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>oncallHandoffNotificationRuleId: The oncall handoff notification rule ID on the user.</li>
     *   <li>createUserHandoffNotificationRuleRequest: The User's Handoff Notification Rule to be updated.</li>
     * </ul>
     */
    public UpdateUserHandoffNotification200Response updateUserHandoffNotification(Consumer<UpdateUserHandoffNotificationOperationSpec> spec) {
        UpdateUserHandoffNotificationOperationSpec r = new UpdateUserHandoffNotificationOperationSpec(spec);
        return api.updateUserHandoffNotification(r.id(), r.oncallHandoffNotificationRuleId(), r.createUserHandoffNotificationRuleRequest());
    }

    /**
     * Update a user's notification rule
     * <p>
     * Update a user's notification rule.
     * Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users:contact_methods.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>notificationRuleId: The notification rule ID on the user.</li>
     *   <li>createUserNotificationRuleRequest: The user's notification rule to be updated.</li>
     * </ul>
     */
    public UpdateUserNotificationRule200Response updateUserNotificationRule(Consumer<UpdateUserNotificationRuleOperationSpec> spec) {
        UpdateUserNotificationRuleOperationSpec r = new UpdateUserNotificationRuleOperationSpec(spec);
        return api.updateUserNotificationRule(r.id(), r.notificationRuleId(), r.createUserNotificationRuleRequest());
    }

    /**
     * Update a user's status update notification rule
     * <p>
     * Update a user's status update notification rule.
     * Users are members of a PagerDuty account that have the ability to interact with Incidents and other data on the account.
     * &amp;lt;!-- theme: warning --&amp;gt; &amp;gt; ### Early Access &amp;gt; This endpoint is in Early Access and may change at any time. You must pass in the X-EARLY-ACCESS header to access it.
     * For more information see the [API Concepts Document](../../api-reference/ZG9jOjI3NDc5Nzc-api-concepts#users)
     * Scoped OAuth requires: {@code users.write} 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>statusUpdateNotificationRuleId: The status update notification rule ID on the user.</li>
     *   <li>createUserStatusUpdateNotificationRule201Response: The user's status update notification rule to be updated.</li>
     * </ul>
     */
    public UpdateUserStatusUpdateNotificationRule200Response updateUserStatusUpdateNotificationRule(Consumer<UpdateUserStatusUpdateNotificationRuleOperationSpec> spec) {
        UpdateUserStatusUpdateNotificationRuleOperationSpec r = new UpdateUserStatusUpdateNotificationRuleOperationSpec(spec);
        return api.updateUserStatusUpdateNotificationRule(r.id(), r.statusUpdateNotificationRuleId(), r.createUserStatusUpdateNotificationRule201Response());
    }

    /**
     * Update a webhook subscription
     * <p>
     * Updates an existing webhook subscription.
     * Only the fields being updated need to be included on the request.
     * This operation does not support updating the {@code delivery_method} of the webhook subscription. 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>id: The ID of the resource.</li>
     *   <li>webhookSubscriptionUpdate: </li>
     * </ul>
     */
    public CreateWebhookSubscriptionRequest updateWebhookSubscription(Consumer<UpdateWebhookSubscriptionOperationSpec> spec) {
        UpdateWebhookSubscriptionOperationSpec r = new UpdateWebhookSubscriptionOperationSpec(spec);
        return api.updateWebhookSubscription(r.id(), r.webhookSubscriptionUpdate());
    }

}
