/**
 * Created by glenc on Aug 2021
 **/
package com.glencconnnect.savenote

data class CourseInfo (val courseId:String,val courseTitle:String) {
    override fun toString(): String {
        return courseTitle
    }
}

data class NoteInfo (var course:CourseInfo? = null,var title:String?=null, var text:String?=null)

