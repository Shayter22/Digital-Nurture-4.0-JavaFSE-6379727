package com.example.MockitoDemo;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.InOrder;

public class MyServiceTest {

    // -------------------------------
    // Exercise 1: Mocking and Stubbing
    // -------------------------------
    @Test
    public void testExternalApi() {
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("Mock Data");

        MyService service = new MyService(mockApi);
        String result = service.fetchData();

        assertEquals("Mock Data", result);
    }

    // -------------------------------
    // Exercise 2: Verifying Interactions
    // -------------------------------
    @Test
    public void testVerifyInteraction() {
        ExternalApi mockApi = mock(ExternalApi.class);
        MyService service = new MyService(mockApi);

        service.fetchData();

        // Verify that getData() was called
        verify(mockApi).getData();
    }

    // -------------------------------
    // Exercise 3: Argument Matching
    // -------------------------------
    @Test
    public void testArgumentMatching() {
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getUserData(anyString())).thenReturn("User Info");

        mockApi.getUserData("user123");

        // Verify that getUserData was called with specific argument
        verify(mockApi).getUserData(eq("user123"));
    }

    // -------------------------------
    // Exercise 4: Handling Void Methods
    // -------------------------------
    @Test
    public void testVoidMethod() {
        ExternalApi mockApi = mock(ExternalApi.class);
        doNothing().when(mockApi).delete();

        mockApi.delete();

        // Verify delete was called
        verify(mockApi).delete();
    }

    // -------------------------------
    // Exercise 5: Multiple Returns from Stub
    // -------------------------------
    @Test
    public void testMultipleReturns() {
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getData())
            .thenReturn("First")
            .thenReturn("Second");

        MyService service = new MyService(mockApi);

        assertEquals("First", service.fetchData());
        assertEquals("Second", service.fetchData());
    }

    // -------------------------------
    // Exercise 6: Verifying Interaction Order
    // -------------------------------
    @Test
    public void testInteractionOrder() {
        ExternalApi mockApi = mock(ExternalApi.class);

        // Call methods
        mockApi.getData();
        mockApi.getUserData("abc");

        // Verify order
        InOrder inOrder = inOrder(mockApi);
        inOrder.verify(mockApi).getData();
        inOrder.verify(mockApi).getUserData("abc");
    }

    // -------------------------------
    // Exercise 7: Void Method Throwing Exception
    // -------------------------------
    @Test
    public void testVoidThrowsException() {
        ExternalApi mockApi = mock(ExternalApi.class);
        doThrow(new RuntimeException("Delete failed")).when(mockApi).delete();

        // Verify exception thrown
        assertThrows(RuntimeException.class, () -> mockApi.delete());
    }
}
