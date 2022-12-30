package explore.micronaut.controller;

import explore.micronaut.model.UserRequest;
import explore.micronaut.model.Users;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Put;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Controller("/samples")
public class AppController {

    @Put(uri = "all_sorts", produces = MediaType.APPLICATION_JSON, consumes = MediaType.APPLICATION_JSON)
    public List<UserRequest> sampleNotesUpdate(@Body List<UserRequest> userRequests) throws Exception {
        String sentence  = "The array of tall buildings in New York City seemed to reach the sky and go on for miles";
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(sentence.split(" ")));
        //Collection sort
        Collections.sort(arrayList);
        Collections.reverse(arrayList);
        // List Sort
        arrayList.sort(Comparator.naturalOrder());
        arrayList.sort(Comparator.reverseOrder());
        // Stream Sort
        arrayList.stream().sorted().collect(Collectors.toList());

        userRequests.sort(Comparator.comparingInt(UserRequest::getId));
        userRequests.sort(Comparator.comparing(UserRequest::getFirstName).thenComparing(UserRequest::getId));
        userRequests.stream().sorted(Comparator.comparing(UserRequest::getFirstName)).collect(Collectors.toList());
        userRequests.stream().sorted(Comparator.comparing(x -> x.getFirstName())).collect(Collectors.toList());
        userRequests.stream().sorted(Comparator.comparing(UserRequest::getFirstName).reversed()).collect(Collectors.toList());
//        Users dbUsers = new Users();
//        BeanUtils.copyProperties( dbUsers, userRequests);
        return userRequests;
    }

}
