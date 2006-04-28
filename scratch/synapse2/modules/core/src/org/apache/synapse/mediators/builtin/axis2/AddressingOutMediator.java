package org.apache.synapse.mediators.builtin.axis2;

import org.apache.synapse.api.Mediator;


import org.apache.synapse.SynapseMessage;
import org.apache.synapse.Constants;
/*
 * Copyright 2004,2005 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

public class AddressingOutMediator implements Mediator {
    public boolean mediate(SynapseMessage sm) {
        // engage addressing outhandler in the out bound message. 
        sm.setProperty(Constants.ENGAGE_ADDRESSING_OUT_BOUND_MESSAGE, Boolean.TRUE);
        return true;
    }
}
