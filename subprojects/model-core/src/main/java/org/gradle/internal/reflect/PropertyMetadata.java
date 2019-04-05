/*
 * Copyright 2017 the original author or authors.
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

package org.gradle.internal.reflect;

import javax.annotation.Nullable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public interface PropertyMetadata {
    String getPropertyName();

    boolean isAnnotationPresent(PropertyAnnotationCategory category, Class<? extends Annotation> annotationType);

    @Nullable
    Annotation getAnnotation(PropertyAnnotationCategory category);

    boolean hasAnnotation(PropertyAnnotationCategory category);

    Class<? extends Annotation> getPropertyType();

    Method getGetterMethod();
}
