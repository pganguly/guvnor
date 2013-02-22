/*
 * Copyright 2011 JBoss Inc
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
package org.drools.guvnor.models.guided.dtable.model;

import org.drools.guvnor.models.guided.dtable.model.ActionSetFieldCol52;
import org.drools.guvnor.models.guided.dtable.model.DTCellValue52;
import org.drools.guvnor.models.guided.dtable.model.LimitedEntryCol;
import org.jboss.errai.common.client.api.annotations.Portable;

/**
 * A column that sets the value of an existing fact.
 */
@Portable
public class LimitedEntryActionSetFieldCol52 extends ActionSetFieldCol52
        implements
        LimitedEntryCol {

    private static final long serialVersionUID = 510l;

    private DTCellValue52 value;

    public DTCellValue52 getValue() {
        return value;
    }

    public void setValue( DTCellValue52 value ) {
        this.value = value;
    }

}