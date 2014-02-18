/*
   Copyright (c) 2012 LinkedIn Corp.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

/**
 * $Id: $
 */

package com.linkedin.restli.client;

import java.net.URI;
import java.util.Map;

/**
 * @author Josh Walker
 * @version $Revision: $
 */

public interface Response<T>
{

  int getStatus();

  T getEntity();

  String getHeader(String name);

  Map<String, String> getHeaders();

  /**
   * @return the ID. This ID is stored in the header of the {@link Response}.
   */
  String getId();

  URI getLocation();

  RestLiResponseException getError();

  boolean hasError();
}
