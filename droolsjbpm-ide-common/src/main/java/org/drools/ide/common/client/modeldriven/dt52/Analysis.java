/*
 * Copyright 2011 JBoss Inc
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

package org.drools.ide.common.client.modeldriven.dt52;

import java.util.ArrayList;
import java.util.List;

/**
 * Only used on the client side, not stored on the server side.
 */
public class Analysis implements Comparable<Analysis> {

    private List<String> warningHtmlList = new ArrayList<String>();

    public void addWarning(String htmlEntry) {
        warningHtmlList.add(htmlEntry);
    }

    public String toHtmlString() {
        StringBuilder htmlBuilder = new StringBuilder("<span>");
        boolean first = true;
        for (String htmlEntry : warningHtmlList) {
            if (!first) {
                htmlBuilder.append(", ");
                first = false;
            }
            htmlBuilder.append(htmlEntry);
        }
        htmlBuilder.append("</span>");
        return htmlBuilder.toString();
    }

    public int getWarningSize() {
        return warningHtmlList.size();
    }

    public int compareTo(Analysis other) {
        return Integer.valueOf(getWarningSize()).compareTo(Integer.valueOf(other.getWarningSize()));
    }

}
