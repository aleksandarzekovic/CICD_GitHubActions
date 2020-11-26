package me.aleksandarzekovic.cicd_githubactions

import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert.assertThat
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.runners.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class InputAttributesTest {

    // region constants
    private val FIRSTNAME: String = "Aleksandar"
    private val LASTNAME: String = "Zekovic"
    private val FULLNAME: String = "Aleksandar Zekovic"
    // endregion constants

    // region helper fields
    private lateinit var SUT: InputAttributes
    // end region helper fields


    @Before
    fun setup() {
        SUT = InputAttributes()

    }

    @Test
    fun inputAttributes_sendLNameAndFName_returnFullName() {
        val result = SUT.getFullName(FIRSTNAME, LASTNAME)
        assertThat(result, `is`(FULLNAME))
    }

    // region helper methods

    // endregion helper methods

    // region helper classes

    // endregion helper classes
}