/*
 * Copyright 2007 The Depan Project Authors
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

package com.google.devtools.depan.tasks;

import com.google.common.collect.Lists;

import org.joda.time.DateTime;

import java.util.Calendar;
import java.util.Collection;

/**
 * @author leeca@google.com (Lee Carver)
 *
 */
public class MigrationTask {
  
  private String id;
  
  private String name;
  
  private String description;
  
  private String okrQuarter;
  
  private String updatedBy;
  
  private DateTime updatedDate;
  
  private Collection<String> engineers = Lists.newArrayList();  
  
  private Collection<MigrationGroup> groups = Lists.newArrayList();  

  public String getDescription() {
    return description;
  }

  public Collection<String> getEngineers() {
    return engineers;
  }

  public Collection<MigrationGroup> getMigrationGroups() {
    return groups;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getUpdatedBy() {
    return updatedBy;
  }

  public DateTime getUpdatedDate() {
    return updatedDate;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }

  public void setUpdatedDate(DateTime updatedDate) {
    this.updatedDate = updatedDate;
  }

  public String getOkrQuarter() {
    return okrQuarter;
  }

  public void setOkrQuarter(String okrQuarter) {
    this.okrQuarter = okrQuarter;
  }

  public void addEngineers(String content) {
    getEngineers().add(content);
  }
  
  public void removeEngineer(String engineer) {
    getEngineers().remove(engineer);
  }

  public void addMigrationGroup(MigrationGroup group) {
    getMigrationGroups().add(group);
  }

  public Calendar getUpdatedCalendar() {
    if (null == updatedDate ) {
      return null;
    }
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(updatedDate.toDate());
    return calendar;
  }

  /**
   * @param group
   */
  public void removeMigrationGroup(MigrationGroup group) {
    if (groups.contains(group)) {
      groups.remove(group);
    }
  }
}
