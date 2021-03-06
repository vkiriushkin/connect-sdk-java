/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

public class RedirectPaymentProduct863SpecificInput {

	private String integrationType = null;

	/**
	 * The type of integration with WeChat. Possible values:
	 * <ul><li>desktopQRCode - used on desktops, the consumer opens the WeChat app by scanning a QR code.
	 * <li>urlIntent - used in mobile apps or on mobile web pages, the consumer opens the WeChat app using a URL intent.
	 * <li>nativeInApp - used in mobile apps that use the WeChat Pay SDK.
	 * </ul>
	 */
	public String getIntegrationType() {
		return integrationType;
	}

	/**
	 * The type of integration with WeChat. Possible values:
	 * <ul><li>desktopQRCode - used on desktops, the consumer opens the WeChat app by scanning a QR code.
	 * <li>urlIntent - used in mobile apps or on mobile web pages, the consumer opens the WeChat app using a URL intent.
	 * <li>nativeInApp - used in mobile apps that use the WeChat Pay SDK.
	 * </ul>
	 */
	public void setIntegrationType(String value) {
		this.integrationType = value;
	}
}
