/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.netflix.iceberg.events;

import com.netflix.iceberg.Schema;
import com.netflix.iceberg.expressions.Expression;

/**
 * Event sent to listeners when a table scan is planned.
 */
public final class ScanEvent {
  private final String tableName;
  private final long snapshotId;
  private final Expression filter;
  private final Schema projection;

  public ScanEvent(String tableName, long snapshotId, Expression filter, Schema projection) {
    this.tableName = tableName;
    this.snapshotId = snapshotId;
    this.filter = filter;
    this.projection = projection;
  }

  public String tableName() {
    return tableName;
  }

  public long snapshotId() {
    return snapshotId;
  }

  public Expression filter() {
    return filter;
  }

  public Schema projection() {
    return projection;
  }
}