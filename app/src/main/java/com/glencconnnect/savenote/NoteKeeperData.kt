/**
 * Created by glenc on Aug 2021
 **/
package com.glencconnnect.savenote

data class CourseInfo (val courseId:String,val courseTitle:String) {
    override fun toString(): String {
        return courseTitle
    }
}

class NoteInfo (var course:CourseInfo,var title:String, var text:String)

