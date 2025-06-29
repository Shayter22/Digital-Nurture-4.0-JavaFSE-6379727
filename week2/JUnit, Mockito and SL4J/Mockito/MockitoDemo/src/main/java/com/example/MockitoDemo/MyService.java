package com.example.MockitoDemo;

public class MyService {
    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }

    public void logData() {
        System.out.println("Logging data...");
    }

    public void deleteData() {
        throw new UnsupportedOperationException("Not implemented");
    }
}