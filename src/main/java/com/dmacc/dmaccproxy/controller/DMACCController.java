package com.dmacc.dmaccproxy.controller;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
//@RequestMapping("api/dmacc")
@RequiredArgsConstructor
public class DMACCController {
    @Autowired
    private final RestTemplate restTemplate;

   // private final String ACCESS_TOKEN = "eyJraWQiOiI1QmZydnZHUHRqdEFkb2dqT0VvSGd4eStCMWVCUWVqek1FVUhVWGVkNVhzPSIsImFsZyI6IlJTMjU2In0.eyJvcmlnaW5fanRpIjoiMjYzZWRiYzktMmM0Yy00OGY5LTg4ODUtN2FmNmQ1OTY4ZTIxIiwic3ViIjoiMDNjNDQwYjEtMjZjMC00NGRkLWFkZTItYzM1ZDczN2Q2YmQwIiwiZXZlbnRfaWQiOiJhOGJkODk0Ny1hODAxLTQ4ZGItOTllMC0yOGY3NGU2ZjJiMTQiLCJ0b2tlbl91c2UiOiJhY2Nlc3MiLCJzY29wZSI6ImF3cy5jb2duaXRvLnNpZ25pbi51c2VyLmFkbWluIiwiYXV0aF90aW1lIjoxNjI2NTQxODA0LCJpc3MiOiJodHRwczpcL1wvY29nbml0by1pZHAudXMtZWFzdC0xLmFtYXpvbmF3cy5jb21cL3VzLWVhc3QtMV9rN2cybUV4SUwiLCJleHAiOjE2MjY1NDU0MDQsImlhdCI6MTYyNjU0MTgwNCwianRpIjoiYmNmNTQzNTEtMjJjMy00NTQ1LTgxMzYtMTE4OTVlZGFiMjY0IiwiY2xpZW50X2lkIjoiMW80ZWZrNjk0cDZvZHQ0YmF0OWxvYW0";
   // private final String BASE_URL = "http://anodvlp.campus.dmacc.edu:3000/";
   //private final String BASE_URL = "https://ANSMC01.campus.dmacc.edu:3000/";
   private final String BASE_URL = "https://integration.dmacc.edu:3000/";
/*
    @PostMapping("pathwaysjourney")
    public @ResponseBody List getRecordFetch(@RequestHeader("access-token") String accessToken) throws Exception {

        if (!accessToken.equals(ACCESS_TOKEN)) {
            throw new Exception("The request has not been applied because it lacks valid authentication credentials for the target resource");
        }

        String requestUrl = BASE_URL + "pathwaysjourney";

        return restTemplate.getForEntity(requestUrl,List.class).getBody();
    }

 */
@GetMapping(value = "/pathwaysjourneyNative1/{pidm}",produces = MediaType.APPLICATION_JSON_VALUE)
@ResponseBody
public String getAllPathwaysNative1(@PathVariable Integer pidm) {
    String requestUrl = BASE_URL + "pathwaysjourneyNative1/"+pidm;
    //String result= resultsRepo.fetchStoredPoc1(pidm).toString();
    //result.replace("\\","");
    return restTemplate.getForEntity(requestUrl,String.class).getBody();
}
    @GetMapping(value = "/pathwaysjourneyOnePidms",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String getAllPidms() {
        String requestUrl = BASE_URL + "pathwaysjourneyOnePidms";
       // String result= resultsRepo.fetchListOfPidms().toString();
       // result.replace("\\","");
        return restTemplate.getForEntity(requestUrl,String.class).getBody();
    }
 }
