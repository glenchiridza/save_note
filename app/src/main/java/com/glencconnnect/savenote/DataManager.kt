/**
 * Created by glenc on Aug 2021
 **/
package com.glencconnnect.savenote

import java.util.*

object DataManager {
    val courses = HashMap<String,CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
        initializeNotes()
    }

    private fun initializeCourses() {
        var course = CourseInfo("android_intents","Android Programming With Intents")
        courses.put(course.courseId, course)

        course = CourseInfo("android_async","Android Async Programming and Service")
        courses.put(course.courseId,course)

        course = CourseInfo("java_lang","Java Fundamentals: The Java Language")
        courses.put(course.courseId,course)

        course = CourseInfo("java_core","Java Fundamentals: The Core Platform")
        courses.put(course.courseId,course)


    }

    private fun initializeNotes(){

        var note = NoteInfo(courses.get("android_intents"),"Android Intents","Working Android Intents and starting Activities")
        notes.add(note)
    }
}