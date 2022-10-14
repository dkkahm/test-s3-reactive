package com.example.tests3reactive.controller;

import reactor.core.publisher.Flux;
import software.amazon.awssdk.services.s3.model.GetObjectResponse;

import java.nio.ByteBuffer;
import java.util.concurrent.CompletableFuture;

public class FluxResponse {
    final CompletableFuture<FluxResponse> cf = new CompletableFuture<>();
    GetObjectResponse sdkResponse;
     Flux<ByteBuffer> flux;
}
