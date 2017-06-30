package com.udacity.gradle.builditbigger;


import android.content.Context;
import android.support.test.runner.AndroidJUnit4;
import android.support.v4.util.Pair;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

import static android.support.test.InstrumentationRegistry.getContext;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;


/**
 * Created by Dell on 22/06/2017.
 */

@RunWith(AndroidJUnit4.class)
public class MyFunctionalTest {

    @Test
    public void testIsJokeEmpty() throws InterruptedException, ExecutionException {
        String result = null;
        EndpointsAsyncTask endpointsAsyncTask
                = new EndpointsAsyncTask(getContext(), null, null);
        endpointsAsyncTask.execute(new Pair<Context, String>(null, "Ay Haga"));
        result = endpointsAsyncTask.get();
        assertNotNull(result);
        assertFalse(result.isEmpty());

    }
}
