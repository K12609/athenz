/*
 * Copyright The Athenz Authors
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

package com.yahoo.athenz.common.messaging;

import java.util.function.Consumer;

/**
 * change subscriber interface
 */
public interface ChangeSubscriber<T> {

    /**
     * init accepts a processor function, which can be applied on each message consumed from the subscription
     * @param processor is java.util.function.Consumer provided by client that uses the implementation of this interface
     * @param valueType is the class of the type T that is needed for deserializing the message into type T
     */
    void init(Consumer<T> processor, Class<T> valueType);
}
