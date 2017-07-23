package org.mule.modules.businessserviceproviders;

import static org.junit.Assert.*;

import org.junit.Test;

public class BusinessServiceProvidersConnectorTest {
	
	BusinessServiceProvidersConnector businessServiceProvidersConnector = new BusinessServiceProvidersConnector();

	@Test
	public void testQuery() {
		System.out.println(businessServiceProvidersConnector.query("modernization"));
	}

	@Test
	public void testIta_offices() {
		System.out.println(businessServiceProvidersConnector.ita_offices("Mexico"));
	}

	@Test
	public void testCategories() {
		System.out.println(businessServiceProvidersConnector.categories("Business%20Consulting"));
	}

	
	
	
	
}
