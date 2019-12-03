/*
 Copyright 2019 The TensorFlow Authors. All Rights Reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 =======================================================================
 */
package org.tensorflow.util.buffer.impl.jdk;

import org.tensorflow.util.buffer.FloatDataBuffer;
import org.tensorflow.util.buffer.FloatDataBufferTestBase;

public class FloatJdkDataBufferTest extends FloatDataBufferTestBase {

  @Override
  protected long maxSize() {
    return FloatJdkDataBuffer.MAX_SIZE;
  }

  @Override
  protected FloatDataBuffer allocate(long size) {
    return FloatJdkDataBuffer.allocate(size);
  }
}