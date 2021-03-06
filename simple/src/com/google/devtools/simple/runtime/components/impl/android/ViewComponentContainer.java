/*
 * Copyright 2009 Google Inc.
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

package com.google.devtools.simple.runtime.components.impl.android;

import com.google.devtools.simple.runtime.components.ComponentContainer;

import android.view.ViewGroup;

/**
 * Components that can contain other components need to implement this
 * interface.
 * 
 * @author Herbert Czymontek
 */
public interface ViewComponentContainer extends ComponentContainer {

  /**
   * Returns the layout manager of the container.
   *
   * @return layout manager
   */
  ViewGroup getLayoutManager();
}
