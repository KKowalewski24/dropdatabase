package com.lambda.APImethods.Candidate;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.lambda.runtime.Context;
import com.lambda.Cognito.Authorizer;
import com.lambda.Model.Candidate;
import com.lambda.Tools.ResponeBuilder;

import javax.ws.rs.core.Response;

public class Put {

    private static AmazonDynamoDB client = AmazonDynamoDBAsyncClientBuilder.defaultClient();
    private static DynamoDBMapper mapper = new DynamoDBMapper(client);

    public static Object handleRequest(Candidate request, Context context) {

        return ResponeBuilder.RequestRecruter(() -> {

            request.setRecruiterName(Authorizer.getUserName(request.getRequestToken()));
            mapper.save(request);
            return Response.Status.CREATED;
        }, request.getRequestToken());
    }
}
