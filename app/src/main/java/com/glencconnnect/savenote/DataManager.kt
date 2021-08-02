/**
 * Created by glenc on Aug 2021
 **/
package com.glencconnnect.savenote

import java.util.*

class DataManager {
    val courses = HashMap<String,CourseInfo>()
    val notes = ArrayList<CourseInfo>()

    init {
        initializeCourses()
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
}