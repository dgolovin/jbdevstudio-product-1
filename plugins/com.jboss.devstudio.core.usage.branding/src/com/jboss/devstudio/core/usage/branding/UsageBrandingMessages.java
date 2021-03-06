/*******************************************************************************
 * Copyright (c) 2010-2014 Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Red Hat, Inc. - initial API and implementation
 ******************************************************************************/
package com.jboss.devstudio.core.usage.branding;

import org.eclipse.osgi.util.NLS;

/**
 * @author Andre Dietisheim
 *
 */
public class UsageBrandingMessages extends NLS {
	private static final String BUNDLE_NAME = "com.jboss.devstudio.core.usage.branding.messages"; //$NON-NLS-1$

	public static String GlobalUsageSettings_RemoteProps_URL;
	public static String UsageReportPreferencePage_Description;
	public static String UsageReportPreferencePage_AllowReporting;
	public static String UsageReport_DialogTitle;
	public static String UsageReport_DialogMessage;
	public static String UsageReport_GoogleAnalytics_Account;
	public static String UsageReport_Checkbox_Text;
	public static String UsageReport_HostName;
	public static String UsageReport_ExplanationPage;

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, UsageBrandingMessages.class);
	}

	private UsageBrandingMessages() {
	}
}
