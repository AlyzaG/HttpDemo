package com.example.notekeeper.models

import android.icu.text.CaseMap

class CourseInfo( val courseId: String, val title: String){

    override fun toString(): String{
        return title;
    }
}

class NoteInfo(var course: CourseInfo, var title: String,var text: String)
