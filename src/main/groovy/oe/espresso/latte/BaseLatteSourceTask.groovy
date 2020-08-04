/**
  Copyright © 2019,2020 Progress Software Corporation and/or its subsidiaries or affiliates. All Rights Reserved.
*/

package oe.espresso.latte

import org.gradle.api.tasks.Input
import org.gradle.api.tasks.SourceTask
import org.gradle.api.tasks.Optional
import org.gradle.api.tasks.Internal


/**
    Base task (not for source tasks) for some boilerplate stuff related to setting
    dlcHome and similar.

*/
abstract class BaseLatteSourceTask extends SourceTask {


    /**
        value for OpenEdge installation location.
        defaults to using dlcHome value of extension
        if not specified
    */
    @Input @Optional
    File dlcHome = ext.dlcHome

    /**
    If true use prowin. If false use _progress.
    if not set, defaults to abl.graphicalMode
    */
    @Input @Optional
    Boolean graphicalMode

    /**
    COMPILE statement allows underscores (-zn parameter)
    */
    @Input @Optional
    Boolean compileUnderscore

    /**
        get value of DlcHome
    */
    File getDlcHome() {
        return dlcHome
    }

    @Internal
    protected LatteExtension getExt() {
        return project.extensions.getByType(LatteExtension)
    }

    /**
       Use prowin if set to true. Use _progress if set
       to false. If not explicitly set, defaults to the value
       of abl.graphicalMode.

    */
    Boolean getGraphicalMode() {
        if (graphicalMode == null) {
            return ext.graphicalMode
        }
        return graphicalMode.value
    }
}
