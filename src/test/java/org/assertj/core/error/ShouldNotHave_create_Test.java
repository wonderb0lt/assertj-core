/**
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2012-2014 the original author or authors.
 */
package org.assertj.core.error;

import static org.assertj.core.error.ShouldNotHave.shouldNotHave;
import static org.junit.Assert.assertEquals;


import org.assertj.core.api.TestCondition;
import org.assertj.core.description.*;
import org.assertj.core.presentation.StandardRepresentation;
import org.junit.*;

/**
 * Tests for <code>{@link ShouldNotHave#create(org.assertj.core.description.Description, org.assertj.core.presentation.Representation)}</code>.
 * 
 * @author Yvonne Wang
 */
public class ShouldNotHave_create_Test {

  private ErrorMessageFactory factory;

  @Before
  public void setUp() {
    factory = shouldNotHave("Yoda", new TestCondition<String>("red lightsaber"));
  }

  @Test
  public void should_create_error_message() {
    String message = factory.create(new TextDescription("Test"), new StandardRepresentation());
    assertEquals("[Test] \nExpecting:\n <\"Yoda\">\nnot to have:\n <red lightsaber>", message);
  }
}
