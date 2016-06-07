/*
 * Copyright 2016 The Depan Project Authors
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
package com.google.devtools.depan.filesystem.eclipse.preferences;

import com.google.devtools.depan.filesystem.eclipse.FileSystemActivator;

import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

/**
 * Preference page for Maven node color selections.
 *
 * @author <a href="mailto:leeca@pnambic.com">Lee Carver</a>
 */
public class ColorPreferencesPage extends FieldEditorPreferencePage
    implements IWorkbenchPreferencePage {

  public ColorPreferencesPage() {
    super(GRID);
  }

  @Override
  protected void createFieldEditors() {
    Composite parent = getFieldEditorParent();

    ColorFieldEditor artifact = new ColorFieldEditor(
        ColorPreferencesIds.COLOR_DIRECTORY, "Directories", parent);
    ColorFieldEditor property = new ColorFieldEditor(
        ColorPreferencesIds.COLOR_FILE, "Files", parent);

    addField(artifact);
    addField(property);
  }

  @Override
  public void init(IWorkbench workbench) {
    setDescription("Define FileSystem Node Color Preferences.");
    setPreferenceStore(FileSystemActivator.getDefault().getPreferenceStore());
  }
}
