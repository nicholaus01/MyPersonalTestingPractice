package com.example.mypersonaltestingpractice


import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

class RegistrationUtilTest{

    private lateinit var registrationUtil: RegistrationUtil

    @Before
    fun setUp(){
        registrationUtil = RegistrationUtil()
    }

    @Test
    fun userEntersAllFieldsCorrectly_returnsTrue(){
        val result = registrationUtil.validateStudentRegistration(
            "firstName",
            "lastName",
            7,
            "Male",
            "department",
            "faculty"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun firstNameIsEmpty_returnsFalse(){
        val result = registrationUtil.validateStudentRegistration(
            "",
            "lastName",
            7,
            "Male",
            "department",
            "faculty"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun lastNameIsEmpty_returnsFalse(){
        val result = registrationUtil.validateStudentRegistration(
            "firstName",
            "",
            7,
            "Male",
            "department",
            "faculty"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun ageIsLessThanOrEqualToZero(){
        val result = registrationUtil.validateStudentRegistration(
            "firstName",
            "lastName",
            -1,
            "Male",
            "department",
            "faculty"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun genderIsNotMaleOrFemale_returnsFalse(){
        val result = registrationUtil.validateStudentRegistration(
            "firstName",
            "lastName",
            7,
            "gender",
            "department",
            "faculty"
        )
        assertThat(result).isFalse()
    }

}