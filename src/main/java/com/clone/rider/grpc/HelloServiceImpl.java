package com.clone.rider.grpc;

import com.msa.HelloGrpcRequest;
import com.msa.HelloGrpcResponse;
import com.msa.MsaServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class HelloServiceImpl extends MsaServiceGrpc.MsaServiceImplBase {

    @Override
    public void register(com.msa.HelloGrpcRequest helloGrpcRequest, StreamObserver<HelloGrpcResponse> helloGrpcResponseStreamObserver){

        System.out.println(helloGrpcRequest.getId());


        HelloGrpcResponse helloGrpcResponse = HelloGrpcResponse.newBuilder()
                .setReturnValue("Hello Seller from rider")
                .build();
        helloGrpcResponseStreamObserver.onNext(helloGrpcResponse);
        helloGrpcResponseStreamObserver.onCompleted();
    }


}
