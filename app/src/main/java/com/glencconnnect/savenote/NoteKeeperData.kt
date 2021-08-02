/**
 * Created by glenc on Aug 2021
 **/
package com.glencconnnect.savenote

class CourseInfo (val courseId:String,val courseTitle:String)

class NoteInfo (var course:CourseInfo,var title:String, var text:String)