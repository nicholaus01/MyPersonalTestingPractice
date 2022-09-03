package com.example.mypersonaltestingpractice

class RegistrationUtil {


    /**
     * will return false if
     * ...firstname is empty
     * ...lastname is empty
     * ....age is less than or equal to zero
     * ...gender is not male/female
     */

    fun validateStudentRegistration(
        firstName: String,
        lastName: String,
        age: Int,
        gender: String,
        department: String,
        faculty: String
    ): Boolean{
        if(firstName.isEmpty()){
            return false
        }
        if(lastName.isEmpty()){
            return false
        }
        if(age <= 0){
            return false
        }
        if(gender != "Male" && gender != "Female"){
            return false
        }
        return true
    }

}