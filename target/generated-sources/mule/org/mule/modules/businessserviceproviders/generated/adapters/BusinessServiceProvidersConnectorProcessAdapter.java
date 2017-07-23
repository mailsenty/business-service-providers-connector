
package org.mule.modules.businessserviceproviders.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.businessserviceproviders.BusinessServiceProvidersConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>BusinessServiceProvidersConnectorProcessAdapter</code> is a wrapper around {@link BusinessServiceProvidersConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-07-23T02:54:05-04:00", comments = "Build UNNAMED.2793.f49b6c7")
public class BusinessServiceProvidersConnectorProcessAdapter
    extends BusinessServiceProvidersConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<BusinessServiceProvidersConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, BusinessServiceProvidersConnectorCapabilitiesAdapter> getProcessTemplate() {
        final BusinessServiceProvidersConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,BusinessServiceProvidersConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, BusinessServiceProvidersConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, BusinessServiceProvidersConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
