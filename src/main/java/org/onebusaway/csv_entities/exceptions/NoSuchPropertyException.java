/**
 * Copyright (C) 2011 Brian Ferris <bdferris@onebusaway.org>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onebusaway.csv_entities.exceptions;

/**
 * Indicates that the specified entity type does not have a property with the
 * given name, or that there was an error examining the property.
 * 
 * @author bdferris
 */
public class NoSuchPropertyException extends CsvEntityException {

  private static final long serialVersionUID = 1L;

  private String _propertyName;

  public NoSuchPropertyException(Class<?> entityType, String propertyName) {
    super(entityType, "no such property \"" + propertyName + "\" for type "
        + entityType.getName());
    _propertyName = propertyName;
  }

  public NoSuchPropertyException(Class<?> entityType, String propertyName,
      Exception ex) {
    super(entityType, "no such property \"" + propertyName + "\" for type "
        + entityType.getName(), ex);
    _propertyName = propertyName;
  }

  public String getPropertyName() {
    return _propertyName;
  }
}
