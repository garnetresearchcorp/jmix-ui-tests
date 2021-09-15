/*
 * Copyright (c) 2008-2013 Haulmont. All rights reserved.
 */

package io.jmix.tests.ui.menu

import io.jmix.masquerade.component.SideMenu
import io.jmix.tests.screen.individual.IndividualBrowse
import io.jmix.tests.ui.screen.administration.audit.EntityLogBrowse
import io.jmix.tests.ui.screen.administration.datatools.EntityInspectorBrowse
import io.jmix.tests.ui.screen.administration.dynattr.DynamicAttributeBrowse
import io.jmix.tests.ui.screen.application.email.EmailScreen
import io.jmix.tests.ui.screen.application.company.CompanyBrowse
import io.jmix.tests.ui.screen.application.company.CompanyBrowse
import io.jmix.tests.ui.screen.application.user.UserBrowse
import io.jmix.tests.ui.screen.reports.browser.ReportBrowse
import io.jmix.tests.ui.screen.reports.browser.ReportGroupBrowse
import io.jmix.tests.ui.screen.reports.screen.ReportRunScreen
import io.jmix.tests.ui.screen.reports.screen.ShowReportTableScreen

final class Menus {
    public static final SideMenu.Menu<UserBrowse> USER_BROWSE =
            new SideMenu.Menu<>(UserBrowse, 'application', 'User.browse')

    public static final SideMenu.Menu<CompanyBrowse> COMPANY_BROWSE =
            new SideMenu.Menu<>(CompanyBrowse, 'application', 'Company.browse')

    public static final SideMenu.Menu<DynamicAttributeBrowse> DYNAMIC_ATTRIBUTES_BROWSE =
            new SideMenu.Menu<>(DynamicAttributeBrowse, 'administration', 'dynat_Category.browse')

    public static final SideMenu.Menu<EntityInspectorBrowse> ENTITY_INSPECTOR_BROWSE =
            new SideMenu.Menu<>(EntityInspectorBrowse, 'administration', 'entityInspector.browse')
    public static final SideMenu.Menu<EntityLogBrowse> ENTITY_LOG_BROWSE =
            new SideMenu.Menu<>(EntityLogBrowse, 'administration', 'entityLog.browse')

    public static final SideMenu.Menu<IndividualBrowse> INDIVIDUAL_BROWSE =
            new SideMenu.Menu<>(IndividualBrowse, 'application', 'Individual.browse')

    public static final SideMenu.Menu<EntityInspectorBrowse> ENTITY_INSPECTOR =
            new SideMenu.Menu<>(EntityInspectorBrowse, 'administration', 'entityInspector.browse')

    public static final SideMenu.Menu<ReportBrowse> REPORTS_BROWSE =
            new SideMenu.Menu<>(ReportBrowse, 'reports', 'report_Report.browse')

    public static final SideMenu.Menu<ReportGroupBrowse> REPORTS_GROUP_BROWSE =
            new SideMenu.Menu<>(ReportGroupBrowse, 'reports', 'report_ReportGroup.browse')

    public static final SideMenu.Menu<ShowReportTableScreen> REPORTS_SHOW_TABLES_SCREEN =
            new SideMenu.Menu<>(ShowReportTableScreen, 'reports', 'report_ShowReportTable.screen')

    public static final SideMenu.Menu<ReportRunScreen> REPORTS_RUN_SCREEN =
            new SideMenu.Menu<>(ReportRunScreen, 'reports', 'report_Report.run')


    public static final SideMenu.Menu<EmailScreen> EMAIL_SCREEN =
            new SideMenu.Menu<>(EmailScreen, 'application', 'BlankScreenEmail')

    public static final SideMenu.Menu<EntityInspectorBrowse> EMAIL_HISTORY=
            new SideMenu.Menu<>(EntityInspectorBrowse, 'administration', 'email_SendingMessage.browse')

}
