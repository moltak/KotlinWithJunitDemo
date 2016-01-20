package net.cleanhacker.kotlinwithjunitdemo

import org.junit.Test

import org.junit.Assert.*
import org.hamcrest.CoreMatchers.*

class RestTest {

    @Test
    fun testGithubUserApi() {
        val o = MyRetrofitAdapter.getRetrofit()
                .create(GitHubService::class.java)
        val user = o.get("moltak")
                .toBlocking()
                .toFuture()
                .get()
        assertThat(user.login, `is`("moltak"))
    }
}