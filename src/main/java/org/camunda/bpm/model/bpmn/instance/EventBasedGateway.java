/*
 * Copyright © 2014-2018 camunda services GmbH and various authors (info@camunda.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.camunda.bpm.model.bpmn.instance;

import org.camunda.bpm.model.bpmn.EventBasedGatewayType;
import org.camunda.bpm.model.bpmn.builder.EventBasedGatewayBuilder;

/**
 * The BPMN eventBasedGateway element
 *
 * @author Sebastian Menski
 */
public interface EventBasedGateway extends Gateway {

  EventBasedGatewayBuilder builder();

  boolean isInstantiate();

  void setInstantiate(boolean isInstantiate);

  EventBasedGatewayType getEventGatewayType();

  void setEventGatewayType(EventBasedGatewayType eventGatewayType);

}
