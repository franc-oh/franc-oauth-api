package com.api.oauth.auth;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class AuthControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void hello_api() throws Exception {
        String url = "/api/v1/hello";
        String result = "Hello Ok";

        MvcResult resultMvc = mockMvc.perform(get(url))
                .andExpect(status().isOk())
                .andDo(print())
                .andReturn();

        assertThat(resultMvc.getResponse().getContentAsString(), is(result));
    }

    @Test
    public void helloPost_api() throws Exception {
        String url = "/api/v1/postHello";
        String result = "Post Hello";

        MvcResult resultMvc = mockMvc.perform(post(url))
                .andExpect(status().isOk())
                .andDo(print())
                .andReturn();

        assertThat(resultMvc.getResponse().getContentAsString(), is(result));
    }

}