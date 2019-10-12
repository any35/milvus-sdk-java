/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.milvus.client;

import javax.annotation.Nullable;
import java.util.Optional;

/**
 * Contains the returned <code>response</code> and <code>tableSchema</code> for <code>describeTable
 * </code>
 */
public class DescribeTableResponse {
  private final Response response;
  private final TableSchema tableSchema;

  public DescribeTableResponse(Response response, @Nullable TableSchema tableSchema) {
    this.response = response;
    this.tableSchema = tableSchema;
  }

  /**
   * @return an <code>Optional</code> object which may or may not contain a <code>TableSchema</code>
   *     object
   * @see Optional
   */
  public Optional<TableSchema> getTableSchema() {
    return Optional.ofNullable(tableSchema);
  }

  public Response getResponse() {
    return response;
  }

  @Override
  public String toString() {
    return String.format(
        "DescribeTableResponse {%s, %s}",
        response.toString(), tableSchema == null ? "Table schema = None" : tableSchema.toString());
  }
}
