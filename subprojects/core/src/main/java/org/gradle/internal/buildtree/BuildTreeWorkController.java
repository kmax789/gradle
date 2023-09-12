/*
 * Copyright 2022 the original author or authors.
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

package org.gradle.internal.buildtree;

import org.gradle.execution.EntryTaskSelector;
import org.gradle.internal.build.ExecutionResult;
import org.gradle.internal.service.scopes.Scopes;
import org.gradle.internal.service.scopes.ServiceScope;

import javax.annotation.Nullable;

@ServiceScope(Scopes.BuildTree.class)
public interface BuildTreeWorkController {

    /**
     * Schedules and runs requested tasks based on the provided {@code taskSelector}.
     *
     * @param tasksOnly True if tasks execution only was requested. False if model building for tasks was requested.
     * */
    ExecutionResult<Void> scheduleAndRunRequestedTasks(@Nullable EntryTaskSelector taskSelector, boolean tasksOnly);
}
