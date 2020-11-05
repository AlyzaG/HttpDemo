package com.example.notekeeper.models


// this does not need a primary  constructor
class DataManager (){

    val courses = HashMap<String, CourseInfo>()

    val notes = ArrayList<NoteInfo>()

    // Initializer block
    //Similar to a constructor in Java - it gets called after the class is created
    init {

        inititializeCourses()


    }
    private fun inititializeCourses(){

        var course = CourseInfo("Kotlin", "Integers")

        courses.set(course.courseId, course)

        // Alternative method: using Named parameters

        course = CourseInfo("Android", "Intents")

        courses.set(course.courseId, course)

        // Alternative
        course = CourseInfo(title = "Java", courseId = "Classes")
        courses.set(course.courseId, course)

        //
        course = CourseInfo("C#", "Collections")
        courses.set(course.courseId, course)




    }


}

