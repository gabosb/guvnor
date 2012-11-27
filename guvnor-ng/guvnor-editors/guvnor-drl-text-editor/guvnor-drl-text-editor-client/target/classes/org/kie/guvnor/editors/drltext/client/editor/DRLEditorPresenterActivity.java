/*
 * Copyright 2012 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kie.guvnor.editors.drltext.client.editor;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import javax.annotation.Generated;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import com.google.gwt.user.client.ui.InlineLabel;

import org.uberfire.client.workbench.annotations.Identifier;
import org.uberfire.client.workbench.annotations.ResourceType;
import org.uberfire.client.mvp.AbstractWorkbenchEditorActivity;
import org.uberfire.client.mvp.PlaceManager;

import org.uberfire.shared.mvp.PlaceRequest;

import org.uberfire.backend.vfs.Path;

import com.google.gwt.user.client.ui.IsWidget;

@Dependent
@Generated("org.uberfire.annotations.processors.WorkbenchEditorProcessor")
@ResourceType("drl")
@Identifier("DRLEditor")
/*
 * WARNING! This class is generated. Do not modify.
 */
public class DRLEditorPresenterActivity extends AbstractWorkbenchEditorActivity {

    private static final Collection<String> ROLES = Collections.emptyList();

    private static final Collection<String> TRAITS = Collections.emptyList();

    @Inject
    private DRLEditorPresenter realPresenter;

    @Inject
    //Constructor injection for testing
    public DRLEditorPresenterActivity(final PlaceManager placeManager) {
        super( placeManager );
    }

    @Override
    public void onStart(final Path path,
                        final PlaceRequest place) {
        super.onStart( path );
        realPresenter.onStart( path );
    }

    @Override
    public boolean onMayClose() {
        return realPresenter.checkIfDirty();
    }

    @Override
    public void onClose() {
        super.onClose();
        realPresenter.onClose();
    }

    @Override
    public IsWidget getTitleWidget() {
        return new InlineLabel(realPresenter.getTitle());
    }

    @Override
    public IsWidget getWidget() {
        return realPresenter.getWidget();
    }
    
    @Override
    public boolean isDirty() {
        return realPresenter.isDirty();
    }
    
    @Override
    public void onSave() {
        super.onSave();
        realPresenter.onSave();
    }

    @Override
    public Collection<String> getRoles() {
        return ROLES;
    }

    @Override
    public Collection<String> getTraits() {
        return TRAITS;
    }

    @Override
    public String getSignatureId() {
        return "org.kie.guvnor.editors.drltext.client.editor.DRLEditorPresenterActivity";
    }
}
