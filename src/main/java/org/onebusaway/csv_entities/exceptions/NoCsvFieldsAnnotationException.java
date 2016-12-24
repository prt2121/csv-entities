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

import org.onebusaway.csv_entities.schema.AnnotationDrivenEntitySchemaFactory;
import org.onebusaway.csv_entities.schema.annotations.CsvFields;

/**
 * Indicates that an entity type was passed to
 * {@link AnnotationDrivenEntitySchemaFactory} for introspection and the
 * specified entity type did not have a {@link CsvFields} class annotation
 * 
 * @author bdferris
 * @see CsvFields
 * @see AnnotationDrivenEntitySchemaFactory
 */
public class NoCsvFieldsAnnotationException extends CsvEntityException {

  private static final long serialVersionUID = 1L;

  public NoCsvFieldsAnnotationException(Class<?> entityType) {
    super(entityType, "No @CsvFields annotation found for entity type "
        + entityType.getName());
  }
}
