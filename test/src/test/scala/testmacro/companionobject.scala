/*
 * Copyright (c) 2015 Miles Sabin
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

package companionobject

import org.scalatest.FunSuite

class MacroCompatTests extends FunSuite {
  test("ClassWithCompanionObject") {
    val res = ClassWithCompanionObject.foo
    assert(res == 1)
  }

  test("ClassWithCompanionObjectWithMixin") {
    val res = ClassWithCompanionObjectWithMixin.foo
    assert(res == 1)

    val res2 = ClassWithCompanionObjectWithMixin.bar
    assert(res2 == 1)
  }

  test("ClassWithCompanionObjectWithParent") {
    val res = ClassWithCompanionObjectWithParent.foo
    assert(res == 1)

    val res2 = ClassWithCompanionObjectWithParent.bar
    assert(res2 == 1)
  }
}
